
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
object ShowSignals extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template12[String,Map[String, scala.Tuple2[String, List[scala.Tuple7[String, Int, Int, Option[String], Option[java.math.BigDecimal], Option[java.math.BigDecimal], Int]]]],Int,String,Map[String, List[scala.Tuple3[String, String, String]]],Int,List[scala.Tuple3[String, Long, String]],List[scala.Tuple3[Int, Int, Int]],String,Map[String, List[scala.Tuple3[String, String, String]]],List[String],Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(SubjectId: String, sub_sess:Map[String, (String, List[(String, Int, Int, Option[String], Option[java.math.BigDecimal], Option[java.math.BigDecimal], Int)])], studyNo:Int, userName: String, videos:  Map[String, List[(String, String, String)]], study_type: Int, sub_sess_menu: List[(String, Long, String)], generalList: List[(Int, Int, Int)], studyName: String, audio:  Map[String, List[(String, String, String)]], inProgressSubjects: List[String], isThere : Int):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import java.math.BigInteger; var i=1;
import java.math.BigInteger; var j =1; var t =1; var r=1;

Seq[Any](format.raw/*1.464*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
<head>
    <style type="text/css">



        /* The Modal (background) */
        .modal """),format.raw/*10.16*/("""{"""),format.raw/*10.17*/("""
        """),format.raw/*11.9*/("""display: none; /* Hidden by default */
        position: fixed; /* Stay in place */
        z-index: 1; /* Sit on top */
        padding-top: 100px; /* Location of the box */
        left: 0;
        top: 0;
        width: 100%; /* Full width */
        height: 100%; /* Full height */
        overflow: auto; /* Enable scroll if needed */
        background-color: rgb(0,0,0); /* Fallback color */
        background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
        """),format.raw/*22.9*/("""}"""),format.raw/*22.10*/("""

        """),format.raw/*24.9*/("""/* Modal Content */
        .modal-content """),format.raw/*25.24*/("""{"""),format.raw/*25.25*/("""
        """),format.raw/*26.9*/("""position: relative;
        background-color: #fefefe;
        margin: auto;
        padding: 0;
        border: 1px solid #888;
        width: 80%;
        box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2),0 6px 20px 0 rgba(0,0,0,0.19);
        -webkit-animation-name: animatetop;
        -webkit-animation-duration: 0.4s;
        animation-name: animatetop;
        animation-duration: 0.4s
        """),format.raw/*37.9*/("""}"""),format.raw/*37.10*/("""



        """),format.raw/*41.9*/("""/* The Close Button */
        .close """),format.raw/*42.16*/("""{"""),format.raw/*42.17*/("""
        """),format.raw/*43.9*/("""color: white;
        float: right;
        font-size: 40px;
        font-weight: bold;
        """),format.raw/*47.9*/("""}"""),format.raw/*47.10*/("""

        """),format.raw/*49.9*/(""".close:hover,
        .close:focus """),format.raw/*50.22*/("""{"""),format.raw/*50.23*/("""
        """),format.raw/*51.9*/("""color: #000;
        text-decoration: none;
        cursor: pointer;
        """),format.raw/*54.9*/("""}"""),format.raw/*54.10*/("""

        """),format.raw/*56.9*/(""".modal-header """),format.raw/*56.23*/("""{"""),format.raw/*56.24*/("""
        """),format.raw/*57.9*/("""padding: 2px 10px;
        background-color: DodgerBlue ;
        color: white;
        """),format.raw/*60.9*/("""}"""),format.raw/*60.10*/("""

        """),format.raw/*62.9*/(""".modal-body """),format.raw/*62.21*/("""{"""),format.raw/*62.22*/("""padding: 2px 16px;"""),format.raw/*62.40*/("""}"""),format.raw/*62.41*/("""

        """),format.raw/*64.9*/(""".modal-footer """),format.raw/*64.23*/("""{"""),format.raw/*64.24*/("""
        """),format.raw/*65.9*/("""padding: 2px 16px;
        background-color: #5cb85c;
        color: white;
        """),format.raw/*68.9*/("""}"""),format.raw/*68.10*/("""

        """),format.raw/*70.9*/(""".markerStyle
        """),format.raw/*71.9*/("""{"""),format.raw/*71.10*/("""
        """),format.raw/*72.9*/("""position: absolute;
        left: 40px;
        top: 50px;
        transition: left .5s ease-in, top .5s ease-in;
        width:0.0em;
        height:14.5em;
        #border-left: thick solid #99ccff;
        border-left: thick solid pink;
        white-space:nowrap;
        padding:0.5em;
        z-index: 10;
        """),format.raw/*83.9*/("""}"""),format.raw/*83.10*/("""




        """),format.raw/*88.9*/(""".blink """),format.raw/*88.16*/("""{"""),format.raw/*88.17*/("""
        """),format.raw/*89.9*/("""animation-duration: 1s;
        animation-name: blink;
        animation-iteration-count: infinite;
        animation-timing-function: steps(2, start);
        """),format.raw/*93.9*/("""}"""),format.raw/*93.10*/("""
        """),format.raw/*94.9*/("""@keyframes blink """),format.raw/*94.27*/("""{"""),format.raw/*94.28*/("""
        """),format.raw/*95.9*/("""80% """),format.raw/*95.13*/("""{"""),format.raw/*95.14*/("""
        """),format.raw/*96.9*/("""visibility: hidden;
        """),format.raw/*97.9*/("""}"""),format.raw/*97.10*/("""
        """),format.raw/*98.9*/("""}"""),format.raw/*98.10*/("""


    """),format.raw/*101.5*/("""</style>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>SubjectBook</title>
    <link href="/assets/stylesheets/bootstrap.min.css" rel="stylesheet">
    <link href="/assets/stylesheets/styles.css" rel="stylesheet">

    <!-- <script src="http://code.jquery.com/jquery-1.10.2.js"></script> -->
    <!--<script src="http://code.jquery.com/ui/1.10.4/jquery-ui.js"></script> -->

    <!--[if lt IE 9]>
    <script src="/assets/javascripts/html5shiv.js"></script>
    <script src="/assets/javascripts/respond.min.js"></script>
    <![endif]-->

    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script type="text/javascript" src="https://www.google.com/jsapi"></script>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <!-- <script type='text/javascript' src='"""),_display_(/*119.47*/routes/*119.53*/.Assets.at("javascripts/changevideo.js")),format.raw/*119.93*/("""'></script> -->
    <script type='text/javascript' src='"""),_display_(/*120.42*/routes/*120.48*/.Assets.at("javascripts/signalwithtabNew.js")),format.raw/*120.93*/("""'></script>
    <link rel="stylesheet" type="text/css" href="/assets/stylesheets/jquery-ui-1.9.2.css">


    <script src="/assets/javascripts/bootstrap.min.js"></script>
    <script src="/assets/javascripts/chart.min.js"></script>
    <script src="/assets/javascripts/chart-data.js"></script>
    <script src="/assets/javascripts/easypiechart.js"></script>
    <script src="/assets/javascripts/easypiechart-data.js"></script>
    <script src="/assets/javascripts/bootstrap-datepicker.js"></script>
    <script>

		!function ($) """),format.raw/*132.17*/("""{"""),format.raw/*132.18*/("""
		    """),format.raw/*133.7*/("""$(document).on("click","ul.nav li.parent > a > span.icon", function()"""),format.raw/*133.76*/("""{"""),format.raw/*133.77*/("""
		        """),format.raw/*134.11*/("""$(this).find('em:first').toggleClass("glyphicon-minus");
		    """),format.raw/*135.7*/("""}"""),format.raw/*135.8*/(""");


		    $(".sidebar span.icon").find('em:first').addClass("glyphicon-plus");
		"""),format.raw/*139.3*/("""}"""),format.raw/*139.4*/("""(window.jQuery);

		$(window).on('resize', function () """),format.raw/*141.38*/("""{"""),format.raw/*141.39*/("""
		  """),format.raw/*142.5*/("""if ($(window).width() > 768) $('#sidebar-collapse').collapse('show')
		"""),format.raw/*143.3*/("""}"""),format.raw/*143.4*/(""")
		$(window).on('resize', function () """),format.raw/*144.38*/("""{"""),format.raw/*144.39*/("""
		  """),format.raw/*145.5*/("""if ($(window).width() <= 767) $('#sidebar-collapse').collapse('hide')
		"""),format.raw/*146.3*/("""}"""),format.raw/*146.4*/(""")
        // this is to unfold the subject list
        $(document).ready(function()"""),format.raw/*148.37*/("""{"""),format.raw/*148.38*/("""
        """),format.raw/*149.9*/("""$('ul.nav li.parent > a > span.icon').trigger("click");
        """),format.raw/*150.9*/("""}"""),format.raw/*150.10*/(""");

</script>









    <!-- Ignite UI Required Combined CSS Files -->
    <link href="/assets/stylesheets/infragistics.theme.css" rel="stylesheet">
    <!-- <link href="http://cdn-na.infragistics.com/igniteui/2015.1/latest/css/themes/infragistics/infragistics.theme.css" rel="stylesheet" /> -->
    <!--  <link href="http://cdn-na.infragistics.com/igniteui/2015.1/latest/css/structure/infragistics.css" rel="stylesheet" />-->

    <!-- Used to style the API Viewer and Explorer UI -->
    <!--  <link href="http://www.igniteui.com/css/apiviewer.css" rel="stylesheet" type="text/css" /> -->

    <!--<script src="http://modernizr.com/downloads/modernizr-latest.js"></script> -->
    <script src="http://code.jquery.com/ui/1.10.3/jquery-ui.min.js"></script>

    <!-- Ignite UI Required Combined JavaScript Files -->
    <script src="http://cdn-na.infragistics.com/igniteui/2015.1/latest/js/infragistics.core.js"></script>
    <script src="http://cdn-na.infragistics.com/igniteui/2015.1/latest/js/infragistics.dv.js"></script>


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
            <!-- <a class="navbar-brand" href="#"><span></span>Share</a> -->
            <a class="navbar-brand" href="/frontPage"><span></span>Help</a>
            <ul class="user-menu">
                <li class="dropdown pull-right">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-user"></span> """),_display_(/*194.128*/userName),format.raw/*194.136*/(""" """),format.raw/*194.137*/("""<span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="#"><span class="glyphicon glyphicon-user"></span> Profile</a></li>
                        <li><a href="#"><span class="glyphicon glyphicon-cog"></span> Settings</a></li>
                        <li><a href="/"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
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

        <li><a href="/allStudies"><span class="glyphicon glyphicon-th"></span> My Studies </a></li>
        <li><a href="/createStudy"><span class="glyphicon glyphicon-pencil"></span> New Study</a></li>
        <li><a href="/showAllDataTypes"><span class="glyphicon glyphicon-cog"></span> Manage your Data</a></li>
        <li><a href="/showAllPsychometric"><span class="glyphicon glyphicon-cog"></span> Manage your Psychometric data</a></li>
        <li class="parent ">
            <a href="#">
                <span class="glyphicon glyphicon-list"></span> In Progress Subjects <span data-toggle="collapse" href="#sub-item-1" class="icon pull-right"><em class="glyphicon glyphicon-s glyphicon-plus"></em></span>
            </a>
            <ul class="children collapse1">
                """),_display_(/*224.18*/for(sub <- inProgressSubjects) yield /*224.48*/{_display_(Seq[Any](format.raw/*224.49*/("""
                """),format.raw/*225.17*/("""<li>
                    <a class="" href="/displaySubject?studyNo="""),_display_(/*226.64*/studyNo),format.raw/*226.71*/("""&SubjectId="""),_display_(/*226.83*/sub),format.raw/*226.86*/("""">
                        <div  class="blink"> <span class="glyphicon glyphicon-user" style="color:red"></span> <b style="color:red" class="blink"> """),_display_(/*227.148*/sub),format.raw/*227.151*/("""  """),format.raw/*227.153*/("""</b> </div>
                    </a>
                </li>
                """)))}),format.raw/*230.18*/("""
            """),format.raw/*231.13*/("""</ul>
            <a href="#">
                <span class="glyphicon glyphicon-list"></span> Subjects <span data-toggle="collapse" href="#sub-item-1" class="icon pull-right"><em class="glyphicon glyphicon-s glyphicon-plus"></em></span>
            </a>

            <ul class="children collapse" id="sub-item-1">
                """),_display_(/*237.18*/for((subject, count, grp) <- sub_sess_menu) yield /*237.61*/{_display_(Seq[Any](format.raw/*237.62*/("""
                """),format.raw/*238.17*/("""<li>

                    <a class="" href="/displaySubject?studyNo="""),_display_(/*240.64*/studyNo),format.raw/*240.71*/("""&SubjectId="""),_display_(/*240.83*/subject),format.raw/*240.90*/("""">
                        """),_display_(/*241.26*/if(count > 0)/*241.39*/ {_display_(Seq[Any](format.raw/*241.41*/("""
                        """),_display_(/*242.26*/if(grp == "SIT")/*242.42*/ {_display_(Seq[Any](format.raw/*242.44*/("""
                        """),format.raw/*243.25*/("""<span class="glyphicon glyphicon-user" style="color:red"></span> <b style="color:red"> """),_display_(/*243.113*/subject),format.raw/*243.120*/("""  """),format.raw/*243.122*/("""["""),_display_(/*243.124*/grp),format.raw/*243.127*/("""] </b>
                        """)))}/*244.27*/else/*244.32*/{_display_(Seq[Any](format.raw/*244.33*/(""" """),_display_(/*244.35*/if(grp == "Control")/*244.55*/ {_display_(Seq[Any](format.raw/*244.57*/("""
                        """),format.raw/*245.25*/("""<span class="glyphicon glyphicon-user" style="color:green" ></span> <b style="color:green"> """),_display_(/*245.118*/subject),format.raw/*245.125*/(""" """),format.raw/*245.126*/("""["""),_display_(/*245.128*/grp),format.raw/*245.131*/("""]  </b>
                        """)))}/*246.28*/else/*246.33*/{_display_(Seq[Any](format.raw/*246.34*/("""
                        """),format.raw/*247.25*/("""<span class="glyphicon glyphicon-user" ></span> <b> """),_display_(/*247.78*/subject),format.raw/*247.85*/("""   """),format.raw/*247.88*/("""</b>
                        """)))}),format.raw/*248.26*/("""

                        """)))}),format.raw/*250.26*/("""
                        """)))}/*251.27*/else/*251.32*/{_display_(Seq[Any](format.raw/*251.33*/("""
                        """),format.raw/*252.25*/("""<span class="glyphicon glyphicon-user" style="color:grey"></span> <b style="color:grey"> """),_display_(/*252.115*/subject),format.raw/*252.122*/(""" """),format.raw/*252.123*/("""</b>
                        """)))}),format.raw/*253.26*/("""

                    """),format.raw/*255.21*/("""</a>
                </li>


                """)))}),format.raw/*259.18*/("""

            """),format.raw/*261.13*/("""</ul>
        </li>
        <li role="presentation" class="divider"></li>

    </ul>

</div><!--/.sidebar-->

<div id = 'main' class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">

    <!-- <img src="/assets/images/ajax-loader.gif" alt="Mountain View" style="width:304px;height:228px"> -->
    <!-- <img src="/assets/images/ajax-loader.gif" alt="Mountain View" style="width:304px;height:228px"> -->

    <div class="row">
        <ol class="breadcrumb">
            <li><a href="/allStudies"><span class="glyphicon glyphicon-home"></span></a></li>
            <li class="active"><a href="/showStudy/"""),_display_(/*277.53*/studyNo),format.raw/*277.60*/("""">"""),_display_(/*277.63*/studyName),format.raw/*277.72*/(""" """),format.raw/*277.73*/("""</a> </li>
            <li class="active"><a href="/showStudySkipTop/"""),_display_(/*278.60*/studyNo),format.raw/*278.67*/("""">User Portrait </a> </li>
            <li>"""),_display_(/*279.18*/SubjectId),format.raw/*279.27*/("""</li>



            <!-- <li><button id ='hideSideBar'><a href="/file">toggle</a></button></li> -->
        </ol>
    </div><!--/.row-->
    <div class="row">
        </br>
    </div>

    <div class="row" id ="allInfo">


        <!-- <a href="/showRadar?SubjectId="""),_display_(/*293.45*/SubjectId),format.raw/*293.54*/("""&studyNo="""),_display_(/*293.64*/studyNo),format.raw/*293.71*/(""""> Show Session view </a> -->

        """),_display_(/*295.10*/for(temp <- generalList) yield /*295.34*/{_display_(Seq[Any](format.raw/*295.35*/("""

        """),format.raw/*297.9*/("""<div class="col-md-4" id="generalData"""),_display_(/*297.47*/temp/*297.51*/._1),_display_(/*297.55*/temp/*297.59*/._2),format.raw/*297.62*/(""""  subject=""""),_display_(/*297.75*/SubjectId),format.raw/*297.84*/("""" session="sss" signalSequence=""""),_display_(/*297.117*/temp/*297.121*/._1),format.raw/*297.124*/("""" signalCode=""""),_display_(/*297.139*/temp/*297.143*/._2),format.raw/*297.146*/("""" dataType=""""),_display_(/*297.159*/temp/*297.163*/._3),format.raw/*297.166*/("""" studyId="""),_display_(/*297.177*/studyNo),format.raw/*297.184*/(""" """),format.raw/*297.185*/("""style="display: none;">

        </div>

        """)))}),format.raw/*301.10*/("""



    """),format.raw/*305.5*/("""</div><!--/.row-->


    <div id="myModal" class="modal">

        <!-- Modal content -->
        <div class="modal-content">
            <div class="modal-header">
                <span class="close">×</span>
                <h2>Help</h2>
            </div>
            <div class="modal-body">
                <!--<p>Some text in the Modal Body</p>
                <p>Some other text...</p> -->
                <img src='"""),_display_(/*319.28*/routes/*319.34*/.Assets.at("images/help.gif")),format.raw/*319.63*/("""'  alt="Mountain View" style="width:100%;height:100%;">
            </div>
            <!--<div class="modal-footer">
              <h3>Modal Footer</h3>
            </div> -->
        </div>

    </div>
    <script>
// Get the modal
var modal = document.getElementById('myModal');

var ctr = 0;

// Get the button that opens the modal
//var btn = document.getElementById("myBtn");

// Get the <span> element that closes the modal
var span = document.getElementsByClassName("close")[0];

// When the user clicks the button, open the modal
/*btn.onclick = function() """),format.raw/*340.28*/("""{"""),format.raw/*340.29*/("""
    """),format.raw/*341.5*/("""modal.style.display = "block";
"""),format.raw/*342.1*/("""}"""),format.raw/*342.2*/("""*/


function myFunction() """),format.raw/*345.23*/("""{"""),format.raw/*345.24*/("""
"""),format.raw/*346.1*/("""if ("""),_display_(/*346.6*/isThere),format.raw/*346.13*/(""" """),format.raw/*346.14*/("""== 0 && ctr ==0)
    modal.style.display = "block";
    ctr =1;
"""),format.raw/*349.1*/("""}"""),format.raw/*349.2*/("""

"""),format.raw/*351.1*/("""// When the user clicks on <span> (x), close the modal
span.onclick = function() """),format.raw/*352.27*/("""{"""),format.raw/*352.28*/("""
    """),format.raw/*353.5*/("""modal.style.display = "none";
"""),format.raw/*354.1*/("""}"""),format.raw/*354.2*/("""

"""),format.raw/*356.1*/("""// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) """),format.raw/*357.34*/("""{"""),format.raw/*357.35*/("""
    """),format.raw/*358.5*/("""if (event.target == modal) """),format.raw/*358.32*/("""{"""),format.raw/*358.33*/("""
        """),format.raw/*359.9*/("""modal.style.display = "none";
    """),format.raw/*360.5*/("""}"""),format.raw/*360.6*/("""
"""),format.raw/*361.1*/("""}"""),format.raw/*361.2*/("""
"""),format.raw/*362.1*/("""</script>

    <div class="">
        <div class="panel panel-default">
            <div class="panel-body tabs">
                """),format.raw/*368.1*/("""                """),format.raw/*368.17*/("""<ul class="nav nav-tabs">
                    """),_display_(/*369.22*/for((name,session) <- sub_sess) yield /*369.53*/{_display_(Seq[Any](format.raw/*369.54*/("""
                    """),_display_(/*370.22*/if(i == 1)/*370.32*/ {_display_(Seq[Any](format.raw/*370.34*/("""
                    """),format.raw/*371.21*/("""<li class="active"><a  href="#"""),_display_(/*371.52*/session/*371.59*/._1),format.raw/*371.62*/("""" id="link"""),_display_(/*371.73*/session/*371.80*/._1),format.raw/*371.83*/("""" class="onesignal" subject=""""),_display_(/*371.113*/SubjectId),format.raw/*371.122*/("""" session=""""),_display_(/*371.134*/session/*371.141*/._1),format.raw/*371.144*/("""" newSessionName=""""),_display_(/*371.163*/name),format.raw/*371.167*/("""" studyId="""),_display_(/*371.178*/studyNo),format.raw/*371.185*/("""  """),format.raw/*371.187*/("""occupied ="no" data-toggle="tab">"""),_display_(/*371.221*/name/*371.225*/.replaceFirst("(\\d*\\s*)", "")),format.raw/*371.256*/("""</a></li>
                    """)))}/*372.23*/else/*372.28*/{_display_(Seq[Any](format.raw/*372.29*/("""
                    """),format.raw/*373.21*/("""<li><a  href="#"""),_display_(/*373.37*/session/*373.44*/._1),format.raw/*373.47*/("""" id="link"""),_display_(/*373.58*/session/*373.65*/._1),format.raw/*373.68*/("""" class="onesignal" subject=""""),_display_(/*373.98*/SubjectId),format.raw/*373.107*/("""" session=""""),_display_(/*373.119*/session/*373.126*/._1),format.raw/*373.129*/("""" newSessionName=""""),_display_(/*373.148*/name),format.raw/*373.152*/("""" studyId="""),_display_(/*373.163*/studyNo),format.raw/*373.170*/("""  """),format.raw/*373.172*/("""occupied ="no" data-toggle="tab">"""),_display_(/*373.206*/name/*373.210*/.replaceFirst("(\\d*\\s*)", "")),format.raw/*373.241*/("""</a></li>
                    """)))}),format.raw/*374.22*/("""
                    """),_display_(/*375.22*/{i = i + 1;}),format.raw/*375.34*/("""
                    """)))}),format.raw/*376.22*/("""
                """),format.raw/*377.17*/("""</ul>

                <div class="tab-content"  onmouseover = "myFunction()">

                    """),format.raw/*382.1*/("""                    """),_display_(/*382.22*/for((name,sessions) <- sub_sess) yield /*382.54*/{_display_(Seq[Any](format.raw/*382.55*/("""
                    """),_display_(/*383.22*/if(j == 1)/*383.32*/ {_display_(Seq[Any](format.raw/*383.34*/("""
                    """),format.raw/*384.21*/("""<div id=""""),_display_(/*384.31*/sessions/*384.39*/._1),format.raw/*384.42*/("""" class="tab-pane fade in active">
                        """)))}/*385.27*/else/*385.32*/{_display_(Seq[Any](format.raw/*385.33*/("""
                        """),format.raw/*386.25*/("""<div id=""""),_display_(/*386.35*/sessions/*386.43*/._1),format.raw/*386.46*/("""" class="tab-pane fade">
                            """)))}),format.raw/*387.30*/("""
                            """),_display_(/*388.30*/{j = j + 1;}),format.raw/*388.42*/("""
                            """),_display_(/*389.30*/{r = 1}),format.raw/*389.37*/("""
                            """),_display_(/*390.30*/{t = 1}),format.raw/*390.37*/("""
                            """),_display_(/*391.30*/for(signal <- sessions._2) yield /*391.56*/{_display_(Seq[Any](format.raw/*391.57*/("""
                            """),format.raw/*392.29*/("""<!-- to avoid the non signal files -->
                            """),_display_(/*393.30*/if(signal._3 == 1 || signal._3 == 3 || signal._3 == 4|| signal._3 == 5)/*393.101*/ {_display_(Seq[Any](format.raw/*393.103*/("""
                            """),format.raw/*394.29*/("""<div  id="dashboard_div"""),_display_(/*394.53*/sessions/*394.61*/._1),_display_(/*394.65*/signal/*394.71*/._2),format.raw/*394.74*/("""">
                                <div id="chart"""),_display_(/*395.48*/sessions/*395.56*/._1),_display_(/*395.60*/signal/*395.66*/._2),format.raw/*395.69*/("""" class="chart" subject=""""),_display_(/*395.95*/SubjectId),format.raw/*395.104*/("""" session=""""),_display_(/*395.116*/sessions/*395.124*/._1),format.raw/*395.127*/("""" newSessionName=""""),_display_(/*395.146*/name),format.raw/*395.150*/("""" signalSequence=""""),_display_(/*395.169*/signal/*395.175*/._2),format.raw/*395.178*/("""" signalType=""""),_display_(/*395.193*/signal/*395.199*/._3),format.raw/*395.202*/("""" yTitle = """"),_display_(/*395.215*/signal/*395.221*/._4),format.raw/*395.224*/("""" ymin =""""),_display_(/*395.234*/signal/*395.240*/._5),format.raw/*395.243*/("""" ymax =""""),_display_(/*395.253*/signal/*395.259*/._6),format.raw/*395.262*/(""""  log = """"),_display_(/*395.273*/signal/*395.279*/._7),format.raw/*395.282*/("""" style="height: 250px;">
                                </div>
                            </div>
                            <!--<br> -->

                            <!--<br> -->
                            """),_display_(/*401.30*/if(signal._3 == 1)/*401.48*/{_display_(Seq[Any](format.raw/*401.49*/("""
                            """),format.raw/*402.29*/("""&nbsp;<div id="videoboard"""),_display_(/*402.55*/sessions/*402.63*/._1),_display_(/*402.67*/signal/*402.73*/._2),format.raw/*402.76*/("""" class= "video-board" name="videoboard"""),_display_(/*402.116*/sessions/*402.124*/._1),_display_(/*402.128*/signal/*402.134*/._2),format.raw/*402.137*/("""" style="position:relative; left: 40px; width: 80%; height: 400px; overflow-x:scroll;  white-space: nowrap;" hidden>
                            <div class="button-station"> <a id = "showvideo"""),_display_(/*403.77*/sessions/*403.85*/._1),_display_(/*403.89*/signal/*403.95*/._2),format.raw/*403.98*/("""" class = "btn btn-default show-video" >Hide Videos</a>  </div>
                            <meta http-equiv="X-UA-Compatible" content="IE=Edge"/>
                            """),_display_(/*405.30*/for((sess,videoList) <- videos) yield /*405.61*/{_display_(Seq[Any](format.raw/*405.62*/("""

                            """),_display_(/*407.30*/if(sess == signal._1)/*407.51*/ {_display_(Seq[Any](format.raw/*407.53*/("""
                            """),_display_(/*408.30*/for(video <- videoList) yield /*408.53*/{_display_(Seq[Any](format.raw/*408.54*/("""
                            """),_display_(/*409.30*/if(study_type == 1)/*409.49*/ {_display_(Seq[Any](format.raw/*409.51*/("""
                            """),_display_(/*410.30*/if(r <= 1)/*410.40*/ {_display_(Seq[Any](format.raw/*410.42*/("""

                            """),format.raw/*412.29*/("""<meta  http-equiv="X-UA-Compatible" content="IE=Edge"/>
                            <video controls="controls"  id="videofile"""),_display_(/*413.71*/video/*413.76*/._2),_display_(/*413.80*/signal/*413.86*/._2),format.raw/*413.89*/("""" width="400" height="300" class = "sal" vName =""""),_display_(/*413.139*/video/*413.144*/._3),format.raw/*413.147*/("""" sess=""""),_display_(/*413.156*/sessions/*413.164*/._1),format.raw/*413.167*/("""" sub= """"),_display_(/*413.176*/SubjectId),format.raw/*413.185*/("""" >
                                <source src="" type='video/mp4'/>
                                <!--<source src="/videoC?studyNo="""),_display_(/*415.67*/studyNo),format.raw/*415.74*/("""&subjectId="""),_display_(/*415.86*/SubjectId),format.raw/*415.95*/("""&sessionName="""),_display_(/*415.109*/sessions/*415.117*/._1),format.raw/*415.120*/("""&fileName="""),_display_(/*415.131*/video/*415.136*/._3),format.raw/*415.139*/("""" type='video/mp4'/>-->
                                <!-- <source src="https://drive.google.com/uc?export=download&id="""),_display_(/*416.99*/video/*416.104*/._2),format.raw/*416.107*/("""" type='video/mp4'/>
                                <!-- <source src="https://googledrive.com/host/"""),_display_(/*417.81*/video/*417.86*/._2),format.raw/*417.89*/("""" type='video/mp4'/> -->
                                <!-- <source src="/videoB" type='video/mp4'/>-->
                            </video>




                            """)))}),format.raw/*424.30*/("""
                            """),format.raw/*425.29*/("""<!--<object  id=""""),_display_(/*425.47*/video),format.raw/*425.52*/("""" class = "vdTag">
                                <param name='movie' value='https://video.google.com/get_player?docid=0B2TDTGk9sqZLQjlxcVRxYUNqOFE&amp;ps=docs&amp;partnerid=30&amp;cc_load_policy=1'></param>
                                <param name='allowFullScreen' value='true'></param>
                                <param name='allowScriptAccess' value='always'></param>
                                <embed id='video"""),_display_(/*429.50*/video/*429.55*/._2),_display_(/*429.59*/signal/*429.65*/._2),format.raw/*429.68*/("""' src='https://video.google.com/get_player?docid="""),_display_(/*429.118*/video/*429.123*/._2),format.raw/*429.126*/("""&amp;enablejsapi=1&amp;ps=docs&amp;partnerid=30&amp;cc_load_policy=1&amp;playerapiid=video"""),_display_(/*429.217*/video/*429.222*/._2),_display_(/*429.226*/signal/*429.232*/._2),format.raw/*429.235*/("""' type='application/x-shockwave-flash' allowfullscreen='true' allowScriptAccess='always' width=50% height='300'></embed>
                            </object> -->


                            """)))}/*433.31*/else/*433.36*/{_display_(Seq[Any](format.raw/*433.37*/("""

                            """),format.raw/*435.29*/("""<meta http-equiv="X-UA-Compatible" content="IE=Edge"/>
                            <video id=""""),_display_(/*436.41*/video),format.raw/*436.46*/("""" width="640" height="264" controls>
                                <source src="/videoB" controls type='video/mp4' >
                                <source src="file:///"""),_display_(/*438.55*/video/*438.60*/._2),format.raw/*438.63*/(""""
                                        type='video/ogg; codecs="theora, vorbis"'>
                                Your user agent does not support the HTML5 Video element.
                            </video>

                            """)))}),format.raw/*443.30*/(""" """),format.raw/*443.31*/("""<!-- else -->

                            """)))}),format.raw/*445.30*/(""" """),format.raw/*445.31*/("""<!-- video List -->
                            """),_display_(/*446.30*/{r = r + 1}),format.raw/*446.41*/("""
                            """)))}),format.raw/*447.30*/(""" """),format.raw/*447.31*/("""<!-- if sess== session._1 -->
                            """)))}),format.raw/*448.30*/("""<!-- main for for videos -->


                            """),_display_(/*451.30*/for((sess,videoList) <- audio) yield /*451.60*/{_display_(Seq[Any](format.raw/*451.61*/("""
                            """),_display_(/*452.30*/if(sess == signal._1)/*452.51*/ {_display_(Seq[Any](format.raw/*452.53*/("""
                            """),_display_(/*453.30*/for(video <- videoList) yield /*453.53*/{_display_(Seq[Any](format.raw/*453.54*/("""
                            """),_display_(/*454.30*/if(study_type == 1)/*454.49*/ {_display_(Seq[Any](format.raw/*454.51*/("""
                            """),_display_(/*455.30*/if(t == 1)/*455.40*/ {_display_(Seq[Any](format.raw/*455.42*/("""
                            """),format.raw/*456.29*/("""<!-- <audio controls="controls" id=""""),_display_(/*456.66*/video/*456.71*/._2),format.raw/*456.74*/(""""  src="https://googledrive.com/host/"""),_display_(/*456.112*/video/*456.117*/._2),format.raw/*456.120*/("""" type=audio/x-wav" width="400" height="300" class = "sal" vName =""""),_display_(/*456.188*/video/*456.193*/._3),format.raw/*456.196*/("""" sess=""""),_display_(/*456.205*/sessions/*456.213*/._1),format.raw/*456.216*/("""" sub= """"),_display_(/*456.225*/SubjectId),format.raw/*456.234*/(""""> </audio> -->
                            <audio controls id=""""),_display_(/*457.50*/video/*457.55*/._2),format.raw/*457.58*/("""" width="400" height="300" class = "sal"  vName =""""),_display_(/*457.109*/video/*457.114*/._3),format.raw/*457.117*/("""" sess=""""),_display_(/*457.126*/sessions/*457.134*/._1),format.raw/*457.137*/("""" sub= """"),_display_(/*457.146*/SubjectId),format.raw/*457.155*/("""">
                                <source src="" type="audio/mpeg">
                                <p id = """"),_display_(/*459.43*/t),format.raw/*459.44*/("""" >Your browser does not support the <code>audio</code> element </p>
                            </audio>
                            """)))}),format.raw/*461.30*/("""
                            """)))}),format.raw/*462.30*/("""
                            """),_display_(/*463.30*/{t = t + 1}),format.raw/*463.41*/("""
                            """)))}),format.raw/*464.30*/(""" """),format.raw/*464.31*/("""<!-- video List -->

                            """)))}),format.raw/*466.30*/(""" """),format.raw/*466.31*/("""<!-- if sess== session._1 -->
                            """)))}),format.raw/*467.30*/("""<!-- main for for videos -->

                            <br>
                            <a id = "stopvideo"""),_display_(/*470.48*/sessions/*470.56*/._1),_display_(/*470.60*/signal/*470.66*/._2),format.raw/*470.69*/(""""  class="btn btn-default">Stop Videos</a>   &nbsp; &nbsp;
                        </div>

                            """)))}),format.raw/*473.30*/(""" """),format.raw/*473.31*/("""<!-- check the sequence number  -->
                            """)))}),format.raw/*474.30*/(""" """),format.raw/*474.31*/("""<!-- check the type of signal -->


                            """)))}),format.raw/*477.30*/("""
                        """),format.raw/*478.25*/("""</div>
                        """)))}),format.raw/*479.26*/("""

                    """),format.raw/*481.21*/("""</div>
                </div>
            </div><!--/.panel-->
        </div><!--/.col-->




    </div>	<!--/.main-->



</div>

<div id="loading" style="display:none; position: fixed;height:100%; width:100%; background: rgba( 255, 255, 255, .8 ) url('/assets/images/ajax-loader.gif') 50% 50%    no-repeat;">
</div>

</body>

</html>
"""))}
  }

  def render(SubjectId:String,sub_sess:Map[String, scala.Tuple2[String, List[scala.Tuple7[String, Int, Int, Option[String], Option[java.math.BigDecimal], Option[java.math.BigDecimal], Int]]]],studyNo:Int,userName:String,videos:Map[String, List[scala.Tuple3[String, String, String]]],study_type:Int,sub_sess_menu:List[scala.Tuple3[String, Long, String]],generalList:List[scala.Tuple3[Int, Int, Int]],studyName:String,audio:Map[String, List[scala.Tuple3[String, String, String]]],inProgressSubjects:List[String],isThere:Int): play.twirl.api.HtmlFormat.Appendable = apply(SubjectId,sub_sess,studyNo,userName,videos,study_type,sub_sess_menu,generalList,studyName,audio,inProgressSubjects,isThere)

  def f:((String,Map[String, scala.Tuple2[String, List[scala.Tuple7[String, Int, Int, Option[String], Option[java.math.BigDecimal], Option[java.math.BigDecimal], Int]]]],Int,String,Map[String, List[scala.Tuple3[String, String, String]]],Int,List[scala.Tuple3[String, Long, String]],List[scala.Tuple3[Int, Int, Int]],String,Map[String, List[scala.Tuple3[String, String, String]]],List[String],Int) => play.twirl.api.HtmlFormat.Appendable) = (SubjectId,sub_sess,studyNo,userName,videos,study_type,sub_sess_menu,generalList,studyName,audio,inProgressSubjects,isThere) => apply(SubjectId,sub_sess,studyNo,userName,videos,study_type,sub_sess_menu,generalList,studyName,audio,inProgressSubjects,isThere)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Dec 28 16:18:32 CST 2016
                  SOURCE: C:/first_play/app/views/ShowSignals.scala.html
                  HASH: e8300b094c34b30b6163faabd8c1dc339f8ed1c4
                  MATRIX: 891->1|1537->463|1565->465|1714->586|1743->587|1780->597|2291->1081|2320->1082|2359->1094|2431->1138|2460->1139|2497->1149|2926->1551|2955->1552|2998->1568|3065->1607|3094->1608|3131->1618|3258->1718|3287->1719|3326->1731|3390->1767|3419->1768|3456->1778|3563->1858|3592->1859|3631->1871|3673->1885|3702->1886|3739->1896|3857->1987|3886->1988|3925->2000|3965->2012|3994->2013|4040->2031|4069->2032|4108->2044|4150->2058|4179->2059|4216->2069|4330->2156|4359->2157|4398->2169|4447->2191|4476->2192|4513->2202|4871->2533|4900->2534|4945->2552|4980->2559|5009->2560|5046->2570|5237->2734|5266->2735|5303->2745|5348->2763|5377->2764|5414->2774|5446->2778|5475->2779|5512->2789|5568->2818|5597->2819|5634->2829|5663->2830|5701->2840|6685->3796|6701->3802|6763->3842|6849->3900|6865->3906|6932->3951|7501->4491|7531->4492|7567->4500|7665->4569|7695->4570|7736->4582|7828->4646|7857->4647|7971->4733|8000->4734|8086->4791|8116->4792|8150->4798|8250->4870|8279->4871|8348->4911|8378->4912|8412->4918|8513->4991|8542->4992|8657->5078|8687->5079|8725->5089|8818->5154|8848->5155|10965->7243|10996->7251|11027->7252|12658->8855|12705->8885|12745->8886|12792->8904|12889->8973|12918->8980|12958->8992|12983->8995|13163->9146|13189->9149|13221->9151|13332->9230|13375->9244|13740->9581|13800->9624|13840->9625|13887->9643|13986->9714|14015->9721|14055->9733|14084->9740|14141->9769|14164->9782|14205->9784|14260->9811|14286->9827|14327->9829|14382->9855|14499->9943|14529->9950|14561->9952|14592->9954|14618->9957|14671->9991|14685->9996|14725->9997|14755->9999|14785->10019|14826->10021|14881->10047|15003->10140|15033->10147|15064->10148|15095->10150|15121->10153|15175->10189|15189->10194|15229->10195|15284->10221|15365->10274|15394->10281|15426->10284|15489->10315|15550->10344|15597->10372|15611->10377|15651->10378|15706->10404|15825->10494|15855->10501|15886->10502|15949->10533|16002->10557|16084->10607|16129->10623|16785->11251|16814->11258|16845->11261|16876->11270|16906->11271|17005->11342|17034->11349|17107->11394|17138->11403|17448->11685|17479->11694|17517->11704|17546->11711|17616->11753|17657->11777|17697->11778|17737->11790|17803->11828|17817->11832|17842->11836|17856->11840|17881->11843|17922->11856|17953->11865|18015->11898|18030->11902|18056->11905|18100->11920|18115->11924|18141->11927|18183->11940|18198->11944|18224->11947|18264->11958|18294->11965|18325->11966|18411->12020|18451->12032|18917->12470|18933->12476|18984->12505|19600->13092|19630->13093|19664->13099|19724->13131|19753->13132|19812->13162|19842->13163|19872->13165|19904->13170|19933->13177|19963->13178|20058->13245|20087->13246|20119->13250|20230->13332|20260->13333|20294->13339|20353->13370|20382->13371|20414->13375|20541->13473|20571->13474|20605->13480|20661->13507|20691->13508|20729->13518|20792->13553|20821->13554|20851->13556|20880->13557|20910->13559|21073->13734|21118->13750|21194->13798|21242->13829|21282->13830|21333->13853|21353->13863|21394->13865|21445->13887|21504->13918|21521->13925|21546->13928|21585->13939|21602->13946|21627->13949|21686->13979|21718->13988|21759->14000|21777->14007|21803->14010|21851->14029|21878->14033|21918->14044|21948->14051|21980->14053|22043->14087|22058->14091|22112->14122|22164->14155|22178->14160|22218->14161|22269->14183|22313->14199|22330->14206|22355->14209|22394->14220|22411->14227|22436->14230|22494->14260|22526->14269|22567->14281|22585->14288|22611->14291|22659->14310|22686->14314|22726->14325|22756->14332|22788->14334|22851->14368|22866->14372|22920->14403|22984->14435|23035->14458|23069->14470|23124->14493|23171->14511|23303->14675|23352->14696|23401->14728|23441->14729|23492->14752|23512->14762|23553->14764|23604->14786|23642->14796|23660->14804|23685->14807|23766->14869|23780->14874|23820->14875|23875->14901|23913->14911|23931->14919|23956->14922|24043->14977|24102->15008|24136->15020|24195->15051|24224->15058|24283->15089|24312->15096|24371->15127|24414->15153|24454->15154|24513->15184|24610->15253|24692->15324|24734->15326|24793->15356|24845->15380|24863->15388|24888->15392|24904->15398|24929->15401|25008->15452|25026->15460|25051->15464|25067->15470|25092->15473|25146->15499|25178->15508|25219->15520|25238->15528|25264->15531|25312->15550|25339->15554|25387->15573|25404->15579|25430->15582|25474->15597|25491->15603|25517->15606|25559->15619|25576->15625|25602->15628|25641->15638|25658->15644|25684->15647|25723->15657|25740->15663|25766->15666|25806->15677|25823->15683|25849->15686|26095->15904|26123->15922|26163->15923|26222->15953|26276->15979|26294->15987|26319->15991|26335->15997|26360->16000|26429->16040|26448->16048|26474->16052|26491->16058|26517->16061|26739->16255|26757->16263|26782->16267|26798->16273|26823->16276|27029->16454|27077->16485|27117->16486|27178->16519|27209->16540|27250->16542|27309->16573|27349->16596|27389->16597|27448->16628|27477->16647|27518->16649|27577->16680|27597->16690|27638->16692|27699->16724|27854->16851|27869->16856|27894->16860|27910->16866|27935->16869|28014->16919|28030->16924|28056->16927|28094->16936|28113->16944|28139->16947|28177->16956|28209->16965|28375->17103|28404->17110|28444->17122|28475->17131|28518->17145|28537->17153|28563->17156|28603->17167|28619->17172|28645->17175|28796->17298|28812->17303|28838->17306|28968->17408|28983->17413|29008->17416|29223->17599|29282->17629|29328->17647|29355->17652|29817->18086|29832->18091|29857->18095|29873->18101|29898->18104|29977->18154|29993->18159|30019->18162|30139->18253|30155->18258|30181->18262|30198->18268|30224->18271|30442->18470|30456->18475|30496->18476|30557->18508|30681->18604|30708->18609|30911->18784|30926->18789|30951->18792|31230->19039|31260->19040|31338->19086|31368->19087|31446->19137|31479->19148|31542->19179|31572->19180|31664->19240|31755->19303|31802->19333|31842->19334|31901->19365|31932->19386|31973->19388|32032->19419|32072->19442|32112->19443|32171->19474|32200->19493|32241->19495|32300->19526|32320->19536|32361->19538|32420->19568|32485->19605|32500->19610|32525->19613|32592->19651|32608->19656|32634->19659|32731->19727|32747->19732|32773->19735|32811->19744|32830->19752|32856->19755|32894->19764|32926->19773|33020->19839|33035->19844|33060->19847|33140->19898|33156->19903|33182->19906|33220->19915|33239->19923|33265->19926|33303->19935|33335->19944|33476->20057|33499->20058|33668->20195|33731->20226|33790->20257|33823->20268|33886->20299|33916->20300|34000->20352|34030->20353|34122->20413|34263->20526|34281->20534|34306->20538|34322->20544|34347->20547|34502->20670|34532->20671|34630->20737|34660->20738|34760->20806|34815->20832|34880->20865|34933->20889
                  LINES: 19->1|23->1|24->2|32->10|32->10|33->11|44->22|44->22|46->24|47->25|47->25|48->26|59->37|59->37|63->41|64->42|64->42|65->43|69->47|69->47|71->49|72->50|72->50|73->51|76->54|76->54|78->56|78->56|78->56|79->57|82->60|82->60|84->62|84->62|84->62|84->62|84->62|86->64|86->64|86->64|87->65|90->68|90->68|92->70|93->71|93->71|94->72|105->83|105->83|110->88|110->88|110->88|111->89|115->93|115->93|116->94|116->94|116->94|117->95|117->95|117->95|118->96|119->97|119->97|120->98|120->98|123->101|141->119|141->119|141->119|142->120|142->120|142->120|154->132|154->132|155->133|155->133|155->133|156->134|157->135|157->135|161->139|161->139|163->141|163->141|164->142|165->143|165->143|166->144|166->144|167->145|168->146|168->146|170->148|170->148|171->149|172->150|172->150|216->194|216->194|216->194|246->224|246->224|246->224|247->225|248->226|248->226|248->226|248->226|249->227|249->227|249->227|252->230|253->231|259->237|259->237|259->237|260->238|262->240|262->240|262->240|262->240|263->241|263->241|263->241|264->242|264->242|264->242|265->243|265->243|265->243|265->243|265->243|265->243|266->244|266->244|266->244|266->244|266->244|266->244|267->245|267->245|267->245|267->245|267->245|267->245|268->246|268->246|268->246|269->247|269->247|269->247|269->247|270->248|272->250|273->251|273->251|273->251|274->252|274->252|274->252|274->252|275->253|277->255|281->259|283->261|299->277|299->277|299->277|299->277|299->277|300->278|300->278|301->279|301->279|315->293|315->293|315->293|315->293|317->295|317->295|317->295|319->297|319->297|319->297|319->297|319->297|319->297|319->297|319->297|319->297|319->297|319->297|319->297|319->297|319->297|319->297|319->297|319->297|319->297|319->297|319->297|323->301|327->305|341->319|341->319|341->319|362->340|362->340|363->341|364->342|364->342|367->345|367->345|368->346|368->346|368->346|368->346|371->349|371->349|373->351|374->352|374->352|375->353|376->354|376->354|378->356|379->357|379->357|380->358|380->358|380->358|381->359|382->360|382->360|383->361|383->361|384->362|389->368|389->368|390->369|390->369|390->369|391->370|391->370|391->370|392->371|392->371|392->371|392->371|392->371|392->371|392->371|392->371|392->371|392->371|392->371|392->371|392->371|392->371|392->371|392->371|392->371|392->371|392->371|392->371|393->372|393->372|393->372|394->373|394->373|394->373|394->373|394->373|394->373|394->373|394->373|394->373|394->373|394->373|394->373|394->373|394->373|394->373|394->373|394->373|394->373|394->373|394->373|395->374|396->375|396->375|397->376|398->377|402->382|402->382|402->382|402->382|403->383|403->383|403->383|404->384|404->384|404->384|404->384|405->385|405->385|405->385|406->386|406->386|406->386|406->386|407->387|408->388|408->388|409->389|409->389|410->390|410->390|411->391|411->391|411->391|412->392|413->393|413->393|413->393|414->394|414->394|414->394|414->394|414->394|414->394|415->395|415->395|415->395|415->395|415->395|415->395|415->395|415->395|415->395|415->395|415->395|415->395|415->395|415->395|415->395|415->395|415->395|415->395|415->395|415->395|415->395|415->395|415->395|415->395|415->395|415->395|415->395|415->395|415->395|415->395|421->401|421->401|421->401|422->402|422->402|422->402|422->402|422->402|422->402|422->402|422->402|422->402|422->402|422->402|423->403|423->403|423->403|423->403|423->403|425->405|425->405|425->405|427->407|427->407|427->407|428->408|428->408|428->408|429->409|429->409|429->409|430->410|430->410|430->410|432->412|433->413|433->413|433->413|433->413|433->413|433->413|433->413|433->413|433->413|433->413|433->413|433->413|433->413|435->415|435->415|435->415|435->415|435->415|435->415|435->415|435->415|435->415|435->415|436->416|436->416|436->416|437->417|437->417|437->417|444->424|445->425|445->425|445->425|449->429|449->429|449->429|449->429|449->429|449->429|449->429|449->429|449->429|449->429|449->429|449->429|449->429|453->433|453->433|453->433|455->435|456->436|456->436|458->438|458->438|458->438|463->443|463->443|465->445|465->445|466->446|466->446|467->447|467->447|468->448|471->451|471->451|471->451|472->452|472->452|472->452|473->453|473->453|473->453|474->454|474->454|474->454|475->455|475->455|475->455|476->456|476->456|476->456|476->456|476->456|476->456|476->456|476->456|476->456|476->456|476->456|476->456|476->456|476->456|476->456|477->457|477->457|477->457|477->457|477->457|477->457|477->457|477->457|477->457|477->457|477->457|479->459|479->459|481->461|482->462|483->463|483->463|484->464|484->464|486->466|486->466|487->467|490->470|490->470|490->470|490->470|490->470|493->473|493->473|494->474|494->474|497->477|498->478|499->479|501->481
                  -- GENERATED --
              */
          