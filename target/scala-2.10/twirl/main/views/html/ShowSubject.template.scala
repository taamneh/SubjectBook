
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
            <li class="active"><a href="/showStudy/"""),_display_(/*81.53*/studyNo),format.raw/*81.60*/("""">"""),_display_(/*81.63*/study_name),format.raw/*81.73*/(""" """),format.raw/*81.74*/("""</a> </li>
        </ol>
    </div><!--/.row-->




    <!-- <a id ="portart">Portart </a> -->

    <!-- Use a container to wrap the slider, the purpose is to enable slider to always fit width of the wrapper while window resize -->
    <div class="row">
        <!-- Jssor Slider Begin -->
        <!-- To move inline styles to css file/block, please specify a class name for each element. -->
        <!-- ================================================== -->
        <div id="slider1_container" style="display: none; position: relative; margin: 0 auto; width: 1140px; height: 442px; overflow: hidden;">

            <!-- Loading Screen -->
            <div u="loading" style="position: absolute; top: 0px; left: 0px;">
                <div style="filter: alpha(opacity=70); opacity:0.7; position: absolute; display: block;

                background-color: #000; top: 0px; left: 0px;width: 100%; height:100%;">
                </div>
                <div style="position: absolute; display: block; background: url(/assets/images/loading.gif) no-repeat center center;

                top: 0px; left: 0px;width: 100%;height:100%;">
                </div>
            </div>

            <!-- Slides Container -->
            <div u="slides" style="cursor: move; position: absolute; left: 0px; top: 0px; width: 1140px; height: 442px;
            overflow: hidden;">
                <div>
                    <img u="image" src2="/assets/images/general.jpg" />
                </div>
                <div>
                    <img u="image" src2="/assets/images/sessions.jpg" />
                </div>
                <div>
                    <img u="image" src2="/assets/images/sessions2.jpg" />
                </div>
                <div>
                    <img u="image" src2="/assets/images/NASA.jpg" />
                </div>
                <div>
                    <img u="image" src2="/assets/images/performance.jpg" />
                </div>
            </div>

            <!--#region Bullet Navigator Skin Begin -->
            <!-- Help: http://www.jssor.com/development/slider-with-bullet-navigator-jquery.html -->
            <style>
                /* jssor slider bullet navigator skin 05 css */
                /*
                .jssorb05 div           (normal)
                .jssorb05 div:hover     (normal mouseover)
                .jssorb05 .av           (active)
                .jssorb05 .av:hover     (active mouseover)
                .jssorb05 .dn           (mousedown)
                */
                .jssorb05 """),format.raw/*140.27*/("""{"""),format.raw/*140.28*/("""
                """),format.raw/*141.17*/("""position: absolute;
                """),format.raw/*142.17*/("""}"""),format.raw/*142.18*/("""
                """),format.raw/*143.17*/(""".jssorb05 div, .jssorb05 div:hover, .jssorb05 .av """),format.raw/*143.67*/("""{"""),format.raw/*143.68*/("""
                """),format.raw/*144.17*/("""position: absolute;
                /* size of bullet elment */
                width: 16px;
                height: 16px;
                background: url(/assets/images/b05.png) no-repeat;
                overflow: hidden;
                cursor: pointer;
                """),format.raw/*151.17*/("""}"""),format.raw/*151.18*/("""
                """),format.raw/*152.17*/(""".jssorb05 div """),format.raw/*152.31*/("""{"""),format.raw/*152.32*/(""" """),format.raw/*152.33*/("""background-position: -7px -7px; """),format.raw/*152.65*/("""}"""),format.raw/*152.66*/("""
                """),format.raw/*153.17*/(""".jssorb05 div:hover, .jssorb05 .av:hover """),format.raw/*153.58*/("""{"""),format.raw/*153.59*/(""" """),format.raw/*153.60*/("""background-position: -37px -7px; """),format.raw/*153.93*/("""}"""),format.raw/*153.94*/("""
                """),format.raw/*154.17*/(""".jssorb05 .av """),format.raw/*154.31*/("""{"""),format.raw/*154.32*/(""" """),format.raw/*154.33*/("""background-position: -67px -7px; """),format.raw/*154.66*/("""}"""),format.raw/*154.67*/("""
                """),format.raw/*155.17*/(""".jssorb05 .dn, .jssorb05 .dn:hover """),format.raw/*155.52*/("""{"""),format.raw/*155.53*/(""" """),format.raw/*155.54*/("""background-position: -97px -7px; """),format.raw/*155.87*/("""}"""),format.raw/*155.88*/("""
            """),format.raw/*156.13*/("""</style>
            <!-- bullet navigator container -->
            <div u="navigator" class="jssorb05" style="bottom: 16px; right: 6px;">
                <!-- bullet navigator item prototype -->
                <div u="prototype"></div>
            </div>
            <!--#endregion Bullet Navigator Skin End -->

            <!--#region Arrow Navigator Skin Begin -->
            <!-- Help: http://www.jssor.com/development/slider-with-arrow-navigator-jquery.html -->
            <style>
                /* jssor slider arrow navigator skin 11 css */
                /*
                .jssora11l                  (normal)
                .jssora11r                  (normal)
                .jssora11l:hover            (normal mouseover)
                .jssora11r:hover            (normal mouseover)
                .jssora11l.jssora11ldn      (mousedown)
                .jssora11r.jssora11rdn      (mousedown)
                */
                .jssora11l, .jssora11r """),format.raw/*176.40*/("""{"""),format.raw/*176.41*/("""
                """),format.raw/*177.17*/("""display: block;
                position: absolute;
                /* size of arrow element */
                width: 37px;
                height: 37px;
                cursor: pointer;
                background: url(/assets/images/a11.png) no-repeat;
                overflow: hidden;
                """),format.raw/*185.17*/("""}"""),format.raw/*185.18*/("""
                """),format.raw/*186.17*/(""".jssora11l """),format.raw/*186.28*/("""{"""),format.raw/*186.29*/(""" """),format.raw/*186.30*/("""background-position: -11px -41px; """),format.raw/*186.64*/("""}"""),format.raw/*186.65*/("""
                """),format.raw/*187.17*/(""".jssora11r """),format.raw/*187.28*/("""{"""),format.raw/*187.29*/(""" """),format.raw/*187.30*/("""background-position: -71px -41px; """),format.raw/*187.64*/("""}"""),format.raw/*187.65*/("""
                """),format.raw/*188.17*/(""".jssora11l:hover """),format.raw/*188.34*/("""{"""),format.raw/*188.35*/(""" """),format.raw/*188.36*/("""background-position: -131px -41px; """),format.raw/*188.71*/("""}"""),format.raw/*188.72*/("""
                """),format.raw/*189.17*/(""".jssora11r:hover """),format.raw/*189.34*/("""{"""),format.raw/*189.35*/(""" """),format.raw/*189.36*/("""background-position: -191px -41px; """),format.raw/*189.71*/("""}"""),format.raw/*189.72*/("""
                """),format.raw/*190.17*/(""".jssora11l.jssora11ldn """),format.raw/*190.40*/("""{"""),format.raw/*190.41*/(""" """),format.raw/*190.42*/("""background-position: -251px -41px; """),format.raw/*190.77*/("""}"""),format.raw/*190.78*/("""
                """),format.raw/*191.17*/(""".jssora11r.jssora11rdn """),format.raw/*191.40*/("""{"""),format.raw/*191.41*/(""" """),format.raw/*191.42*/("""background-position: -311px -41px; """),format.raw/*191.77*/("""}"""),format.raw/*191.78*/("""
            """),format.raw/*192.13*/("""</style>
            <!-- Arrow Left -->
            <span u="arrowleft" class="jssora11l" style="top: 123px; left: 8px;">
            </span>
            <!-- Arrow Right -->
            <span u="arrowright" class="jssora11r" style="top: 123px; right: 8px;">
            </span>
            <!--#endregion Arrow Navigator Skin End -->
            <a style="display: none" href="http://www.jssor.com">Bootstrap Slider</a>
        </div>
        <!-- Jssor Slider End -->
    </div>

    <div  class="row" id="portrait" >
    </div>



    <script type="text/javascript"  src="/assets/javascripts/jssor.slider.mini.js"></script>
    <script>
        jQuery(document).ready(function ($) """),format.raw/*212.45*/("""{"""),format.raw/*212.46*/("""
            """),format.raw/*213.13*/("""var options = """),format.raw/*213.27*/("""{"""),format.raw/*213.28*/("""
                """),format.raw/*214.17*/("""$AutoPlay: true,                                    //[Optional] Whether to auto play, to enable slideshow, this option must be set to true, default value is false
                $AutoPlaySteps: 1,                                  //[Optional] Steps to go for each navigation request (this options applys only when slideshow disabled), the default value is 1
                $AutoPlayInterval: 8000,                            //[Optional] Interval (in milliseconds) to go for next slide since the previous stopped if the slider is auto playing, default value is 3000
                $PauseOnHover: 1,                                   //[Optional] Whether to pause when mouse over if a slider is auto playing, 0 no pause, 1 pause for desktop, 2 pause for touch device, 3 pause for desktop and touch device, 4 freeze for desktop, 8 freeze for touch device, 12 freeze for desktop and touch device, default value is 1

                $ArrowKeyNavigation: true,   			            //[Optional] Allows keyboard (arrow key) navigation or not, default value is false
                $SlideEasing: $JssorEasing$.$EaseOutQuint,          //[Optional] Specifies easing for right to left animation, default value is $JssorEasing$.$EaseOutQuad
                $SlideDuration: 800,                                //[Optional] Specifies default duration (swipe) for slide in milliseconds, default value is 500
                $MinDragOffsetToSlide: 20,                          //[Optional] Minimum drag offset to trigger slide , default value is 20
                //$SlideWidth: 600,                                 //[Optional] Width of every slide in pixels, default value is width of 'slides' container
                //$SlideHeight: 300,                                //[Optional] Height of every slide in pixels, default value is height of 'slides' container
                $SlideSpacing: 0, 					                //[Optional] Space between each slide in pixels, default value is 0
                $DisplayPieces: 1,                                  //[Optional] Number of pieces to display (the slideshow would be disabled if the value is set to greater than 1), the default value is 1
                $ParkingPosition: 0,                                //[Optional] The offset position to park slide (this options applys only when slideshow disabled), default value is 0.
                $UISearchMode: 1,                                   //[Optional] The way (0 parellel, 1 recursive, default value is 1) to search UI components (slides container, loading screen, navigator container, arrow navigator container, thumbnail navigator container etc).
                $PlayOrientation: 1,                                //[Optional] Orientation to play slide (for auto play, navigation), 1 horizental, 2 vertical, 5 horizental reverse, 6 vertical reverse, default value is 1
                $DragOrientation: 1,                                //[Optional] Orientation to drag slide, 0 no drag, 1 horizental, 2 vertical, 3 either, default value is 1 (Note that the $DragOrientation should be the same as $PlayOrientation when $DisplayPieces is greater than 1, or parking position is not 0)

                $ArrowNavigatorOptions: """),format.raw/*232.41*/("""{"""),format.raw/*232.42*/("""                           """),format.raw/*232.69*/("""//[Optional] Options to specify and enable arrow navigator or not
                    $Class: $JssorArrowNavigator$,                  //[Requried] Class to create arrow navigator instance
                    $ChanceToShow: 2,                               //[Required] 0 Never, 1 Mouse Over, 2 Always
                    $AutoCenter: 2,                                 //[Optional] Auto center arrows in parent container, 0 No, 1 Horizontal, 2 Vertical, 3 Both, default value is 0
                    $Steps: 1,                                      //[Optional] Steps to go for each navigation request, default value is 1
                    $Scale: false                                   //Scales bullets navigator or not while slider scale
                """),format.raw/*238.17*/("""}"""),format.raw/*238.18*/(""",

                $BulletNavigatorOptions: """),format.raw/*240.42*/("""{"""),format.raw/*240.43*/("""                                """),format.raw/*240.75*/("""//[Optional] Options to specify and enable navigator or not
                    $Class: $JssorBulletNavigator$,                       //[Required] Class to create navigator instance
                    $ChanceToShow: 2,                               //[Required] 0 Never, 1 Mouse Over, 2 Always
                    $AutoCenter: 1,                                 //[Optional] Auto center navigator in parent container, 0 None, 1 Horizontal, 2 Vertical, 3 Both, default value is 0
                    $Steps: 1,                                      //[Optional] Steps to go for each navigation request, default value is 1
                    $Lanes: 1,                                      //[Optional] Specify lanes to arrange items, default value is 1
                    $SpacingX: 12,                                   //[Optional] Horizontal space between each item in pixel, default value is 0
                    $SpacingY: 4,                                   //[Optional] Vertical space between each item in pixel, default value is 0
                    $Orientation: 1,                                //[Optional] The orientation of the navigator, 1 horizontal, 2 vertical, default value is 1
                    $Scale: false                                   //Scales bullets navigator or not while slider scale
                """),format.raw/*250.17*/("""}"""),format.raw/*250.18*/("""
            """),format.raw/*251.13*/("""}"""),format.raw/*251.14*/(""";

            //Make the element 'slider1_container' visible before initialize jssor slider.
            $("#slider1_container").css("display", "block");
            var jssor_slider1 = new $JssorSlider$("slider1_container", options);

            //responsive code begin
            //you can remove responsive code if you don't want the slider scales while window resizes
            function ScaleSlider() """),format.raw/*259.36*/("""{"""),format.raw/*259.37*/("""
                """),format.raw/*260.17*/("""var parentWidth = jssor_slider1.$Elmt.parentNode.clientWidth;
                if (parentWidth) """),format.raw/*261.34*/("""{"""),format.raw/*261.35*/("""
                    """),format.raw/*262.21*/("""jssor_slider1.$ScaleWidth(parentWidth - 30);
                """),format.raw/*263.17*/("""}"""),format.raw/*263.18*/("""
                """),format.raw/*264.17*/("""else
                    window.setTimeout(ScaleSlider, 30);
            """),format.raw/*266.13*/("""}"""),format.raw/*266.14*/("""
            """),format.raw/*267.13*/("""ScaleSlider();


            $(window).bind("load", ScaleSlider);
            $(window).bind("resize", ScaleSlider);
            $(window).bind("orientationchange", ScaleSlider);
            //responsive code end
        """),format.raw/*274.9*/("""}"""),format.raw/*274.10*/(""");
    </script>


    <script>

   /*$(document).ready(function()"""),format.raw/*280.34*/("""{"""),format.raw/*280.35*/("""

    """),format.raw/*282.5*/("""alert( """"),_display_(/*282.14*/poratratParm),format.raw/*282.26*/("""" );
    var port = "http://kyeongan.cpl.uh.edu/projects/css/api/generator-portrait.php?" + "subjects=39&cols=3&hideButton=yes&title=ToyotaStudy&genders=M,F,M,F,M,F,F,M,F,M,F,M,F,F,M,F,F,F,M,F,F,F,M,F,F,F,M,F,M,M,F,M,F,F,M,F,F,M,M&exams=8&traits=0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0&grades=NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA;NA,NA,NA,NA,NA,NA,NA,NA&sBars=6.37,83.33,10.3:21.18,72.44,6.38:8.24,82.71,9.05:7.16,88.2,4.64:1.93,66.75,31.32:9.54,76.59,13.87:9.12,84.34,6.54:34.51,56.66,8.82;5.4,78.39,16.22:15.1,68.26,16.64:9.4,83.47,7.13:24.44,56.45,19.12:10,80.91,9.09:13.41,71.15,15.44:8.77,74.12,17.11;16.69,77.8,5.51:23.81,71.66,4.53:14.11,78.87,7.01:18.69,77.03,4.28:7.35,71.83,20.83:15.67,69.12,15.21:2.79,71.34,25.87:6.63,80.99,12.38;29.56,62.84,7.6:21.96,70.29,7.74:4.74,75.7,19.56:15.01,68.1,16.89:13.34,72.2,14.46:6.98,77.7,15.32:21.79,66.52,11.69:18.2,58.37,23.43;23.39,71.2,5.4:30.07,69.76,0.17:13.52,75.49,11:5.05,90.91,4.04:1.28,73.59,25.13:9.04,79.3,11.67:2.52,69.38,28.1:12.57,83.01,4.41;12,85.72,2.28:5.63,82.59,11.79:6.22,90.26,3.53:15.11,83.71,1.18:5.18,84.56,10.26:3.84,70.45,25.71:10.63,64.53,24.84:10.1,66.8,23.09;7.88,81.97,10.15:1.75,71.71,26.53:20.14,77.56,2.3:2.44,81.34,16.22:4.06,77.07,18.87:5.54,86.58,7.88:10.01,85.21,4.78:12.14,81.47,6.39;29.52,62.5,7.98:7.79,89.21,3:13.66,76.63,9.71:2.72,81.65,15.63:1.15,94.89,3.97:5.97,83.14,10.9:2.18,82.89,14.93;16.13,71.79,12.08:14.22,64.94,20.84:4.98,79.03,15.99:10.04,71.85,18.12:21.46,67.79,10.75:21.5,67.44,11.06:9.25,77.06,13.69:17.88,69.01,13.11;20.64,77.55,1.81:5.05,89.84,5.11:1.44,91.86,6.7:6.28,85.27,8.45:3.03,91.01,5.95:0.8,91.98,7.21:4.77,86.62,8.6:0.4,94.55,5.05;5.11,78.53,16.36:8,78.63,13.37:14.36,74.09,11.55:4.96,83.77,11.26:3.37,92.27,4.35:2.76,89.52,7.73:3.1,90.05,6.85:11.99,83.9,4.11;40.13,59.44,0.43:13.74,75.63,10.62:8.01,76.76,15.23:4.41,82.03,13.57:7.95,81,11.05:2.42,81.56,16.01:2.42,77.72,19.86:19.66,76.23,4.11;10.8,78.22,10.99:3.49,81.39,15.11:5.47,89.08,5.45:12.03,80.8,7.16:3.32,89.8,6.88:2.25,85.09,12.66:12.13,76.27,11.6:4.94,77.67,17.39;25.15,67.94,6.91:6.86,70.49,22.65:17.7,72.98,9.32:11.4,73.91,14.69:8.46,82.36,9.18:13.43,74.03,12.54:16.8,66.66,16.54:3.11,74.45,22.44;19.4,79.98,0.62:7.72,89.66,2.62:12.23,81.75,6.02:7.05,89.6,3.35:3.94,91.52,4.54:5.12,67.2,27.68:2.06,71.25,26.7:1.92,88.04,10.03;19.96,74.4,5.64:19.87,70.03,10.1:15.29,73.21,11.5:15.44,70.59,13.98:8.3,76.72,14.98:13.3,68.5,18.2:14.98,70.64,14.37:7.15,66,26.85;6.39,66.57,27.04:8.02,64.46,27.51:8.55,82.29,9.16:13.29,76.94,9.77:6.53,82.07,11.39:11.48,84.46,4.06:10.66,80.7,8.65:4.03,84.82,11.15;36.35,49.86,13.79:13.37,78.96,7.68:28.84,65.22,5.94:18.8,72.55,8.65:10.69,71.72,17.59:10.43,74.4,15.17:1.31,73.9,24.79:6.26,76.27,17.47;5.21,69.54,25.24:26.2,61.18,12.63:26.53,65.47,8:7.78,71.05,21.17:11.91,73.7,14.39:10.77,77.48,11.75:12.28,76.82,10.89:15.9,72.43,11.67;3.87,85.64,10.49:9.47,72.85,17.68:26.71,60.37,12.91:8.47,72.81,18.72:19.33,65.41,15.25:16.47,75.16,8.37:8.72,78.51,12.77:6.63,74.54,18.83;15.49,83.17,1.33:16.14,75.96,7.9:14.47,81.66,3.87:15.85,81.31,2.84:3.98,78.12,17.9:6,82.61,11.38:3.81,69.73,26.46:2.34,64.92,32.74;12.35,76,11.65:14.55,73.23,12.22:10.35,77.19,12.47:11.71,79.18,9.12:6.61,82.8,10.59:10.2,79.17,10.64:13.5,71.62,14.88:3.96,81.62,14.41;10.74,81.84,7.42:5.43,74.9,19.66:36.51,55.09,8.41:7.85,85.99,6.16:7.79,83.07,9.14:4.1,84.5,11.4:6.3,80.5,13.2:5.54,78.94,15.52;15.39,74.51,10.1:13.99,76.1,9.92:9.56,81.37,9.07:15.42,77.21,7.37:15.92,67.67,16.41:10.91,76.86,12.24:7.23,76.42,16.35:7.39,66.37,26.25;16.62,66.8,16.58:6.97,86.08,6.95:6.15,91.27,2.58:8.98,83.87,7.15:17.85,71.8,10.35:15.22,66.28,18.5:10.87,71.59,17.54:4.77,71.92,23.31;6.43,85.87,7.69:13.63,68.81,17.56:19.95,63.76,16.29:9.56,75.95,14.49:16.66,72.9,10.44:15.56,69.85,14.59:13.51,74.52,11.96:1.62,67.39,30.98;0.4,33.2,66.4:8.08,74.15,17.78:7.82,90.36,1.82:5.18,73.42,21.4:15.76,76.61,7.63:9.3,85.28,5.42:19.39,76.78,3.82:11.91,84.65,3.44;33.38,64.37,2.25:21.08,65.94,12.98:17.23,75.11,7.66:10.53,82.8,6.67:6.7,69.39,23.91:10.59,76.78,12.63:7.82,80.31,11.87:8.65,71.78,19.57;49.11,30.96,19.93:1.75,81.78,16.47:5.49,79.32,15.19:8.12,72.57,19.31:4.15,72.21,23.64:6.71,82.87,10.42:23.27,67.44,9.29:28.01,70.37,1.62;1.75,96.21,2.04:1.64,90.34,8.02:5.83,90.72,3.45:2.66,91.32,6.02:7.12,90.56,2.32:3.85,82.99,13.16:0.55,89.29,10.17:0.74,93.77,5.49;0.93,84.01,15.06:9.22,80.38,10.4:20.71,75.09,4.2:9.09,83.63,7.28:8.33,82.95,8.72:7.61,88.59,3.8:9.13,66.78,24.09:1.52,67.64,30.85;54.04,45.16,0.8:13.48,85.35,1.16:23.34,76.41,0.25:4.29,72.49,23.22:1.14,89.56,9.29:0.43,58.54,41.03:11.33,86.27,2.39:17.04,81.5,1.46;7.47,72.44,20.09:13.13,74.87,12:15.24,76.57,8.19:5.73,82.02,12.25:12.08,78.71,9.21:12.76,71.79,15.44:18.88,67.16,13.96:6.39,68.27,25.35;9.79,80.58,9.63:1.87,83.37,14.76:5.05,83.68,11.27:11.8,66.64,21.56:11.16,87.2,1.63:8.88,75.76,15.36:4.07,88.83,7.09;13.98,77.98,8.05:7.44,85.62,6.94:19.87,77.32,2.81:24.57,61.77,13.66:6.12,92.36,1.52:4.15,81.57,14.28:1.01,61.32,37.66:0.06,84.17,15.77;30.09,61.1,8.82:5.98,85.35,8.67:7.45,85.91,6.65:12.27,70.19,17.54:12.33,72.79,14.87:10.98,77.66,11.36:10.85,74.41,14.74:10.39,72.93,16.68;57.36,41.8,0.84:15.06,81.88,3.06:17.52,75.48,7:12.21,82.9,4.89:4.54,82.36,13.1:18.38,77.16,4.46:1.94,55.1,42.96:0.52,49.91,49.56;24.77,74.84,0.39:5.28,92.74,1.98:9.58,90.31,0.12:8.19,91.65,0.16:0.31,68.46,31.24:0.02,89.96,10.02:0.04,90.81,9.15:0.13,81.89,17.98;4.63,66.84,28.54:37.49,60.65,1.86:58.36,41.03,0.61:4.49,71.17,24.34:1.83,74.03,24.14:0.9,76.79,22.31:27.61,69.29,3.11:15.12,80.4,4.48&namesSubjects=T001,T002,T003,T004,T005,T006,T008,T009,T010,T011,T012,T013,T014,T016,T017,T018,T020,T022,T023,T024,T025,T027,T028,T029,T031,T033,T034,T035,T036,T038,T039,T040,T041,T043,T044,T045,T047,T050,T054&studyNo=16&exLinks=http://subjectbook.times.uh.edu/displaySubject&namesExams=BL,PD,ND,LD1,LD2,LD3,LD4,FD;PD,ND,LD1,LD2,LD4,LD3,FD;BL,PD,ND,LD1,LD3,LD2,LD4,FD;BL,PD,ND,LD1,LD3,LD4,LD2,FD;BL,PD,ND,LD1,LD4,LD2,LD3,FD;BL,PD,ND,LD1,LD4,LD3,LD2,FD;BL,PD,ND,LD2,LD1,LD4,LD3,FD;PD,ND,LD2,LD3,LD1,LD4,FD;BL,PD,ND,LD2,LD3,LD4,LD1,FD;BL,PD,ND,LD2,LD4,LD1,LD3,FD;BL,PD,ND,LD2,LD4,LD3,LD1,FD;BL,PD,ND,LD3,LD1,LD2,LD4,FD;BL,PD,ND,LD3,LD1,LD4,LD2,FD;BL,PD,ND,LD3,LD2,LD4,LD1,FD;BL,PD,ND,LD3,LD4,LD1,LD2,FD;BL,PD,ND,LD3,LD4,LD2,LD1,FD;BL,PD,ND,LD2,LD4,LD1,LD3,FD;BL,PD,ND,LD4,LD2,LD3,LD1,FD;BL,PD,ND,LD4,LD3,LD1,LD2,FD;BL,PD,ND,LD4,LD3,LD2,LD1,FD;BL,PD,ND,LD1,LD2,LD3,LD4,FD;BL,PD,ND,LD1,LD3,LD2,LD4,FD;BL,PD,ND,LD1,LD3,LD4,LD2,FD;BL,PD,ND,LD1,LD4,LD2,LD3,FD;BL,PD,ND,LD2,LD1,LD3,LD4,FD;BL,PD,ND,LD2,LD3,LD4,LD1,FD;BL,PD,ND,LD2,LD3,LD4,LD1,FD;BL,PD,ND,LD2,LD4,LD1,LD3,FD;BL,PD,ND,LD2,LD4,LD3,LD1,FD;BL,PD,ND,LD3,LD1,LD4,LD2,FD;BL,PD,ND,LD3,LD2,LD1,LD4,FD;BL,PD,ND,LD3,LD2,LD4,LD1,FD;BL,PD,ND,LD3,LD4,LD1,LD2,FD;BL,PD,ND,LD4,LD1,LD2,LD3,FD;BL,PD,ND,LD4,LD1,LD3,LD2,FD;BL,PD,ND,LD4,LD2,LD1,LD3,FD;BL,PD,ND,LD4,LD3,LD1,LD2,FD;BL,PD,ND,LD1,LD4,LD3,LD2,FD;BL,PD,ND,LD1,LD2,LD3,LD4,FD";

    alert(port);
          $("#portrait").load( port, function() """),format.raw/*286.49*/("""{"""),format.raw/*286.50*/("""
  """),format.raw/*287.3*/("""alert( "Load was performed." );
    """),format.raw/*288.5*/("""}"""),format.raw/*288.6*/(""");
   """),format.raw/*289.4*/("""}"""),format.raw/*289.5*/(""");*/



   $('iframe').load(function()"""),format.raw/*293.31*/("""{"""),format.raw/*293.32*/("""
         """),format.raw/*294.10*/("""//alert('sss');
         var x = document.getElementById("portrait");
         //alert(x);
        $("#S003").clicke(function()"""),format.raw/*297.37*/("""{"""),format.raw/*297.38*/("""
         """),format.raw/*298.10*/("""//alert('sss');
        """),format.raw/*299.9*/("""}"""),format.raw/*299.10*/(""");
        """),format.raw/*300.9*/("""}"""),format.raw/*300.10*/(""");
          //$("#portart").click(function() """),format.raw/*301.44*/("""{"""),format.raw/*301.45*/("""
        """),format.raw/*302.9*/("""var arr =[100,1000,3000,9000];
        //window.location = 'http://kyeongan.cpl.uh.edu/projects/css/api/generator.html?data=1,2,3,4,5,6,76,7,8,8,8,9';
        //window.locaton = 'http://kyeongan.cpl.uh.edu/projects/css/api/generator.html?data=' + result;


       /* paramList =  $.ajax("""),format.raw/*307.31*/("""{"""),format.raw/*307.32*/("""
                   """),format.raw/*308.20*/("""type: 'GET',
                   url: "/portrait",
                   dataType:"text",
                   data: "studyId=" + """),_display_(/*311.40*/studyNo),format.raw/*311.47*/(""",
                    async: false
                   """),format.raw/*313.20*/("""}"""),format.raw/*313.21*/(""").responseText;*/

        //window.location.assign("http://kyeongan.cpl.uh.edu/projects/css/api/generator-portrait.php?"+ paramList);


         //alert(""""),_display_(/*318.20*/poratratParm),format.raw/*318.32*/("""");
        /* var iframe = document.createElement('iframe');
         iframe.style.width = "100%"
         iframe.style.height= "1000px"
         iframe.frameborder = "0";
         //alert("""),_display_(/*323.19*/poratratParm),format.raw/*323.31*/(""");
         iframe.src = "http://kyeongan.cpl.uh.edu/projects/css/api/generator-portrait.php?"""),_display_(/*324.92*/poratratParm),format.raw/*324.104*/("""";
         //document.body.appendChild(iframe);
         document.getElementById("portrait").appendChild(iframe);*/

        //"""),format.raw/*328.11*/("""}"""),format.raw/*328.12*/(""");
    </script>

    <!-- <div>
        <object type="text/html" data="http://kyeongan.cpl.uh.edu/projects/css/api/generator-portrait.php?"""),_display_(/*332.108*/poratratParm),format.raw/*332.120*/("""" width="800px" height="600px" style="overflow:auto;border:5px ridge blue">
        </object>
    </div> -->

    <!-- <meta http-equiv="refresh" content="0; url=http://kyeongan.cpl.uh.edu/projects/css/api/generator-portrait.php?"""),_display_(/*336.121*/poratratParm),format.raw/*336.133*/("""" /> -->



    """),_display_(/*340.6*/if(poratratParm != "")/*340.28*/ {_display_(Seq[Any](format.raw/*340.30*/("""
    """),format.raw/*341.5*/("""<iframe src="http://kyeongan.cpl.uh.edu/projects/css/api/generator-portrait.php?"""),_display_(/*341.86*/poratratParm),format.raw/*341.98*/("""" style="width:100%; height: 3000px;" frameborder="0"></iframe>
    """)))}/*342.7*/else/*342.12*/{_display_(Seq[Any](format.raw/*342.13*/("""

    """),format.raw/*344.5*/("""<div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">Subjects</h1>
        </div>
    </div><!--/.row-->

    <div class="row">
        """),_display_(/*351.10*/for(subject <- sub_sess) yield /*351.34*/{_display_(Seq[Any](format.raw/*351.35*/("""
        """),format.raw/*352.9*/("""<div class="col-xs-12 col-md-6 col-lg-3">
            <div class="panel panel-blue panel-widget ">
                <div class="row no-padding">
                    <div class="col-sm-3 col-lg-5 widget-left">
                        <em class="glyphicon glyphicon-user glyphicon-l"></em>
                    </div>
                    <div class="col-sm-9 col-lg-7 widget-right">
                        <div class="large">
                            <a href="/displaySubject?studyNo="""),_display_(/*360.63*/studyNo),format.raw/*360.70*/("""&SubjectId="""),_display_(/*360.82*/subject),format.raw/*360.89*/("""">
                                """),_display_(/*361.34*/subject),format.raw/*361.41*/("""
                            """),format.raw/*362.29*/("""</a>
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
        """)))}),format.raw/*374.10*/("""


    """),format.raw/*377.5*/("""</div><!--/.row-->
    """)))}),format.raw/*378.6*/("""

"""),format.raw/*380.1*/("""</div>	<!--/.main-->

<script>
		$('#calendar').datepicker("""),format.raw/*383.29*/("""{"""),format.raw/*383.30*/("""
		"""),format.raw/*384.3*/("""}"""),format.raw/*384.4*/(""");

		!function ($) """),format.raw/*386.17*/("""{"""),format.raw/*386.18*/("""
		    """),format.raw/*387.7*/("""$(document).on("click","ul.nav li.parent > a > span.icon", function()"""),format.raw/*387.76*/("""{"""),format.raw/*387.77*/("""          
		        """),format.raw/*388.11*/("""$(this).find('em:first').toggleClass("glyphicon-minus");      
		    """),format.raw/*389.7*/("""}"""),format.raw/*389.8*/("""); 
		    $(".sidebar span.icon").find('em:first').addClass("glyphicon-plus");
		"""),format.raw/*391.3*/("""}"""),format.raw/*391.4*/("""(window.jQuery);

		$(window).on('resize', function () """),format.raw/*393.38*/("""{"""),format.raw/*393.39*/("""
		  """),format.raw/*394.5*/("""if ($(window).width() > 768) $('#sidebar-collapse').collapse('show')
		"""),format.raw/*395.3*/("""}"""),format.raw/*395.4*/(""")
		$(window).on('resize', function () """),format.raw/*396.38*/("""{"""),format.raw/*396.39*/("""
		  """),format.raw/*397.5*/("""if ($(window).width() <= 767) $('#sidebar-collapse').collapse('hide')
		"""),format.raw/*398.3*/("""}"""),format.raw/*398.4*/(""")
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
                  DATE: Mon Jun 08 21:55:42 CDT 2015
                  SOURCE: C:/first_play/app/views/ShowSubject.scala.html
                  HASH: 9d71cb52f6e2dc80e24506c23b7223a29e81eebc
                  MATRIX: 542->1|731->101|759->103|2834->2150|2864->2158|2894->2159|5100->4338|5128->4345|5158->4348|5189->4358|5218->4359|7856->6968|7886->6969|7933->6987|7999->7024|8029->7025|8076->7043|8155->7093|8185->7094|8232->7112|8541->7392|8571->7393|8618->7411|8661->7425|8691->7426|8721->7427|8782->7459|8812->7460|8859->7478|8929->7519|8959->7520|8989->7521|9051->7554|9081->7555|9128->7573|9171->7587|9201->7588|9231->7589|9293->7622|9323->7623|9370->7641|9434->7676|9464->7677|9494->7678|9556->7711|9586->7712|9629->7726|10653->8721|10683->8722|10730->8740|11072->9053|11102->9054|11149->9072|11189->9083|11219->9084|11249->9085|11312->9119|11342->9120|11389->9138|11429->9149|11459->9150|11489->9151|11552->9185|11582->9186|11629->9204|11675->9221|11705->9222|11735->9223|11799->9258|11829->9259|11876->9277|11922->9294|11952->9295|11982->9296|12046->9331|12076->9332|12123->9350|12175->9373|12205->9374|12235->9375|12299->9410|12329->9411|12376->9429|12428->9452|12458->9453|12488->9454|12552->9489|12582->9490|12625->9504|13359->10209|13389->10210|13432->10224|13475->10238|13505->10239|13552->10257|16824->13500|16854->13501|16910->13528|17704->14293|17734->14294|17809->14340|17839->14341|17900->14373|19278->15722|19308->15723|19351->15737|19381->15738|19828->16156|19858->16157|19905->16175|20030->16271|20060->16272|20111->16294|20202->16356|20232->16357|20279->16375|20383->16450|20413->16451|20456->16465|20712->16693|20742->16694|20843->16766|20873->16767|20909->16775|20946->16784|20980->16796|28859->24646|28889->24647|28921->24651|28986->24688|29015->24689|29050->24696|29079->24697|29150->24739|29180->24740|29220->24751|29379->24881|29409->24882|29449->24893|29502->24918|29532->24919|29572->24931|29602->24932|29678->24979|29708->24980|29746->24990|30067->25282|30097->25283|30147->25304|30303->25432|30332->25439|30417->25495|30447->25496|30636->25657|30670->25669|30894->25865|30928->25877|31051->25972|31086->25984|31247->26116|31277->26117|31450->26261|31485->26273|31748->26507|31783->26519|31831->26540|31863->26562|31904->26564|31938->26570|32047->26651|32081->26663|32170->26734|32184->26739|32224->26740|32260->26748|32465->26925|32506->26949|32546->26950|32584->26960|33105->27453|33134->27460|33174->27472|33203->27479|33268->27516|33297->27523|33356->27553|33786->27951|33824->27961|33880->27986|33912->27990|34003->28052|34033->28053|34065->28057|34094->28058|34145->28080|34175->28081|34211->28089|34309->28158|34339->28159|34390->28181|34488->28251|34517->28252|34628->28335|34657->28336|34743->28393|34773->28394|34807->28400|34907->28472|34936->28473|35005->28513|35035->28514|35069->28520|35170->28593|35199->28594
                  LINES: 19->1|22->1|23->2|65->44|65->44|65->44|102->81|102->81|102->81|102->81|102->81|161->140|161->140|162->141|163->142|163->142|164->143|164->143|164->143|165->144|172->151|172->151|173->152|173->152|173->152|173->152|173->152|173->152|174->153|174->153|174->153|174->153|174->153|174->153|175->154|175->154|175->154|175->154|175->154|175->154|176->155|176->155|176->155|176->155|176->155|176->155|177->156|197->176|197->176|198->177|206->185|206->185|207->186|207->186|207->186|207->186|207->186|207->186|208->187|208->187|208->187|208->187|208->187|208->187|209->188|209->188|209->188|209->188|209->188|209->188|210->189|210->189|210->189|210->189|210->189|210->189|211->190|211->190|211->190|211->190|211->190|211->190|212->191|212->191|212->191|212->191|212->191|212->191|213->192|233->212|233->212|234->213|234->213|234->213|235->214|253->232|253->232|253->232|259->238|259->238|261->240|261->240|261->240|271->250|271->250|272->251|272->251|280->259|280->259|281->260|282->261|282->261|283->262|284->263|284->263|285->264|287->266|287->266|288->267|295->274|295->274|301->280|301->280|303->282|303->282|303->282|307->286|307->286|308->287|309->288|309->288|310->289|310->289|314->293|314->293|315->294|318->297|318->297|319->298|320->299|320->299|321->300|321->300|322->301|322->301|323->302|328->307|328->307|329->308|332->311|332->311|334->313|334->313|339->318|339->318|344->323|344->323|345->324|345->324|349->328|349->328|353->332|353->332|357->336|357->336|361->340|361->340|361->340|362->341|362->341|362->341|363->342|363->342|363->342|365->344|372->351|372->351|372->351|373->352|381->360|381->360|381->360|381->360|382->361|382->361|383->362|395->374|398->377|399->378|401->380|404->383|404->383|405->384|405->384|407->386|407->386|408->387|408->387|408->387|409->388|410->389|410->389|412->391|412->391|414->393|414->393|415->394|416->395|416->395|417->396|417->396|418->397|419->398|419->398
                  -- GENERATED --
              */
          