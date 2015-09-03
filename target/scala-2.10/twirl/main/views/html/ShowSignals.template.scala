
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
object ShowSignals extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template8[String,Map[String, List[scala.Tuple2[String, List[scala.Tuple2[Int, Int]]]]],Int,String,Map[String, List[String]],Int,List[String],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(SubjectId: String, sub_sess:Map[String, List[(String, List[(Int, Int)])]], studyNo:Int, userName: String, videos:  Map[String, List[ String]], study_type: Int, sub_sess_menu: List[String], studyName: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import java.math.BigInteger; var ctr =1;
import java.math.BigInteger; var i=1;
import java.math.BigInteger; var j =1;

Seq[Any](format.raw/*1.210*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
<head>
    <style type="text/css">

        .markerStyle
        """),format.raw/*8.9*/("""{"""),format.raw/*8.10*/("""
        """),format.raw/*9.9*/("""position: absolute;
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
        """),format.raw/*20.9*/("""}"""),format.raw/*20.10*/("""


    """),format.raw/*23.5*/("""</style>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>SubjectBook</title>
    <link href="/assets/stylesheets/bootstrap.min.css" rel="stylesheet">
    <link href="/assets/stylesheets/styles.css" rel="stylesheet">

    <script src="http://code.jquery.com/jquery-1.10.2.js"></script>
    <script src="http://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>

    <!--[if lt IE 9]>
    <script src="/assets/javascripts/html5shiv.js"></script>
    <script src="/assets/javascripts/respond.min.js"></script>
    <![endif]-->

    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script type="text/javascript" src="https://www.google.com/jsapi"></script>
    <script type='text/javascript' src='"""),_display_(/*40.42*/routes/*40.48*/.Assets.at("javascripts/changevideo.js")),format.raw/*40.88*/("""'></script>
    <script type='text/javascript' src='"""),_display_(/*41.42*/routes/*41.48*/.Assets.at("javascripts/signalwithtabNew.js")),format.raw/*41.93*/("""'></script>
    <link rel="stylesheet" type="text/css" href="/assets/stylesheets/jquery-ui-1.9.2.css">


    <script src="/assets/javascripts/bootstrap.min.js"></script>
    <script src="/assets/javascripts/chart.min.js"></script>
    <script src="/assets/javascripts/chart-data.js"></script>
    <script src="/assets/javascripts/easypiechart.js"></script>
    <script src="/assets/javascripts/easypiechart-data.js"></script>
    <script src="/assets/javascripts/bootstrap-datepicker.js"></script>
    <script>

		!function ($) """),format.raw/*53.17*/("""{"""),format.raw/*53.18*/("""
		    """),format.raw/*54.7*/("""$(document).on("click","ul.nav li.parent > a > span.icon", function()"""),format.raw/*54.76*/("""{"""),format.raw/*54.77*/("""
		        """),format.raw/*55.11*/("""$(this).find('em:first').toggleClass("glyphicon-minus");
		    """),format.raw/*56.7*/("""}"""),format.raw/*56.8*/(""");


		     $(document).on("click","div#BioTop div.panel div.panel-heading > a > span.icon", function()"""),format.raw/*59.99*/("""{"""),format.raw/*59.100*/("""
		        """),format.raw/*60.11*/("""$("div.panel div#Bio").slideToggle();
		    """),format.raw/*61.7*/("""}"""),format.raw/*61.8*/(""");

		      $(document).on("click","div#phychoTop div.panel div.panel-heading > a > span.icon", function()"""),format.raw/*63.103*/("""{"""),format.raw/*63.104*/("""
		        """),format.raw/*64.11*/("""$("div.panel div#phycho").slideToggle();
		    """),format.raw/*65.7*/("""}"""),format.raw/*65.8*/(""");


		      $(document).on("click","div#generalInfo div.panel div.panel-heading > a > span.icon", function()"""),format.raw/*68.105*/("""{"""),format.raw/*68.106*/("""
		        """),format.raw/*69.11*/("""$("div.panel div#general").slideToggle();
		    """),format.raw/*70.7*/("""}"""),format.raw/*70.8*/(""");


		    $(".sidebar span.icon").find('em:first').addClass("glyphicon-plus");
		"""),format.raw/*74.3*/("""}"""),format.raw/*74.4*/("""(window.jQuery);

		$(window).on('resize', function () """),format.raw/*76.38*/("""{"""),format.raw/*76.39*/("""
		  """),format.raw/*77.5*/("""if ($(window).width() > 768) $('#sidebar-collapse').collapse('show')
		"""),format.raw/*78.3*/("""}"""),format.raw/*78.4*/(""")
		$(window).on('resize', function () """),format.raw/*79.38*/("""{"""),format.raw/*79.39*/("""
		  """),format.raw/*80.5*/("""if ($(window).width() <= 767) $('#sidebar-collapse').collapse('hide')
		"""),format.raw/*81.3*/("""}"""),format.raw/*81.4*/(""")
        // this is to unfold the subject list
        $(document).ready(function()"""),format.raw/*83.37*/("""{"""),format.raw/*83.38*/("""
        """),format.raw/*84.9*/("""$('ul.nav li.parent > a > span.icon').trigger("click");
        """),format.raw/*85.9*/("""}"""),format.raw/*85.10*/(""");

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
            <a class="navbar-brand" href="#"><span></span>Share</a>
            <a class="navbar-brand" href="#"><span></span>Recommend us</a>
            <ul class="user-menu">
                <li class="dropdown pull-right">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-user"></span> """),_display_(/*129.128*/userName),format.raw/*129.136*/(""" """),format.raw/*129.137*/("""<span class="caret"></span></a>
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

        <li><a href="/allStudies"><span class="glyphicon glyphicon-th"></span> My Studies </a></li>
        <li><a href="/createStudy"><span class="glyphicon glyphicon-pencil"></span> New Study</a></li>
        <li><a href="#"><span class="glyphicon glyphicon glyphicon-share"></span> Share study</a></li>
        <li class="parent ">
            <a href="#">
                <span class="glyphicon glyphicon-list"></span> Subjects <span data-toggle="collapse" href="#sub-item-1" class="icon pull-right"><em class="glyphicon glyphicon-s glyphicon-plus"></em></span>
            </a>
            <ul class="children collapse" id="sub-item-1">
                """),_display_(/*158.18*/for(subject <- sub_sess_menu) yield /*158.47*/{_display_(Seq[Any](format.raw/*158.48*/("""

                """),format.raw/*160.17*/("""<li>

                    <a class="" href="/displaySubject?studyNo="""),_display_(/*162.64*/studyNo),format.raw/*162.71*/("""&SubjectId="""),_display_(/*162.83*/subject),format.raw/*162.90*/("""">
                        <span class="glyphicon glyphicon-user"></span> """),_display_(/*163.73*/subject),format.raw/*163.80*/("""
                    """),format.raw/*164.21*/("""</a>
                </li>


                """)))}),format.raw/*168.18*/("""

            """),format.raw/*170.13*/("""</ul>
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
            <li class="active"><a href="/showStudy/"""),_display_(/*186.53*/studyNo),format.raw/*186.60*/("""">"""),_display_(/*186.63*/studyName),format.raw/*186.72*/(""" """),format.raw/*186.73*/("""</a> </li><li>"""),_display_(/*186.88*/SubjectId),format.raw/*186.97*/("""</li>



            <!-- <li><button id ='hideSideBar'><a href="/file">toggle</a></button></li> -->
        </ol>
    </div><!--/.row-->
    <div class="row">
        </br>
    </div>

    <div class="row" id ="allInfo">
        <div class="col-md-8" id ="phychoTop" style="display: none;">
            <div class="panel panel-info">
                <div class="panel-heading">
                    Phychometrics <a><span data-toggle="collapse" href="#" class="icon pull-right"><em class="glyphicon glyphicon-chevron-down"></em></span> </a>
                </div>
                <div id ="phycho" class="panel-body">
                </div>
            </div>
        </div>

        <div class="col-md-4" id="BioTop" style="display: none;">
            <div class="panel panel-info">

                <div class="panel-heading">
                    Biography <a><span data-toggle="collapse" href="#" class="icon pull-right"><em class="glyphicon glyphicon-chevron-down"></em></span> </a>

                </div>
                <div id="Bio" class="panel-body">
                    <span class="glyphicons glyphicons-girl"></span>
                </div>
            </div>
        </div>


        <div class="col-lg-12" id ="generalInfo" style="display: none;">
            <div class="panel panel-info">
                <div class="panel-heading">
                    NASA Task Load Index <a><span data-toggle="collapse" href="#" class="icon pull-right"><em class="glyphicon glyphicon-chevron-down"></em></span> </a>
                </div>
                <div id ="general" class="panel-body">


                    """),format.raw/*231.1*/("""                    """),_display_(/*231.22*/for((subject,sessions) <- sub_sess) yield /*231.57*/{_display_(Seq[Any](format.raw/*231.58*/("""
                    """),_display_(/*232.22*/for(session <- sessions) yield /*232.46*/{_display_(Seq[Any](format.raw/*232.47*/("""

                    """),_display_(/*234.22*/for(signal <- session._2) yield /*234.47*/{_display_(Seq[Any](format.raw/*234.48*/("""
                    """),_display_(/*235.22*/if(signal._2 == 12)/*235.41*/ {_display_(Seq[Any](format.raw/*235.43*/("""

                    """),format.raw/*237.21*/("""<div  id="dashboard_div"""),_display_(/*237.45*/session/*237.52*/._1),_display_(/*237.56*/signal/*237.62*/._1),format.raw/*237.65*/("""">
                        <div id="chartBar"""),_display_(/*238.43*/session/*238.50*/._1),_display_(/*238.54*/signal/*238.60*/._1),format.raw/*238.63*/("""" class="chartBar" subject=""""),_display_(/*238.92*/subject),format.raw/*238.99*/("""" session=""""),_display_(/*238.111*/session/*238.118*/._1),format.raw/*238.121*/("""" signalSequence=""""),_display_(/*238.140*/signal/*238.146*/._1),format.raw/*238.149*/("""" signalType=""""),_display_(/*238.164*/signal/*238.170*/._2),format.raw/*238.173*/(""""  style="height: 250px;">
                        </div>
                    </div>

                    """)))}),format.raw/*242.22*/("""
                    """)))}),format.raw/*243.22*/("""

                    """)))}),format.raw/*245.22*/("""
                    """)))}),format.raw/*246.22*/("""
                """),format.raw/*247.17*/("""</div>
            </div>
        </div>


    </div><!--/.row-->
    <div class="">
        <div class="panel panel-default">
            <div class="panel-body tabs">
                """),format.raw/*257.1*/("""                """),_display_(/*257.18*/for((subject,sessions) <- sub_sess) yield /*257.53*/{_display_(Seq[Any](format.raw/*257.54*/("""
                """),format.raw/*258.17*/("""<ul class="nav nav-tabs">
                    """),_display_(/*259.22*/for(session <- sessions if session._1 != "BAR") yield /*259.69*/{_display_(Seq[Any](format.raw/*259.70*/("""
                    """),_display_(/*260.22*/if(i == 1)/*260.32*/ {_display_(Seq[Any](format.raw/*260.34*/("""
                    """),format.raw/*261.21*/("""<li class="active"><a  href="#"""),_display_(/*261.52*/session/*261.59*/._1),format.raw/*261.62*/("""" id="link"""),_display_(/*261.73*/session/*261.80*/._1),format.raw/*261.83*/("""" class="onesignal" subject=""""),_display_(/*261.113*/subject),format.raw/*261.120*/("""" session=""""),_display_(/*261.132*/session/*261.139*/._1),format.raw/*261.142*/("""" studyId="""),_display_(/*261.153*/studyNo),format.raw/*261.160*/("""  """),format.raw/*261.162*/("""occupied ="no" data-toggle="tab">"""),_display_(/*261.196*/session/*261.203*/._1),format.raw/*261.206*/("""</a></li>
                    """)))}/*262.23*/else/*262.28*/{_display_(Seq[Any](format.raw/*262.29*/("""
                    """),format.raw/*263.21*/("""<li><a  href="#"""),_display_(/*263.37*/session/*263.44*/._1),format.raw/*263.47*/("""" id="link"""),_display_(/*263.58*/session/*263.65*/._1),format.raw/*263.68*/("""" class="onesignal" subject=""""),_display_(/*263.98*/subject),format.raw/*263.105*/("""" session=""""),_display_(/*263.117*/session/*263.124*/._1),format.raw/*263.127*/("""" studyId="""),_display_(/*263.138*/studyNo),format.raw/*263.145*/("""  """),format.raw/*263.147*/("""occupied ="no" data-toggle="tab">"""),_display_(/*263.181*/session/*263.188*/._1),format.raw/*263.191*/("""</a></li>
                    """)))}),format.raw/*264.22*/("""
                    """),_display_(/*265.22*/{i = i + 1;}),format.raw/*265.34*/("""
                    """)))}),format.raw/*266.22*/("""
                """),format.raw/*267.17*/("""</ul>
                """)))}),format.raw/*268.18*/("""

                """),format.raw/*270.17*/("""<div class="tab-content">

                    """),format.raw/*273.1*/("""                    """),_display_(/*273.22*/for((subject,sessions) <- sub_sess) yield /*273.57*/{_display_(Seq[Any](format.raw/*273.58*/("""
                    """),_display_(/*274.22*/for(session <- sessions) yield /*274.46*/{_display_(Seq[Any](format.raw/*274.47*/("""

                    """),_display_(/*276.22*/if(j == 1)/*276.32*/ {_display_(Seq[Any](format.raw/*276.34*/("""
                    """),format.raw/*277.21*/("""<div id=""""),_display_(/*277.31*/session/*277.38*/._1),format.raw/*277.41*/("""" class="tab-pane fade in active">
                        """)))}/*278.27*/else/*278.32*/{_display_(Seq[Any](format.raw/*278.33*/("""
                        """),format.raw/*279.25*/("""<div id=""""),_display_(/*279.35*/session/*279.42*/._1),format.raw/*279.45*/("""" class="tab-pane fade">
                            """)))}),format.raw/*280.30*/("""
                            """),_display_(/*281.30*/{j = j + 1;}),format.raw/*281.42*/("""
                            """),_display_(/*282.30*/for(signal <- session._2) yield /*282.55*/{_display_(Seq[Any](format.raw/*282.56*/("""
                            """),format.raw/*283.29*/("""<!-- to avoid the non signal files -->
                            """),_display_(/*284.30*/if(signal._2 < 100)/*284.49*/ {_display_(Seq[Any](format.raw/*284.51*/("""
                            """),format.raw/*285.29*/("""<!-- <div id="Combo" style="border-style: solid;  border-radius: 15px; border-color: #636363;"> -->
                            <!-- <div class="panel-heading" id="header"""),_display_(/*286.72*/session/*286.79*/._1),_display_(/*286.83*/signal/*286.89*/._1),format.raw/*286.92*/(""""> </div> -->
                            <!--  <div class="panel-body">-->
                            <div  id="dashboard_div"""),_display_(/*288.53*/session/*288.60*/._1),_display_(/*288.64*/signal/*288.70*/._1),format.raw/*288.73*/("""">
                                <div id="chart"""),_display_(/*289.48*/session/*289.55*/._1),_display_(/*289.59*/signal/*289.65*/._1),format.raw/*289.68*/("""" class="chart" subject=""""),_display_(/*289.94*/subject),format.raw/*289.101*/("""" session=""""),_display_(/*289.113*/session/*289.120*/._1),format.raw/*289.123*/("""" signalSequence=""""),_display_(/*289.142*/signal/*289.148*/._1),format.raw/*289.151*/("""" signalType=""""),_display_(/*289.166*/signal/*289.172*/._2),format.raw/*289.175*/(""""  style="height: 250px;">
                                </div>
                                <!--<div id="filter_div"""),_display_(/*291.57*/session/*291.64*/._1),_display_(/*291.68*/signal/*291.74*/._1),format.raw/*291.77*/("""" style="height: 50px;"></div> -->
                            </div>
                            <!--<br> -->

                            <!--<br> -->
                            &nbsp;<div id="videoboard"""),_display_(/*296.55*/session/*296.62*/._1),_display_(/*296.66*/signal/*296.72*/._1),format.raw/*296.75*/("""" class= "video-board" name="videoboard"""),_display_(/*296.115*/session/*296.122*/._1),_display_(/*296.126*/signal/*296.132*/._1),format.raw/*296.135*/("""" style="position:relative; left: 40px; width: 80%; height: 400px; overflow-x:scroll;  white-space: nowrap;" hidden>
                            <div class="button-station"> <a id = "showvideo"""),_display_(/*297.77*/session/*297.84*/._1),_display_(/*297.88*/signal/*297.94*/._1),format.raw/*297.97*/("""" class = "btn btn-default show-video" >Hide Videos</a> <!--&nbsp; &nbsp; &nbsp; &nbsp; <a id = "dynamic"""),_display_(/*297.202*/session/*297.209*/._1),_display_(/*297.213*/signal/*297.219*/._1),format.raw/*297.222*/("""" class="btn btn-default" style="display: none;">Dynamic</a>  &nbsp; &nbsp; <a id = "showvideo"""),_display_(/*297.317*/session/*297.324*/._1),_display_(/*297.328*/signal/*297.334*/._1),format.raw/*297.337*/("""" class = "btn btn-default show-video" style="display: none;" >Show Videos</a> &nbsp; &nbsp; <a id = "editchart"""),_display_(/*297.449*/session/*297.456*/._1),_display_(/*297.460*/signal/*297.466*/._1),format.raw/*297.469*/("""" class = "btn btn-default" style="display: none;">Edit Chart</a> &nbsp; &nbsp;<a id = "export"""),_display_(/*297.564*/session/*297.571*/._1),_display_(/*297.575*/signal/*297.581*/._1),format.raw/*297.584*/("""" style="display: none;" class = "btn btn-default">Export data</a>  <br>--> </div>
                            """),_display_(/*298.30*/{import java.math.BigInteger; var i=1}),format.raw/*298.68*/("""
                            """),_display_(/*299.30*/for((sess,videoList) <- videos) yield /*299.61*/{_display_(Seq[Any](format.raw/*299.62*/("""
                            """),_display_(/*300.30*/if(sess == session._1)/*300.52*/ {_display_(Seq[Any](format.raw/*300.54*/("""
                            """),_display_(/*301.30*/for(video <- videoList) yield /*301.53*/{_display_(Seq[Any](format.raw/*301.54*/("""
                            """),_display_(/*302.30*/if(study_type == 1)/*302.49*/ {_display_(Seq[Any](format.raw/*302.51*/("""
                            """),format.raw/*303.29*/("""<object id=""""),_display_(/*303.42*/video),format.raw/*303.47*/("""">
                                <param name='movie' value='https://video.google.com/get_player?docid=0B2TDTGk9sqZLQjlxcVRxYUNqOFE&amp;ps=docs&amp;partnerid=30&amp;cc_load_policy=1'></param>
                                <param name='allowFullScreen' value='true'></param>
                                <param name='allowScriptAccess' value='always'></param>
                                <embed id='video"""),_display_(/*307.50*/video),_display_(/*307.56*/signal/*307.62*/._1),format.raw/*307.65*/("""' src='https://video.google.com/get_player?docid="""),_display_(/*307.115*/video),format.raw/*307.120*/("""&amp;ps=docs&amp;partnerid=30&amp;cc_load_policy=1&amp;color=white&amp;autoplay=0&amp;enablejsapi=1&amp;playerapiid=video"""),_display_(/*307.242*/video),_display_(/*307.248*/signal/*307.254*/._1),format.raw/*307.257*/("""' type='application/x-shockwave-flash' allowfullscreen='true' allowScriptAccess='always' width=50% height='300'></embed>
                            </object>
                            """)))}/*309.31*/else/*309.36*/{_display_(Seq[Any](format.raw/*309.37*/("""
                            """),format.raw/*310.29*/("""<object width='400' height='250' id=""""),_display_(/*310.67*/video),format.raw/*310.72*/("""">
                                <embed src='"""),_display_(/*311.46*/video),format.raw/*311.51*/("""' type='video/x-ms-wm' allowfullscreen='true' play ='false' autostart="false"  allowScriptAccess='always' width='350' height='250'></embed></object>
                            """)))}),format.raw/*312.30*/("""
                            """),_display_(/*313.30*/{i = i + 1}),format.raw/*313.41*/("""
                            """)))}),format.raw/*314.30*/("""
                            """)))}),format.raw/*315.30*/("""
                            """)))}),format.raw/*316.30*/("""
                            """),format.raw/*317.29*/("""<br>
                            <a id = "stopvideo"""),_display_(/*318.48*/session/*318.55*/._1),_display_(/*318.59*/signal/*318.65*/._1),format.raw/*318.68*/(""""  class="btn btn-default">Stop Videos</a>   &nbsp; &nbsp;
                        </div>
                            <!--</div> -->
                            <!-- <br><br><br> <br><br><br> -->
                            """)))}),format.raw/*322.30*/("""
                            """)))}),format.raw/*323.30*/("""
                        """),format.raw/*324.25*/("""</div>
                        """)))}),format.raw/*325.26*/("""
                        """)))}),format.raw/*326.26*/("""

                    """),format.raw/*328.21*/("""</div>
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

  def render(SubjectId:String,sub_sess:Map[String, List[scala.Tuple2[String, List[scala.Tuple2[Int, Int]]]]],studyNo:Int,userName:String,videos:Map[String, List[String]],study_type:Int,sub_sess_menu:List[String],studyName:String): play.twirl.api.HtmlFormat.Appendable = apply(SubjectId,sub_sess,studyNo,userName,videos,study_type,sub_sess_menu,studyName)

  def f:((String,Map[String, List[scala.Tuple2[String, List[scala.Tuple2[Int, Int]]]]],Int,String,Map[String, List[String]],Int,List[String],String) => play.twirl.api.HtmlFormat.Appendable) = (SubjectId,sub_sess,studyNo,userName,videos,study_type,sub_sess_menu,studyName) => apply(SubjectId,sub_sess,studyNo,userName,videos,study_type,sub_sess_menu,studyName)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Sep 03 13:39:20 CDT 2015
                  SOURCE: C:/first_play/app/views/ShowSignals.scala.html
                  HASH: 96df08e09c4c2982dffc1921905fc827e3568369
                  MATRIX: 642->1|1056->209|1084->211|1204->305|1232->306|1268->316|1626->647|1655->648|1692->658|2560->1499|2575->1505|2636->1545|2717->1599|2732->1605|2798->1650|3366->2190|3395->2191|3430->2199|3527->2268|3556->2269|3596->2281|3687->2345|3715->2346|3849->2452|3879->2453|3919->2465|3991->2510|4019->2511|4156->2619|4186->2620|4226->2632|4301->2680|4329->2681|4470->2793|4500->2794|4540->2806|4616->2855|4644->2856|4757->2942|4785->2943|4870->3000|4899->3001|4932->3007|5031->3079|5059->3080|5127->3120|5156->3121|5189->3127|5289->3200|5317->3201|5431->3287|5460->3288|5497->3298|5589->3363|5618->3364|7725->5442|7756->5450|7787->5451|9283->6919|9329->6948|9369->6949|9418->6969|9517->7040|9546->7047|9586->7059|9615->7066|9719->7142|9748->7149|9799->7171|9881->7221|9926->7237|10582->7865|10611->7872|10642->7875|10673->7884|10703->7885|10746->7900|10777->7909|12468->9615|12517->9636|12569->9671|12609->9672|12660->9695|12701->9719|12741->9720|12794->9745|12836->9770|12876->9771|12927->9794|12956->9813|12997->9815|13050->9839|13102->9863|13119->9870|13144->9874|13160->9880|13185->9883|13259->9929|13276->9936|13301->9940|13317->9946|13342->9949|13399->9978|13428->9985|13469->9997|13487->10004|13513->10007|13561->10026|13578->10032|13604->10035|13648->10050|13665->10056|13691->10059|13834->10170|13889->10193|13946->10218|14001->10241|14048->10259|14270->10493|14315->10510|14367->10545|14407->10546|14454->10564|14530->10612|14594->10659|14634->10660|14685->10683|14705->10693|14746->10695|14797->10717|14856->10748|14873->10755|14898->10758|14937->10769|14954->10776|14979->10779|15038->10809|15068->10816|15109->10828|15127->10835|15153->10838|15193->10849|15223->10856|15255->10858|15318->10892|15336->10899|15362->10902|15414->10935|15428->10940|15468->10941|15519->10963|15563->10979|15580->10986|15605->10989|15644->11000|15661->11007|15686->11010|15744->11040|15774->11047|15815->11059|15833->11066|15859->11069|15899->11080|15929->11087|15961->11089|16024->11123|16042->11130|16068->11133|16132->11165|16183->11188|16217->11200|16272->11223|16319->11241|16375->11265|16424->11285|16501->11375|16550->11396|16602->11431|16642->11432|16693->11455|16734->11479|16774->11480|16827->11505|16847->11515|16888->11517|16939->11539|16977->11549|16994->11556|17019->11559|17100->11621|17114->11626|17154->11627|17209->11653|17247->11663|17264->11670|17289->11673|17376->11728|17435->11759|17469->11771|17528->11802|17570->11827|17610->11828|17669->11858|17766->11927|17795->11946|17836->11948|17895->11978|18095->12150|18112->12157|18137->12161|18153->12167|18178->12170|18336->12300|18353->12307|18378->12311|18394->12317|18419->12320|18498->12371|18515->12378|18540->12382|18556->12388|18581->12391|18635->12417|18665->12424|18706->12436|18724->12443|18750->12446|18798->12465|18815->12471|18841->12474|18885->12489|18902->12495|18928->12498|19080->12622|19097->12629|19122->12633|19138->12639|19163->12642|19403->12854|19420->12861|19445->12865|19461->12871|19486->12874|19555->12914|19573->12921|19599->12925|19616->12931|19642->12934|19864->13128|19881->13135|19906->13139|19922->13145|19947->13148|20081->13253|20099->13260|20125->13264|20142->13270|20168->13273|20292->13368|20310->13375|20336->13379|20353->13385|20379->13388|20520->13500|20538->13507|20564->13511|20581->13517|20607->13520|20731->13615|20749->13622|20775->13626|20792->13632|20818->13635|20959->13748|21019->13786|21078->13817|21126->13848|21166->13849|21225->13880|21257->13902|21298->13904|21357->13935|21397->13958|21437->13959|21496->13990|21525->14009|21566->14011|21625->14041|21666->14054|21693->14059|22139->14477|22166->14483|22182->14489|22207->14492|22286->14542|22314->14547|22465->14669|22493->14675|22510->14681|22536->14684|22746->14875|22760->14880|22800->14881|22859->14911|22925->14949|22952->14954|23029->15003|23056->15008|23267->15187|23326->15218|23359->15229|23422->15260|23485->15291|23548->15322|23607->15352|23688->15405|23705->15412|23730->15416|23746->15422|23771->15425|24032->15654|24095->15685|24150->15711|24215->15744|24274->15771|24327->15795
                  LINES: 19->1|24->1|25->2|31->8|31->8|32->9|43->20|43->20|46->23|63->40|63->40|63->40|64->41|64->41|64->41|76->53|76->53|77->54|77->54|77->54|78->55|79->56|79->56|82->59|82->59|83->60|84->61|84->61|86->63|86->63|87->64|88->65|88->65|91->68|91->68|92->69|93->70|93->70|97->74|97->74|99->76|99->76|100->77|101->78|101->78|102->79|102->79|103->80|104->81|104->81|106->83|106->83|107->84|108->85|108->85|152->129|152->129|152->129|181->158|181->158|181->158|183->160|185->162|185->162|185->162|185->162|186->163|186->163|187->164|191->168|193->170|209->186|209->186|209->186|209->186|209->186|209->186|209->186|253->231|253->231|253->231|253->231|254->232|254->232|254->232|256->234|256->234|256->234|257->235|257->235|257->235|259->237|259->237|259->237|259->237|259->237|259->237|260->238|260->238|260->238|260->238|260->238|260->238|260->238|260->238|260->238|260->238|260->238|260->238|260->238|260->238|260->238|260->238|264->242|265->243|267->245|268->246|269->247|278->257|278->257|278->257|278->257|279->258|280->259|280->259|280->259|281->260|281->260|281->260|282->261|282->261|282->261|282->261|282->261|282->261|282->261|282->261|282->261|282->261|282->261|282->261|282->261|282->261|282->261|282->261|282->261|282->261|283->262|283->262|283->262|284->263|284->263|284->263|284->263|284->263|284->263|284->263|284->263|284->263|284->263|284->263|284->263|284->263|284->263|284->263|284->263|284->263|284->263|285->264|286->265|286->265|287->266|288->267|289->268|291->270|293->273|293->273|293->273|293->273|294->274|294->274|294->274|296->276|296->276|296->276|297->277|297->277|297->277|297->277|298->278|298->278|298->278|299->279|299->279|299->279|299->279|300->280|301->281|301->281|302->282|302->282|302->282|303->283|304->284|304->284|304->284|305->285|306->286|306->286|306->286|306->286|306->286|308->288|308->288|308->288|308->288|308->288|309->289|309->289|309->289|309->289|309->289|309->289|309->289|309->289|309->289|309->289|309->289|309->289|309->289|309->289|309->289|309->289|311->291|311->291|311->291|311->291|311->291|316->296|316->296|316->296|316->296|316->296|316->296|316->296|316->296|316->296|316->296|317->297|317->297|317->297|317->297|317->297|317->297|317->297|317->297|317->297|317->297|317->297|317->297|317->297|317->297|317->297|317->297|317->297|317->297|317->297|317->297|317->297|317->297|317->297|317->297|317->297|318->298|318->298|319->299|319->299|319->299|320->300|320->300|320->300|321->301|321->301|321->301|322->302|322->302|322->302|323->303|323->303|323->303|327->307|327->307|327->307|327->307|327->307|327->307|327->307|327->307|327->307|327->307|329->309|329->309|329->309|330->310|330->310|330->310|331->311|331->311|332->312|333->313|333->313|334->314|335->315|336->316|337->317|338->318|338->318|338->318|338->318|338->318|342->322|343->323|344->324|345->325|346->326|348->328
                  -- GENERATED --
              */
          