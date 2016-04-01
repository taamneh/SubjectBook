package controllers

//import Models.{DB, Person, ReadExcelScala}

import java.io._
import java.nio.file.Path
import java.util.{UUID, Date}
import akka.actor.{Props, ActorSystem}
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential
import com.google.api.services.drive.Drive
import controllers.SharedData.MinMax
import collection.JavaConversions._

import scala.collection.JavaConverters._
import Models._
import org.apache.poi.util.IOUtils
import play.api.libs.concurrent.Execution.Implicits._
import play.api.Play.current
import play.api._
import anorm._
import play.api.libs.json.{JsValue, JsArray, Json}
import play.api.db.DB
import play.api.data.Form
import play.api.data.Forms._
import play.api.libs.iteratee.{Concurrent, Enumerator}
import play.api.mvc._
import play.Logger
import scala.collection.immutable.TreeMap
import scala.collection.mutable

import scala.concurrent.{ExecutionContext, Future}
;
import akka.actor._


object Application extends Controller {


  val GOOGLE_DRIVE = 1;
  val LOCAL_SERVER = 2;

  val userForm = Form(
    mapping(
      "username" -> text,
      "password" -> text
    )(Models.UserLogin.apply)(Models.UserLogin.unapply)
  )

  object MyWebSocketActorNewStudy {
    def props(out: ActorRef) = Props(new MyWebSocketActorNewStudy(out))
  }



  def socket = WebSocket.acceptWithActor[String, String] { request => out =>
    MyWebSocketActorNewStudy.props(out)
  }

  def Front = Action {
    Ok(views.html.HelpPage())
  }

  def setUpStudy = Action {
    Ok(views.html.SetupStudy())
  }

  def howToCreateNewStudy = Action {
    Ok(views.html.HowToCreateStudy())
  }


  def RealTime = Action {
    implicit request =>
      var username: String = "";
      var temp = List.empty[(String, Int, Int)]
      request.session.get("connected").map { user =>
        username = user;
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
      }

      Ok(views.html.RealTime(username));
  }


  def showSignalRealTime(fileId: String) = Action {
    implicit request =>
      var username: String = "";
      request.session.get("connected").map { user =>
        username = user;
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
      }
      GoogleDrive.UpdatingRealTime(username, fileId)
      Ok(views.html.RealTimeChart(username, fileId));
  }


  def showSignalRealTime2(fileId: String) = Action {
    implicit request =>
      var username: String = "";
      request.session.get("connected").map { user =>
        username = user;
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
      }

      Ok(GoogleDrive.UpdatingRealTime(username, fileId).toJSONString);
  }

  case class NewDataType(dataDec: Option[String], dataExtension :String, dataType : Int, yTitle: Option[String], frameRate:Option[Int] , first_row: Option[Int], first_col: Option[Int])
  case class ExistingDataType(code: Int, dataDec: Option[String], dataExtension :String, dataType : Int, yTitle: Option[String], frameRate:Option[Int] , first_row: Option[Int], first_col: Option[Int], min_yvalue:  Option[Float], max_yvalue:  Option[Float], log : Int)
  case class NewPsychometric(pName: String, min : Int, max: Int)
  case class NewTopSummary(code: String, studyId: Int)
  case class NewDescriptor(code: String, studyId: Int)
  case class ExistingPsychometric(code: Int, pName: String, min :Int, max : Int )
  case class EditHideSubjectMdl(studyId: Int, subjectID: String, hide :Int )


  val addPsychometric = Form(
    mapping(
      "pName" -> nonEmptyText,
      "min" -> number,
      "max" -> number
    )(NewPsychometric.apply)(NewPsychometric.unapply)
  )

  val addNewTopSummary = Form(
    mapping(
      "code" -> nonEmptyText,
      "studyId" -> number
    )(NewTopSummary.apply)(NewTopSummary.unapply)
  )

  val addDescriptor = Form(
    mapping(
      "code" -> nonEmptyText,
      "studyId" -> number
    )(NewDescriptor.apply)(NewDescriptor.unapply)
  )

  val editPsychometric = Form(
    mapping(
      "code" -> number,
      "pName" -> nonEmptyText,
      "min" -> number,
      "max" -> number
    )(ExistingPsychometric.apply)(ExistingPsychometric.unapply)
  )

  val editHideSubjectMdl = Form(
    mapping(
      "studyId" -> number,
      "subjectID" -> nonEmptyText,
      "hide" -> number
    )(EditHideSubjectMdl.apply)(EditHideSubjectMdl.unapply)
  )


  val addDataType = Form(
    mapping(
      "dataDec" -> optional(text),
      "dataExtension" -> nonEmptyText,
      "dataType" -> number,
      "yTitle" -> optional(text),
      "frameRate" -> optional(number),
      "first_row" -> optional(number) ,
      "first_col" -> optional(number)
    )(NewDataType.apply)(NewDataType.unapply)
  )

  import play.api.data.format.Formats._
  val editDataType = Form(
    mapping(
      "code" -> number,
      "dataDec" -> optional(text),
      "dataExtension" -> nonEmptyText,
      "dataType" -> number,
      "yTitle" -> optional(text),
      "frameRate" -> optional(number),
      "first_row" -> optional(number) ,
      "first_col" -> optional(number),
      "min_yvalue" -> optional(of[Float]),
      "max_yvalue" -> optional(of[Float]),
      "log" -> number
    )(ExistingDataType.apply)(ExistingDataType.unapply)
  )

  def showAddDataType = Action {
    implicit request =>
      var username: String = "";
      request.session.get("connected").map { user =>
        username = user;
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
      }

      Ok(views.html.AddNewDataType(username));
  }




  def CreateStudyTest()= Action{
    implicit request =>
      /*val forpor = Abstraction(userName,json.get("sourceType").asInt(),  json.get("studyName").asText(), json.get("studyLocation").asText(), json.get("portrait").asBoolean(), json.get("public").asBoolean()
        , explExt, expListExtention, resExt, resListExtentions,json.get("StaticBefore").asInt(), json.get("StaticAfter").asInt(),
        json.get("covarite").asInt(), json.get("explanColNo").asInt(), json.get("respColNo").asInt(), json.get("baseLineFolder").asText(), json.get("descriptor").toString)*/


      /*var str = Abstraction("cplsubjectbook@gmail.com",1,"Using Test-Salah","0BzuoB3uc0tTVS0hmSWkzcU9pM2s",false,false,"pp",List("peda"),"res2",List(),12,12,130,2,4,
        "Normal-Drive","""[{"sessionName":"Practice-Drive","acronym":"Salah","sessionType":"1","arm":"1"},{"sessionName":"Nd","acronym":"df","sessionType":"2","arm":"0"}]""")*/
      var str = Abstraction("cplsubjectbook@gmail.com",1,"Using Test-Salah","0BzuoB3uc0tTVS0hmSWkzcU9pM2s",false,false,"pp",List("peda"),"res2",List(),12,12,130,2,4,
        "Normal-Drive",null)

      Global.CreateSTudyAbstractWay(str);
      Ok("");

  }



  def ProcessNewDataType  = Action {
    implicit request =>
      var username: String = "";
      request.session.get("connected").map { user =>
        username = user;
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
      }
      addDataType.bindFromRequest.fold(
        formWithErrors => {
          //BadRequest("The Study Has not been creted Correctly please check that data you entered!")
          Ok(views.html.AddNewDataType(username, "The data type has not been created correctly, please check the data you entered!"));
        },
        contact => {

          DB.withConnection { implicit c =>



            val id: Option[Long] =
              SQL("insert into signals(signal_desc ,signal_extension ,data_type,ytitle,frame_rate, first_row, first_col, owner) values ({desc}, {ext}, {type}, {title}, {frame},{frow},{fcol}, {user})")
                .on('desc -> contact.dataDec , 'ext -> contact.dataExtension, 'type -> contact.dataType, 'title -> contact.yTitle, 'frame -> contact.frameRate, 'user -> username, 'frow ->contact.first_row, 'fcol -> contact.first_col).executeInsert()

            //Ok(views.html.ShowStudies(username, med)).withSession("connected" -> username)
            Redirect(routes.Application.showAllDataTypes()).withSession(
              "connected" -> username);
          }
        }
      )
  }

