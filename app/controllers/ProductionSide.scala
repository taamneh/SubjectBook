package controllers

import java.util
/**
 * Created by staamneh on 9/30/2016.
 */
object ProductionSide {


  val videosLocattion = "E:\\videos\\"
  val tempDownloading = "C:\\temp\\"
  val CLIENTSECRETS_LOCATION = "C:\\first_play\\app\\client_secrets.json";

  val REDIRECT_URI = "http://subjectbook.times.uh.edu/display";
  val SCOPES = util.Arrays.asList(
    //"https://www.googleapis.com/auth/drive.file",
    "https://spreadsheets.google.com/feeds",
    "https://www.googleapis.com/auth/drive",
    "https://www.googleapis.com/auth/userinfo.email",
    "https://www.googleapis.com/auth/userinfo.profile");

  val CLIENT_ID: String = "244043910780-hfaucr1q34i87t28ofj2lu70jgm6ho3p.apps.googleusercontent.com";
  val CLIENT_SECRET: String = "ejv6Y0N7up7XUmKENhXMLsXt";


}
