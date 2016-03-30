package controllers

import Models.{Biography, Psychometric, Physiology}
import anorm._
import org.json.simple.{JSONObject, JSONArray}
import org.json.simple.parser.{JSONParser, ParseException}

import scala.collection.immutable.TreeMap

//import org.json.simple.{JSONObject, JSONArray}
//import org.json.simple.parser.{ParseException, JSONParser}
//import play.Logger
import play.api.db.DB
import play.api.libs.json.JsValue
import play.api.mvc.Controller
import play.api.Play.current
import play.Logger
import play.libs.Json
import scala.collection.JavaConversions._
import scala.collection.mutable.ListBuffer

/**
 * Created by staamneh on 10/27/2014.
 * These methods are designed to be called from class GoogleDrive to make changes to database once creating a new study, the reason for  have in scala
 * is because scala has anorm which make it easer to deal with DB
 */

case class AccessRefreshString (Access: String, refresh: String)
object DataBaseOperations extends Controller{


  def storeCredentials(userID: String, accessToken: String, refreshToken: String): Unit= {

    DB.withConnection { implicit c =>
      val rowOption = SQL("select count(*) as c from credential where userId={userID};").on('userID -> userID).apply().head
      var ctr = rowOption[Long]("c");

      if (ctr == 0) {
        val id: Option[Long] =
          SQL("insert into credential values({userid},{access_token},{refresh_token});")
            .on('userid -> userID, 'access_token -> accessToken, 'refresh_token -> refreshToken).executeInsert()

        //if(userID != "cplsubjectbook@gmail.com")
        InsertDefaultDatType(userID);
      }
      else
      {
        val id: Int =
          SQL("update credential set access_token = {access},refresh_token = {refresh} WHERE userId={user};")
            .on( 'access -> accessToken, 'refresh -> refreshToken, 'user -> userID).executeUpdate()
        Logger.info("access and refresh token has been updated in the database for: " +  userID );
        Logger.info(id.toString);
      }
    }
  }

  def InsertDefaultDatType (userID: String): Unit = {

    DB.withConnection { implicit c =>

      /* SQL("insert into signals(signal_desc ,signal_extension ,data_type,ytitle,frame_rate, first_row, first_col, owner) values ('Perinasal EDA', 'perspiration', 1, 'Perinasal EDA', 8,9, 2, {user})")
         .on( 'user -> userID).executeInsert()
       SQL("insert into signals(signal_desc ,signal_extension ,data_type,ytitle,frame_rate, first_row, first_col, owner) values ('Palm EDA', 'q_eda', 1, 'Palm EDA', 8,9, 2, {user})")
         .on( 'user -> userID).executeInsert()
       SQL("insert into signals(signal_desc ,signal_extension ,data_type,ytitle,frame_rate, first_row, first_col, owner) values ('Heart rate variability', 'hrv', 1, 'HRV', 8,9, 2, {user})")
         .on( 'user -> userID).executeInsert()

       SQL("insert into signals(signal_desc ,signal_extension ,data_type,ytitle,frame_rate, first_row, first_col, owner) values ('Motion', 'q_motion', 1, 'Energy', 8,9, 2, {user})")
         .on( 'user -> userID).executeInsert()
       SQL("insert into signals(signal_desc ,signal_extension ,data_type,ytitle,frame_rate, first_row, first_col, owner) values ('Respiratory rate', 'breathing', 1, '', 8,9, 2, {user})")
         .on( 'user -> userID).executeInsert()
       SQL("insert into signals(signal_desc ,signal_extension ,data_type,ytitle,frame_rate, first_row, first_col, owner) values ('Electrocardiography', 'Z_ECG', 1, '', 8,9, 2, {user})")
         .on( 'user -> userID).executeInsert()
       SQL("insert into signals(signal_desc ,signal_extension ,data_type,ytitle,frame_rate, first_row, first_col, owner) values ('Belt breathing', 'z_breathing', 1, '', 8, 9, 2, {user})")
         .on( 'user -> userID).executeInsert()
       SQL("insert into signals(signal_desc ,signal_extension ,data_type,ytitle,frame_rate, first_row, first_col, owner) values ('Temperature', 'q_temperature', 1, '', 8,9, 2,{user})")
         .on( 'user -> userID).executeInsert()
       SQL("insert into signals(signal_desc ,signal_extension ,data_type,ytitle,frame_rate, first_row, first_col, owner) values ('Nasal Persperiation', 'nperspiration', 1, '', 8,9, 2, {user})")
         .on( 'user -> userID).executeInsert()
       SQL("insert into signals(signal_desc ,signal_extension ,data_type,ytitle,frame_rate, first_row, first_col, owner) values ( 'bar', 'bar', 4, '', 8,9, 2, {user})")
         .on( 'user -> userID).executeInsert()
       SQL("insert into signals(signal_desc ,signal_extension ,data_type,ytitle,frame_rate, first_row, first_col, owner) values ( 'eye', 'eye', 1, '', 8,9, 2,{user})")
         .on( 'user -> userID).executeInsert()
       SQL("insert into signals(signal_desc ,signal_extension ,data_type,ytitle,frame_rate, first_row, first_col, owner) values ( 'Video', 'avi', 2, '', 8,9, 2, {user})")
         .on( 'user -> userID).executeInsert()
       SQL("insert into signals(signal_desc ,signal_extension ,data_type,ytitle,frame_rate, first_row, first_col, owner) values ('Info', 'info', 3, '', 8,9, 2,  {user})")
         .on( 'user -> userID).executeInsert()
       SQL("insert into signals(signal_desc ,signal_extension ,data_type,ytitle,frame_rate, first_row, first_col, owner) values ('Activity', 'activity', 6, '', 8,9, 2, {user})")
         .on( 'user -> userID).executeInsert()
       SQL("insert into signals(signal_desc ,signal_extension ,data_type,ytitle,frame_rate, first_row, first_col, owner) values (  'Physchometric', 'pm', 5, '', 8,9, 2,{user})")
         .on( 'user -> userID).executeInsert()

         */

      SQL("insert into signals(signal_desc ,signal_extension ,data_type,ytitle,frame_rate, first_row, first_col, owner) values ('Perinasal Perspiration', 'pp', 1, 'perinasal', 8,9, 2, {user})")
        .on( 'user -> userID).executeInsert()
      SQL("insert into signals(signal_desc ,signal_extension ,data_type,ytitle,frame_rate, first_row, first_col, owner) values ('Nasal Perspiration', 'np', 1, 'nasal', 8,9, 2, {user})")
        .on( 'user -> userID).executeInsert()
      SQL("insert into signals(signal_desc ,signal_extension ,data_type,ytitle,frame_rate, first_row, first_col, owner) values ('Palm EDA', 'peda', 1, 'eda', 8,9, 2, {user})")
        .on( 'user -> userID).executeInsert()
      SQL("insert into signals(signal_desc ,signal_extension ,data_type,ytitle,frame_rate, first_row, first_col, owner) values ('Finger EDA', 'feda', 1, 'eda', 8,9, 2, {user})")
        .on( 'user -> userID).executeInsert()
      SQL("insert into signals(signal_desc ,signal_extension ,data_type,ytitle,frame_rate, first_row, first_col, owner) values ('Plantar EDA', 'pleda', 1, 'eda', 8,9, 2, {user})")
        .on( 'user -> userID).executeInsert()
      SQL("insert into signals(signal_desc ,signal_extension ,data_type,ytitle,frame_rate, first_row, first_col, owner) values ('Heart Rate Variability', 'HRV', 1, '', 8,9, 2, {user})")
        .on( 'user -> userID).executeInsert()
      SQL("insert into signals(signal_desc ,signal_extension ,data_type,ytitle,frame_rate, first_row, first_col, owner) values ('Heart Rate - Chest', 'hrc', 1, '', 8, 9, 2, {user})")
        .on( 'user -> userID).executeInsert()
      SQL("insert into signals(signal_desc ,signal_extension ,data_type,ytitle,frame_rate, first_row, first_col, owner) values ('Heart Rate - Wrist', 'hrw', 1, '', 8,9, 2,{user})")
        .on( 'user -> userID).executeInsert()
      SQL("insert into signals(signal_desc ,signal_extension ,data_type,ytitle,frame_rate, first_row, first_col, owner) values ('Breathing Rate - Chest', 'brc', 1, '', 8,9, 2, {user})")
        .on( 'user -> userID).executeInsert()
      SQL("insert into signals(signal_desc ,signal_extension ,data_type,ytitle,frame_rate, first_row, first_col, owner) values ( 'Breathing Rate - Thermistor', 'brt', 1, '', 8,9, 2, {user})")
        .on( 'user -> userID).executeInsert()
      SQL("insert into signals(signal_desc ,signal_extension ,data_type,ytitle,frame_rate, first_row, first_col, owner) values ( 'Breathing Rate - Thermal', 'brtl', 1, '', 8,9, 2,{user})")
        .on( 'user -> userID).executeInsert()
      SQL("insert into signals(signal_desc ,signal_extension ,data_type,ytitle,frame_rate, first_row, first_col, owner) values ( 'Facial Expression', 'FACS', 1, '', 8,9, 2, {user})")
        .on( 'user -> userID).executeInsert()
      SQL("insert into signals(signal_desc ,signal_extension ,data_type,ytitle,frame_rate, first_row, first_col, owner) values ('Motion - Core', 'mc', 1, '', 8,9, 2,  {user})")
        .on( 'user -> userID).executeInsert()
      SQL("insert into signals(signal_desc ,signal_extension ,data_type,ytitle,frame_rate, first_row, first_col, owner) values ('Motion - Hand', 'mh', 1, '', 8,9, 2, {user})")
        .on( 'user -> userID).executeInsert()
      SQL("insert into signals(signal_desc ,signal_extension ,data_type,ytitle,frame_rate, first_row, first_col, owner) values (  'Motion - Feet', 'mf', 1, '', 8,9, 2,{user})")
        .on( 'user -> userID).executeInsert()
      SQL("insert into signals(signal_desc ,signal_extension ,data_type,ytitle,frame_rate, first_row, first_col, owner) values (  'Eye Track', 'et', 1, '', 8,9, 2,{user})")
        .on( 'user -> userID).executeInsert()
      SQL("insert into signals(signal_desc ,signal_extension ,data_type,ytitle,frame_rate, first_row, first_col, owner) values (  'Face Video', 'fv', 2, '', 8,9, 2,{user})")
        .on( 'user -> userID).executeInsert()
      SQL("insert into signals(signal_desc ,signal_extension ,data_type,ytitle,frame_rate, first_row, first_col, owner) values (  'Face Video', 'avi', 2, '', 8,9, 2,{user})")
        .on( 'user -> userID).executeInsert()
      SQL("insert into signals(signal_desc ,signal_extension ,data_type,ytitle,frame_rate, first_row, first_col, owner) values (  'Stimuli', 'stm', 6, '', 8,9, 2,{user})")
        .on( 'user -> userID).executeInsert()
      SQL("insert into signals(signal_desc ,signal_extension ,data_type,ytitle,frame_rate, first_row, first_col, owner) values (  'Biographic', 'b', 3, '', 8,9, 2,{user})")
        .on( 'user -> userID).executeInsert()
      SQL("insert into signals(signal_desc ,signal_extension ,data_type,ytitle,frame_rate, first_row, first_col, owner) values (  'Trend Pychometrics', 'tp', 5, '', 8,9, 2,{user})")
        .on( 'user -> userID).executeInsert()
      SQL("insert into signals(signal_desc ,signal_extension ,data_type,ytitle,frame_rate, first_row, first_col, owner) values (  'State Pychometrics', 'sp', 5, '', 8,9, 2,{user})")
        .on( 'user -> userID).executeInsert()



      /* val id: Option[Long] =
         SQL("insert into credential values({userid},{access_token},{refresh_token});")
           .on('userid -> userID, 'access_token -> accessToken, 'refresh_token -> refreshToken).executeInsert()*/
    }


  }
  def getStoredCredentials(userID: String): AccessRefreshString= {

    var access = "";
    var refresh= "";
    DB.withConnection { implicit c =>
      val id=
        SQL("select access_token, refresh_token from credential where userId={sub_id};")
          .on('sub_id -> userID).apply().head;
      access = id[String]("access_token");
      refresh = id[String]("refresh_token");



    }
    var cred = new AccessRefreshString(access, refresh);
    /*val cred: Credential = new Credential(access);
    cred.setAccessToken(access);
    cred.setRefreshToken(refresh);*/
    return cred;
  }

  def deleteStudy(StudyNo: Int)= {

    DB.withConnection { implicit c =>
      val result1 =
        SQL(" delete  from session where subject_seq in (select subject_seq from subject where study_id = {std});")
          .on( 'std -> StudyNo).executeUpdate()

      val result2 =
        SQL("  delete from subject where study_id = {std};")
          .on( 'std -> StudyNo).executeUpdate()

      val result3 =
        SQL("delete from privilege where study_id ={std};")
          .on( 'std -> StudyNo).executeUpdate()

      val result4 =
        SQL("delete from study where study_id = {std};")
          .on( 'std -> StudyNo).executeUpdate()
    }
    Logger.debug("Study: " + StudyNo + " has been deleted" );
  }

  def GenerateStudyNoGD(StudyName: String, username: String, study_type : Int, public: Int, descLoc : String): Int = {

    DB.withConnection { implicit c =>
      val rowOption = SQL("select coalesce(max(study_id),0) as c from study;").apply().head
      var ctr = rowOption[Long]("c");
      ctr = ctr + 1;


      //var uuid = java.util.UUID.randomUUID.toString
      //ctr = uuid.toLong;
      Logger.info("Generate study Id for Study: " + StudyName );

      if(descLoc == null)
      {
        val id: Option[Long] =
          SQL("insert into study values({study_id},{study_name},NOW(), {study_type}, {user}, NULL, NULL, NULL, NULL);")
            .on('study_id -> ctr , 'study_name -> StudyName, 'study_type -> study_type, 'user -> username).executeInsert()
      }
      else {
        val id: Option[Long] =
          SQL("insert into study values({study_id},{study_name},NOW(), {study_type}, {user}, NULL, NULL, NULL, {desc});")
            .on('study_id -> ctr , 'study_name -> StudyName, 'study_type -> study_type, 'user -> username, 'desc -> descLoc).executeInsert()
      }


      if(public ==1) {
        val id2: Option[Long] =
          SQL("insert into privilege values({s_id}, 1, {user});")
            .on('s_id -> ctr, 'user -> username).executeInsert()
      }
      ctr.toInt;

    }
  }

  def fromJsonToMapDescriptor (str: String): Option[TreeMap[String,(String,Boolean,Int, Boolean)]] ={

    var mp :TreeMap[String,(String,Boolean,Int, Boolean)] = TreeMap.empty

    val parser: JSONParser = new JSONParser
    try {
      val obj: AnyRef = parser.parse(str)
      val array: JSONArray = obj.asInstanceOf[JSONArray]

      for(i <- 0 to array.size()-1){
        val ob: JSONObject = array.get(i).asInstanceOf[JSONObject]
        //mp += ob.get("sessionName").toString ->(ob.get("acronym").toString, Integer.parseInt(ob.get("sessionType").toString), Integer.parseInt(ob.get("arm").toString), i)
        var me = false;
        var show = true;
        if(Integer.parseInt(ob.get("arm").toString)> 0)
          me= true;
        if(Integer.parseInt(ob.get("sessionType").toString) ==3)
          show = false;

        mp += ob.get("sessionName").toString ->(ob.get("acronym").toString, show,i, me)
      }
      Some(mp)

    }
    catch {
      case pe: ParseException => {
        println("position: " + pe.getPosition)

        None
      }
    }

  }

  def getDescriptorAsMap (stdNo: Int): Option[TreeMap[String,(String,Boolean,Int, Boolean)]] =
  {
    //var mp :Option[TreeMap[String,(String,Boolean,Int, Boolean)]];
    DB.withConnection { implicit c =>
      val rowOption = SQL("select study_descriptor  from study where study_id={std} ;").on('std -> stdNo).apply().head

      var ctr = rowOption[Option[String]]("study_descriptor");
      ctr match {
        case Some(value) =>
          if(value == null)
            null
          else {
            val x = fromJsonToMapDescriptor(value)
            x
          }

        case _ => None
      }

    }
  }

  def getDescriptorAsMapJava (stdNo: Int): java.util.TreeMap[String, String] =
  {
    //var mp :Option[TreeMap[String,(String,Boolean,Int, Boolean)]];
    DB.withConnection { implicit c =>
      val rowOption = SQL("select study_descriptor  from study where study_id={std};").on('std -> stdNo).apply().head

      var ctr = rowOption[Option[String]]("study_descriptor");
      ctr match {
        case Some(value) =>
          fromJsonToMapDescriptor(value) match {
            case Some(x) =>
              var newMap : java.util.TreeMap[String, String] = new java.util.TreeMap[String, String];
              for((key,value) <- x){
                newMap put(key , value._1)
              }
              newMap
            case None => null
          }

        case None => null
      }

    }
  }

  def InsertStudyPortraitString(StudyNo: Int, queryString: String)= {

    DB.withConnection { implicit c =>
      val id: Int =
        SQL("update study set portrait_string = {str} WHERE study_id={std};")
          .on( 'str -> queryString, 'std -> StudyNo).executeUpdate()
    }
    Logger.debug("Study: " + StudyNo + "has been Updated with Portrait string" );
  }


  def InsertStudyRadar(StudyNo: Int, queryString: String)= {

    DB.withConnection { implicit c =>
      val id: Int =
        SQL("update study set radar = {str} WHERE study_id={std};")
          .on( 'str -> queryString, 'std -> StudyNo).executeUpdate()
    }
    Logger.debug("Study: " + StudyNo + "has been Updated with Portrait string" );
  }

  def InsertSubjectGD(subject: String,studyId :Int,bio_code:Int, psycho:Int,physio: Int): Unit = {
    //println("Salah Taa   :" + subject)
    DB.withConnection { implicit c =>
      /*val rowOption  =
        SQL("select coalesce(max(subject_seq),0) as c from subject;").apply().head
      var ctr = rowOption[Long]("c");
      ctr = ctr+1;*/


      val id: Option[Long] =
        SQL("insert into subject (subject_id, study_id, f_name , l_name , DOB ,  hide, PAS , NAS, bio_code, psycho,physio) values({subject_id},{study_id},null, null, NOW() ,9,10,10,{a}, {b}, {c});")
          .on( 'subject_id -> subject, 'study_id -> studyId, 'a->bio_code ,'b ->psycho ,'c ->physio ).executeInsert()
    }
  }


  def InsertSessionGD(subject: String, studyId: Int, session_no : Int, session_name: String, signal_code: Int, url: String, isGeneral: Int, isBL : Boolean, order: Int): Unit= {

    DB.withConnection { implicit c =>
      val rowOption1  =
        SQL("select subject_seq from subject where subject_id={sub_id} AND study_id={study_id};").on('sub_id -> subject, 'study_id-> studyId).apply().head
      val seq = rowOption1[Long]("subject_seq");

      /*val rowOption2  =
        SQL("select coalesce(max(session_no),0) as c from session where subject_seq={seq};").on('seq -> seq).apply().head
      var ctr = rowOption2[Long]("c");
      ct = ctr+1; */
      val rowOption = SQL("select coalesce(max(signal_seq),0) as c from session where subject_seq={seq};").on('seq -> seq).apply().head;
      var ctr = rowOption[Long]("c");
      ctr = ctr + 1;

      if(isBL){
        val id: Option[Long] =
          SQL("insert into session values({signal_seq}, {seq},{sess_no},1 ,{sess_name}, {url},'',{general},1, {signal_code}, {odr});")
            .on( 'signal_seq -> {ctr}, 'seq -> seq, 'sess_name -> session_name, 'sess_no -> session_no,'url -> url, 'general -> isGeneral ,'signal_code -> signal_code, 'odr -> order).executeInsert()
      }
      else{
        val id: Option[Long] =
          SQL("insert into session values({signal_seq}, {seq},{sess_no},1 ,{sess_name}, {url},'',{general},0, {signal_code}, {odr});")
            .on( 'signal_seq -> {ctr}, 'seq -> seq, 'sess_name -> session_name, 'sess_no -> session_no,'url -> url, 'general -> isGeneral ,'signal_code -> signal_code, 'odr -> order).executeInsert()
      }


    }
  }

  def listOfFileExtension ( username: String):Map[String, Int]= {

    DB.withConnection { implicit c =>
      val rowOption1 =
        SQL("select  signal_code, LCASE(signal_extension) as signal_extension  from signals where owner ={user};").on('user -> username)
      //SQL("select  signal_code, signal_extension  from signals where owner ={user} \nunion \nselect  signal_code, signal_extension  from signals where  (owner = 'cplsubjectbook@gmail.com'  And signal_extension  not in (select signal_extension from signals where owner ={user} ));").on('user -> username)

      val temp = rowOption1().map( row => (row[String]("signal_extension"), row[Int]("signal_code"))).toMap
      temp
      //val seq = rowOption1[Long]("subject_seq");
    }

  }

  //TODO merege it with the above one
  def listOfFileExtensionPortrait ( username: String):Map[String, Int]= {

    DB.withConnection { implicit c =>
      val rowOption1 =
        SQL("select  signal_code, signal_extension  from signals where data_type =1 AND owner ={user};").on('user -> username)
      //SQL("select  signal_code, signal_extension  from signals where owner ={user} \nunion \nselect  signal_code, signal_extension  from signals where  (owner = 'cplsubjectbook@gmail.com'  And signal_extension  not in (select signal_extension from signals where owner ={user} ));").on('user -> username)

      val temp = rowOption1().map( row => (row[String]("signal_extension"), row[Int]("signal_code"))).toMap
      temp
      //val seq = rowOption1[Long]("subject_seq");
    }

  }


  def listOfPsychometric ( username: String):Map[String, (Int,Int)]= {

    DB.withConnection { implicit c =>
      val rowOption1 =
        SQL("select  UPPER(p_name) As pName, min_value, max_value  from psychometric where owner ={user} \nunion \nselect  p_name, min_value, max_value  from psychometric where  (owner = 'cplsubjectbook@gmail.com'  And p_name  not in (select p_name from psychometric where owner ={user} ));").on('user -> username)


      val temp = rowOption1().map( row => (row[String]("pName"), (row[Int]("min_value"), row[Int]("max_value")))).toMap
      temp
      //val seq = rowOption1[Long]("subject_seq");
    }

  }

  def InsertSubjectRadar(subject: String, radarVal: String ): Unit = {
    //println("Salah Taa   :" + subject)
    DB.withConnection { implicit c =>
      val id: Int =
        SQL("update subject set radar_value = {str} WHERE subject_id={std};")
          .on( 'str -> radarVal, 'std -> subject).executeUpdate()

    }
  }


}
