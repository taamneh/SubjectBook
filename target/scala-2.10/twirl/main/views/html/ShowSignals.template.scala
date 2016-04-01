
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
object ShowSignals extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template9[String,Map[String, scala.Tuple2[String, List[scala.Tuple7[String, Int, Int, Option[String], Option[java.math.BigDecimal], Option[java.math.BigDecimal], Int]]]],Int,String,Map[String, List[scala.Tuple2[String, String]]],Int,List[String],List[scala.Tuple3[Int, Int, Int]],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(SubjectId: String, sub_sess:Map[String, (String, List[(String, Int, Int, Option[String], Option[java.math.BigDecimal], Option[java.math.BigDecimal], Int)])], studyNo:Int, userName: String, videos:  Map[String, List[(String, String)]], study_type: Int, sub_sess_menu: List[String], generalList: List[(Int, Int, Int)], studyName: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import java.math.BigInteger; var i=1;
import java.math.BigInteger; var j =1;

Seq[Any](format.raw/*1.338*/("""
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

    <!-- <script src="http://code.jquery.com/jquery-1.10.2.js"></script> -->
    <!--<script src="http://code.jquery.com/ui/1.10.4/jquery-ui.js"></script> -->

    <!--[if lt IE 9]>
    <script src="/assets/javascripts/html5shiv.js"></script>
    <script src="/assets/javascripts/respond.min.js"></script>
    <![endif]-->

    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script type="text/javascript" src="https://www.google.com/jsapi"></script>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <!-- <script type='text/javascript' src='"""),_display_(/*41.47*/routes/*41.53*/.Assets.at("javascripts/changevideo.js")),format.raw/*41.93*/("""'></script> -->
    <script type='text/javascript' src='"""),_display_(/*42.42*/routes/*42.48*/.Assets.at("javascripts/signalwithtabNew.js")),format.raw/*42.93*/("""'></script>
    <link rel="stylesheet" type="text/css" href="/assets/stylesheets/jquery-ui-1.9.2.css">


    <script src="/assets/javascripts/bootstrap.min.js"></script>
    <script src="/assets/javascripts/chart.min.js"></script>
    <script src="/assets/javascripts/chart-data.js"></script>
    <script src="/assets/javascripts/easypiechart.js"></script>
    <script src="/assets/javascripts/easypiechart-data.js"></script>
    <script src="/assets/javascripts/bootstrap-datepicker.js"></script>
    <script>

		!function ($) """),format.raw/*54.17*/("""{"""),format.raw/*54.18*/("""
		    """),format.raw/*55.7*/("""$(document).on("click","ul.nav li.parent > a > span.icon", function()"""),format.raw/*55.76*/("""{"""),format.raw/*55.77*/("""
		        """),format.raw/*56.11*/("""$(this).find('em:first').toggleClass("glyphicon-minus");
		    """),format.raw/*57.7*/("""}"""),format.raw/*57.8*/(""");


		    $(".sidebar span.icon").find('em:first').addClass("glyphicon-plus");
		"""),format.raw/*61.3*/("""}"""),format.raw/*61.4*/("""(window.jQuery);

		$(window).on('resize', function () """),format.raw/*63.38*/("""{"""),format.raw/*63.39*/("""
		  """),format.raw/*64.5*/("""if ($(window).width() > 768) $('#sidebar-collapse').collapse('show')
		"""),format.raw/*65.3*/("""}"""),format.raw/*65.4*/(""")
		$(window).on('resize', function () """),format.raw/*66.38*/("""{"""),format.raw/*66.39*/("""
		  """),format.raw/*67.5*/("""if ($(window).width() <= 767) $('#sidebar-collapse').collapse('hide')
		"""),format.raw/*68.3*/("""}"""),format.raw/*68.4*/(""")
        // this is to unfold the subject list
        $(document).ready(function()"""),format.raw/*70.37*/("""{"""),format.raw/*70.38*/("""
        """),format.raw/*71.9*/("""$('ul.nav li.parent > a > span.icon').trigger("click");
        """),format.raw/*72.9*/("""}"""),format.raw/*72.10*/(""");

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
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-user"></span> """),_display_(/*116.128*/userName),format.raw/*116.136*/(""" """),format.raw/*116.137*/("""<span class="caret"></span></a>
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
                <span class="glyphicon glyphicon-list"></span> Subjects <span data-toggle="collapse" href="#sub-item-1" class="icon pull-right"><em class="glyphicon glyphicon-s glyphicon-plus"></em></span>
            </a>
            <ul class="children collapse" id="sub-item-1">
                """),_display_(/*146.18*/for(subject <- sub_sess_menu) yield /*146.47*/{_display_(Seq[Any](format.raw/*146.48*/("""

                """),format.raw/*148.17*/("""<li>

                    <a class="" href="/displaySubject?studyNo="""),_display_(/*150.64*/studyNo),format.raw/*150.71*/("""&SubjectId="""),_display_(/*150.83*/subject),format.raw/*150.90*/("""">
                        <span class="glyphicon glyphicon-user"></span> """),_display_(/*151.73*/subject),format.raw/*151.80*/("""
                    """),format.raw/*152.21*/("""</a>
                </li>


                """)))}),format.raw/*156.18*/("""

            """),format.raw/*158.13*/("""</ul>
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
            <li class="active"><a href="/showStudy/"""),_display_(/*174.53*/studyNo),format.raw/*174.60*/("""">"""),_display_(/*174.63*/studyName),format.raw/*174.72*/(""" """),format.raw/*174.73*/("""</a> </li>
            <li class="active"><a href="/showStudySkipTop/"""),_display_(/*175.60*/studyNo),format.raw/*175.67*/("""">User Portrait </a> </li>
            <li>"""),_display_(/*176.18*/SubjectId),format.raw/*176.27*/("""</li>



            <!-- <li><button id ='hideSideBar'><a href="/file">toggle</a></button></li> -->
        </ol>
    </div><!--/.row-->
    <div class="row">
        </br>
    </div>

    <div class="row" id ="allInfo">


        <!-- <a href="/showRadar?SubjectId="""),_display_(/*190.45*/SubjectId),format.raw/*190.54*/("""&studyNo="""),_display_(/*190.64*/studyNo),format.raw/*190.71*/(""""> Show Session view </a> -->

        """),_display_(/*192.10*/for(temp <- generalList) yield /*192.34*/{_display_(Seq[Any](format.raw/*192.35*/("""

        """),format.raw/*194.9*/("""<div class="col-md-4" id="generalData"""),_display_(/*194.47*/temp/*194.51*/._1),_display_(/*194.55*/temp/*194.59*/._2),format.raw/*194.62*/(""""  subject=""""),_display_(/*194.75*/SubjectId),format.raw/*194.84*/("""" session="sss" signalSequence=""""),_display_(/*194.117*/temp/*194.121*/._1),format.raw/*194.124*/("""" signalCode=""""),_display_(/*194.139*/temp/*194.143*/._2),format.raw/*194.146*/("""" dataType=""""),_display_(/*194.159*/temp/*194.163*/._3),format.raw/*194.166*/("""" style="display: none;">

        </div>

        """)))}),format.raw/*198.10*/("""



    """),format.raw/*202.5*/("""</div><!--/.row-->
    <div class="">
        <div class="panel panel-default">
            <div class="panel-body tabs">
                """),format.raw/*207.1*/("""                """),format.raw/*207.17*/("""<ul class="nav nav-tabs">
                    """),_display_(/*208.22*/for((name,session) <- sub_sess) yield /*208.53*/{_display_(Seq[Any](format.raw/*208.54*/("""
                    """),_display_(/*209.22*/if(i == 1)/*209.32*/ {_display_(Seq[Any](format.raw/*209.34*/("""
                    """),format.raw/*210.21*/("""<li class="active"><a  href="#"""),_display_(/*210.52*/session/*210.59*/._1),format.raw/*210.62*/("""" id="link"""),_display_(/*210.73*/session/*210.80*/._1),format.raw/*210.83*/("""" class="onesignal" subject=""""),_display_(/*210.113*/SubjectId),format.raw/*210.122*/("""" session=""""),_display_(/*210.134*/session/*210.141*/._1),format.raw/*210.144*/("""" newSessionName=""""),_display_(/*210.163*/name),format.raw/*210.167*/("""" studyId="""),_display_(/*210.178*/studyNo),format.raw/*210.185*/("""  """),format.raw/*210.187*/("""occupied ="no" data-toggle="tab">"""),_display_(/*210.221*/name/*210.225*/.replaceFirst("(\\d*\\s*)", "")),format.raw/*210.256*/("""</a></li>
                    """)))}/*211.23*/else/*211.28*/{_display_(Seq[Any](format.raw/*211.29*/("""
                    """),format.raw/*212.21*/("""<li><a  href="#"""),_display_(/*212.37*/session/*212.44*/._1),format.raw/*212.47*/("""" id="link"""),_display_(/*212.58*/session/*212.65*/._1),format.raw/*212.68*/("""" class="onesignal" subject=""""),_display_(/*212.98*/SubjectId),format.raw/*212.107*/("""" session=""""),_display_(/*212.119*/session/*212.126*/._1),format.raw/*212.129*/("""" newSessionName=""""),_display_(/*212.148*/name),format.raw/*212.152*/("""" studyId="""),_display_(/*212.163*/studyNo),format.raw/*212.170*/("""  """),format.raw/*212.172*/("""occupied ="no" data-toggle="tab">"""),_display_(/*212.206*/name/*212.210*/.replaceFirst("(\\d*\\s*)", "")),format.raw/*212.241*/("""</a></li>
                    """)))}),format.raw/*213.22*/("""
                    """),_display_(/*214.22*/{i = i + 1;}),format.raw/*214.34*/("""
                    """)))}),format.raw/*215.22*/("""
                """),format.raw/*216.17*/("""</ul>

                <div class="tab-content">

                    """),format.raw/*221.1*/("""                    """),_display_(/*221.22*/for((name,sessions) <- sub_sess) yield /*221.54*/{_display_(Seq[Any](format.raw/*221.55*/("""
                    """),_display_(/*222.22*/if(j == 1)/*222.32*/ {_display_(Seq[Any](format.raw/*222.34*/("""
                    """),format.raw/*223.21*/("""<div id=""""),_display_(/*223.31*/sessions/*223.39*/._1),format.raw/*223.42*/("""" class="tab-pane fade in active">
                        """)))}/*224.27*/else/*224.32*/{_display_(Seq[Any](format.raw/*224.33*/("""
                        """),format.raw/*225.25*/("""<div id=""""),_display_(/*225.35*/sessions/*225.43*/._1),format.raw/*225.46*/("""" class="tab-pane fade">
                            """)))}),format.raw/*226.30*/("""
                            """),_display_(/*227.30*/{j = j + 1;}),format.raw/*227.42*/("""
                            """),_display_(/*228.30*/for(signal <- sessions._2) yield /*228.56*/{_display_(Seq[Any](format.raw/*228.57*/("""
                            """),format.raw/*229.29*/("""<!-- to avoid the non signal files -->
                            """),_display_(/*230.30*/if(signal._3 == 1 || signal._3 == 3 || signal._3 == 4|| signal._3 == 5)/*230.101*/ {_display_(Seq[Any](format.raw/*230.103*/("""
                            """),format.raw/*231.29*/("""<div  id="dashboard_div"""),_display_(/*231.53*/sessions/*231.61*/._1),_display_(/*231.65*/signal/*231.71*/._2),format.raw/*231.74*/("""">
                                <div id="chart"""),_display_(/*232.48*/sessions/*232.56*/._1),_display_(/*232.60*/signal/*232.66*/._2),format.raw/*232.69*/("""" class="chart" subject=""""),_display_(/*232.95*/SubjectId),format.raw/*232.104*/("""" session=""""),_display_(/*232.116*/sessions/*232.124*/._1),format.raw/*232.127*/("""" newSessionName=""""),_display_(/*232.146*/name),format.raw/*232.150*/("""" signalSequence=""""),_display_(/*232.169*/signal/*232.175*/._2),format.raw/*232.178*/("""" signalType=""""),_display_(/*232.193*/signal/*232.199*/._3),format.raw/*232.202*/("""" yTitle = """"),_display_(/*232.215*/signal/*232.221*/._4),format.raw/*232.224*/("""" ymin =""""),_display_(/*232.234*/signal/*232.240*/._5),format.raw/*232.243*/("""" ymax =""""),_display_(/*232.253*/signal/*232.259*/._6),format.raw/*232.262*/(""""  log = """"),_display_(/*232.273*/signal/*232.279*/._7),format.raw/*232.282*/("""" style="height: 250px;">
                                </div>
                            </div>
                            <!--<br> -->

                            <!--<br> -->
                            """),_display_(/*238.30*/if(signal._3 == 1)/*238.48*/{_display_(Seq[Any](format.raw/*238.49*/("""
                            """),format.raw/*239.29*/("""&nbsp;<div id="videoboard"""),_display_(/*239.55*/sessions/*239.63*/._1),_display_(/*239.67*/signal/*239.73*/._2),format.raw/*239.76*/("""" class= "video-board" name="videoboard"""),_display_(/*239.116*/sessions/*239.124*/._1),_display_(/*239.128*/signal/*239.134*/._2),format.raw/*239.137*/("""" style="position:relative; left: 40px; width: 80%; height: 400px; overflow-x:scroll;  white-space: nowrap;" hidden>
                            <div class="button-station"> <a id = "showvideo"""),_display_(/*240.77*/sessions/*240.85*/._1),_display_(/*240.89*/signal/*240.95*/._2),format.raw/*240.98*/("""" class = "btn btn-default show-video" >Hide Videos</a>  </div>
                            """),_display_(/*241.30*/{import java.math.BigInteger; var i=1}),format.raw/*241.68*/("""
                            """),_display_(/*242.30*/for((sess,videoList) <- videos) yield /*242.61*/{_display_(Seq[Any](format.raw/*242.62*/("""
                            """),_display_(/*243.30*/if(sess == signal._1)/*243.51*/ {_display_(Seq[Any](format.raw/*243.53*/("""
                            """),_display_(/*244.30*/for(video <- videoList) yield /*244.53*/{_display_(Seq[Any](format.raw/*244.54*/("""
                            """),_display_(/*245.30*/if(study_type == 1)/*245.49*/ {_display_(Seq[Any](format.raw/*245.51*/("""
                            """),format.raw/*246.29*/("""<object id=""""),_display_(/*246.42*/video),format.raw/*246.47*/("""">
                                <param name='movie' value='https://video.google.com/get_player?docid=0B2TDTGk9sqZLQjlxcVRxYUNqOFE&amp;ps=docs&amp;partnerid=30&amp;cc_load_policy=1'></param>
                                <param name='allowFullScreen' value='true'></param>
                                <param name='allowScriptAccess' value='always'></param>
                                <embed id='video"""),_display_(/*250.50*/video/*250.55*/._2),_display_(/*250.59*/signal/*250.65*/._2),format.raw/*250.68*/("""' src='https://video.google.com/get_player?docid="""),_display_(/*250.118*/video/*250.123*/._2),format.raw/*250.126*/("""&amp;ps=docs&amp;partnerid=30&amp;cc_load_policy=1&amp;color=white&amp;autoplay=0&amp;enablejsapi=1&amp;playerapiid=video"""),_display_(/*250.248*/video/*250.253*/._2),_display_(/*250.257*/signal/*250.263*/._2),format.raw/*250.266*/("""' type='application/x-shockwave-flash' allowfullscreen='true' allowScriptAccess='always' width=50% height='300'></embed>
                            </object>
                            """)))}/*252.31*/else/*252.36*/{_display_(Seq[Any](format.raw/*252.37*/("""

                            """),format.raw/*254.29*/("""<video id=""""),_display_(/*254.41*/video),format.raw/*254.46*/("""" width="640" height="264" controls>
                                <source src="/videoB" controls type='video/mp4' >
                                <source src="file:///"""),_display_(/*256.55*/video/*256.60*/._2),format.raw/*256.63*/(""""
                                        type='video/ogg; codecs="theora, vorbis"'>
                                Your user agent does not support the HTML5 Video element.
                            </video>

                            """)))}),format.raw/*261.30*/(""" """),format.raw/*261.31*/("""<!-- else -->
                            """),_display_(/*262.30*/{i = i + 1}),format.raw/*262.41*/("""
                            """)))}),format.raw/*263.30*/(""" """),format.raw/*263.31*/("""<!-- video List -->
                            """)))}),format.raw/*264.30*/(""" """),format.raw/*264.31*/("""<!-- if sess== session._1 -->
                            """)))}),format.raw/*265.30*/("""<!-- main for for videos -->
                            <br>
                            <a id = "stopvideo"""),_display_(/*267.48*/sessions/*267.56*/._1),_display_(/*267.60*/signal/*267.66*/._2),format.raw/*267.69*/(""""  class="btn btn-default">Stop Videos</a>   &nbsp; &nbsp;
                        </div>

                            """)))}),format.raw/*270.30*/(""" """),format.raw/*270.31*/("""<!-- check the sequence number  -->
                            """)))}),format.raw/*271.30*/(""" """),format.raw/*271.31*/("""<!-- check the type of signal -->


                            """)))}),format.raw/*274.30*/("""
                        """),format.raw/*275.25*/("""</div>
                        """)))}),format.raw/*276.26*/("""

                    """),format.raw/*278.21*/("""</div>
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

  def render(SubjectId:String,sub_sess:Map[String, scala.Tuple2[String, List[scala.Tuple7[String, Int, Int, Option[String], Option[java.math.BigDecimal], Option[java.math.BigDecimal], Int]]]],studyNo:Int,userName:String,videos:Map[String, List[scala.Tuple2[String, String]]],study_type:Int,sub_sess_menu:List[String],generalList:List[scala.Tuple3[Int, Int, Int]],studyName:String): play.twirl.api.HtmlFormat.Appendable = apply(SubjectId,sub_sess,studyNo,userName,videos,study_type,sub_sess_menu,generalList,studyName)

  def f:((String,Map[String, scala.Tuple2[String, List[scala.Tuple7[String, Int, Int, Option[String], Option[java.math.BigDecimal], Option[java.math.BigDecimal], Int]]]],Int,String,Map[String, List[scala.Tuple2[String, String]]],Int,List[String],List[scala.Tuple3[Int, Int, Int]],String) => play.twirl.api.HtmlFormat.Appendable) = (SubjectId,sub_sess,studyNo,userName,videos,study_type,sub_sess_menu,generalList,studyName) => apply(SubjectId,sub_sess,studyNo,userName,videos,study_type,sub_sess_menu,generalList,studyName)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Apr 01 18:31:42 CDT 2016
                  SOURCE: C:/first_play/app/views/ShowSignals.scala.html
                  HASH: 6f075268d1ac261c83d8a43bbd37a10494986cad
                  MATRIX: 781->1|1282->337|1310->339|1430->433|1458->434|1494->444|1852->775|1881->776|1918->786|2901->1742|2916->1748|2977->1788|3062->1846|3077->1852|3143->1897|3711->2437|3740->2438|3775->2446|3872->2515|3901->2516|3941->2528|4032->2592|4060->2593|4173->2679|4201->2680|4286->2737|4315->2738|4348->2744|4447->2816|4475->2817|4543->2857|4572->2858|4605->2864|4705->2937|4733->2938|4847->3024|4876->3025|4913->3035|5005->3100|5034->3101|7151->5189|7182->5197|7213->5198|8847->6804|8893->6833|8933->6834|8982->6854|9081->6925|9110->6932|9150->6944|9179->6951|9283->7027|9312->7034|9363->7056|9445->7106|9490->7122|10146->7750|10175->7757|10206->7760|10237->7769|10267->7770|10366->7841|10395->7848|10468->7893|10499->7902|10809->8184|10840->8193|10878->8203|10907->8210|10977->8252|11018->8276|11058->8277|11098->8289|11164->8327|11178->8331|11203->8335|11217->8339|11242->8342|11283->8355|11314->8364|11376->8397|11391->8401|11417->8404|11461->8419|11476->8423|11502->8426|11544->8439|11559->8443|11585->8446|11673->8502|11713->8514|11883->8696|11928->8712|12004->8760|12052->8791|12092->8792|12143->8815|12163->8825|12204->8827|12255->8849|12314->8880|12331->8887|12356->8890|12395->8901|12412->8908|12437->8911|12496->8941|12528->8950|12569->8962|12587->8969|12613->8972|12661->8991|12688->8995|12728->9006|12758->9013|12790->9015|12853->9049|12868->9053|12922->9084|12974->9117|12988->9122|13028->9123|13079->9145|13123->9161|13140->9168|13165->9171|13204->9182|13221->9189|13246->9192|13304->9222|13336->9231|13377->9243|13395->9250|13421->9253|13469->9272|13496->9276|13536->9287|13566->9294|13598->9296|13661->9330|13676->9334|13730->9365|13794->9397|13845->9420|13879->9432|13934->9455|13981->9473|14083->9588|14132->9609|14181->9641|14221->9642|14272->9665|14292->9675|14333->9677|14384->9699|14422->9709|14440->9717|14465->9720|14546->9782|14560->9787|14600->9788|14655->9814|14693->9824|14711->9832|14736->9835|14823->9890|14882->9921|14916->9933|14975->9964|15018->9990|15058->9991|15117->10021|15214->10090|15296->10161|15338->10163|15397->10193|15449->10217|15467->10225|15492->10229|15508->10235|15533->10238|15612->10289|15630->10297|15655->10301|15671->10307|15696->10310|15750->10336|15782->10345|15823->10357|15842->10365|15868->10368|15916->10387|15943->10391|15991->10410|16008->10416|16034->10419|16078->10434|16095->10440|16121->10443|16163->10456|16180->10462|16206->10465|16245->10475|16262->10481|16288->10484|16327->10494|16344->10500|16370->10503|16410->10514|16427->10520|16453->10523|16699->10741|16727->10759|16767->10760|16826->10790|16880->10816|16898->10824|16923->10828|16939->10834|16964->10837|17033->10877|17052->10885|17078->10889|17095->10895|17121->10898|17343->11092|17361->11100|17386->11104|17402->11110|17427->11113|17549->11207|17609->11245|17668->11276|17716->11307|17756->11308|17815->11339|17846->11360|17887->11362|17946->11393|17986->11416|18026->11417|18085->11448|18114->11467|18155->11469|18214->11499|18255->11512|18282->11517|18728->11935|18743->11940|18768->11944|18784->11950|18809->11953|18888->12003|18904->12008|18930->12011|19081->12133|19097->12138|19123->12142|19140->12148|19166->12151|19376->12342|19390->12347|19430->12348|19491->12380|19531->12392|19558->12397|19761->12572|19776->12577|19801->12580|20080->12827|20110->12828|20182->12872|20215->12883|20278->12914|20308->12915|20390->12965|20420->12966|20512->13026|20651->13137|20669->13145|20694->13149|20710->13155|20735->13158|20890->13281|20920->13282|21018->13348|21048->13349|21148->13417|21203->13443|21268->13476|21321->13500
                  LINES: 19->1|23->1|24->2|30->8|30->8|31->9|42->20|42->20|45->23|63->41|63->41|63->41|64->42|64->42|64->42|76->54|76->54|77->55|77->55|77->55|78->56|79->57|79->57|83->61|83->61|85->63|85->63|86->64|87->65|87->65|88->66|88->66|89->67|90->68|90->68|92->70|92->70|93->71|94->72|94->72|138->116|138->116|138->116|168->146|168->146|168->146|170->148|172->150|172->150|172->150|172->150|173->151|173->151|174->152|178->156|180->158|196->174|196->174|196->174|196->174|196->174|197->175|197->175|198->176|198->176|212->190|212->190|212->190|212->190|214->192|214->192|214->192|216->194|216->194|216->194|216->194|216->194|216->194|216->194|216->194|216->194|216->194|216->194|216->194|216->194|216->194|216->194|216->194|216->194|220->198|224->202|228->207|228->207|229->208|229->208|229->208|230->209|230->209|230->209|231->210|231->210|231->210|231->210|231->210|231->210|231->210|231->210|231->210|231->210|231->210|231->210|231->210|231->210|231->210|231->210|231->210|231->210|231->210|231->210|232->211|232->211|232->211|233->212|233->212|233->212|233->212|233->212|233->212|233->212|233->212|233->212|233->212|233->212|233->212|233->212|233->212|233->212|233->212|233->212|233->212|233->212|233->212|234->213|235->214|235->214|236->215|237->216|241->221|241->221|241->221|241->221|242->222|242->222|242->222|243->223|243->223|243->223|243->223|244->224|244->224|244->224|245->225|245->225|245->225|245->225|246->226|247->227|247->227|248->228|248->228|248->228|249->229|250->230|250->230|250->230|251->231|251->231|251->231|251->231|251->231|251->231|252->232|252->232|252->232|252->232|252->232|252->232|252->232|252->232|252->232|252->232|252->232|252->232|252->232|252->232|252->232|252->232|252->232|252->232|252->232|252->232|252->232|252->232|252->232|252->232|252->232|252->232|252->232|252->232|252->232|252->232|258->238|258->238|258->238|259->239|259->239|259->239|259->239|259->239|259->239|259->239|259->239|259->239|259->239|259->239|260->240|260->240|260->240|260->240|260->240|261->241|261->241|262->242|262->242|262->242|263->243|263->243|263->243|264->244|264->244|264->244|265->245|265->245|265->245|266->246|266->246|266->246|270->250|270->250|270->250|270->250|270->250|270->250|270->250|270->250|270->250|270->250|270->250|270->250|270->250|272->252|272->252|272->252|274->254|274->254|274->254|276->256|276->256|276->256|281->261|281->261|282->262|282->262|283->263|283->263|284->264|284->264|285->265|287->267|287->267|287->267|287->267|287->267|290->270|290->270|291->271|291->271|294->274|295->275|296->276|298->278
                  -- GENERATED --
              */
          