
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object ShowSubject extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String,List[String],Int,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userName: String, sub_sess: List[( String)], studyNo:Int, study_name:String,  poratratParm: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.102*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>SubjectBook</title>

    <link href="/assets/stylesheets/bootstrap.min.css" rel="stylesheet">
    <link href="/assets/stylesheets/datepicker3.css" rel="stylesheet">
    <link href="/assets/stylesheets/styles.css" rel="stylesheet">

    <!--[if lt IE 9]>
    <script src="/assets/javascripts/html5shiv.js"></script>
    <script src="/assets/javascripts/respond.min.js"></script>
    <![endif]-->


    <script src="/assets/javascripts/jquery-1.11.1.min.js"></script>
    <script src="/assets/javascripts/bootstrap.min.js"></script>
    <script src="/assets/javascripts/chart.min.js"></script>
    <script src="/assets/javascripts/chart-data.js"></script>
    <script src="/assets/javascripts/easypiechart.js"></script>
    <script src="/assets/javascripts/easypiechart-data.js"></script>
    <script src="/assets/javascripts/bootstrap-datepicker.js"></script>

</head>

<body>
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#sidebar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#"><span>Subject</span>Book</a> <a class="navbar-brand" href="/allStudies"><span></span>My Studies</a>
            <a class="navbar-brand" href="#"><span></span>Share</a>
            <a class="navbar-brand" href="#"><span></span>Recommend us</a>
            <ul class="user-menu">
                <li class="dropdown pull-right">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-user"></span> """),_display_(/*44.128*/userName),format.raw/*44.136*/(""" """),format.raw/*44.137*/("""<span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="#"><span class="glyphicon glyphicon-user"></span> Profile</a></li>
                        <li><a href="#"><span class="glyphicon glyphicon-cog"></span> Settings</a></li>
                        <li><a href="#"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
                    </ul>
                </li>
            </ul>
        </div>

    </div><!-- /.container-fluid -->
</nav>

<div id="sidebar-collapse" class="col-sm-3 col-lg-2 sidebar">
    <form role="search">
        <div class="form-group">
            <input type="text" class="form-control" placeholder="Search">
        </div>
    </form>
    <ul class="nav menu">
        <!-- <li><a href="index.html"><span class="glyphicon glyphicon-dashboard"></span> Dashboard</a></li>
        <li><a href="widgets.html"><span class="glyphicon glyphicon-th"></span> Widgets</a></li>
        <li class="active"><a href="charts.html"><span class="glyphicon glyphicon-stats"></span> Charts</a></li> -->
        <li><a href="/allStudies"><span class="glyphicon glyphicon-th"></span> My Studies </a></li>
        <li><a href="/createStudy"><span class="glyphicon glyphicon-pencil"></span> New Study</a></li>
        <li><a href="#"><span class="glyphicon glyphicon glyphicon-share"></span> Share study</a></li>
        <!-- <li><a href="panels.html"><span class="glyphicon glyphicon-info-sign"></span> Alerts &amp; Panels</a></li> -->
        <li role="presentation" class="divider"></li>
        <!-- <li><a href="login.html"><span class="glyphicon glyphicon-user"></span> Login Page</a></li> -->
    </ul>
    <!-- <div class="attribution">Template by <a href="http://www.medialoot.com/item/lumino-admin-bootstrap-template/">Medialoot</a></div> -->
</div><!--/.sidebar-->

<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">
<div class="row">
    <ol class="breadcrumb">
        <li><a href="/allStudies"><span class="glyphicon glyphicon-home"></span></a></li>
        <li class="active"><a href="/showStudy/"""),_display_(/*81.49*/studyNo),format.raw/*81.56*/("""">"""),_display_(/*81.59*/study_name),format.raw/*81.69*/(""" """),format.raw/*81.70*/("""</a> </li>
    </ol>
</div><!--/.row-->




    <!-- <a id ="portart">Portart </a> -->
    <div  class="row" id="portrait" >
    </div>

    <script>

   /*$(document).ready(function()"""),format.raw/*94.34*/("""{"""),format.raw/*94.35*/("""

    """),format.raw/*96.5*/("""alert( """"),_display_(/*96.14*/poratratParm),format.raw/*96.26*/("""" );
    var port = "http://kyeongan.cpl.uh.edu/projects/css/api/generator-portrait.php?" + "subjects=39&cols=3&hideButton=yes&title=ToyotaStudy&genders=M,F,M,F,M,F,F,M,F,M,F,M,F,F,M,F,F,F,M,F,F,F,M,F,F,F,M,F,M,M,F,M,F,F,M,F,F,M,M&exams=8&traits=0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0&grades=NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA&sBars=6.37,83.33,10.3:21.18,72.44,6.38:8.24,82.71,9.05:7.16,88.2,4.64:1.93,66.75,31.32:9.54,76.59,13.87:9.12,84.34,6.54:34.51,56.66,8.82;5.4,78.39,16.22:15.1,68.26,16.64:9.4,83.47,7.13:24.44,56.45,19.12:10,80.91,9.09:13.41,71.15,15.44:8.77,74.12,17.11;16.69,77.8,5.51:23.81,71.66,4.53:14.11,78.87,7.01:18.69,77.03,4.28:7.35,71.83,20.83:15.67,69.12,15.21:2.79,71.34,25.87:6.63,80.99,12.38;29.56,62.84,7.6:21.96,70.29,7.74:4.74,75.7,19.56:15.01,68.1,16.89:13.34,72.2,14.46:6.98,77.7,15.32:21.79,66.52,11.69:18.2,58.37,23.43;23.39,71.2,5.4:30.07,69.76,0.17:13.52,75.49,11:5.05,90.91,4.04:1.28,73.59,25.13:9.04,79.3,11.67:2.52,69.38,28.1:12.57,83.01,4.41;12,85.72,2.28:5.63,82.59,11.79:6.22,90.26,3.53:15.11,83.71,1.18:5.18,84.56,10.26:3.84,70.45,25.71:10.63,64.53,24.84:10.1,66.8,23.09;7.88,81.97,10.15:1.75,71.71,26.53:20.14,77.56,2.3:2.44,81.34,16.22:4.06,77.07,18.87:5.54,86.58,7.88:10.01,85.21,4.78:12.14,81.47,6.39;29.52,62.5,7.98:7.79,89.21,3:13.66,76.63,9.71:2.72,81.65,15.63:1.15,94.89,3.97:5.97,83.14,10.9:2.18,82.89,14.93;16.13,71.79,12.08:14.22,64.94,20.84:4.98,79.03,15.99:10.04,71.85,18.12:21.46,67.79,10.75:21.5,67.44,11.06:9.25,77.06,13.69:17.88,69.01,13.11;20.64,77.55,1.81:5.05,89.84,5.11:1.44,91.86,6.7:6.28,85.27,8.45:3.03,91.01,5.95:0.8,91.98,7.21:4.77,86.62,8.6:0.4,94.55,5.05;5.11,78.53,16.36:8,78.63,13.37:14.36,74.09,11.55:4.96,83.77,11.26:3.37,92.27,4.35:2.76,89.52,7.73:3.1,90.05,6.85:11.99,83.9,4.11;40.13,59.44,0.43:13.74,75.63,10.62:8.01,76.76,15.23:4.41,82.03,13.57:7.95,81,11.05:2.42,81.56,16.01:2.42,77.72,19.86:19.66,76.23,4.11;10.8,78.22,10.99:3.49,81.39,15.11:5.47,89.08,5.45:12.03,80.8,7.16:3.32,89.8,6.88:2.25,85.09,12.66:12.13,76.27,11.6:4.94,77.67,17.39;25.15,67.94,6.91:6.86,70.49,22.65:17.7,72.98,9.32:11.4,73.91,14.69:8.46,82.36,9.18:13.43,74.03,12.54:16.8,66.66,16.54:3.11,74.45,22.44;19.4,79.98,0.62:7.72,89.66,2.62:12.23,81.75,6.02:7.05,89.6,3.35:3.94,91.52,4.54:5.12,67.2,27.68:2.06,71.25,26.7:1.92,88.04,10.03;19.96,74.4,5.64:19.87,70.03,10.1:15.29,73.21,11.5:15.44,70.59,13.98:8.3,76.72,14.98:13.3,68.5,18.2:14.98,70.64,14.37:7.15,66,26.85;6.39,66.57,27.04:8.02,64.46,27.51:8.55,82.29,9.16:13.29,76.94,9.77:6.53,82.07,11.39:11.48,84.46,4.06:10.66,80.7,8.65:4.03,84.82,11.15;36.35,49.86,13.79:13.37,78.96,7.68:28.84,65.22,5.94:18.8,72.55,8.65:10.69,71.72,17.59:10.43,74.4,15.17:1.31,73.9,24.79:6.26,76.27,17.47;5.21,69.54,25.24:26.2,61.18,12.63:26.53,65.47,8:7.78,71.05,21.17:11.91,73.7,14.39:10.77,77.48,11.75:12.28,76.82,10.89:15.9,72.43,11.67;3.87,85.64,10.49:9.47,72.85,17.68:26.71,60.37,12.91:8.47,72.81,18.72:19.33,65.41,15.25:16.47,75.16,8.37:8.72,78.51,12.77:6.63,74.54,18.83;15.49,83.17,1.33:16.14,75.96,7.9:14.47,81.66,3.87:15.85,81.31,2.84:3.98,78.12,17.9:6,82.61,11.38:3.81,69.73,26.46:2.34,64.92,32.74;12.35,76,11.65:14.55,73.23,12.22:10.35,77.19,12.47:11.71,79.18,9.12:6.61,82.8,10.59:10.2,79.17,10.64:13.5,71.62,14.88:3.96,81.62,14.41;10.74,81.84,7.42:5.43,74.9,19.66:36.51,55.09,8.41:7.85,85.99,6.16:7.79,83.07,9.14:4.1,84.5,11.4:6.3,80.5,13.2:5.54,78.94,15.52;15.39,74.51,10.1:13.99,76.1,9.92:9.56,81.37,9.07:15.42,77.21,7.37:15.92,67.67,16.41:10.91,76.86,12.24:7.23,76.42,16.35:7.39,66.37,26.25;16.62,66.8,16.58:6.97,86.08,6.95:6.15,91.27,2.58:8.98,83.87,7.15:17.85,71.8,10.35:15.22,66.28,18.5:10.87,71.59,17.54:4.77,71.92,23.31;6.43,85.87,7.69:13.63,68.81,17.56:19.95,63.76,16.29:9.56,75.95,14.49:16.66,72.9,10.44:15.56,69.85,14.59:13.51,74.52,11.96:1.62,67.39,30.98;0.4,33.2,66.4:8.08,74.15,17.78:7.82,90.36,1.82:5.18,73.42,21.4:15.76,76.61,7.63:9.3,85.28,5.42:19.39,76.78,3.82:11.91,84.65,3.44;33.38,64.37,2.25:21.08,65.94,12.98:17.23,75.11,7.66:10.53,82.8,6.67:6.7,69.39,23.91:10.59,76.78,12.63:7.82,80.31,11.87:8.65,71.78,19.57;49.11,30.96,19.93:1.75,81.78,16.47:5.49,79.32,15.19:8.12,72.57,19.31:4.15,72.21,23.64:6.71,82.87,10.42:23.27,67.44,9.29:28.01,70.37,1.62;1.75,96.21,2.04:1.64,90.34,8.02:5.83,90.72,3.45:2.66,91.32,6.02:7.12,90.56,2.32:3.85,82.99,13.16:0.55,89.29,10.17:0.74,93.77,5.49;0.93,84.01,15.06:9.22,80.38,10.4:20.71,75.09,4.2:9.09,83.63,7.28:8.33,82.95,8.72:7.61,88.59,3.8:9.13,66.78,24.09:1.52,67.64,30.85;54.04,45.16,0.8:13.48,85.35,1.16:23.34,76.41,0.25:4.29,72.49,23.22:1.14,89.56,9.29:0.43,58.54,41.03:11.33,86.27,2.39:17.04,81.5,1.46;7.47,72.44,20.09:13.13,74.87,12:15.24,76.57,8.19:5.73,82.02,12.25:12.08,78.71,9.21:12.76,71.79,15.44:18.88,67.16,13.96:6.39,68.27,25.35;9.79,80.58,9.63:1.87,83.37,14.76:5.05,83.68,11.27:11.8,66.64,21.56:11.16,87.2,1.63:8.88,75.76,15.36:4.07,88.83,7.09;13.98,77.98,8.05:7.44,85.62,6.94:19.87,77.32,2.81:24.57,61.77,13.66:6.12,92.36,1.52:4.15,81.57,14.28:1.01,61.32,37.66:0.06,84.17,15.77;30.09,61.1,8.82:5.98,85.35,8.67:7.45,85.91,6.65:12.27,70.19,17.54:12.33,72.79,14.87:10.98,77.66,11.36:10.85,74.41,14.74:10.39,72.93,16.68;57.36,41.8,0.84:15.06,81.88,3.06:17.52,75.48,7:12.21,82.9,4.89:4.54,82.36,13.1:18.38,77.16,4.46:1.94,55.1,42.96:0.52,49.91,49.56;24.77,74.84,0.39:5.28,92.74,1.98:9.58,90.31,0.12:8.19,91.65,0.16:0.31,68.46,31.24:0.02,89.96,10.02:0.04,90.81,9.15:0.13,81.89,17.98;4.63,66.84,28.54:37.49,60.65,1.86:58.36,41.03,0.61:4.49,71.17,24.34:1.83,74.03,24.14:0.9,76.79,22.31:27.61,69.29,3.11:15.12,80.4,4.48&namesSubjects=T001,T002,T003,T004,T005,T006,T008,T009,T010,T011,T012,T013,T014,T016,T017,T018,T020,T022,T023,T024,T025,T027,T028,T029,T031,T033,T034,T035,T036,T038,T039,T040,T041,T043,T044,T045,T047,T050,T054&studyNo=16&exLinks=http://subjectbook.times.uh.edu/displaySubject&namesExams=BL,PD,ND,LD1,LD2,LD3,LD4,FD;PD,ND,LD1,LD2,LD4,LD3,FD;BL,PD,ND,LD1,LD3,LD2,LD4,FD;BL,PD,ND,LD1,LD3,LD4,LD2,FD;BL,PD,ND,LD1,LD4,LD2,LD3,FD;BL,PD,ND,LD1,LD4,LD3,LD2,FD;BL,PD,ND,LD2,LD1,LD4,LD3,FD;PD,ND,LD2,LD3,LD1,LD4,FD;BL,PD,ND,LD2,LD3,LD4,LD1,FD;BL,PD,ND,LD2,LD4,LD1,LD3,FD;BL,PD,ND,LD2,LD4,LD3,LD1,FD;BL,PD,ND,LD3,LD1,LD2,LD4,FD;BL,PD,ND,LD3,LD1,LD4,LD2,FD;BL,PD,ND,LD3,LD2,LD4,LD1,FD;BL,PD,ND,LD3,LD4,LD1,LD2,FD;BL,PD,ND,LD3,LD4,LD2,LD1,FD;BL,PD,ND,LD2,LD4,LD1,LD3,FD;BL,PD,ND,LD4,LD2,LD3,LD1,FD;BL,PD,ND,LD4,LD3,LD1,LD2,FD;BL,PD,ND,LD4,LD3,LD2,LD1,FD;BL,PD,ND,LD1,LD2,LD3,LD4,FD;BL,PD,ND,LD1,LD3,LD2,LD4,FD;BL,PD,ND,LD1,LD3,LD4,LD2,FD;BL,PD,ND,LD1,LD4,LD2,LD3,FD;BL,PD,ND,LD2,LD1,LD3,LD4,FD;BL,PD,ND,LD2,LD3,LD4,LD1,FD;BL,PD,ND,LD2,LD3,LD4,LD1,FD;BL,PD,ND,LD2,LD4,LD1,LD3,FD;BL,PD,ND,LD2,LD4,LD3,LD1,FD;BL,PD,ND,LD3,LD1,LD4,LD2,FD;BL,PD,ND,LD3,LD2,LD1,LD4,FD;BL,PD,ND,LD3,LD2,LD4,LD1,FD;BL,PD,ND,LD3,LD4,LD1,LD2,FD;BL,PD,ND,LD4,LD1,LD2,LD3,FD;BL,PD,ND,LD4,LD1,LD3,LD2,FD;BL,PD,ND,LD4,LD2,LD1,LD3,FD;BL,PD,ND,LD4,LD3,LD1,LD2,FD;BL,PD,ND,LD1,LD4,LD3,LD2,FD;BL,PD,ND,LD1,LD2,LD3,LD4,FD";

    alert(port);
          $("#portrait").load( port, function() """),format.raw/*100.49*/("""{"""),format.raw/*100.50*/("""
  """),format.raw/*101.3*/("""alert( "Load was performed." );
    """),format.raw/*102.5*/("""}"""),format.raw/*102.6*/(""");
   """),format.raw/*103.4*/("""}"""),format.raw/*103.5*/(""");*/



   $('iframe').load(function()"""),format.raw/*107.31*/("""{"""),format.raw/*107.32*/("""
         """),format.raw/*108.10*/("""//alert('sss');
         var x = document.getElementById("portrait");
         //alert(x);
        $("#S003").clicke(function()"""),format.raw/*111.37*/("""{"""),format.raw/*111.38*/("""
         """),format.raw/*112.10*/("""//alert('sss');
        """),format.raw/*113.9*/("""}"""),format.raw/*113.10*/(""");
        """),format.raw/*114.9*/("""}"""),format.raw/*114.10*/(""");
          //$("#portart").click(function() """),format.raw/*115.44*/("""{"""),format.raw/*115.45*/("""
        """),format.raw/*116.9*/("""var arr =[100,1000,3000,9000];
        //window.location = 'http://kyeongan.cpl.uh.edu/projects/css/api/generator.html?data=1,2,3,4,5,6,76,7,8,8,8,9';
        //window.locaton = 'http://kyeongan.cpl.uh.edu/projects/css/api/generator.html?data=' + result;


       /* paramList =  $.ajax("""),format.raw/*121.31*/("""{"""),format.raw/*121.32*/("""
                   """),format.raw/*122.20*/("""type: 'GET',
                   url: "/portrait",
                   dataType:"text",
                   data: "studyId=" + """),_display_(/*125.40*/studyNo),format.raw/*125.47*/(""",
                    async: false
                   """),format.raw/*127.20*/("""}"""),format.raw/*127.21*/(""").responseText;*/

        //window.location.assign("http://kyeongan.cpl.uh.edu/projects/css/api/generator-portrait.php?"+ paramList);


         //alert(""""),_display_(/*132.20*/poratratParm),format.raw/*132.32*/("""");
        /* var iframe = document.createElement('iframe');
         iframe.style.width = "100%"
         iframe.style.height= "1000px"
         iframe.frameborder = "0";
         //alert("""),_display_(/*137.19*/poratratParm),format.raw/*137.31*/(""");
         iframe.src = "http://kyeongan.cpl.uh.edu/projects/css/api/generator-portrait.php?"""),_display_(/*138.92*/poratratParm),format.raw/*138.104*/("""";
         //document.body.appendChild(iframe);
         document.getElementById("portrait").appendChild(iframe);*/

        //"""),format.raw/*142.11*/("""}"""),format.raw/*142.12*/(""");
    </script>

    <!-- <div>
        <object type="text/html" data="http://kyeongan.cpl.uh.edu/projects/css/api/generator-portrait.php?"""),_display_(/*146.108*/poratratParm),format.raw/*146.120*/("""" width="800px" height="600px" style="overflow:auto;border:5px ridge blue">
        </object>
    </div> -->

    <!-- <meta http-equiv="refresh" content="0; url=http://kyeongan.cpl.uh.edu/projects/css/api/generator-portrait.php?"""),_display_(/*150.121*/poratratParm),format.raw/*150.133*/("""" /> -->



    """),_display_(/*154.6*/if(poratratParm != "")/*154.28*/ {_display_(Seq[Any](format.raw/*154.30*/("""
    """),format.raw/*155.5*/("""<iframe src="http://kyeongan.cpl.uh.edu/projects/css/api/generator-portrait.php?"""),_display_(/*155.86*/poratratParm),format.raw/*155.98*/("""" style="width:100%; height: 3000px;" frameborder="0"></iframe>
    """)))}/*156.7*/else/*156.12*/{_display_(Seq[Any](format.raw/*156.13*/("""

    """),format.raw/*158.5*/("""<div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">Subjects</h1>
        </div>
    </div><!--/.row-->

<div class="row">
    """),_display_(/*165.6*/for(subject <- sub_sess) yield /*165.30*/{_display_(Seq[Any](format.raw/*165.31*/("""
        """),format.raw/*166.9*/("""<div class="col-xs-12 col-md-6 col-lg-3">
            <div class="panel panel-blue panel-widget ">
                <div class="row no-padding">
                    <div class="col-sm-3 col-lg-5 widget-left">
                        <em class="glyphicon glyphicon-user glyphicon-l"></em>
                    </div>
                    <div class="col-sm-9 col-lg-7 widget-right">
                        <div class="large">
                            <a href="/displaySubject?studyNo="""),_display_(/*174.63*/studyNo),format.raw/*174.70*/("""&SubjectId="""),_display_(/*174.82*/subject),format.raw/*174.89*/("""">
                                """),_display_(/*175.34*/subject),format.raw/*175.41*/("""
                            """),format.raw/*176.29*/("""</a>
                        </div>
                        <div class="text-muted">
                            <!-- <a class="" href="#">
                                <span class="glyphicon glyphicon-signal"></span> BL
                            </a> -->

                        </div>
                    </div>
                </div>
            </div>
        </div>
    """)))}),format.raw/*188.6*/("""


"""),format.raw/*191.1*/("""</div><!--/.row-->
    """)))}),format.raw/*192.6*/("""

"""),format.raw/*194.1*/("""</div>	<!--/.main-->

<script>
		$('#calendar').datepicker("""),format.raw/*197.29*/("""{"""),format.raw/*197.30*/("""
		"""),format.raw/*198.3*/("""}"""),format.raw/*198.4*/(""");

		!function ($) """),format.raw/*200.17*/("""{"""),format.raw/*200.18*/("""
		    """),format.raw/*201.7*/("""$(document).on("click","ul.nav li.parent > a > span.icon", function()"""),format.raw/*201.76*/("""{"""),format.raw/*201.77*/("""          
		        """),format.raw/*202.11*/("""$(this).find('em:first').toggleClass("glyphicon-minus");      
		    """),format.raw/*203.7*/("""}"""),format.raw/*203.8*/("""); 
		    $(".sidebar span.icon").find('em:first').addClass("glyphicon-plus");
		"""),format.raw/*205.3*/("""}"""),format.raw/*205.4*/("""(window.jQuery);

		$(window).on('resize', function () """),format.raw/*207.38*/("""{"""),format.raw/*207.39*/("""
		  """),format.raw/*208.5*/("""if ($(window).width() > 768) $('#sidebar-collapse').collapse('show')
		"""),format.raw/*209.3*/("""}"""),format.raw/*209.4*/(""")
		$(window).on('resize', function () """),format.raw/*210.38*/("""{"""),format.raw/*210.39*/("""
		  """),format.raw/*211.5*/("""if ($(window).width() <= 767) $('#sidebar-collapse').collapse('hide')
		"""),format.raw/*212.3*/("""}"""),format.raw/*212.4*/(""")
	</script>
</body>

</html>
"""))}
  }

  def render(userName:String,sub_sess:List[String],studyNo:Int,study_name:String,poratratParm:String): play.twirl.api.HtmlFormat.Appendable = apply(userName,sub_sess,studyNo,study_name,poratratParm)

  def f:((String,List[String],Int,String,String) => play.twirl.api.HtmlFormat.Appendable) = (userName,sub_sess,studyNo,study_name,poratratParm) => apply(userName,sub_sess,studyNo,study_name,poratratParm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri May 22 00:52:13 CDT 2015
                  SOURCE: C:/first_play/app/views/ShowSubject.scala.html
                  HASH: c1092e95d56ac24a6762945d980962251ede1c45
                  MATRIX: 542->1|731->101|759->103|2834->2150|2864->2158|2894->2159|5084->4322|5112->4329|5142->4332|5173->4342|5202->4343|5427->4540|5456->4541|5491->4549|5527->4558|5560->4570|13439->12420|13469->12421|13501->12425|13566->12462|13595->12463|13630->12470|13659->12471|13730->12513|13760->12514|13800->12525|13959->12655|13989->12656|14029->12667|14082->12692|14112->12693|14152->12705|14182->12706|14258->12753|14288->12754|14326->12764|14647->13056|14677->13057|14727->13078|14883->13206|14912->13213|14997->13269|15027->13270|15216->13431|15250->13443|15474->13639|15508->13651|15631->13746|15666->13758|15827->13890|15857->13891|16030->14035|16065->14047|16328->14281|16363->14293|16411->14314|16443->14336|16484->14338|16518->14344|16627->14425|16661->14437|16750->14508|16764->14513|16804->14514|16840->14522|17036->14691|17077->14715|17117->14716|17155->14726|17676->15219|17705->15226|17745->15238|17774->15245|17839->15282|17868->15289|17927->15319|18352->15713|18386->15719|18442->15744|18474->15748|18565->15810|18595->15811|18627->15815|18656->15816|18707->15838|18737->15839|18773->15847|18871->15916|18901->15917|18952->15939|19050->16009|19079->16010|19190->16093|19219->16094|19305->16151|19335->16152|19369->16158|19469->16230|19498->16231|19567->16271|19597->16272|19631->16278|19732->16351|19761->16352
                  LINES: 19->1|22->1|23->2|65->44|65->44|65->44|102->81|102->81|102->81|102->81|102->81|115->94|115->94|117->96|117->96|117->96|121->100|121->100|122->101|123->102|123->102|124->103|124->103|128->107|128->107|129->108|132->111|132->111|133->112|134->113|134->113|135->114|135->114|136->115|136->115|137->116|142->121|142->121|143->122|146->125|146->125|148->127|148->127|153->132|153->132|158->137|158->137|159->138|159->138|163->142|163->142|167->146|167->146|171->150|171->150|175->154|175->154|175->154|176->155|176->155|176->155|177->156|177->156|177->156|179->158|186->165|186->165|186->165|187->166|195->174|195->174|195->174|195->174|196->175|196->175|197->176|209->188|212->191|213->192|215->194|218->197|218->197|219->198|219->198|221->200|221->200|222->201|222->201|222->201|223->202|224->203|224->203|226->205|226->205|228->207|228->207|229->208|230->209|230->209|231->210|231->210|232->211|233->212|233->212
                  -- GENERATED --
              */
          