
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
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-user"></span> """),_display_(/*115.128*/userName),format.raw/*115.136*/(""" """),format.raw/*115.137*/("""<span class="caret"></span></a>
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
                """),_display_(/*144.18*/for((subject,sessions) <- sub_sess_menu) yield /*144.58*/{_display_(Seq[Any](format.raw/*144.59*/("""

                """),format.raw/*146.17*/("""<li>

                    <a class="" href="/displaySubject?studyNo="""),_display_(/*148.64*/studyNo),format.raw/*148.71*/("""&SubjectId="""),_display_(/*148.83*/subject),format.raw/*148.90*/("""">
                        <span class="glyphicon glyphicon-user"></span> """),_display_(/*149.73*/subject),format.raw/*149.80*/("""
                    """),format.raw/*150.21*/("""</a>
                </li>


                """)))}),format.raw/*154.18*/("""

            """),format.raw/*156.13*/("""</ul>
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
            <li class="active"><a href="/showStudy/"""),_display_(/*172.53*/studyNo),format.raw/*172.60*/("""">"""),_display_(/*172.63*/studyName),format.raw/*172.72*/(""" """),format.raw/*172.73*/("""</a> </li><li>"""),_display_(/*172.88*/SubjectId),format.raw/*172.97*/("""</li>



            <!-- <li><button id ='hideSideBar'><a href="/file">toggle</a></button></li> -->
        </ol>
    </div><!--/.row-->
    <div class="row">
        </br>
    </div>

    <div class="row" id ="allInfo">

        <div class="col-md-4" id="BioTop" style="display: none;">
            <div class="panel panel-info">

                <div class="panel-heading">
                    Biography <a><span data-toggle="collapse" href="#" class="icon pull-right"><em class="glyphicon glyphicon-chevron-down"></em></span> </a>

                </div>
                <div id="Bio" class="panel-body">
                </div>
            </div>
        </div>
        <div class="col-md-8" id ="phychoTop" style="display: none;">
            <div class="panel panel-info">
                <div class="panel-heading">
                    Phychometrics <a><span data-toggle="collapse" href="#" class="icon pull-right"><em class="glyphicon glyphicon-chevron-down"></em></span> </a>
                </div>
                <div id ="phycho" class="panel-body">


                </div>
            </div>
        </div>


        <div class="col-lg-12" id ="generalInfo" style="display: none;">
            <div class="panel panel-info">
                <div class="panel-heading">
                    NASA Task Load Index <a><span data-toggle="collapse" href="#" class="icon pull-right"><em class="glyphicon glyphicon-chevron-down"></em></span> </a>
                </div>
                <div id ="general" class="panel-body">


                    """),format.raw/*218.1*/("""                    """),_display_(/*218.22*/for((subject,sessions) <- sub_sess) yield /*218.57*/{_display_(Seq[Any](format.raw/*218.58*/("""
                    """),_display_(/*219.22*/for(session <- sessions) yield /*219.46*/{_display_(Seq[Any](format.raw/*219.47*/("""

                    """),_display_(/*221.22*/for(signal <- session._2) yield /*221.47*/{_display_(Seq[Any](format.raw/*221.48*/("""
                    """),_display_(/*222.22*/if(signal._2 == 11)/*222.41*/ {_display_(Seq[Any](format.raw/*222.43*/("""

                    """),format.raw/*224.21*/("""<div  id="dashboard_div"""),_display_(/*224.45*/session/*224.52*/._1),_display_(/*224.56*/signal/*224.62*/._1),format.raw/*224.65*/("""">
                        <div id="chartBar"""),_display_(/*225.43*/session/*225.50*/._1),_display_(/*225.54*/signal/*225.60*/._1),format.raw/*225.63*/("""" class="chartBar" subject=""""),_display_(/*225.92*/subject),format.raw/*225.99*/("""" session=""""),_display_(/*225.111*/session/*225.118*/._1),format.raw/*225.121*/("""" signalSequence=""""),_display_(/*225.140*/signal/*225.146*/._1),format.raw/*225.149*/("""" signalType=""""),_display_(/*225.164*/signal/*225.170*/._2),format.raw/*225.173*/(""""  style="height: 250px;">
                        </div>
                    </div>

                    """)))}),format.raw/*229.22*/("""
                    """)))}),format.raw/*230.22*/("""

                    """)))}),format.raw/*232.22*/("""
                    """)))}),format.raw/*233.22*/("""
                """),format.raw/*234.17*/("""</div>
            </div>
        </div>


    </div><!--/.row-->
    <div class="">
        <div class="panel panel-default">
            <div class="panel-body tabs">
                """),format.raw/*244.1*/("""                """),_display_(/*244.18*/for((subject,sessions) <- sub_sess) yield /*244.53*/{_display_(Seq[Any](format.raw/*244.54*/("""
                """),format.raw/*245.17*/("""<ul class="nav nav-tabs">
                    """),_display_(/*246.22*/for(session <- sessions if session._1 != "BAR") yield /*246.69*/{_display_(Seq[Any](format.raw/*246.70*/("""
                    """),_display_(/*247.22*/if(i == 1)/*247.32*/ {_display_(Seq[Any](format.raw/*247.34*/("""
                    """),format.raw/*248.21*/("""<li class="active"><a  href="#"""),_display_(/*248.52*/session/*248.59*/._1),format.raw/*248.62*/("""" id="link"""),_display_(/*248.73*/session/*248.80*/._1),format.raw/*248.83*/("""" class="onesignal" subject=""""),_display_(/*248.113*/subject),format.raw/*248.120*/("""" session=""""),_display_(/*248.132*/session/*248.139*/._1),format.raw/*248.142*/("""" studyId="""),_display_(/*248.153*/studyNo),format.raw/*248.160*/("""  """),format.raw/*248.162*/("""occupied ="no" data-toggle="tab">"""),_display_(/*248.196*/session/*248.203*/._1),format.raw/*248.206*/("""</a></li>
                    """)))}/*249.23*/else/*249.28*/{_display_(Seq[Any](format.raw/*249.29*/("""
                    """),format.raw/*250.21*/("""<li><a  href="#"""),_display_(/*250.37*/session/*250.44*/._1),format.raw/*250.47*/("""" id="link"""),_display_(/*250.58*/session/*250.65*/._1),format.raw/*250.68*/("""" class="onesignal" subject=""""),_display_(/*250.98*/subject),format.raw/*250.105*/("""" session=""""),_display_(/*250.117*/session/*250.124*/._1),format.raw/*250.127*/("""" studyId="""),_display_(/*250.138*/studyNo),format.raw/*250.145*/("""  """),format.raw/*250.147*/("""occupied ="no" data-toggle="tab">"""),_display_(/*250.181*/session/*250.188*/._1),format.raw/*250.191*/("""</a></li>
                    """)))}),format.raw/*251.22*/("""
                    """),_display_(/*252.22*/{i = i + 1;}),format.raw/*252.34*/("""
                    """)))}),format.raw/*253.22*/("""
                """),format.raw/*254.17*/("""</ul>
                """)))}),format.raw/*255.18*/("""

                """),format.raw/*257.17*/("""<div class="tab-content">

                    """),format.raw/*260.1*/("""                    """),_display_(/*260.22*/for((subject,sessions) <- sub_sess) yield /*260.57*/{_display_(Seq[Any](format.raw/*260.58*/("""
                    """),_display_(/*261.22*/for(session <- sessions) yield /*261.46*/{_display_(Seq[Any](format.raw/*261.47*/("""

                    """),_display_(/*263.22*/if(j == 1)/*263.32*/ {_display_(Seq[Any](format.raw/*263.34*/("""
                    """),format.raw/*264.21*/("""<div id=""""),_display_(/*264.31*/session/*264.38*/._1),format.raw/*264.41*/("""" class="tab-pane fade in active">
                        """)))}/*265.27*/else/*265.32*/{_display_(Seq[Any](format.raw/*265.33*/("""
                        """),format.raw/*266.25*/("""<div id=""""),_display_(/*266.35*/session/*266.42*/._1),format.raw/*266.45*/("""" class="tab-pane fade">
                            """)))}),format.raw/*267.30*/("""
                            """),_display_(/*268.30*/{j = j + 1;}),format.raw/*268.42*/("""
                            """),_display_(/*269.30*/for(signal <- session._2) yield /*269.55*/{_display_(Seq[Any](format.raw/*269.56*/("""
                            """),format.raw/*270.29*/("""<!-- to avoid the non signal files -->
                            """),_display_(/*271.30*/if(signal._2 < 11)/*271.48*/ {_display_(Seq[Any](format.raw/*271.50*/("""
                            """),format.raw/*272.29*/("""<!-- <div id="Combo" style="border-style: solid;  border-radius: 15px; border-color: #636363;"> -->
                            <!-- <div class="panel-heading" id="header"""),_display_(/*273.72*/session/*273.79*/._1),_display_(/*273.83*/signal/*273.89*/._1),format.raw/*273.92*/(""""> </div> -->
                            <!--  <div class="panel-body">-->
                            <div  id="dashboard_div"""),_display_(/*275.53*/session/*275.60*/._1),_display_(/*275.64*/signal/*275.70*/._1),format.raw/*275.73*/("""">
                                <div id="chart"""),_display_(/*276.48*/session/*276.55*/._1),_display_(/*276.59*/signal/*276.65*/._1),format.raw/*276.68*/("""" class="chart" subject=""""),_display_(/*276.94*/subject),format.raw/*276.101*/("""" session=""""),_display_(/*276.113*/session/*276.120*/._1),format.raw/*276.123*/("""" signalSequence=""""),_display_(/*276.142*/signal/*276.148*/._1),format.raw/*276.151*/("""" signalType=""""),_display_(/*276.166*/signal/*276.172*/._2),format.raw/*276.175*/(""""  style="height: 250px;">
                                </div>
                                <!--<div id="filter_div"""),_display_(/*278.57*/session/*278.64*/._1),_display_(/*278.68*/signal/*278.74*/._1),format.raw/*278.77*/("""" style="height: 50px;"></div> -->
                            </div>
                            <!--<br> -->

                            <!--<br> -->
                            &nbsp;<div id="videoboard"""),_display_(/*283.55*/session/*283.62*/._1),_display_(/*283.66*/signal/*283.72*/._1),format.raw/*283.75*/("""" class= "video-board" name="videoboard"""),_display_(/*283.115*/session/*283.122*/._1),_display_(/*283.126*/signal/*283.132*/._1),format.raw/*283.135*/("""" style="position:relative; left: 40px; width: 80%; height: 400px; overflow-x:scroll;  white-space: nowrap;" hidden>
                            <div class="button-station"> <a id = "showvideo"""),_display_(/*284.77*/session/*284.84*/._1),_display_(/*284.88*/signal/*284.94*/._1),format.raw/*284.97*/("""" class = "btn btn-default show-video" >Hide Videos</a> <!--&nbsp; &nbsp; &nbsp; &nbsp; <a id = "dynamic"""),_display_(/*284.202*/session/*284.209*/._1),_display_(/*284.213*/signal/*284.219*/._1),format.raw/*284.222*/("""" class="btn btn-default" style="display: none;">Dynamic</a>  &nbsp; &nbsp; <a id = "showvideo"""),_display_(/*284.317*/session/*284.324*/._1),_display_(/*284.328*/signal/*284.334*/._1),format.raw/*284.337*/("""" class = "btn btn-default show-video" style="display: none;" >Show Videos</a> &nbsp; &nbsp; <a id = "editchart"""),_display_(/*284.449*/session/*284.456*/._1),_display_(/*284.460*/signal/*284.466*/._1),format.raw/*284.469*/("""" class = "btn btn-default" style="display: none;">Edit Chart</a> &nbsp; &nbsp;<a id = "export"""),_display_(/*284.564*/session/*284.571*/._1),_display_(/*284.575*/signal/*284.581*/._1),format.raw/*284.584*/("""" style="display: none;" class = "btn btn-default">Export data</a>  <br>--> </div>
                            """),_display_(/*285.30*/{import java.math.BigInteger; var i=1}),format.raw/*285.68*/("""
                            """),_display_(/*286.30*/for((sess,videoList) <- videos) yield /*286.61*/{_display_(Seq[Any](format.raw/*286.62*/("""
                            """),_display_(/*287.30*/if(sess == session._1)/*287.52*/ {_display_(Seq[Any](format.raw/*287.54*/("""
                            """),_display_(/*288.30*/for(video <- videoList) yield /*288.53*/{_display_(Seq[Any](format.raw/*288.54*/("""
                            """),_display_(/*289.30*/if(study_type == 1)/*289.49*/ {_display_(Seq[Any](format.raw/*289.51*/("""
                            """),format.raw/*290.29*/("""<object id=""""),_display_(/*290.42*/video),format.raw/*290.47*/("""">
                                <param name='movie' value='https://video.google.com/get_player?docid=0B2TDTGk9sqZLQjlxcVRxYUNqOFE&amp;ps=docs&amp;partnerid=30&amp;cc_load_policy=1'></param>
                                <param name='allowFullScreen' value='true'></param>
                                <param name='allowScriptAccess' value='always'></param>
                                <embed id='video"""),_display_(/*294.50*/video),_display_(/*294.56*/signal/*294.62*/._1),format.raw/*294.65*/("""' src='https://video.google.com/get_player?docid="""),_display_(/*294.115*/video),format.raw/*294.120*/("""&amp;ps=docs&amp;partnerid=30&amp;cc_load_policy=1&amp;color=white&amp;autoplay=0&amp;enablejsapi=1&amp;playerapiid=video"""),_display_(/*294.242*/video),_display_(/*294.248*/signal/*294.254*/._1),format.raw/*294.257*/("""' type='application/x-shockwave-flash' allowfullscreen='true' allowScriptAccess='always' width=50% height='300'></embed>
                            </object>
                            """)))}/*296.31*/else/*296.36*/{_display_(Seq[Any](format.raw/*296.37*/("""
                            """),format.raw/*297.29*/("""<object width='400' height='250' id=""""),_display_(/*297.67*/video),format.raw/*297.72*/("""">
                                <embed src='"""),_display_(/*298.46*/video),format.raw/*298.51*/("""' type='video/x-ms-wm' allowfullscreen='true' play ='false' autostart="false"  allowScriptAccess='always' width='350' height='250'></embed></object>
                            """)))}),format.raw/*299.30*/("""
                            """),_display_(/*300.30*/{i = i + 1}),format.raw/*300.41*/("""
                            """)))}),format.raw/*301.30*/("""
                            """)))}),format.raw/*302.30*/("""
                            """)))}),format.raw/*303.30*/("""
                            """),format.raw/*304.29*/("""<br>
                            <a id = "stopvideo"""),_display_(/*305.48*/session/*305.55*/._1),_display_(/*305.59*/signal/*305.65*/._1),format.raw/*305.68*/(""""  class="btn btn-default">Stop Videos</a>   &nbsp; &nbsp;
                        </div>
                            <!--</div> -->
                            <!-- <br><br><br> <br><br><br> -->
                            """)))}),format.raw/*309.30*/("""
                            """)))}),format.raw/*310.30*/("""
                        """),format.raw/*311.25*/("""</div>
                        """)))}),format.raw/*312.26*/("""
                        """)))}),format.raw/*313.26*/("""

                    """),format.raw/*315.21*/("""</div>
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
                  DATE: Fri May 08 19:56:49 CDT 2015
                  SOURCE: C:/first_play/app/views/ShowSignals.scala.html
                  HASH: febaf19a6b74021a1cc14e7171c944477ad9b9a8
                  MATRIX: 665->1|1112->242|1140->244|1260->338|1288->339|1324->349|1682->680|1711->681|1748->691|2616->1532|2631->1538|2692->1578|2773->1632|2788->1638|2854->1683|3422->2223|3451->2224|3486->2232|3583->2301|3612->2302|3652->2314|3743->2378|3771->2379|3905->2485|3935->2486|3975->2498|4047->2543|4075->2544|4212->2652|4242->2653|4282->2665|4357->2713|4385->2714|4526->2826|4556->2827|4596->2839|4672->2888|4700->2889|4813->2975|4841->2976|4926->3033|4955->3034|4988->3040|5087->3112|5115->3113|5183->3153|5212->3154|5245->3160|5345->3233|5373->3234|5487->3320|5516->3321|5553->3331|5645->3396|5674->3397|7230->4924|7261->4932|7292->4933|8788->6401|8845->6441|8885->6442|8934->6462|9033->6533|9062->6540|9102->6552|9131->6559|9235->6635|9264->6642|9315->6664|9397->6714|9442->6730|10098->7358|10127->7365|10158->7368|10189->7377|10219->7378|10262->7393|10293->7402|11918->9042|11967->9063|12019->9098|12059->9099|12110->9122|12151->9146|12191->9147|12244->9172|12286->9197|12326->9198|12377->9221|12406->9240|12447->9242|12500->9266|12552->9290|12569->9297|12594->9301|12610->9307|12635->9310|12709->9356|12726->9363|12751->9367|12767->9373|12792->9376|12849->9405|12878->9412|12919->9424|12937->9431|12963->9434|13011->9453|13028->9459|13054->9462|13098->9477|13115->9483|13141->9486|13284->9597|13339->9620|13396->9645|13451->9668|13498->9686|13720->9920|13765->9937|13817->9972|13857->9973|13904->9991|13980->10039|14044->10086|14084->10087|14135->10110|14155->10120|14196->10122|14247->10144|14306->10175|14323->10182|14348->10185|14387->10196|14404->10203|14429->10206|14488->10236|14518->10243|14559->10255|14577->10262|14603->10265|14643->10276|14673->10283|14705->10285|14768->10319|14786->10326|14812->10329|14864->10362|14878->10367|14918->10368|14969->10390|15013->10406|15030->10413|15055->10416|15094->10427|15111->10434|15136->10437|15194->10467|15224->10474|15265->10486|15283->10493|15309->10496|15349->10507|15379->10514|15411->10516|15474->10550|15492->10557|15518->10560|15582->10592|15633->10615|15667->10627|15722->10650|15769->10668|15825->10692|15874->10712|15951->10802|16000->10823|16052->10858|16092->10859|16143->10882|16184->10906|16224->10907|16277->10932|16297->10942|16338->10944|16389->10966|16427->10976|16444->10983|16469->10986|16550->11048|16564->11053|16604->11054|16659->11080|16697->11090|16714->11097|16739->11100|16826->11155|16885->11186|16919->11198|16978->11229|17020->11254|17060->11255|17119->11285|17216->11354|17244->11372|17285->11374|17344->11404|17544->11576|17561->11583|17586->11587|17602->11593|17627->11596|17785->11726|17802->11733|17827->11737|17843->11743|17868->11746|17947->11797|17964->11804|17989->11808|18005->11814|18030->11817|18084->11843|18114->11850|18155->11862|18173->11869|18199->11872|18247->11891|18264->11897|18290->11900|18334->11915|18351->11921|18377->11924|18529->12048|18546->12055|18571->12059|18587->12065|18612->12068|18852->12280|18869->12287|18894->12291|18910->12297|18935->12300|19004->12340|19022->12347|19048->12351|19065->12357|19091->12360|19313->12554|19330->12561|19355->12565|19371->12571|19396->12574|19530->12679|19548->12686|19574->12690|19591->12696|19617->12699|19741->12794|19759->12801|19785->12805|19802->12811|19828->12814|19969->12926|19987->12933|20013->12937|20030->12943|20056->12946|20180->13041|20198->13048|20224->13052|20241->13058|20267->13061|20408->13174|20468->13212|20527->13243|20575->13274|20615->13275|20674->13306|20706->13328|20747->13330|20806->13361|20846->13384|20886->13385|20945->13416|20974->13435|21015->13437|21074->13467|21115->13480|21142->13485|21588->13903|21615->13909|21631->13915|21656->13918|21735->13968|21763->13973|21914->14095|21942->14101|21959->14107|21985->14110|22195->14301|22209->14306|22249->14307|22308->14337|22374->14375|22401->14380|22478->14429|22505->14434|22716->14613|22775->14644|22808->14655|22871->14686|22934->14717|22997->14748|23056->14778|23137->14831|23154->14838|23179->14842|23195->14848|23220->14851|23481->15080|23544->15111|23599->15137|23664->15170|23723->15197|23776->15221
                  LINES: 19->1|24->1|25->2|31->8|31->8|32->9|43->20|43->20|46->23|63->40|63->40|63->40|64->41|64->41|64->41|76->53|76->53|77->54|77->54|77->54|78->55|79->56|79->56|82->59|82->59|83->60|84->61|84->61|86->63|86->63|87->64|88->65|88->65|91->68|91->68|92->69|93->70|93->70|97->74|97->74|99->76|99->76|100->77|101->78|101->78|102->79|102->79|103->80|104->81|104->81|106->83|106->83|107->84|108->85|108->85|138->115|138->115|138->115|167->144|167->144|167->144|169->146|171->148|171->148|171->148|171->148|172->149|172->149|173->150|177->154|179->156|195->172|195->172|195->172|195->172|195->172|195->172|195->172|240->218|240->218|240->218|240->218|241->219|241->219|241->219|243->221|243->221|243->221|244->222|244->222|244->222|246->224|246->224|246->224|246->224|246->224|246->224|247->225|247->225|247->225|247->225|247->225|247->225|247->225|247->225|247->225|247->225|247->225|247->225|247->225|247->225|247->225|247->225|251->229|252->230|254->232|255->233|256->234|265->244|265->244|265->244|265->244|266->245|267->246|267->246|267->246|268->247|268->247|268->247|269->248|269->248|269->248|269->248|269->248|269->248|269->248|269->248|269->248|269->248|269->248|269->248|269->248|269->248|269->248|269->248|269->248|269->248|270->249|270->249|270->249|271->250|271->250|271->250|271->250|271->250|271->250|271->250|271->250|271->250|271->250|271->250|271->250|271->250|271->250|271->250|271->250|271->250|271->250|272->251|273->252|273->252|274->253|275->254|276->255|278->257|280->260|280->260|280->260|280->260|281->261|281->261|281->261|283->263|283->263|283->263|284->264|284->264|284->264|284->264|285->265|285->265|285->265|286->266|286->266|286->266|286->266|287->267|288->268|288->268|289->269|289->269|289->269|290->270|291->271|291->271|291->271|292->272|293->273|293->273|293->273|293->273|293->273|295->275|295->275|295->275|295->275|295->275|296->276|296->276|296->276|296->276|296->276|296->276|296->276|296->276|296->276|296->276|296->276|296->276|296->276|296->276|296->276|296->276|298->278|298->278|298->278|298->278|298->278|303->283|303->283|303->283|303->283|303->283|303->283|303->283|303->283|303->283|303->283|304->284|304->284|304->284|304->284|304->284|304->284|304->284|304->284|304->284|304->284|304->284|304->284|304->284|304->284|304->284|304->284|304->284|304->284|304->284|304->284|304->284|304->284|304->284|304->284|304->284|305->285|305->285|306->286|306->286|306->286|307->287|307->287|307->287|308->288|308->288|308->288|309->289|309->289|309->289|310->290|310->290|310->290|314->294|314->294|314->294|314->294|314->294|314->294|314->294|314->294|314->294|314->294|316->296|316->296|316->296|317->297|317->297|317->297|318->298|318->298|319->299|320->300|320->300|321->301|322->302|323->303|324->304|325->305|325->305|325->305|325->305|325->305|329->309|330->310|331->311|332->312|333->313|335->315
                  -- GENERATED --
              */
          