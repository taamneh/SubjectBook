
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
object ShowSignals extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template9[String,Map[String, List[scala.Tuple2[String, List[scala.Tuple2[Int, Int]]]]],Int,String,List[Int],Map[String, List[String]],Int,Map[String, List[String]],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(SubjectId: String, sub_sess:Map[String, List[(String, List[(Int, Int)])]], studyNo:Int, userName: String, signals: List[Int], videos:  Map[String, List[ String]], study_type: Int, sub_sess_menu: Map[String, List[String]], studyName: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import java.math.BigInteger; var ctr =1;
import java.math.BigInteger; var i=1;
import java.math.BigInteger; var j =1;

Seq[Any](format.raw/*1.243*/("""
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
                """),_display_(/*158.18*/for((subject,sessions) <- sub_sess_menu) yield /*158.58*/{_display_(Seq[Any](format.raw/*158.59*/("""

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
                            """),_display_(/*284.30*/if(signal._2 < 12)/*284.48*/ {_display_(Seq[Any](format.raw/*284.50*/("""
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

  def render(SubjectId:String,sub_sess:Map[String, List[scala.Tuple2[String, List[scala.Tuple2[Int, Int]]]]],studyNo:Int,userName:String,signals:List[Int],videos:Map[String, List[String]],study_type:Int,sub_sess_menu:Map[String, List[String]],studyName:String): play.twirl.api.HtmlFormat.Appendable = apply(SubjectId,sub_sess,studyNo,userName,signals,videos,study_type,sub_sess_menu,studyName)

  def f:((String,Map[String, List[scala.Tuple2[String, List[scala.Tuple2[Int, Int]]]]],Int,String,List[Int],Map[String, List[String]],Int,Map[String, List[String]],String) => play.twirl.api.HtmlFormat.Appendable) = (SubjectId,sub_sess,studyNo,userName,signals,videos,study_type,sub_sess_menu,studyName) => apply(SubjectId,sub_sess,studyNo,userName,signals,videos,study_type,sub_sess_menu,studyName)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jun 08 21:55:42 CDT 2015
                  SOURCE: C:/first_play/app/views/ShowSignals.scala.html
                  HASH: e545bd0168918d06c3a499dc3fe6bb62a315ce5b
                  MATRIX: 665->1|1112->242|1140->244|1260->338|1288->339|1324->349|1682->680|1711->681|1748->691|2616->1532|2631->1538|2692->1578|2773->1632|2788->1638|2854->1683|3422->2223|3451->2224|3486->2232|3583->2301|3612->2302|3652->2314|3743->2378|3771->2379|3905->2485|3935->2486|3975->2498|4047->2543|4075->2544|4212->2652|4242->2653|4282->2665|4357->2713|4385->2714|4526->2826|4556->2827|4596->2839|4672->2888|4700->2889|4813->2975|4841->2976|4926->3033|4955->3034|4988->3040|5087->3112|5115->3113|5183->3153|5212->3154|5245->3160|5345->3233|5373->3234|5487->3320|5516->3321|5553->3331|5645->3396|5674->3397|7781->5475|7812->5483|7843->5484|9339->6952|9396->6992|9436->6993|9485->7013|9584->7084|9613->7091|9653->7103|9682->7110|9786->7186|9815->7193|9866->7215|9948->7265|9993->7281|10649->7909|10678->7916|10709->7919|10740->7928|10770->7929|10813->7944|10844->7953|12535->9659|12584->9680|12636->9715|12676->9716|12727->9739|12768->9763|12808->9764|12861->9789|12903->9814|12943->9815|12994->9838|13023->9857|13064->9859|13117->9883|13169->9907|13186->9914|13211->9918|13227->9924|13252->9927|13326->9973|13343->9980|13368->9984|13384->9990|13409->9993|13466->10022|13495->10029|13536->10041|13554->10048|13580->10051|13628->10070|13645->10076|13671->10079|13715->10094|13732->10100|13758->10103|13901->10214|13956->10237|14013->10262|14068->10285|14115->10303|14337->10537|14382->10554|14434->10589|14474->10590|14521->10608|14597->10656|14661->10703|14701->10704|14752->10727|14772->10737|14813->10739|14864->10761|14923->10792|14940->10799|14965->10802|15004->10813|15021->10820|15046->10823|15105->10853|15135->10860|15176->10872|15194->10879|15220->10882|15260->10893|15290->10900|15322->10902|15385->10936|15403->10943|15429->10946|15481->10979|15495->10984|15535->10985|15586->11007|15630->11023|15647->11030|15672->11033|15711->11044|15728->11051|15753->11054|15811->11084|15841->11091|15882->11103|15900->11110|15926->11113|15966->11124|15996->11131|16028->11133|16091->11167|16109->11174|16135->11177|16199->11209|16250->11232|16284->11244|16339->11267|16386->11285|16442->11309|16491->11329|16568->11419|16617->11440|16669->11475|16709->11476|16760->11499|16801->11523|16841->11524|16894->11549|16914->11559|16955->11561|17006->11583|17044->11593|17061->11600|17086->11603|17167->11665|17181->11670|17221->11671|17276->11697|17314->11707|17331->11714|17356->11717|17443->11772|17502->11803|17536->11815|17595->11846|17637->11871|17677->11872|17736->11902|17833->11971|17861->11989|17902->11991|17961->12021|18161->12193|18178->12200|18203->12204|18219->12210|18244->12213|18402->12343|18419->12350|18444->12354|18460->12360|18485->12363|18564->12414|18581->12421|18606->12425|18622->12431|18647->12434|18701->12460|18731->12467|18772->12479|18790->12486|18816->12489|18864->12508|18881->12514|18907->12517|18951->12532|18968->12538|18994->12541|19146->12665|19163->12672|19188->12676|19204->12682|19229->12685|19469->12897|19486->12904|19511->12908|19527->12914|19552->12917|19621->12957|19639->12964|19665->12968|19682->12974|19708->12977|19930->13171|19947->13178|19972->13182|19988->13188|20013->13191|20147->13296|20165->13303|20191->13307|20208->13313|20234->13316|20358->13411|20376->13418|20402->13422|20419->13428|20445->13431|20586->13543|20604->13550|20630->13554|20647->13560|20673->13563|20797->13658|20815->13665|20841->13669|20858->13675|20884->13678|21025->13791|21085->13829|21144->13860|21192->13891|21232->13892|21291->13923|21323->13945|21364->13947|21423->13978|21463->14001|21503->14002|21562->14033|21591->14052|21632->14054|21691->14084|21732->14097|21759->14102|22205->14520|22232->14526|22248->14532|22273->14535|22352->14585|22380->14590|22531->14712|22559->14718|22576->14724|22602->14727|22812->14918|22826->14923|22866->14924|22925->14954|22991->14992|23018->14997|23095->15046|23122->15051|23333->15230|23392->15261|23425->15272|23488->15303|23551->15334|23614->15365|23673->15395|23754->15448|23771->15455|23796->15459|23812->15465|23837->15468|24098->15697|24161->15728|24216->15754|24281->15787|24340->15814|24393->15838
                  LINES: 19->1|24->1|25->2|31->8|31->8|32->9|43->20|43->20|46->23|63->40|63->40|63->40|64->41|64->41|64->41|76->53|76->53|77->54|77->54|77->54|78->55|79->56|79->56|82->59|82->59|83->60|84->61|84->61|86->63|86->63|87->64|88->65|88->65|91->68|91->68|92->69|93->70|93->70|97->74|97->74|99->76|99->76|100->77|101->78|101->78|102->79|102->79|103->80|104->81|104->81|106->83|106->83|107->84|108->85|108->85|152->129|152->129|152->129|181->158|181->158|181->158|183->160|185->162|185->162|185->162|185->162|186->163|186->163|187->164|191->168|193->170|209->186|209->186|209->186|209->186|209->186|209->186|209->186|253->231|253->231|253->231|253->231|254->232|254->232|254->232|256->234|256->234|256->234|257->235|257->235|257->235|259->237|259->237|259->237|259->237|259->237|259->237|260->238|260->238|260->238|260->238|260->238|260->238|260->238|260->238|260->238|260->238|260->238|260->238|260->238|260->238|260->238|260->238|264->242|265->243|267->245|268->246|269->247|278->257|278->257|278->257|278->257|279->258|280->259|280->259|280->259|281->260|281->260|281->260|282->261|282->261|282->261|282->261|282->261|282->261|282->261|282->261|282->261|282->261|282->261|282->261|282->261|282->261|282->261|282->261|282->261|282->261|283->262|283->262|283->262|284->263|284->263|284->263|284->263|284->263|284->263|284->263|284->263|284->263|284->263|284->263|284->263|284->263|284->263|284->263|284->263|284->263|284->263|285->264|286->265|286->265|287->266|288->267|289->268|291->270|293->273|293->273|293->273|293->273|294->274|294->274|294->274|296->276|296->276|296->276|297->277|297->277|297->277|297->277|298->278|298->278|298->278|299->279|299->279|299->279|299->279|300->280|301->281|301->281|302->282|302->282|302->282|303->283|304->284|304->284|304->284|305->285|306->286|306->286|306->286|306->286|306->286|308->288|308->288|308->288|308->288|308->288|309->289|309->289|309->289|309->289|309->289|309->289|309->289|309->289|309->289|309->289|309->289|309->289|309->289|309->289|309->289|309->289|311->291|311->291|311->291|311->291|311->291|316->296|316->296|316->296|316->296|316->296|316->296|316->296|316->296|316->296|316->296|317->297|317->297|317->297|317->297|317->297|317->297|317->297|317->297|317->297|317->297|317->297|317->297|317->297|317->297|317->297|317->297|317->297|317->297|317->297|317->297|317->297|317->297|317->297|317->297|317->297|318->298|318->298|319->299|319->299|319->299|320->300|320->300|320->300|321->301|321->301|321->301|322->302|322->302|322->302|323->303|323->303|323->303|327->307|327->307|327->307|327->307|327->307|327->307|327->307|327->307|327->307|327->307|329->309|329->309|329->309|330->310|330->310|330->310|331->311|331->311|332->312|333->313|333->313|334->314|335->315|336->316|337->317|338->318|338->318|338->318|338->318|338->318|342->322|343->323|344->324|345->325|346->326|348->328
                  -- GENERATED --
              */
          