  def EditDataType  = Action {
    implicit request =>

      /*.get("action").headOption match {
      case Some("edit") => Ok("Cliked edit")
      case Some("remove") => Ok("Cliked remove")
      case _ => BadRequest("This action is not allowed")
    }*/

      var username: String = "";
      request.session.get("connected").map { user =>
        username = user;
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
      }
      editDataType.bindFromRequest.fold(
        formWithErrors => {
          BadRequest("The Study Has not been creted Correctly please check that data you entered!")
          Redirect(routes.Application.showAllDataTypes()).withSession(
            "connected" -> username);
        },
        contact => {

          val rate = contact.frameRate match {
            case Some(x) => x
            case _ => 1

          }

          val row = contact.first_row match {
            case Some(x) => x
            case _ => 1

          }

          val col = contact.first_col match {
            case Some(x) => x
            case _ => 1

          }


          DB.withConnection { implicit c =>
            val id: Int =
              SQL("update signals set signal_desc = {desc}, signal_extension ={ext}, data_type= {type}, ytitle ={title}, frame_rate={frame}, first_row ={fr}, first_col= {fc}, min_yvalue={mn} , max_yvalue={mx}, isLogarithmic = {log}  WHERE signal_code = {code}")
                .on('desc -> contact.dataDec , 'ext -> contact.dataExtension, 'type -> contact.dataType, 'title -> contact.yTitle, 'frame -> rate, 'code -> contact.code, 'fr -> row, 'fc -> col, 'mn->contact.min_yvalue ,  'mx -> contact.max_yvalue, 'log -> contact.log).executeUpdate()

            //Ok(views.html.ShowStudies(username, med)).withSession("connected" -> username)
            //Ok(("Congratualtion! you just added a new data type "))

            Redirect(routes.Application.showAllDataTypes()).withSession(
              "connected" -> username);
          }
        }
      )
  }


  def showAllDataTypes = Action {
    implicit request =>
      var username: String = "";
      request.session.get("connected").map { user =>
        username = user;
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
      }
      DB.withConnection { implicit c =>
        val studies  =
          SQL("select  signal_code, signal_desc, signal_extension, data_type, ytitle, frame_rate, first_row, first_col, min_yvalue, max_yvalue, isLogarithmic  from signals where ( owner ={user} );").on('user -> username)
        //SQL("select  distinct(study_name), study_owner, study_id as c from study where study_owner ={un} OR study_id in (select study_id from privilege );").on('un -> username)
        val med = studies().map(row =>
          (row[Int]("signal_code"),row[Option[String]]("signal_desc"), row[String]("signal_extension") , row[Int]("data_type") , row[Option[String]]("ytitle"), row[Int]("frame_rate"),  row[Int]("first_row"),  row[Int]("first_col"), row[Option[java.math.BigDecimal]]("min_yvalue"),  row[Option[java.math.BigDecimal]]("max_yvalue"), row[Int]("isLogarithmic"))
        ).toList


        /*val med3 = signals2().map(row =>
          (row[Int]("signal_seq") , row[Int]("data_type"), row[String]("ytitle"))
        ).toList*/




        Ok(views.html.ShowDataTypes(username,med)).withSession("connected" -> username)
      }
  }


  def showAllSubjectToHide(studyNo : Int) = Action {
    implicit request =>
      var username: String = "";
      request.session.get("connected").map { user =>
        username = user;
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
      }
      DB.withConnection { implicit c =>
        val studies  =
          SQL("select  subject_id , hide from subject  where study_id={std} order by subject_id;").on('std -> studyNo)
        //SQL("select  distinct(study_name), study_owner, study_id as c from study where study_owner ={un} OR study_id in (select study_id from privilege );").on('un -> username)
        val med = studies().map(row =>
          (row[String]("subject_id"), row[Int]("hide"))
        ).toList
        Ok(views.html.HideSubjects(username,studyNo,med)).withSession("connected" -> username)
      }
  }



  def showAllPsychometric = Action {
    implicit request =>
      var username: String = "";
      request.session.get("connected").map { user =>
        username = user;
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
      }
      DB.withConnection { implicit c =>
        val studies  =
          SQL("select  p_code, p_name, min_value, max_value from psychometric  where ( owner ={user} );").on('user -> username)
        //SQL("select  distinct(study_name), study_owner, study_id as c from study where study_owner ={un} OR study_id in (select study_id from privilege );").on('un -> username)
        val med = studies().map(row =>
          (row[Int]("p_code"), row[String]("p_name"),row[Int]("min_value"), row[Int]("max_value"))
        ).toList
        Ok(views.html.ShowAllPsychometric(username,med)).withSession("connected" -> username)
      }
  }


  def EditPsychometric  = Action {
    implicit request =>

      var username: String = "";
      request.session.get("connected").map { user =>
        username = user;
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
      }
      editPsychometric.bindFromRequest.fold(
        formWithErrors => {
          BadRequest("The Study Has not been creted Correctly please check that data you entered!")
          Redirect(routes.Application.EditPsychometric()).withSession(
            "connected" -> username);
        },
        contact => {
          DB.withConnection { implicit c =>
            val id: Int =
              SQL("update psychometric set p_name = {name}, min_value ={min}, max_value= {max} WHERE p_code = {code}")
                .on('name -> contact.pName , 'min -> contact.min, 'max -> contact.max, 'code -> contact.code).executeUpdate()
            Redirect(routes.Application.showAllPsychometric()).withSession(
              "connected" -> username);
          }
        }
      )
  }


  def EditHideSubject  = Action {
    implicit request =>

      var username: String = "";
      request.session.get("connected").map { user =>
        username = user;
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
      }
      editHideSubjectMdl.bindFromRequest.fold(
        formWithErrors => {
          BadRequest("The Study Has not been creted Correctly please check that data you entered!")
          /*Redirect(routes.Application.showAllSubjectToHide(1)).withSession(
            "connected" -> username);*/
          Ok("Basdddd")
        },
        contact => {
          DB.withConnection { implicit c =>
            val id: Int =
              SQL("update subject set hide = {h} WHERE study_id = {sId} AND subject_id= {subId}")
                .on('h -> contact.hide , 'sId -> contact.studyId, 'subId -> contact.subjectID).executeUpdate()
            Redirect(routes.Application.showAllSubjectToHide(1)).withSession(
              "connected" -> username);
          }
        }
      )
  }





  def showAddPsychometric = Action {
    implicit request =>
      var username: String = "";
      request.session.get("connected").map { user =>
        username = user;
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
      }

      Ok(views.html.AddNewPsychometric(username));
  }


  def showAddTopSummary(studyNo: Int)= Action {
    implicit request =>
      var username: String = "";
      request.session.get("connected").map { user =>
        username = user;
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
      }

      Ok(views.html.AddTopSummary(username,studyNo));

  }


  def showAddDescriptor(studyNo: Int)= Action {
    implicit request =>
      var username: String = "";
      request.session.get("connected").map { user =>
        username = user;
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
      }

      //Ok(views.html.AddTopSummary(username,studyNo));
      Ok(views.html.experimentalDesign(username,studyNo));

  }





  def showPyramid(studyNo: Int) = Action  {
    implicit request =>
      var username: String = "";
      request.session.get("connected").map { user =>
        username = user;
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
      }

      Ok(views.html.ShowPyramid(username,studyNo));
  }



  def ProcessNewPsychometric  = Action {
    implicit request =>
      var username: String = "";
      request.session.get("connected").map { user =>
        username = user;
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
      }
      addPsychometric.bindFromRequest.fold(
        formWithErrors => {
          //BadRequest("The Study Has not been creted Correctly please check that data you entered!")
          Ok(views.html.AddNewPsychometric(username, "The data type has not been created correctly, please check the data you entered!"));
        },
        contact => {

          DB.withConnection { implicit c =>




            val id: Option[Long] =
              SQL("insert into psychometric(p_name ,min_value ,max_value, owner) values ( {name}, {min}, {max}, {user})")
                .on('name -> contact.pName , 'min -> contact.min, 'max -> contact.max, 'user -> username).executeInsert()

            //Ok(views.html.ShowStudies(username, med)).withSession("connected" -> username)
            Redirect(routes.Application.showAllPsychometric()).withSession(
              "connected" -> username);
          }
        }
      )
  }


  def ProcessNewTopSummary = Action {
    implicit request =>
      var username: String = "";
      request.session.get("connected").map { user =>
        username = user;
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
      }
      addNewTopSummary.bindFromRequest.fold(
        formWithErrors => {
          //BadRequest("The Study Has not been creted Correctly please check that data you entered!")
          Ok(views.html.AddNewPsychometric(username, "The data type has not been created correctly, please check the data you entered!"));
        },
        contact => {

          DB.withConnection { implicit c =>


            val id: Int = SQL("update study set top_summary = {code} where study_id = {id}")
              .on( 'code -> contact.code, 'id -> contact.studyId).executeUpdate()

            Ok(views.html.ShowTopSummary(username, contact.code, contact.studyId))

          }
        }
      )
  }


  def ProcessNewDescriptor = Action {
    implicit request =>
      var username: String = "";
      request.session.get("connected").map { user =>
        username = user;
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
      }
      addDescriptor.bindFromRequest.fold(
        formWithErrors => {
          //BadRequest("The Study Has not been creted Correctly please check that data you entered!")
          Ok(views.html.AddNewPsychometric(username, "The data type has not been created correctly, please check the data you entered!"));
        },
        contact => {

          DB.withConnection { implicit c =>


            val id: Int = SQL("update study set study_descriptor = {code} where study_id = {id}")
              .on( 'code -> contact.code, 'id -> contact.studyId).executeUpdate()

            Ok(views.html.ShowTopSummary(username, contact.code, contact.studyId))

          }
        }
      )
  }




  /**
   * It is called when the user visit our main page. It then generates the URL for the google permission screen and redirect the user to it.
   * When the user hits Accept It is gonna be redirected to what we specified in our google console (i.e, REDIRECT URIS: http://stressbook.ddns.net/display),
   * which in turn will call ReciveOuthData. The redirect Url will contain the code and state that is needed to access user Drive
   */

  def Main = Action {
    Redirect(GoogleDrive.getAuthorizationUrl())
  }

  /**
   * This will retrieve the state and code from the query string in the URL and then get credential by call google API
   */

  def ReceiveOauthData(state: String, code :String) = Action {
    Redirect(routes.Application.authentication()).withSession(
      "connected" -> GoogleDrive.getUserEmail(code));
  }




  /**
   * This function will be called from "ReceiveOauthData" after getting the credential, and it will redirect the user to his list of studies
   */

  def authentication = Action {
    implicit request =>
      var username: String = "";
      request.session.get("connected").map { user =>
        username = user;
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
      }
      DB.withConnection { implicit c =>
        val studies  =
          SQL("select  distinct(study_name), study_owner, study_id as c from study where study_owner ={un} OR study_id in (select study_id from privilege );").on('un -> username)
        val med = studies().map(row =>
          row[String]("study_name") -> row[String]("study_owner") -> row[Int]("study_id")
        ).toList
        Ok(views.html.ShowStudies(username,med)).withSession("connected" -> username)
      }
  }

  /**
   * This Method is called when the user hit My model from any window, and it will display all the studies that the user created or share with other people
   */
  def displayStudies() = Action
  {
    implicit request =>
      var username: String = "";
      var videoIdList:  Map[String, List[ String]]= Map()
      request.session.get("connected").map { user =>
        username = user;
        DB.withConnection { implicit c =>
          val studies  =
            SQL("select  distinct(study_name), study_owner, study_id as c from study where study_owner ={un} OR study_id in (select study_id from privilege );").on('un -> username)
          val med = studies().map(row =>
            row[String]("study_name") -> row[String]("study_owner") -> row[Int]("study_id")
          ).toList
          Ok(views.html.ShowStudies(username,med))
        }
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
        Logger.error("Trying to show studies without log in ")
        Redirect(GoogleDrive.getAuthorizationUrl())
      }

  }

  /**
   * This Function is called once the user select a study to show from the list of studies
   */



  def showStudy(studyNo: Int) = Action
  {
    implicit request =>
      var username: String = "";
      var parameterList: String= "";
      var study_name: String ="";
      var summary: String ="";
      request.session.get("connected").map { user =>
        username = user;
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
      }
      Logger.info("Show Study Number: " + studyNo)
      var sessionsPerSubject : Map[String, List[( String)]]= Map();
      var subectList : List[( String)] = List();
      DB.withConnection { implicit c =>
        val subjects  =
          SQL("select distinct(subject_id) from subject, session where study_id ={study_no} AND subject.subject_seq = session.subject_seq order by subject_id;")
            .on('study_no -> studyNo)
        subectList = subjects().map(row =>
          row[String]("subject_id")).toList

        val portrait = SQL("select  distinct(study_name) as study_name, coalesce(portrait_string,'') as portrait , coalesce(top_summary,'') as summary from study where study_id={study_id};").on('study_id -> studyNo).apply().head
        parameterList = portrait[String]("portrait");
        summary = portrait[String]("summary");

        //parameterList = parameterList.substring(0, parameterList.indexOf('~'))
        /*val allpages = parameterList.split("~")
        parameterList = allpages(pageNo-1)

        println("*****************************" + pageNo)*/
        study_name =  portrait[String]("study_name");

      }
      if(summary != "")
        Ok(views.html.ShowTopSummary(username, summary, studyNo))
      else
        Ok(views.html.UnderConstruction(username,  studyNo));
  }


  def showStudySkipTop(studyNo: Int) = Action
  {
    implicit request =>
      var username: String = "";
      var parameterList: String= "";
      var study_name: String ="";
      var summary: String ="";
      request.session.get("connected").map { user =>
        username = user;
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
      }
      Logger.info("Show Study Number: " + studyNo)
      var sessionsPerSubject : Map[String, List[( String)]]= Map();
      var subectList : List[( String)] = List();
      DB.withConnection { implicit c =>
        val subjects  =
          SQL("select distinct(subject_id) from subject, session where study_id ={study_no} AND subject.subject_seq = session.subject_seq order by subject_id;")
            .on('study_no -> studyNo)
        subectList = subjects().map(row =>
          row[String]("subject_id")).toList

        val portrait = SQL("select  distinct(study_name) as study_name, coalesce(portrait_string,'') as portrait , coalesce(top_summary,'') as summary from study where study_id={study_id};").on('study_id -> studyNo).apply().head
        parameterList = portrait[String]("portrait");
        study_name =  portrait[String]("study_name");

      }
      Ok(views.html.ShowSubject(username, subectList, studyNo,study_name, parameterList));
  }

  /**
   *  This method is called once the user select one subject to be displayed
   */

  def displaySubject(studyNo: Int, SubjectId: String) = Action {
    implicit request =>
      var username: String = "";
      request.session.get("connected").map { user =>
        username = user;
      }.getOrElse {

        Unauthorized("Oops, you are not connected")
      }
      Logger.info("Show Subject Number: " + SubjectId + " For Study: " +studyNo);
      var signalsPerSession: Map[String, List[(String, Int, Int, Option[String], Option[java.math.BigDecimal], Option[java.math.BigDecimal], Int)]] = Map();
      var signalsPerSessionOldName: Map[String, (String, List[(String, Int, Int, Option[String], Option[java.math.BigDecimal], Option[java.math.BigDecimal], Int)])] = Map();
      var videosPerSession:  Map[String, List[ (String, String)]]= Map()


      var subjectsList = List.empty[String]
      var generalList = List.empty[(Int, Int, Int)]
      var sessionsPerSubjectMenu : Map[String, List[( String)]]= Map();
      var videoIdList:  Map[String, List[ String]]= Map()
      var sourceType: Int = 1;
      var studyName = "";
      var subName = "";
      var hide = 9;
      DB.withConnection { implicit c =>
        subName =   SubjectId
        if(SubjectId == "")
        {
          val findSubjName =  SQL("select subject_id, hide  from subject  where study_id={study_id} order by subject_id;").on('study_id-> studyNo).apply().head
          subName =   findSubjName[String]("subject_id");
          //hide = findSubjName[Int]("hide");
        }

        val findSubjName =  SQL("select hide from subject  where study_id={study_id} AND subject_id = {sId} order by subject_id;").on('study_id-> studyNo, 'sId -> subName).apply().head
        hide = findSubjName[Int]("hide");


        val signalsTemp =
          SQL("select session_name, signal_seq, data_type, ytitle, min_yvalue , max_yvalue, isLogarithmic  from  session, signals where  signal_signal_code = signal_code AND is_general=0  AND subject_seq = (select subject_seq from subject where subject_id ={sub_id}  AND study_id ={study_no}) order by order_to_show desc, session_name, signal_signal_code;")
            .on('study_no -> studyNo, 'sub_id -> subName)


        val x = signalsTemp().map(row => (row[String]("session_name"),  row[Int]("signal_seq"), row[Int]("data_type"), row[Option[String]]("ytitle"), row[Option[java.math.BigDecimal]]("min_yvalue") , row[Option[java.math.BigDecimal]]("max_yvalue"), row[Int]("isLogarithmic"))).toList
        signalsPerSession = x.groupBy(x => x._1);

        signalsPerSession = TreeMap(signalsPerSession.toSeq:_*).toMap  // to sort the map\

        var mpVedio :TreeMap[String, String]= TreeMap.empty;

        val mp = DataBaseOperations.getDescriptorAsMap(studyNo)
        mp match {
          case Some(data) =>

            var counter =0;
            mp match {
              case Some(something) =>
                signalsPerSessionOldName = signalsPerSession.map(v =>
                  if(something.contains(v._1.replaceFirst("(\\d*\\s*)", ""))){
                    something.get(v._1.replaceFirst("(\\d*\\s*)", "")) match {
                      case Some(sN) =>
                        val pattern = "(\\d*)".r
                        val b = pattern.findFirstIn(v._1) match {
                          case Some(s) => s
                          case None => ""
                        }
                        mpVedio += v._1 -> (b+sN._1).toString
                        b+sN._1 -> (v._1, v._2)
                      case None =>
                        mpVedio += v._1 -> v._1
                        v._1 -> (v._1, v._2)
                    }
                  }
                  else{
                    mpVedio += v._1 -> v._1
                    v._1 -> (v._1, v._2)
                  }
                )
              case None=>  //
                signalsPerSessionOldName = signalsPerSession.map(v =>
                  v._1 -> (v._1, v._2)
                )
            }

          case None =>
            signalsPerSessionOldName = signalsPerSession.map(v =>
              v._1 -> (v._1, v._2)
            )
        }

        //signalsPerSession = TreeMap(signalsPerSession.toSeq:_*).toMap  // to sort the map\

        signalsPerSessionOldName = TreeMap(signalsPerSessionOldName.toSeq:_*).toMap  // to sort the map\


        val videosTemp = SQL("select session_name,signal_loc from session, signals  where signal_signal_code = signal_code AND data_type = 2 AND subject_seq = (select subject_seq from subject where subject_id ={sub_id}  AND study_id ={study_no});").
          on('video -> SignalType.getVideoCode, 'study_no -> studyNo, 'sub_id -> subName)

        val vListTemp = videosTemp().map(row =>  (row[String]("session_name"), row[String]("signal_loc")) ).toList
        videosPerSession = vListTemp.groupBy(x=> x._1);

        /*if(mpVedio.isEmpty){
          val vListTemp = videosTemp().map(row =>  (row[String]("session_name"), row[String]("signal_loc")) ).toList
          videosPerSession = vListTemp.groupBy(x=> x._1);
        }
        else {
          val vListTemp = videosTemp().map(row =>  (mpVedio(row[String]("session_name")), row[String]("signal_loc")) ).toList
          videosPerSession = vListTemp.groupBy(x=> x._1);
        }*/


        // if the subject is chosen to be hidden then do not send the video links
        if(hide == 8){

          for((k,v) <- videosPerSession){
            videosPerSession += k -> List((k , "0BzuoB3uc0tTVS3VsaXFWNURpejg"))
          }
        }
        //videosPerSession = Map();

        // we send the study type just to decide wich player should we use
        val studyType  =
          SQL("select study_type, study_name from study where study_id={study_id};").on('study_id-> studyNo).apply().head
        sourceType = studyType[Int]("study_type");
        studyName = studyType[String]("study_name");


        //for menu sake
        val subjects  = SQL("select distinct(subject_id) from subject, session where study_id ={study_no} AND subject.subject_seq = session.subject_seq order by subject_id;")
          .on('study_no -> studyNo)
        subjectsList = subjects().map(row =>  row[String]("subject_id")).toList

        val general = SQL("select signal_seq, signal_code , data_type from session, signals where signal_signal_code = signal_code AND is_general=1  AND subject_seq = (select subject_seq from subject where subject_id ={sub_id}  AND study_id ={study_no}) order by signal_code desc;").on('sub_id -> subName, 'study_no -> studyNo);
        generalList = general().map(row => (row[Int]("signal_seq") ,row[Int]("signal_code"), row[Int]("data_type"))).toList

      }

      Ok(views.html.ShowSignals(subName, signalsPerSessionOldName ,studyNo, username, videosPerSession,sourceType, subjectsList, generalList, studyName))
  }

  /**
   *  LogOut
   */

  def logout = Action {
    Redirect(routes.Application.Main()).withNewSession.flashing(
      "success" -> "You've been logged out"
    )
  }

  /**
   *  Called once creating new study, and will redirect the user to multi-step study creating
   */

  def ShowCreateStudyForm = Action {
    implicit request =>
      var username: String = "";
      var temp = List.empty[(String, Int, Int)]
      request.session.get("connected").map { user =>
        username = user;
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
      }

      DB.withConnection { implicit c =>

        val rowOption1 =
          SQL("select  SIGNAL_DESC , signal_code, data_type  from signals where owner ={user};").on('user -> username)
        //SQL("select  signal_code, signal_extension  from signals where owner ={user} \nunion \nselect  signal_code, signal_extension  from signals where  (owner = 'cplsubjectbook@gmail.com'  And signal_extension  not in (select signal_extension from signals where owner ={user} ));").on('user -> username)

        temp = rowOption1().map( row => (row[String]("SIGNAL_DESC"), row[Int]("signal_code"), row[Int]("data_type"))).toList




      }

      Ok(views.html.ShowCreateStudy(username, temp));
  }


  /**
   *  Called whne user finish entering all the fields and hit enter to create new study
   */
  val newStudy2 = Form(
    mapping(
      "study_name" -> nonEmptyText,
      "study_type" -> number,
      "folder_id" -> nonEmptyText,
      "url" -> nonEmptyText,
      "numSubj" ->number,
      "numSess" ->number,
      "numRun" -> number,
      "public" -> number,
      "portrait" -> number,
      "bio" ->number,
      "psychometric" -> number,
      "physiology" -> number,
      "observation" -> number
    )(NewStudy.apply)(NewStudy.unapply)
  )
  def InsertNewStudy = Action {
    implicit request =>
      var username: String = "";
      request.session.get("connected").map { user =>
        username = user;
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
      }
      newStudy2.bindFromRequest.fold(
        formWithErrors => {


          Redirect(routes.Application.displayStudies())

          //BadRequest("The Study Has not been creted Correctly please check that data you entered!")
        },
        contact => {
          val bio: Biography = AuxiliaryMethods.BiographyCode(contact.bio);
          val psycho : Psychometric = AuxiliaryMethods.PsychometricCode(contact.psychometric);
          val physio : Physiology = AuxiliaryMethods.PhysiologyCode(contact.physiology);
          val obser: Observation = AuxiliaryMethods.ObservationCode(contact.observation);
          val studyToplogy: StudyTopology = new StudyTopology(bio,psycho,physio, obser,new Performance(), contact.numSubj, contact.numSess, contact.numRun);

          //val gDrive : GoogleDrive = new GoogleDrive();
          var report = " "

          // specify the source of the study
          if(contact.study_type == LOCAL_SERVER)
          {
            AddNewStudy.FindStudyLocalServer(contact.study_name,contact.url, username,contact.numSess, studyToplogy,contact.bio,contact.psychometric, contact.physiology, contact.observation);
          }
          else
          {
            //if(contact.study_name.toLowerCase.contains("toyota"))
            Global.startCreatingStudy(contact.folder_id, contact.study_name, username, studyToplogy, contact.bio,contact.psychometric, contact.physiology, contact.observation,contact.portrait, contact.public)
            //else
            //report = AddNewStudy.FindStudy(contact.folder_id, contact.study_name, username, studyToplogy,contact.bio,contact.psychometric, contact.physiology, contact.observation,contact.portrait, contact.public);
            //report = GoogleDrive.Malcolm(contact.folder_id, contact.study_name, username, studyToplogy,contact.bio,contact.psychometric, contact.physiology, contact.observation,contact.portrait, contact.public);
          }


          DB.withConnection { implicit c =>


            val rowOption  =
              SQL("select count(*) as c from credential  where userid ={un}")
                .on('un -> username).apply().head
            val studies  =
              SQL("select  distinct(study_name), study_owner, study_id as c from study where study_owner ={un} OR study_id in (select study_id from privilege );").on('un -> username)
            val med = studies().map(row =>
              row[String]("study_name") -> row[String]("study_owner") -> row[Int]("study_id")
            ).toList
            val ctr = rowOption[Long]("c")
            if (ctr >0 &&  report != null) {

              /*val id: Option[Long] =
                SQL("insert into privilege values ({s_id}, 1, {user})")
                  .on('s_id ->  ctr, 'user -> username).executeInsert()*/

              //Ok(views.html.displayStudies(username,med, report)).withSession("connected" -> username)//Ok(views.html.index(contact.username.toString))
              Ok(views.html.ShowStudies(username, med)).withSession("connected" -> username) //Ok(views.html.index(contact.username.toString))
            }
            else
              Ok("The study has not been created. Please make sure that the folder you chose follow the required format")
            //Ok(views.html.login(userForm))
          }

          //Ok(report)
        }
      )
  }


  val deleteMe = Form(
    mapping(
      "study_id" -> number
    )(deleteStudyData.apply)(deleteStudyData.unapply)
  )
  def deleteStudy = Action {
    implicit request =>
      var username: String = "";
      request.session.get("connected").map { user =>
        username = user;
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
      }
      deleteMe.bindFromRequest.fold(
        formWithErrors => {
          BadRequest("The Study Has not been creted Correctly please check that data you entered!")
        },
        contact => {

          DB.withConnection { implicit c =>

            DataBaseOperations.deleteStudy(contact.study_id)
            val studies =
              SQL("select  distinct(study_name), study_owner, study_id as c from study where study_owner ={un} OR study_id in (select study_id from privilege );").on('un -> username)
            val med = studies().map(row =>
              row[String]("study_name") -> row[String]("study_owner") -> row[Int]("study_id")
            ).toList

            Ok(views.html.ShowStudies(username, med)).withSession("connected" -> username)
          }
        }
      )
  }

  def infoForPortrait (studyId: Int) = Action {
    implicit request =>
      var file_location = "";
      var sourceType = 0;
      var s:String = "{}";

      var username: String = "";
      request.session.get("connected").map { user =>
        username = user;
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
      }
      DB.withConnection { implicit c =>


        // s  = GoogleDrive.GetSubjectInfo(username, file_location, sourceType, signal_type,bio);
        var json = Json.parse("");
        Ok(json);

        Ok(s);
      }
  }

  /**
   *  This is called when the user choose on of the tabs (i.e, session)
   */

  def GetSignal(task: String, subject: String, studyId: Int, signal_type: Int, signal_sequence: Int) = Action {
    implicit request =>
      var subjectSeq : Long = 0
      var jsonFromDB = ""
      var file_location = "";
      var isFdn = false;
      var frameRate =  1;
      var signalCode = 1;
      var first_row = 1;
      var first_col =1;
      var study_owner = "";
      var activityFile : String = null;
      var baslineFile :String = null;
      var baselineSessionName : String = ""
      var sourceType = 0;
      var username: String = "";
      request.session.get("connected").map { user =>
        username = user;
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
      }
      println("Recived A signal")
      DB.withConnection { implicit c =>

        val rowOption1 =
          SQL("select subject_seq from subject where subject_id={sub_id} AND study_id={study_id};").on('sub_id -> subject, 'study_id -> studyId).apply().head
        subjectSeq = rowOption1[Long]("subject_seq");



        ///////////////////////////////
        val test =
          SQL("select signal_json   from session  where  subject_seq ={seq}  AND run_no =1 And signal_seq= {signal_seq};").on('seq -> subjectSeq, 'signal_seq -> signal_sequence).apply().head
        val tempSignal = test[Option[String]]("signal_json");
        jsonFromDB = tempSignal match{
          case Some(str) =>
            val source = scala.io.Source.fromFile(str)
            val lines = try source.mkString
            catch{
              case ex: IOException => {
                null
              }
            }
            finally source.close()
            lines
          case None =>
            val rowOption2  =
              SQL("select signal_code, signal_loc, frame_rate, first_row, first_col  from session, signals  where signal_signal_code = signal_code AND subject_seq ={seq}  AND run_no =1 And signal_seq= {signal_seq};").on('seq -> subjectSeq,  'signal_seq -> signal_sequence).apply().head
            file_location = rowOption2[String]("signal_loc");
            frameRate = rowOption2[Int]("frame_rate");
            first_row = rowOption2[Int]("first_row");
            first_col = rowOption2[Int]("first_col");
            signalCode = rowOption2[Int]("signal_code");

            val rowOption3  =
              SQL("select study_type, study_owner from study where study_id={study_id};").on('study_id-> studyId).apply().head
            sourceType = rowOption3[Int]("study_type");
            study_owner = rowOption3[String]("study_owner");

            val activity2 =
            //SQL("select signal_loc from session where subject_seq={seq} AND session_name ={sess_name} AND run_no =1 And signal_signal_code={activity};").on('seq -> seq, 'sess_name-> task, 'activity -> SignalType.getActivityCode).apply().headOption
              SQL("select signal_loc from session where subject_seq={seq} AND session_name ={sess_name} AND run_no =1 And signal_signal_code in (select signal_code from signals where owner = {owner} AND data_type = 6);").on('seq -> subjectSeq, 'sess_name-> task, 'owner -> study_owner).apply().headOption

            activity2 match {
              case firstDay if firstDay.size >0 =>
                activityFile = firstDay.head[String]("signal_loc");
              case None=>
                activityFile = null

            }
            val testForfailure =
            //SQL("select signal_loc from session where subject_seq={seq} AND session_name ={sess_name} AND run_no =1 And signal_signal_code={activity};").on('seq -> seq, 'sess_name-> task, 'activity -> SignalType.getActivityCode).apply().headOption
              SQL("select session_name from session where subject_seq={seq} AND session_name Like '%FDN%' AND run_no =1;").on('seq -> subjectSeq).apply().headOption

            testForfailure match {
              case firstDay if firstDay.size >0 =>
                isFdn =true;
              case None=>
                isFdn = false;
            }
            val blSignal  = SQL("select signal_loc, SESSION_NAME from session where subject_seq={seq} AND  run_no =1 And signal_signal_code ={sc} AND is_baseline =1 ;").on('seq -> subjectSeq, 'sc -> signalCode).apply().headOption
            blSignal match {
              case firstDay if firstDay.size >0 =>
                baslineFile = firstDay.head[String]("signal_loc");
                baselineSessionName = firstDay.head[String]("SESSION_NAME").replaceFirst("(\\d*\\s*)", "") ;
              case None=>
                baslineFile = null;
            }
            // this is to declare that not json was found
            null
        }
      }


      //This is only for failure drive in toyota project
      if(jsonFromDB== null) {
        if (task.toLowerCase.contains("failure") || task.toLowerCase.contains("fdl") || task.toLowerCase.contains("fdn"))
          baslineFile = null;

        var desc: java.util.TreeMap[String, String] = null
        if (signal_type == 4 || baslineFile != null) {


          desc = DataBaseOperations.getDescriptorAsMapJava(studyId)
          //TODO this code should be remove becuase it is not practical to call it every time We can let the user provide us with the baselinename
          // we can send the session schema to user at the beginign and users provide use with it.
          if (desc != null) {
            if (desc.contains(baselineSessionName.replaceFirst("(\\d*\\s*)", "")))
              baselineSessionName = desc(baselineSessionName.replaceFirst("(\\d*\\s*)", ""))
            if (isFdn) desc.put("Failure Drive", "FDN")
            else desc.put("Failure Drive", "FDL")
          }

        }

        var js = GoogleDrive.DownloadSignal(study_owner, file_location, sourceType, signal_type, frameRate, first_row, first_col, activityFile, baslineFile, baselineSessionName, desc);
        if (js == null)
          Ok("");
        else{
          var destination: Path = null
          val id: UUID = UUID.randomUUID
          val fileNmae = "\\jsonFiles\\" + id +".txt";
          val pw = new PrintWriter(new File(fileNmae ))
          DataBaseOperations.UpdateSignalJson(subjectSeq, signal_sequence, fileNmae)
          pw.write(js.toJSONString)
          pw.close
          println("Sent a signal " + request.queryString)
          Ok(js.toJSONString)
        }

      }
      else{
        println("Sent a signal " + request.queryString)
        Ok(jsonFromDB)
      }


  }


  def showRadar (studyNo: Int, SubjectId: String) = Action {
    implicit request =>
      var username: String = "";
      request.session.get("connected").map { user =>
        username = user;
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
      }
      Ok(views.html.ShowRadarForOneSubject(SubjectId, studyNo, username));
  }
  def Getdummy() = Action {
    implicit request =>
      var file_location = "";
      var frameRate =  1;
      var first_row = 1;
      var first_col =1;
      var study_owner = "";
      var activityFile : String = null;
      var sourceType = 0;
      var username: String = "";
      request.session.get("connected").map { user =>
        username = user;
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
      }
      //var js = GoogleDrive.DownloadSignal(username, file_location, sourceType, signal_type);
      var js = Json.arr();

      var temp ="";

      DB.withConnection { implicit c =>

        val rowOption1 =
          SQL("select radar from study where study_id= 2").apply().head
        temp = rowOption1[String]("radar");
        //js = temp.
      }

      Ok(temp)
  }


  def getRadar( studyId: Int, subject: String) = Action {
    implicit request =>
      var username: String = "";
      request.session.get("connected").map { user =>
        username = user;
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
      }
      //var js = GoogleDrive.DownloadSignal(username, file_location, sourceType, signal_type);
      var js = Json.arr();

      var temp ="";

      DB.withConnection { implicit c =>

        val rowOption1 =
          SQL("select radar_value from subject where study_id= {studyNo} AND subject_id= {sub}").on('studyNo -> studyId, 'sub-> subject).apply().head
        temp = rowOption1[String]("radar_value");
        //js = temp.
      }

      println(temp);

      Ok(temp)
  }


  def getInfo (task: String, subject: String, studyId: Int, signal_seq: Int) = Action {
    implicit request =>
      var file_location = "";
      var study_owner = "";
      var sourceType = 0;
      var s:String = "{}";

      var username: String = "";
      request.session.get("connected").map { user =>
        username = user;
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
      }
      DB.withConnection { implicit c =>

        val rowOption1  =
          SQL("select subject_seq, bio_code from subject where subject_id={sub_id} AND study_id={study_id};").on('sub_id -> subject, 'study_id-> studyId).apply().head
        val seq = rowOption1[Long]("subject_seq");
        var bio_code = rowOption1[Int]("bio_code");

        val rowOption4  =
          SQL("select study_type, study_owner from study  where study_id ={study_id};").on('study_id-> studyId).apply().head
        study_owner = rowOption4[String]("study_owner");
        sourceType = rowOption4[Int]("study_type");

        val rowOption2  =
          SQL("select signal_loc from session  where subject_seq ={seq}  AND run_no =1 And signal_seq= {signal_seq};").on('seq -> seq, 'signal_seq -> signal_seq).apply().head
        file_location = rowOption2[String]("signal_loc");



        val bio: Biography = AuxiliaryMethods.BiographyCode(bio_code);
        s  = QueryStudy.GetSubjectInfo2(study_owner, file_location, sourceType, 3,bio);
        if(s == null) // in case the file was deleted by the user..
          Ok("{}");
        else
          Ok(Json.parse(s));
      }

  }


  def getPRF (task: String, subject: String, studyId: Int, signal_type: Int) = Action {
    implicit request =>
      var file_location = "";
      var sourceType = 0;
      var s:String = "{}";

      var username: String = "";
      request.session.get("connected").map { user =>
        username = user;
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
      }
      DB.withConnection { implicit c =>

        val rowOption1  =
          SQL("select subject_seq from subject where subject_id={sub_id} AND study_id={study_id};").on('sub_id -> subject, 'study_id-> studyId).apply().head
        val seq = rowOption1[Long]("subject_seq");

        val check  =
          SQL("select coalesce(count(session_name),0) as c from session where subject_seq={seq} AND session_name='PRF';").on('seq -> seq).apply().head
        var ctr = check[Long]("c");


        if(ctr == 1)
        {
          val rowOption2  =
            SQL("select signal_loc from session  where subject_seq ={seq} AND session_name ='PRF' AND run_no =1 And signal_signal_code= {signal_type};").on('seq -> seq, 'sess_name-> task, 'signal_type -> signal_type).apply().head
          file_location = rowOption2[String]("signal_loc");

          val rowOption3  =
            SQL("select study_type from study where study_id={study_id};").on('study_id-> studyId).apply().head
          sourceType = rowOption3[Int]("study_type");



          s  =QueryStudy.GetSubjectPRF(username, file_location, sourceType);
          var json = Json.parse(s);
          Ok(json);
        }
        else
        {
          Ok(s);
        }
      }

  }



  //case class MinMax(min: Int, max: Int);

  def getPsycho (task: String, subject: String, studyId: Int, signal_seq: Int) = Action {
    implicit request =>
      var file_location = "";
      var study_owner = "";
      var sourceType = 0;

      //var s:String = "{\"Dummy\": \"Dummy\"}";
      var s:String = "{}";

      var username: String = "";
      request.session.get("connected").map { user =>
        username = user;
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
      }
      DB.withConnection { implicit c =>

        val rowOption1  =
          SQL("select subject_seq, psycho from subject where subject_id={sub_id} AND study_id={study_id};").on('sub_id -> subject, 'study_id-> studyId).apply().head
        val seq = rowOption1[Long]("subject_seq");
        var psycho_code = rowOption1[Int]("psycho");

        val rowOption4  =
          SQL("select study_owner, study_type from study  where study_id ={study_id};").on('study_id-> studyId).apply().head
        study_owner = rowOption4[String]("study_owner");
        sourceType = rowOption4[Int]("study_type");


        val rowOption2  =
          SQL("select signal_loc from session  where subject_seq ={seq} AND  run_no =1 And signal_seq = {signal_seq};").on('seq -> seq,  'signal_seq -> signal_seq).apply().head
        file_location = rowOption2[String]("signal_loc");

        val pyc: Psychometric = AuxiliaryMethods.PsychometricCode(psycho_code);


        var lst = DataBaseOperations.listOfPsychometric(username);
        var newLst : java.util.TreeMap[String, SharedData.MinMax] = new java.util.TreeMap[String, SharedData.MinMax]();

        for((k,v) <- lst){
          newLst += k ->new SharedData.MinMax(v._1, v._2)
          //newLst.put(k, MinMax(v._1, v._2))

        }





        //s  = QueryStudy.GetSubjectPm(study_owner, file_location, sourceType, 4,pyc);
        //var json = Json.parse(s);
        //Ok(json);
        Ok(QueryStudy.GetSubjectPm2(study_owner, file_location, sourceType, 4,pyc, newLst).toJSONString)


      }

  }


  def getPortraitInfo (studyId: Int) = Action {
    implicit request =>
      var file_location = "";
      var sourceType = 0;
      var username: String = "";
      request.session.get("connected").map { user =>
        username = user;
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
      }
      DB.withConnection { implicit c =>

        val rowOption1 =
          SQL("select portrait_string from study where study_id={study_id};").on('study_id -> studyId).apply().head
        val parameterList = rowOption1[String]("portrait_string");
        Ok(parameterList);

      }
  }


  def file (task: String, subject: String, studyId: Int, signal_type: Int, signal_sequence: Int) = Action {

    implicit request =>
      var username: String = "";
      var file_location: String= "";
      //var out : OutputStream = ;
      request.session.get("connected").map { user =>
        username = user;
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
      }
      DB.withConnection { implicit c =>

        val rowOption1  =
          SQL("select subject_seq from subject where subject_id={sub_id} AND study_id={study_id};").on('sub_id -> subject, 'study_id-> studyId).apply().head
        val seq = rowOption1[Long]("subject_seq");

        val rowOption2  =
          SQL("select signal_loc from session  where subject_seq ={seq} AND session_name ={sess_name} AND run_no =1 And signal_seq= {signal_seq};").on('seq -> seq, 'sess_name-> task, 'signal_seq -> signal_sequence).apply().head
        file_location = rowOption2[String]("signal_loc");

      }
      val input :InputStream =GoogleDrive.downloadFileToClient(username, file_location);
      val dataContent: Enumerator[Array[Byte]] = Enumerator.fromStream(input)



      //IOUtils.copy(input,out);
      //val zip = new ZipOutputStream(out);
      Result(
        header = ResponseHeader(200, Map(CONTENT_TYPE ->"application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")),
        body = dataContent
      )


    //Ok("Salah Taamneh");
  }

  def zip (studyId: Int) = Action  {

    implicit request =>
      var username: String = "";
      var locations: List[String] = List()
      var subjects: List[String] = List()
      var sessions: List[String] = List()

      var all: List[((String, String), String)] = List();
      var seq :Seq[Int] = null
      ;
      //var out : OutputStream = ;
      request.session.get("connected").map { user =>
        username = user;
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
      }
      DB.withConnection { implicit c =>

        val rowOption1  =
          SQL("select subject_seq from subject where study_id={study_id};").on('study_id-> studyId)
        seq = rowOption1().map(row => row[Int]("subject_seq")).toSeq


        //TODO remove the fixed number 1,2,3,4....


        val rowOption2  =
          SQL("select signal_loc ,subject_id, session_name from session, subject where session.subject_seq  = subject.subject_seq and session.subject_seq in ({seq}) AND signal_signal_code in (1,2,3,4,5,6,7,8) AND run_no =1 order by subject_id;").on('seq -> seq)
        locations = rowOption2().map(row => row[String]("signal_loc")).toList
        subjects = rowOption2().map(row => row[String]("subject_id")).toList
        sessions = rowOption2().map(row => row[String]("session_name")).toList
        //all = rowOption2().map(row => row[String]("signal_loc") -> row[String]("subject_id") -> row[String]("session_id")).toList
      }

      //val x: java.util.List[String] = ListBuffer(List("3", "3"): _*)

      val input :java.util.ArrayList[ZipFileEntry] =GoogleDrive.downloadFileToClientWholeStudy(username, locations.asJava, subjects.asJava, sessions.asJava);
      //java.util.ArrayList[Int]()
      //val excelFilesList: mutable.Buffer[String] = input.asScala;
      //val dataContent: Enumerator[Array[Byte]] = Enumerator.fromStream(input.get(0))

      import play.api.libs.iteratee._
      import java.util.zip._

      val r = new java.util.Random()

      val enumerator = Enumerator.outputStream { os =>
        val zip = new ZipOutputStream(os);
        Range(0, input.size()).map { i =>
          //zip.putNextEntry(new ZipEntry("test-zip/README-"+i+".xlsx"))
          zip.putNextEntry(new ZipEntry( input.get(i).subjectName+ "/" + input.get(i).fileName+i+".xlsx"))
          //zip.write("Here are 100000 random numbers:\n".map(_.toByte).toArray)
          zip.write(IOUtils.toByteArray(input.get(i).data));
          // Let's do 100 writes of 1'000 numbers
          /*Range(0, 100).map { j =>
            zip.write((Range(0, 1000).map(_=>r.nextLong).map(_.toString).mkString("\n")).map(_.toByte).toArray);
          }*/
          zip.closeEntry()
        }
        zip.close()
      }
      Ok.chunked(enumerator >>> Enumerator.eof).withHeaders(
        "Content-Type"->"application/zip",
        "Content-Disposition"->"attachment; filename=test.zip"
      )
  }

  def outputStream(a: java.io.OutputStream => Unit): Enumerator[Array[Byte]] = {
    Concurrent.unicast[Array[Byte]] { channel =>
      val outputStream = new java.io.OutputStream(){
        override def close() {
          channel.end()
        }
        override def flush() {}
        override def write(value: Int) {
          channel.push(Array(value.toByte))
        }
        override def write(buffer: Array[Byte]) {
          write(buffer, 0, buffer.length)
        }
        override def write(buffer: Array[Byte], start: Int, count: Int) {
          channel.push(buffer.slice(start, start+count))
        }
      }
      a(outputStream)
    }
  }




  //*****************************************************************

  def ShowDriveDialog = Action {

    Ok(views.html.googlePicker());
  }




  val registerForm = Form(
    mapping(
      "fullName" -> nonEmptyText,
      "email" -> nonEmptyText,
      "password" -> nonEmptyText,
      "retypePassword" -> nonEmptyText
    )(Models.NewUser.apply)(Models.NewUser.unapply)
  )

  def Register = Action {
    //Ok(views.html.registration(registerForm))
    Ok(" ! ")
  }

  def submitRegistration = Action {
    implicit request =>
      registerForm.bindFromRequest.fold(
        formWithErrors => {
          //BadRequest(views.html.registration(formWithErrors))
          BadRequest(" ")
        },
        contact => {
          DB.withConnection { implicit c =>
            val id: Option[Long] =
              SQL("insert into user(fullname, username, password, email) values ({fn}, {un}, {pass}, {em})")
                .on('fn -> contact.fullName , 'un -> contact.email, 'pass -> contact.password, 'em -> contact.email).executeInsert()
            //Ok(views.html.login(userForm))
            Ok(" ")
          }

        }
      )

  }

  val shareForm = Form(
    mapping(
      "email" -> nonEmptyText,
      "role" -> number,
      "message" -> nonEmptyText,
      "studyId"-> number
    )(Sharing.apply)(Sharing.unapply)
  )

  // Ajax call from inside editStudy html
  def shareMyStudy =Action
  {
    implicit request =>
      var username: String = "";
      request.session.get("connected").map { user =>
        username = user;
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
      }
      shareForm.bindFromRequest.fold(
        formWithErrors => {
          BadRequest("SomeThing Wrong Happened!");
        },
        contact => {
          DB.withConnection { implicit c =>
            val rowOption  =
              SQL("select count(*) as c from privilege where username ={un} AND study_id = {sid} AND permission_type= {per}")
                .on('un -> contact.email, 'sid -> contact.studyId , 'per -> contact.role).apply().head

            val ctr = rowOption[Long]("c")
            if (ctr >0 )
            {
              Ok("The user already has the permission!");
            }
            else {
              val rowOption2  =
                SQL("select count(*) as c from privilege where username ={un} AND study_id = {sid}")
                  .on('un -> contact.email, 'sid -> contact.studyId , 'per -> contact.role).apply().head

              val ctr = rowOption2[Long]("c")
              if (ctr >0 )
              {
                val id: Int =
                  SQL("update privilege set permission_type = {per}")
                    .on( 'per -> contact.role).executeUpdate()
                Ok("The permission has been updated");
              }
              else {
                val id: Option[Long] =
                  SQL("insert into privilege(username,study_id, permission_type) values ({un}, {sid}, {per})")
                    .on('un -> contact.email, 'sid -> contact.studyId, 'per -> contact.role).executeInsert()
                Ok("Thank you, your study has been shared!");
              }
            }
          }

        }
      )

  }


  /*
    It will give the user the opporunity to upload more files under any subfolder
   */

  def sendRequest(StudyName: String) =TODO


  def editStudy(studyId: Int) = Action {
    implicit request =>
      var username: String = "";
      request.session.get("connected").map { user =>
        username = user;
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
      }
      DB.withConnection { implicit c =>
        val subjects =
          SQL("select distinct(subject_id), DOB from subject where study_id ={study_no} order by subject_id;").on('study_no -> studyId)
        val subjectsList = subjects().map(row =>
          row[String]("subject_id") -> row[Date]("DOB")).toList
        Ok(views.html.editStudy("", username, studyId, subjectsList));
      }
  }

  def editSubject(study_no: Int, Subject_id :String) = Action {
    implicit request =>
      var username: String = "";
      request.session.get("connected").map { user =>
        username = user;
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
      }
      DB.withConnection { implicit c =>
        val subjects =
          SQL("select session_no, session_name, singal_desc  from session, signal  where subject_seq = (select subject_seq from subject where subject_id ={sub_id} AND study_id ={study_no})AND signal_signal_code = signal_code;").on('sub_id -> Subject_id ,'study_no -> study_no)
        val subjectsList = subjects().map(row =>
          (row[Int]("session_no"),row[String]("session_name"),row[String]("singal_desc"))).toList
        Ok(views.html.EditSubject(Subject_id,username ,study_no,subjectsList ));
      }
  }


  val newSubject = Form(
    mapping(
      "subject_id" -> nonEmptyText,
      "study_id" -> number,
      "subject_DOB" -> date,
      "subject_gender" -> nonEmptyText,
      "STAI"-> number,
      "PAS"-> number,
      "NAS"-> number
    )(Subject.apply)(Subject.unapply)
  )
  def insertSubject = Action {
    implicit request =>
      newSubject.bindFromRequest.fold(
        formWithErrors => {
          BadRequest("   hh")
        },
        contact => {
          DB.withConnection { implicit c =>
            val rowOption  =
              SQL("select max(subject_seq) as c from subject;").apply().head
            var ctr = rowOption[Long]("c");
            ctr = ctr+1;

            val id: Option[Long] =
              SQL("insert into subject values({seq},{subject_id},{study_id},null, null, SYSDATE ,10,10,10,0,0,0);")
                .on('seq -> ctr , 'subject_id -> contact.subject_id, 'study_id -> contact.study_id).executeInsert()
            Redirect(routes.Application.editStudy(contact.study_id));
          }
        }
      )
  }
  val newSession = Form(
    mapping(
      "subject_id" -> nonEmptyText,
      "study_id" -> number,
      "run_no" -> number,
      "session_name" -> nonEmptyText,
      "signal_type"-> number
    )(NewSession.apply)(NewSession.unapply)
  )
  def InsertSession = Action {
    implicit request =>
      newSession.bindFromRequest.fold(
        formWithErrors => {
          BadRequest("hh")
        },
        contact => {
          DB.withConnection { implicit c =>
            val rowOption1  =
              SQL("select subject_seq from subject where subject_id={sub_id} AND study_id={study_id};").on('sub_id -> contact.subject_id, 'study_id-> contact.study_id).apply().head
            val seq = rowOption1[Long]("subject_seq");

            val rowOption2  =
              SQL("select coalesce(max(session_no),0) as c from session where subject_seq={seq};").on('seq -> seq).apply().head
            var ctr = rowOption2[Long]("c");
            ctr = ctr+1;

            val id: Option[Long] =
              SQL("insert into session values({seq},{sess_no},0 ,{sess_name}, 'sssssss',1);")
                .on('seq -> seq, 'sess_name -> contact.session_name, 'sess_no -> ctr).executeInsert()
            Ok("fdfdfsad");
          }

        }
      )

  }

  def uploadFile = Action(parse.multipartFormData) { implicit request =>
    newSession.bindFromRequest.fold(
      formWithErrors => {
        BadRequest("hh")
      },
      contact => {

        //val contactId = Contact.save(contact)
        //Redirect(routes.Application.showContact(contactId)).flashing("success" -> "Contact saved!")
        DB.withConnection { implicit c =>
          val rowOption1  =
            SQL("select subject_seq from subject where subject_id={sub_id} AND study_id={study_id};").on('sub_id -> contact.subject_id, 'study_id-> contact.study_id).apply().head
          val seq = rowOption1[Long]("subject_seq");

          val rowOption2  =
            SQL("select coalesce(max(session_no),0) as c from session where subject_seq={seq};").on('seq -> seq).apply().head
          var ctr = rowOption2[Long]("c");
          ctr = ctr+1;
          val upload_loc = ""
          var video_loc = upload_loc;
          request.body.file("signal_loc").map { video =>
            val videoFilename = video.filename
            val contentType = video.contentType.get
            video_loc = video_loc + video.filename;
            //video.ref.moveTo(new File("C:\\Users\\staamneh\\Desktop\\CPL-Lab\\System Desgin\\first_play\\target\\web\\public\\main\\images" + video.filename))
            video.ref.moveTo(new File(video_loc));
          }.getOrElse {
            Redirect(routes.Application.Main())
          }
          val id: Option[Long] =
          //INSERT INTO session VALUES(1,1,1,'BL', 'C:\\Users\\staamneh\\Desktop\\CPL-Lab\\System Desgin\\DataSource\\S001\\BaseLine Dexterity\\RI_S001-001.Q_EDA', 1);
            SQL("insert into session values({seq},{sess_no},{run_no} ,{sess_name},{loc},{signal_type});")
              .on('seq -> seq, 'sess_name -> contact.session_name, 'sess_no -> ctr,'run_no-> contact.run_no ,'loc -> video_loc, 'signal_type -> contact.signal_type).executeInsert()
          //Ok("File has been uploaded" +contact.session_name + " " + contact.signal_type +  " "  + contact.study_id  )
          Redirect(routes.Application.editSubject(contact.study_id, contact.subject_id));
        }
      }
    )
  }






  def video = Action {
    Ok.sendFile(
      content = Play.application.getFile("/public/JUST.pdf"),
      inline = true
    )
  }


  def signalDataExample = Action {
    Ok.sendFile(
      content = Play.application.getFile("/public/RI_S001-001.csv"),
      fileName = _ => "singal.csv"
    )
  }

  def InfoExample = Action {
    Ok.sendFile(
      content = Play.application.getFile("/public/S002.info"),
      fileName = _ => "info.txt"
    )
  }

  def PychometricExample = Action {
    Ok.sendFile(
      content = Play.application.getFile("/public/S001.pm"),
      fileName = _ => "pm.txt"
    )
  }


  def tabularExample = Action {
    Ok.sendFile(
      content = Play.application.getFile("/public/T088.bar"),
      fileName = _ => "tabular.csv"
    )
  }

  def videoExample = Action {
    Ok.sendFile(
      content = Play.application.getFile("/public/mov_bbb.mp4"),
      inline = true
    )
  }


  def findImage(img_no : Int) = Action{

    val app = Play.application
    val file = Play.application.getFile("/public/" + img_no + ".jpg")
    val source = scala.io.Source.fromFile(file)(scala.io.Codec.ISO8859)
    val byteArray = source.map(_.toByte).toArray
    source.close()
    Result(
      header = ResponseHeader(200, Map(CONTENT_LENGTH -> file.length.toString)),
      body = Enumerator(byteArray)
    )
  }

  def getVideo () = Action {
    implicit request =>
      var file_location = "";
      var sourceType = 0;
      // var s:String = "{\"Dummy\": \"Dummy\"}";

      var s:String = "{}";

      var username: String = "";
      request.session.get("connected").map { user =>
        username = user;
      }.getOrElse {
        Unauthorized("Oops, you are not connected")
      }




      // var input: InputStream =QueryStudy.GetVideoInputStream(username, "0BzuoB3uc0tTVQWZDWERyMzlkZ1U", sourceType, 8);
      // val fileContent: Enumerator[Array[Byte]] = Enumerator.fromStream(QueryStudy.GetVideoInputStream(username, "0BzuoB3uc0tTVQWZDWERyMzlkZ1U", sourceType, 8));

      val file = new java.io.File("C:\\first_play\\public\\tata.mp4")
      val targetStream = new FileInputStream(file);

      val fileContent: Enumerator[Array[Byte]] = Enumerator.fromStream(targetStream);






      Result(
        header = ResponseHeader(200, Map(
          //CONTENT_LENGTH -> QueryStudy.GetVideoSize(username, "0BzuoB3uc0tTVQWZDWERyMzlkZ1U", sourceType, 8),
          CONTENT_LENGTH -> file.length().toString,
          CONTENT_RANGE -> s"bytes */${file.length()}",
          ACCEPT_RANGES -> "bytes",
          CONTENT_TYPE -> "video/mp4",
          PRAGMA -> "public",
          CONTENT_TRANSFER_ENCODING -> "binary",
          CONTENT_DISPOSITION -> "attachment"
        )),
        body = fileContent
      )


  }



  def test () = Action {
    implicit request =>
      Ok(views.html.testVideoFromDrive());
  }









}


