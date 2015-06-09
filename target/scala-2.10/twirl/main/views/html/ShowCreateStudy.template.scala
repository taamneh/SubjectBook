
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
object ShowCreateStudy extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userName: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.20*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta content="width=1170" name="viewport"><meta content="text/html; charset=UTF-8" http-equiv="Content-Type">
    <script type="text/javascript" src="/assets/javascripts/jquery-1.9.0.min.js"></script>
    <script type="text/javascript" src="/assets/javascripts/jquery-ui-1.9.2.custom.min.js"></script>
    <title>SubjectBoo</title>

    <link href="/assets/stylesheets/bootstrap.min.css" rel="stylesheet">
    <link href="/assets/stylesheets/datepicker3.css" rel="stylesheet">
    <link href="/assets/stylesheets/styles.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="/assets/stylesheets/multi.css">


    <!--[if lt IE 9]>
    <script src="/assets/javascripts/html5shiv.js"></script>
    <script src="/assets/javascripts/respond.min.js"></script>
    <![endif]-->

    <script type="text/javascript" src="/assets/javascripts/showPicker.js"></script>
    <script src="/assets/javascripts/jquery-1.11.1.min.js"></script>
    <script src="/assets/javascripts/bootstrap.min.js"></script>
    <script src="/assets/javascripts/chart.min.js"></script>
    <script src="/assets/javascripts/chart-data.js"></script>
    <script src="/assets/javascripts/easypiechart.js"></script>
    <script src="/assets/javascripts/easypiechart-data.js"></script>
    <script src="/assets/javascripts/bootstrap-datepicker.js"></script>
    <script type="text/javascript" src="/assets/javascripts/ow-all.js"></script>
    <script type="text/javascript" src="/assets/javascripts/webapp.js"></script>
    <script type="text/javascript" src="/assets/javascripts/browser-features.js"></script>
    <script type="text/javascript" src="/assets/javascripts/common.js"></script>
    <script type="text/javascript" src="/assets/javascripts/notifications.js"></script>
    <script type="text/javascript" src="/assets/javascripts/models.js"></script>
    <script type="text/javascript" src="/assets/javascripts/my_models.js"></script>
    <link rel="stylesheet" type="text/css" href="/assets/stylesheets/datePicker.css">
    <link rel="stylesheet" type="text/css" href="/assets/stylesheets/oneweb-salah.css">
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
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-user"></span> """),_display_(/*57.128*/userName),format.raw/*57.136*/(""" """),format.raw/*57.137*/("""<span class="caret"></span></a>
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
        <!-- <li><a href="#"><span class="glyphicon glyphicon glyphicon-share"></span> Share study</a></li> -->
        <!-- <li><a href="panels.html"><span class="glyphicon glyphicon-info-sign"></span> Alerts &amp; Panels</a></li> -->
        <li role="presentation" class="divider"></li>
        <!-- <li><a href="login.html"><span class="glyphicon glyphicon-user"></span> Login Page</a></li> -->
    </ul>
    <!-- <div class="attribution">Template by <a href="http://www.medialoot.com/item/lumino-admin-bootstrap-template/">Medialoot</a></div> -->
</div><!--/.sidebar-->

<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">
    <div class="row">
        <ol class="breadcrumb">
            <li><a  href="#"><span class="glyphicon glyphicon-home"></span></a></li>
            <li class="active">Forms</li>
        </ol>
    </div><!--/.row-->

    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">Create New Study</h1>
        </div>
    </div><!--/.row-->
    <!-- <div id= "newStudy"> -->
    <div class ="showontop" >

    <form calss="salah" id="msform" method="post">
    <!-- progressbar -->



    """),_display_(/*111.6*/helper/*111.12*/.form(action = routes.Application.InsertNewStudy, 'enctype -> "multipart/form-data")/*111.96*/ {_display_(Seq[Any](format.raw/*111.98*/("""
    """),format.raw/*112.5*/("""<ul class="taa" id="progressbar1">
        <li class="active">Data Source</li>
        <li>Biography Information</li>
        <li>Psychometrics</li>
        <li>Physiological </li>
        <li>Observational </li>
        <li>Performance </li>
    </ul>
    <!-- fieldsets -->

    <fieldset>
        <h2 class="fs-title">Specify your data source</h2>
        <h3 class="fs-subtitle"></h3>
        <table cellspacing="0" class="data_table" id="add_sessions_table">
            <tr>
                <td class="cell_1">* Source type:</td>
                <td>
                    <select class="select_field"  id="sourcetype" name="study_type">
                        <option id="form_versions_avmMoOfAa88BZFkbhDIE2swy6EGJ6QVmwtW7KMk5SbtgxnVrVvxQINqa6aN2CIr4_select_1" value=1>Google Drive</option>
                        <option id="form_versions_avmMoOfAa88BZFkbhDIE2swy6EGJ6QVmwtW7KMk5SbtgxnVrVvxQINqa6aN2CIr4_select_2" value=2>CPL Server</option>
                    </select>

                </td>
            </tr>
            <tr>
                <td class="cell_1">* Study name:</td>
                <td>
                    <input class="text_field" size="200"  type="text" id="study_name" maxlength="50" name="study_name" prompttext="">
                </td>
            </tr>
            <tr>
                <td class="cell_1">* URL:</td>
                <td>
                    <input class="text_field" size="200"  type="text" id="folder_name" maxlength="200" name="url" prompttext="">
                    <input class="text_field" size="200"  type="hidden" id="folder_id" maxlength="50" name="folder_id" value="x">
                </td>
                <td>
                    <input type="button" name="Add" id="browseGD"class="" value="...." />
                </td>
                <script type="text/javascript" src="https://apis.google.com/js/api.js?onload=onApiLoad"></script>
            </tr>
            <tr>
                <td class="cell_1">* Number of subjects:</td>
                <td>
                    <input type="number" class="text_field" name="numSubj" min="1" max="100" value = 1>
                </td>
            </tr>
            <tr>
                <td class="cell_1">* Sessions per subject:</td>
                <td>
                    <input type="number" class="text_field" name="numSess" min="0" max="100" value = 1>
                </td>
            </tr>
            <tr>
                <td><input type="checkbox" id="publicCh" name="publicCh" value=1 style="width: 20px;">Public study&nbsp;&nbsp;&nbsp;&nbsp;<br> </td>
                <td><input type="checkbox" id="portraitCh" name="portraitCh" value=1 style="width: 20px">Generate Portrait&nbsp;&nbsp;&nbsp;<br> </td>
                <input type="hidden" name="public" id='public' value=0>
                <input type="hidden" name="portrait" id='portrait' value=0>
            </tr>
            <!-- <tr>
                <td class="cell_1"> Runs per session:</td>
                <td> -->
            <input type="hidden" class="text_field" name="numRun" min="1" max="100" value = 1>
            <!-- </td> -->

            <!-- </tr>  -->
        </table>
        <input id ="firstNext"  type="button" name="next" class="next action-button" value="Next" />




    </fieldset>
    <fieldset>
        <h2 class="fs-title">Biography</h2>
        <h3 class="fs-subtitle"></h3>

        <table cellspacing="0" class="data_table" id="add_sessions_table">
            <tr>
                <td><input type="checkbox" id="Age" name="Age" value=1 style="width: 20px">Age&nbsp;&nbsp;&nbsp;&nbsp;<br> </td>
                <td><input type="checkbox" id="Height" name="Height" value=10 style="width: 20px">Height&nbsp;&nbsp;&nbsp;<br> </td>
                <td><input type="checkbox" id="Weight" name="Weight" value=100 style="width: 20px">Weight&nbsp;&nbsp;&nbsp;<br> </td>
                <td><input type="checkbox" id="Gender" name="Gender" value=1000 style="width: 20px">Gender&nbsp;&nbsp;&nbsp;<br> </td>
                <td><input type="checkbox" id="Ethnicity" name="Ethnicity" value=10000 style="width: 20px">Ethnicity<br> </td>
            </tr>
            <tr>
                <td><input type="checkbox" id="Bio_other"  name="Bio_other" value=100000 style="width: 20px">Other&nbsp;<br> </td>

            </tr>
        </table>
        <script>
                $(document).ready(function()"""),format.raw/*203.45*/("""{"""),format.raw/*203.46*/("""
                """),format.raw/*204.17*/("""$('#publicCh').change(function() """),format.raw/*204.50*/("""{"""),format.raw/*204.51*/("""
                """),format.raw/*205.17*/("""if($(this).is(":checked")) """),format.raw/*205.44*/("""{"""),format.raw/*205.45*/("""
                       """),format.raw/*206.24*/("""$("#public").val(1);
                       """),format.raw/*207.24*/("""}"""),format.raw/*207.25*/("""
                       """),format.raw/*208.24*/("""else
                       """),format.raw/*209.24*/("""{"""),format.raw/*209.25*/("""
                        """),format.raw/*210.25*/("""$("#public").val(0);
                       """),format.raw/*211.24*/("""}"""),format.raw/*211.25*/("""
                     """),format.raw/*212.22*/("""}"""),format.raw/*212.23*/(""");
                   $('#portraitCh').change(function() """),format.raw/*213.55*/("""{"""),format.raw/*213.56*/("""
                """),format.raw/*214.17*/("""if($(this).is(":checked")) """),format.raw/*214.44*/("""{"""),format.raw/*214.45*/("""
                       """),format.raw/*215.24*/("""$("#portrait").val(1);
                       """),format.raw/*216.24*/("""}"""),format.raw/*216.25*/("""
                       """),format.raw/*217.24*/("""else
                       """),format.raw/*218.24*/("""{"""),format.raw/*218.25*/("""
                        """),format.raw/*219.25*/("""$("#portrait").val(0);
                       """),format.raw/*220.24*/("""}"""),format.raw/*220.25*/("""
                     """),format.raw/*221.22*/("""}"""),format.raw/*221.23*/(""");
                $('#Age').change(function() """),format.raw/*222.45*/("""{"""),format.raw/*222.46*/("""
                    """),format.raw/*223.21*/("""if($(this).is(":checked")) """),format.raw/*223.48*/("""{"""),format.raw/*223.49*/("""
                       """),format.raw/*224.24*/("""var a =  parseInt($("#ir").val()) + 1
                       $("#ir").val(a.toString() );
                       """),format.raw/*226.24*/("""}"""),format.raw/*226.25*/("""
                       """),format.raw/*227.24*/("""else
                       """),format.raw/*228.24*/("""{"""),format.raw/*228.25*/("""
                        """),format.raw/*229.25*/("""var a =  parseInt($("#ir").val()) - 1
                       $("#ir").val(a.toString() );
                       """),format.raw/*231.24*/("""}"""),format.raw/*231.25*/("""
                     """),format.raw/*232.22*/("""}"""),format.raw/*232.23*/(""");

                     $('#Height').change(function() """),format.raw/*234.53*/("""{"""),format.raw/*234.54*/("""
                     """),format.raw/*235.22*/("""if($(this).is(":checked")) """),format.raw/*235.49*/("""{"""),format.raw/*235.50*/("""
                         """),format.raw/*236.26*/("""var a =  parseInt($("#ir").val()) + 10
                       $("#ir").val(a.toString() );
                       """),format.raw/*238.24*/("""}"""),format.raw/*238.25*/("""
                       """),format.raw/*239.24*/("""else
                       """),format.raw/*240.24*/("""{"""),format.raw/*240.25*/("""
                         """),format.raw/*241.26*/("""var a =  parseInt($("#ir").val()) - 10
                       $("#ir").val(a.toString() );
                       """),format.raw/*243.24*/("""}"""),format.raw/*243.25*/("""
                     """),format.raw/*244.22*/("""}"""),format.raw/*244.23*/(""");

                      $('#Weight').change(function() """),format.raw/*246.54*/("""{"""),format.raw/*246.55*/("""
                     """),format.raw/*247.22*/("""if($(this).is(":checked")) """),format.raw/*247.49*/("""{"""),format.raw/*247.50*/("""

                       """),format.raw/*249.24*/("""var a =  parseInt($("#ir").val()) + 100
                       $("#ir").val(a.toString() );
                       """),format.raw/*251.24*/("""}"""),format.raw/*251.25*/("""
                       """),format.raw/*252.24*/("""else
                       """),format.raw/*253.24*/("""{"""),format.raw/*253.25*/("""
                           """),format.raw/*254.28*/("""var a =  parseInt($("#ir").val()) - 100
                       $("#ir").val(a.toString() );
                       """),format.raw/*256.24*/("""}"""),format.raw/*256.25*/("""
                     """),format.raw/*257.22*/("""}"""),format.raw/*257.23*/(""");

                      $('#Gender').change(function() """),format.raw/*259.54*/("""{"""),format.raw/*259.55*/("""
                     """),format.raw/*260.22*/("""if($(this).is(":checked")) """),format.raw/*260.49*/("""{"""),format.raw/*260.50*/("""

                       """),format.raw/*262.24*/("""var a =  parseInt($("#ir").val()) + 1000
                       $("#ir").val(a.toString() );
                       """),format.raw/*264.24*/("""}"""),format.raw/*264.25*/("""
                       """),format.raw/*265.24*/("""else
                       """),format.raw/*266.24*/("""{"""),format.raw/*266.25*/("""
                           """),format.raw/*267.28*/("""var a =  parseInt($("#ir").val()) - 1000
                       $("#ir").val(a.toString() );
                       """),format.raw/*269.24*/("""}"""),format.raw/*269.25*/("""
                     """),format.raw/*270.22*/("""}"""),format.raw/*270.23*/(""");

                      $('#Ethnicity').change(function() """),format.raw/*272.57*/("""{"""),format.raw/*272.58*/("""
                     """),format.raw/*273.22*/("""if($(this).is(":checked")) """),format.raw/*273.49*/("""{"""),format.raw/*273.50*/("""

                       """),format.raw/*275.24*/("""var a =  parseInt($("#ir").val()) + 10000
                       $("#ir").val(a.toString() );
                       """),format.raw/*277.24*/("""}"""),format.raw/*277.25*/("""
                       """),format.raw/*278.24*/("""else
                       """),format.raw/*279.24*/("""{"""),format.raw/*279.25*/("""
                           """),format.raw/*280.28*/("""var a =  parseInt($("#ir").val()) - 10000
                       $("#ir").val(a.toString() );
                       """),format.raw/*282.24*/("""}"""),format.raw/*282.25*/("""
                     """),format.raw/*283.22*/("""}"""),format.raw/*283.23*/(""");

                      $('#Bio_other').change(function() """),format.raw/*285.57*/("""{"""),format.raw/*285.58*/("""
                     """),format.raw/*286.22*/("""if($(this).is(":checked")) """),format.raw/*286.49*/("""{"""),format.raw/*286.50*/("""

                       """),format.raw/*288.24*/("""var a =  parseInt($("#ir").val()) + 100000
                       $("#ir").val(a.toString() );
                       """),format.raw/*290.24*/("""}"""),format.raw/*290.25*/("""
                       """),format.raw/*291.24*/("""else
                       """),format.raw/*292.24*/("""{"""),format.raw/*292.25*/("""
                           """),format.raw/*293.28*/("""var a =  parseInt($("#ir").val()) - 100000
                       $("#ir").val(a.toString() );
                       """),format.raw/*295.24*/("""}"""),format.raw/*295.25*/("""
                     """),format.raw/*296.22*/("""}"""),format.raw/*296.23*/(""");

                 """),format.raw/*298.18*/("""}"""),format.raw/*298.19*/(""");
                                    </script>
        <input type="hidden" name="bio" id='ir' value=0>

        <input type="button" name="previous" class="previous action-button" value="Previous" />
        <input type="button" name="next" class="next action-button" value="Next" />
    </fieldset>
    <fieldset>
        <h2 class="fs-title">Psychometrics</h2>
        <h3 class="fs-subtitle"></h3>
        <table cellspacing="0" class="data_table" id="add_sessions_table">
            <tr>
                <td class="cell_1"> State-Trait Anxiety Inventory: </td>
                <td class="cell_2"><input type="checkbox" id="SAI" name="SAI" value=1 style="width: 20px">SAI&nbsp;&nbsp;&nbsp;&nbsp; </td>
                <!--<td class="cell_2"><input type="checkbox" id="PA" name="PA" value=10 style="width: 20px">PA&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </td> -->
                <!-- <td class="cell_2"><input type="checkbox" id="NA" name="NA" value=100 style="width: 20px">NA&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td> -->
                <td class="cell_2"><input type="checkbox" id="TAI" name="STAI_other" value=1000 style="width: 20px">TAI</td>
            </tr>
            <tr>
                <td class="cell_1"> Positive and Negative Affect Scales: </td>
                <td class="cell_2"><input type="checkbox" id="PA" name="PA" value=10000 style="width: 20px">PA&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </td>
                <td class="cell_2"><input type="checkbox" id="NA" name="NA" value=100000 style="width: 20px">NA&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </td>
                <td class="cell_2"><input type="checkbox" id ="Trait_Other" name="Trait_Other" value=1000000 style="width: 20px">Other</td>
                <td class="cell_2"></td>
            </tr>
        </table>

        <script>
                                                $(document).ready(function()"""),format.raw/*326.77*/("""{"""),format.raw/*326.78*/("""
                                                    """),format.raw/*327.53*/("""$('#SAI').change(function() """),format.raw/*327.81*/("""{"""),format.raw/*327.82*/("""
                                                    """),format.raw/*328.53*/("""if($(this).is(":checked")) """),format.raw/*328.80*/("""{"""),format.raw/*328.81*/("""
                                                       """),format.raw/*329.56*/("""var a =  parseInt($("#Psychometric").val()) + 1
                                                       $("#Psychometric").val(a.toString() );
                                                       """),format.raw/*331.56*/("""}"""),format.raw/*331.57*/("""
                                                       """),format.raw/*332.56*/("""else
                                                       """),format.raw/*333.56*/("""{"""),format.raw/*333.57*/("""
                                                        """),format.raw/*334.57*/("""var a =  parseInt($("#Psychometric").val()) - 1
                                                       $("#Psychometric").val(a.toString() );
                                                       """),format.raw/*336.56*/("""}"""),format.raw/*336.57*/("""
                                                     """),format.raw/*337.54*/("""}"""),format.raw/*337.55*/(""");

                                                     $('#TAI').change(function() """),format.raw/*339.82*/("""{"""),format.raw/*339.83*/("""
                                                     """),format.raw/*340.54*/("""if($(this).is(":checked")) """),format.raw/*340.81*/("""{"""),format.raw/*340.82*/("""
                                                       """),format.raw/*341.56*/("""var a =  parseInt($("#Psychometric").val()) + 10
                                                       $("#Psychometric").val(a.toString() );
                                                       """),format.raw/*343.56*/("""}"""),format.raw/*343.57*/("""
                                                       """),format.raw/*344.56*/("""else
                                                       """),format.raw/*345.56*/("""{"""),format.raw/*345.57*/("""
                                                         """),format.raw/*346.58*/("""var a =  parseInt($("#Psychometric").val()) - 10
                                                       $("#Psychometric").val(a.toString() );
                                                       """),format.raw/*348.56*/("""}"""),format.raw/*348.57*/("""
                                                     """),format.raw/*349.54*/("""}"""),format.raw/*349.55*/(""");

                                                      $('#PA').change(function() """),format.raw/*351.82*/("""{"""),format.raw/*351.83*/("""
                                                     """),format.raw/*352.54*/("""if($(this).is(":checked")) """),format.raw/*352.81*/("""{"""),format.raw/*352.82*/("""

                                                       """),format.raw/*354.56*/("""var a =  parseInt($("#Psychometric").val()) + 100
                                                       $("#Psychometric").val(a.toString() );
                                                       """),format.raw/*356.56*/("""}"""),format.raw/*356.57*/("""
                                                       """),format.raw/*357.56*/("""else
                                                       """),format.raw/*358.56*/("""{"""),format.raw/*358.57*/("""
                                                           """),format.raw/*359.60*/("""var a =  parseInt($("#Psychometric").val()) - 100
                                                       $("#Psychometric").val(a.toString() );
                                                       """),format.raw/*361.56*/("""}"""),format.raw/*361.57*/("""
                                                     """),format.raw/*362.54*/("""}"""),format.raw/*362.55*/(""");

                                                      $('#NA').change(function() """),format.raw/*364.82*/("""{"""),format.raw/*364.83*/("""
                                                     """),format.raw/*365.54*/("""if($(this).is(":checked")) """),format.raw/*365.81*/("""{"""),format.raw/*365.82*/("""

                                                       """),format.raw/*367.56*/("""var a =  parseInt($("#Psychometric").val()) + 1000
                                                       $("#Psychometric").val(a.toString() );
                                                       """),format.raw/*369.56*/("""}"""),format.raw/*369.57*/("""
                                                       """),format.raw/*370.56*/("""else
                                                       """),format.raw/*371.56*/("""{"""),format.raw/*371.57*/("""
                                                           """),format.raw/*372.60*/("""var a =  parseInt($("#Psychometric").val()) - 1000
                                                       $("#Psychometric").val(a.toString() );
                                                       """),format.raw/*374.56*/("""}"""),format.raw/*374.57*/("""
                                                     """),format.raw/*375.54*/("""}"""),format.raw/*375.55*/(""");

                                                      $('#Trait_Other').change(function() """),format.raw/*377.91*/("""{"""),format.raw/*377.92*/("""
                                                     """),format.raw/*378.54*/("""if($(this).is(":checked")) """),format.raw/*378.81*/("""{"""),format.raw/*378.82*/("""

                                                       """),format.raw/*380.56*/("""var a =  parseInt($("#Psychometric").val()) + 10000
                                                       $("#Psychometric").val(a.toString() );
                                                       """),format.raw/*382.56*/("""}"""),format.raw/*382.57*/("""
                                                       """),format.raw/*383.56*/("""else
                                                       """),format.raw/*384.56*/("""{"""),format.raw/*384.57*/("""
                                                           """),format.raw/*385.60*/("""var a =  parseInt($("#Psychometric").val()) - 10000
                                                       $("#Psychometric").val(a.toString() );
                                                       """),format.raw/*387.56*/("""}"""),format.raw/*387.57*/("""
                                                     """),format.raw/*388.54*/("""}"""),format.raw/*388.55*/(""");

                                                 """),format.raw/*390.50*/("""}"""),format.raw/*390.51*/(""");
                                    </script>
        <input type="hidden" name="psychometric" id='Psychometric' value=0>


        <input type="button" name="previous" class="previous action-button" value="Previous" />
        <input type="button" name="next" class="next action-button" value="Next" />
    </fieldset>
    <fieldset>
        <h2 class="fs-title">Physiological</h2>
        <h3 class="fs-subtitle"></h3>
        <table cellspacing="0" class="data_table" id="add_sessions_table">
            <tr>
                <td  class="cell_2"><input type="checkbox" id="EDA" name="EDA" value=1 style="width: 20px">EDA&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </td>
                <td  class="cell_2"><input type="checkbox" id="Motion" name="Motion" value=2 style="width: 20px">Motion&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </td>
                <td  class="cell_2"><input type="checkbox" id= "GSR_Finger" name="GSR_Finger" value=3 style="width: 20px">GSR-Finger</td>
            </tr>
            <tr>
                <td  class="cell_2"><input type="checkbox" id="Breathing_Belt" name="Breathing_Belt" value=4 style="width: 20px">Breathing-Belt&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                <td  class="cell_2"><input type="checkbox" id="Breathing_Thermal" name="Breathing_Thermal" value=4 style="width: 20px">Breathing-Thermal&nbsp;&nbsp;&nbsp;&nbsp;</td>
                <td  class="cell_2"><input type="checkbox" id= "Heart_Rate" name="Heart_Rate" value=4 style="width: 20px">Heart Rate&nbsp;&nbsp;</td>

            </tr>
            <tr>
                <td  class="cell_2"><input type="checkbox" id="Perspiration" name="Perspiration" value=4 style="width: 20px">Perspiration&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                <td class="cell_2"></td>
                <td class="cell_2"></td>
            </tr>

        </table>
        <script>
                                                $(document).ready(function()"""),format.raw/*421.77*/("""{"""),format.raw/*421.78*/("""
                                                """),format.raw/*422.49*/("""$('#EDA').change(function() """),format.raw/*422.77*/("""{"""),format.raw/*422.78*/("""
                                                    """),format.raw/*423.53*/("""if($(this).is(":checked")) """),format.raw/*423.80*/("""{"""),format.raw/*423.81*/("""
                                                       """),format.raw/*424.56*/("""var a =  parseInt($("#physiology").val()) + 1
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*426.56*/("""}"""),format.raw/*426.57*/("""
                                                       """),format.raw/*427.56*/("""else
                                                       """),format.raw/*428.56*/("""{"""),format.raw/*428.57*/("""
                                                        """),format.raw/*429.57*/("""var a =  parseInt($("#physiology").val()) - 1
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*431.56*/("""}"""),format.raw/*431.57*/("""
                                                     """),format.raw/*432.54*/("""}"""),format.raw/*432.55*/(""");

                                                     $('#Motion').change(function() """),format.raw/*434.85*/("""{"""),format.raw/*434.86*/("""
                                                     """),format.raw/*435.54*/("""if($(this).is(":checked")) """),format.raw/*435.81*/("""{"""),format.raw/*435.82*/("""
                                                       """),format.raw/*436.56*/("""var a =  parseInt($("#physiology").val()) + 10
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*438.56*/("""}"""),format.raw/*438.57*/("""
                                                       """),format.raw/*439.56*/("""else
                                                       """),format.raw/*440.56*/("""{"""),format.raw/*440.57*/("""
                                                         """),format.raw/*441.58*/("""var a =  parseInt($("#physiology").val()) - 10
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*443.56*/("""}"""),format.raw/*443.57*/("""
                                                     """),format.raw/*444.54*/("""}"""),format.raw/*444.55*/(""");

                                                      $('#GSR_Finger').change(function() """),format.raw/*446.90*/("""{"""),format.raw/*446.91*/("""
                                                     """),format.raw/*447.54*/("""if($(this).is(":checked")) """),format.raw/*447.81*/("""{"""),format.raw/*447.82*/("""

                                                       """),format.raw/*449.56*/("""var a =  parseInt($("#physiology").val()) + 100
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*451.56*/("""}"""),format.raw/*451.57*/("""
                                                       """),format.raw/*452.56*/("""else
                                                       """),format.raw/*453.56*/("""{"""),format.raw/*453.57*/("""
                                                           """),format.raw/*454.60*/("""var a =  parseInt($("#physiology").val()) - 100
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*456.56*/("""}"""),format.raw/*456.57*/("""
                                                     """),format.raw/*457.54*/("""}"""),format.raw/*457.55*/(""");

                                                      $('#Breathing_Belt').change(function() """),format.raw/*459.94*/("""{"""),format.raw/*459.95*/("""
                                                     """),format.raw/*460.54*/("""if($(this).is(":checked")) """),format.raw/*460.81*/("""{"""),format.raw/*460.82*/("""

                                                       """),format.raw/*462.56*/("""var a =  parseInt($("#physiology").val()) + 1000
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*464.56*/("""}"""),format.raw/*464.57*/("""
                                                       """),format.raw/*465.56*/("""else
                                                       """),format.raw/*466.56*/("""{"""),format.raw/*466.57*/("""
                                                           """),format.raw/*467.60*/("""var a =  parseInt($("#physiology").val()) - 1000
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*469.56*/("""}"""),format.raw/*469.57*/("""
                                                     """),format.raw/*470.54*/("""}"""),format.raw/*470.55*/(""");

                                                      $('#Breathing_Thermal').change(function() """),format.raw/*472.97*/("""{"""),format.raw/*472.98*/("""
                                                     """),format.raw/*473.54*/("""if($(this).is(":checked")) """),format.raw/*473.81*/("""{"""),format.raw/*473.82*/("""

                                                       """),format.raw/*475.56*/("""var a =  parseInt($("#physiology").val()) + 10000
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*477.56*/("""}"""),format.raw/*477.57*/("""
                                                       """),format.raw/*478.56*/("""else
                                                       """),format.raw/*479.56*/("""{"""),format.raw/*479.57*/("""
                                                           """),format.raw/*480.60*/("""var a =  parseInt($("#physiology").val()) - 10000
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*482.56*/("""}"""),format.raw/*482.57*/("""
                                                     """),format.raw/*483.54*/("""}"""),format.raw/*483.55*/(""");

                                                      $('#Heart_Rate').change(function() """),format.raw/*485.90*/("""{"""),format.raw/*485.91*/("""
                                                     """),format.raw/*486.54*/("""if($(this).is(":checked")) """),format.raw/*486.81*/("""{"""),format.raw/*486.82*/("""

                                                       """),format.raw/*488.56*/("""var a =  parseInt($("#physiology").val()) + 100000
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*490.56*/("""}"""),format.raw/*490.57*/("""
                                                       """),format.raw/*491.56*/("""else
                                                       """),format.raw/*492.56*/("""{"""),format.raw/*492.57*/("""
                                                           """),format.raw/*493.60*/("""var a =  parseInt($("#physiology").val()) - 100000
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*495.56*/("""}"""),format.raw/*495.57*/("""
                                                     """),format.raw/*496.54*/("""}"""),format.raw/*496.55*/(""");

                                                      $('#Perspiration').change(function() """),format.raw/*498.92*/("""{"""),format.raw/*498.93*/("""
                                                     """),format.raw/*499.54*/("""if($(this).is(":checked")) """),format.raw/*499.81*/("""{"""),format.raw/*499.82*/("""

                                                       """),format.raw/*501.56*/("""var a =  parseInt($("#physiology").val()) + 1000000
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*503.56*/("""}"""),format.raw/*503.57*/("""
                                                       """),format.raw/*504.56*/("""else
                                                       """),format.raw/*505.56*/("""{"""),format.raw/*505.57*/("""
                                                           """),format.raw/*506.60*/("""var a =  parseInt($("#physiology").val()) - 1000000
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*508.56*/("""}"""),format.raw/*508.57*/("""
                                                     """),format.raw/*509.54*/("""}"""),format.raw/*509.55*/(""");

                                                 """),format.raw/*511.50*/("""}"""),format.raw/*511.51*/(""");
                                    </script>


        <input type="hidden" name="physiology" id='physiology' value=0>
        <input type="button" name="previous" class="previous action-button" value="Previous" />
        <input type="button" name="next" class="next action-button" value="Next" />
    </fieldset>
    <fieldset>
        <h2 class="fs-title">Observational</h2>
        <h3 class="fs-subtitle"></h3>
        <table cellspacing="0" class="data_table" id="add_sessions_table">
            <tr>
                <td class="cell_1"> Observational 1D: </td>
                <td class="cell_2"><input type="checkbox" id="Accelerometer" name="Accelerometer" value=2 style="width: 20px">Accelerometer</td>
                <td class="cell_2"><input type="checkbox" id="Obser_other" name="Obser_other" value=3 style="width: 20px">Other</td>
            </tr>
            <tr>
                <td class="cell_1"> Observational 2D: </td>
                <td class="cell_2"><input type="checkbox" id="Video_Face" name="Video_Face" value=2 style="width: 20px">Video-Face&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                <td class="cell_2"><input type="checkbox" id="Video_Room" name="Video_Room" value=4 style="width: 20px">Video-Room</td>
            </tr>
            <tr>
                <td class="cell_1"></td>
                <td class="cell_2"><input type="checkbox" id= "Video_Theater" name="Video_Theater" value=4 style="width: 20px">Video-Theater</td>
                <td class="cell_2"><input type="checkbox" id="FACS" name="FACS" value=4 style="width: 20px">FACS</td>
            </tr>
            <tr>
                <td class="cell_1"></td>
                <td class="cell_2"><input type="checkbox" id="Obser2d_other" name="Obser2d_other" value=4 style="width: 20px">Other&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
            </tr>
        </table>

        <script>
                                                $(document).ready(function()"""),format.raw/*545.77*/("""{"""),format.raw/*545.78*/("""
                                                """),format.raw/*546.49*/("""$('#Accelerometer').change(function() """),format.raw/*546.87*/("""{"""),format.raw/*546.88*/("""
                                                    """),format.raw/*547.53*/("""if($(this).is(":checked")) """),format.raw/*547.80*/("""{"""),format.raw/*547.81*/("""
                                                       """),format.raw/*548.56*/("""var a =  parseInt($("#observation").val()) + 1
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*550.56*/("""}"""),format.raw/*550.57*/("""
                                                       """),format.raw/*551.56*/("""else
                                                       """),format.raw/*552.56*/("""{"""),format.raw/*552.57*/("""
                                                        """),format.raw/*553.57*/("""var a =  parseInt($("#observation").val()) - 1
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*555.56*/("""}"""),format.raw/*555.57*/("""
                                                     """),format.raw/*556.54*/("""}"""),format.raw/*556.55*/(""");

                                                     $('#Obser_other').change(function() """),format.raw/*558.90*/("""{"""),format.raw/*558.91*/("""
                                                     """),format.raw/*559.54*/("""if($(this).is(":checked")) """),format.raw/*559.81*/("""{"""),format.raw/*559.82*/("""
                                                       """),format.raw/*560.56*/("""var a =  parseInt($("#observation").val()) + 10
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*562.56*/("""}"""),format.raw/*562.57*/("""
                                                       """),format.raw/*563.56*/("""else
                                                       """),format.raw/*564.56*/("""{"""),format.raw/*564.57*/("""
                                                         """),format.raw/*565.58*/("""var a =  parseInt($("#observation").val()) - 10
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*567.56*/("""}"""),format.raw/*567.57*/("""
                                                     """),format.raw/*568.54*/("""}"""),format.raw/*568.55*/(""");

                                                      $('#Video_Face').change(function() """),format.raw/*570.90*/("""{"""),format.raw/*570.91*/("""
                                                     """),format.raw/*571.54*/("""if($(this).is(":checked")) """),format.raw/*571.81*/("""{"""),format.raw/*571.82*/("""

                                                       """),format.raw/*573.56*/("""var a =  parseInt($("#observation").val()) + 100
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*575.56*/("""}"""),format.raw/*575.57*/("""
                                                       """),format.raw/*576.56*/("""else
                                                       """),format.raw/*577.56*/("""{"""),format.raw/*577.57*/("""
                                                           """),format.raw/*578.60*/("""var a =  parseInt($("#observation").val()) - 100
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*580.56*/("""}"""),format.raw/*580.57*/("""
                                                     """),format.raw/*581.54*/("""}"""),format.raw/*581.55*/(""");

                                                      $('#Video_Room').change(function() """),format.raw/*583.90*/("""{"""),format.raw/*583.91*/("""
                                                     """),format.raw/*584.54*/("""if($(this).is(":checked")) """),format.raw/*584.81*/("""{"""),format.raw/*584.82*/("""

                                                       """),format.raw/*586.56*/("""var a =  parseInt($("#observation").val()) + 1000
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*588.56*/("""}"""),format.raw/*588.57*/("""
                                                       """),format.raw/*589.56*/("""else
                                                       """),format.raw/*590.56*/("""{"""),format.raw/*590.57*/("""
                                                           """),format.raw/*591.60*/("""var a =  parseInt($("#observation").val()) - 1000
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*593.56*/("""}"""),format.raw/*593.57*/("""
                                                     """),format.raw/*594.54*/("""}"""),format.raw/*594.55*/(""");

                                                      $('#Video_Theater').change(function() """),format.raw/*596.93*/("""{"""),format.raw/*596.94*/("""
                                                     """),format.raw/*597.54*/("""if($(this).is(":checked")) """),format.raw/*597.81*/("""{"""),format.raw/*597.82*/("""

                                                       """),format.raw/*599.56*/("""var a =  parseInt($("#observation").val()) + 10000
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*601.56*/("""}"""),format.raw/*601.57*/("""
                                                       """),format.raw/*602.56*/("""else
                                                       """),format.raw/*603.56*/("""{"""),format.raw/*603.57*/("""
                                                           """),format.raw/*604.60*/("""var a =  parseInt($("#observation").val()) - 10000
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*606.56*/("""}"""),format.raw/*606.57*/("""
                                                     """),format.raw/*607.54*/("""}"""),format.raw/*607.55*/(""");

                                                      $('#FACS').change(function() """),format.raw/*609.84*/("""{"""),format.raw/*609.85*/("""
                                                     """),format.raw/*610.54*/("""if($(this).is(":checked")) """),format.raw/*610.81*/("""{"""),format.raw/*610.82*/("""

                                                       """),format.raw/*612.56*/("""var a =  parseInt($("#observation").val()) + 100000
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*614.56*/("""}"""),format.raw/*614.57*/("""
                                                       """),format.raw/*615.56*/("""else
                                                       """),format.raw/*616.56*/("""{"""),format.raw/*616.57*/("""
                                                           """),format.raw/*617.60*/("""var a =  parseInt($("#observation").val()) - 100000
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*619.56*/("""}"""),format.raw/*619.57*/("""
                                                     """),format.raw/*620.54*/("""}"""),format.raw/*620.55*/(""");

                                                      $('#Obser2d_other').change(function() """),format.raw/*622.93*/("""{"""),format.raw/*622.94*/("""
                                                     """),format.raw/*623.54*/("""if($(this).is(":checked")) """),format.raw/*623.81*/("""{"""),format.raw/*623.82*/("""

                                                       """),format.raw/*625.56*/("""var a =  parseInt($("#observation").val()) + 1000000
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*627.56*/("""}"""),format.raw/*627.57*/("""
                                                       """),format.raw/*628.56*/("""else
                                                       """),format.raw/*629.56*/("""{"""),format.raw/*629.57*/("""
                                                           """),format.raw/*630.60*/("""var a =  parseInt($("#observation").val()) - 1000000
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*632.56*/("""}"""),format.raw/*632.57*/("""
                                                     """),format.raw/*633.54*/("""}"""),format.raw/*633.55*/(""");

                                                 """),format.raw/*635.50*/("""}"""),format.raw/*635.51*/(""");
                                    </script>

        <input type="hidden" name="observation" id='observation' value=0>
        <input type="button" name="previous" class="previous action-button" value="Previous" />
        <input type="button" name="next" class="next action-button" value="Next" />
    </fieldset>
    <fieldset>
        <h2 class="fs-title">Performance</h2>
        <h3 class="fs-subtitle"></h3>
        <input type="text" name="Perfro_name" placeholder="Performance Name" />
        <input type="text" name="Per_min" placeholder="Min" />
        <input type="text" name="Per_mix" placeholder="Max" />
        <input type="button" name="Add" class="next" value="Add" />
        <input type="button" name="previous" class="previous action-button" value="Previous" />
        <input type="submit" name="submit" class="submit action-button" value="Submit" id="createStudy"/>

    </fieldset>
    </br></br></br></br></br></br></br></br></br></br></br></br></br></br></br></br></br></br></br></br></br></br></br></br></br></br>
    """)))}),format.raw/*654.6*/("""
    """),format.raw/*655.5*/("""</form>

    </div>



</div><!--/.main-->

 <div id="loading" style="display:none; position: fixed;height:100%; width:100%; background: rgba( 255, 255, 255, .8 ) url('/assets/images/ajax-loader.gif') 50% 50%    no-repeat;">
     <p> Please wait, study is being created </p>
 </div>




<script>
$(document).ready(function()"""),format.raw/*671.29*/("""{"""),format.raw/*671.30*/("""

"""),format.raw/*673.1*/("""$("#createStudy").click(function()"""),format.raw/*673.35*/("""{"""),format.raw/*673.36*/("""

   """),format.raw/*675.4*/("""$("#loading").show()
   """),format.raw/*676.4*/("""}"""),format.raw/*676.5*/(""");

"""),format.raw/*678.1*/("""}"""),format.raw/*678.2*/(""");
</script>


<script>
		!function ($) """),format.raw/*683.17*/("""{"""),format.raw/*683.18*/("""
			"""),format.raw/*684.4*/("""$(document).on("click","ul.nav li.parent > a > span.icon", function()"""),format.raw/*684.73*/("""{"""),format.raw/*684.74*/("""
				"""),format.raw/*685.5*/("""$(this).find('em:first').toggleClass("glyphicon-minus");
			"""),format.raw/*686.4*/("""}"""),format.raw/*686.5*/(""");
			$(".sidebar span.icon").find('em:first').addClass("glyphicon-plus");
		"""),format.raw/*688.3*/("""}"""),format.raw/*688.4*/("""(window.jQuery);

		$(window).on('resize', function () """),format.raw/*690.38*/("""{"""),format.raw/*690.39*/("""
		  """),format.raw/*691.5*/("""if ($(window).width() > 768) $('#sidebar-collapse').collapse('show')
		"""),format.raw/*692.3*/("""}"""),format.raw/*692.4*/(""")
		$(window).on('resize', function () """),format.raw/*693.38*/("""{"""),format.raw/*693.39*/("""
		  """),format.raw/*694.5*/("""if ($(window).width() <= 767) $('#sidebar-collapse').collapse('hide')
		"""),format.raw/*695.3*/("""}"""),format.raw/*695.4*/(""")
</script>
<script>
	//jQuery time
var current_fs, next_fs, previous_fs; //fieldsets
var left, opacity, scale; //fieldset properties which we will animate
var animating; //flag to prevent quick multi-click glitches

$(".next").click(function()"""),format.raw/*703.28*/("""{"""),format.raw/*703.29*/("""

     """),format.raw/*705.6*/("""if(document.getElementById("study_name").value == "")
        alert("Please enter the name of study")
     else if(document.getElementById("folder_name").value == "")
         """),format.raw/*708.10*/("""{"""),format.raw/*708.11*/("""
            """),format.raw/*709.13*/("""alert("Please enter the URL")
         """),format.raw/*710.10*/("""}"""),format.raw/*710.11*/("""
     """),format.raw/*711.6*/("""else
     """),format.raw/*712.6*/("""{"""),format.raw/*712.7*/("""
	"""),format.raw/*713.2*/("""if(animating) return false;
	animating = true;

	current_fs = $(this).parent();
	next_fs = $(this).parent().next();

	//activate next step on progressbar using the index of next_fs
	$("#progressbar1 li").eq($("fieldset").index(next_fs)).addClass("active");

	//show the next fieldset
	next_fs.show();
	//hide the current fieldset with style
	current_fs.animate("""),format.raw/*725.21*/("""{"""),format.raw/*725.22*/("""opacity: 0"""),format.raw/*725.32*/("""}"""),format.raw/*725.33*/(""", """),format.raw/*725.35*/("""{"""),format.raw/*725.36*/("""
		"""),format.raw/*726.3*/("""step: function(now, mx) """),format.raw/*726.27*/("""{"""),format.raw/*726.28*/("""
			"""),format.raw/*727.4*/("""//as the opacity of current_fs reduces to 0 - stored in "now"
			//1. scale current_fs down to 80%
			scale = 1 - (1 - now) * 0.2;
			//2. bring next_fs from the right(50%)
			left = (now * 50)+"%";
			//3. increase opacity of next_fs to 1 as it moves in
			opacity = 1 - now;
			current_fs.css("""),format.raw/*734.19*/("""{"""),format.raw/*734.20*/("""'transform': 'scale('+scale+')'"""),format.raw/*734.51*/("""}"""),format.raw/*734.52*/(""");
			next_fs.css("""),format.raw/*735.16*/("""{"""),format.raw/*735.17*/("""'left': left, 'opacity': opacity"""),format.raw/*735.49*/("""}"""),format.raw/*735.50*/(""");
		"""),format.raw/*736.3*/("""}"""),format.raw/*736.4*/(""",
		duration: 800,
		complete: function()"""),format.raw/*738.23*/("""{"""),format.raw/*738.24*/("""
			"""),format.raw/*739.4*/("""current_fs.hide();
			animating = false;
		"""),format.raw/*741.3*/("""}"""),format.raw/*741.4*/(""",
		//this comes from the custom easing plugin
		easing: 'easeInOutBack'
	"""),format.raw/*744.2*/("""}"""),format.raw/*744.3*/(""");
	"""),format.raw/*745.2*/("""}"""),format.raw/*745.3*/("""
"""),format.raw/*746.1*/("""}"""),format.raw/*746.2*/(""");

$(".previous").click(function()"""),format.raw/*748.32*/("""{"""),format.raw/*748.33*/("""
	"""),format.raw/*749.2*/("""if(animating) return false;
	animating = true;

	current_fs = $(this).parent();
	previous_fs = $(this).parent().prev();

	//de-activate current step on progressbar
	$("#progressbar1 li").eq($("fieldset").index(current_fs)).removeClass("active");

	//show the previous fieldset
	previous_fs.show();
	//hide the current fieldset with style
	current_fs.animate("""),format.raw/*761.21*/("""{"""),format.raw/*761.22*/("""opacity: 0"""),format.raw/*761.32*/("""}"""),format.raw/*761.33*/(""", """),format.raw/*761.35*/("""{"""),format.raw/*761.36*/("""
		"""),format.raw/*762.3*/("""step: function(now, mx) """),format.raw/*762.27*/("""{"""),format.raw/*762.28*/("""
			"""),format.raw/*763.4*/("""//as the opacity of current_fs reduces to 0 - stored in "now"
			//1. scale previous_fs from 80% to 100%
			scale = 0.8 + (1 - now) * 0.2;
			//2. take current_fs to the right(50%) - from 0%
			left = ((1-now) * 50)+"%";
			//3. increase opacity of previous_fs to 1 as it moves in
			opacity = 1 - now;
			current_fs.css("""),format.raw/*770.19*/("""{"""),format.raw/*770.20*/("""'left': left"""),format.raw/*770.32*/("""}"""),format.raw/*770.33*/(""");
			previous_fs.css("""),format.raw/*771.20*/("""{"""),format.raw/*771.21*/("""'transform': 'scale('+scale+')', 'opacity': opacity"""),format.raw/*771.72*/("""}"""),format.raw/*771.73*/(""");
		"""),format.raw/*772.3*/("""}"""),format.raw/*772.4*/(""",
		duration: 800,
		complete: function()"""),format.raw/*774.23*/("""{"""),format.raw/*774.24*/("""
			"""),format.raw/*775.4*/("""current_fs.hide();
			animating = false;
		"""),format.raw/*777.3*/("""}"""),format.raw/*777.4*/(""",
		//this comes from the custom easing plugin
		easing: 'easeInOutBack'
	"""),format.raw/*780.2*/("""}"""),format.raw/*780.3*/(""");
"""),format.raw/*781.1*/("""}"""),format.raw/*781.2*/(""");
</script>
</body>

</html>
"""))}
  }

  def render(userName:String): play.twirl.api.HtmlFormat.Appendable = apply(userName)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (userName) => apply(userName)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jun 08 21:55:41 CDT 2015
                  SOURCE: C:/first_play/app/views/ShowCreateStudy.scala.html
                  HASH: 532b5430b25796b9643367441c22a298f5b82440
                  MATRIX: 515->1|621->19|649->21|3969->3313|3999->3321|4029->3322|6579->5845|6595->5851|6689->5935|6730->5937|6764->5943|11281->10431|11311->10432|11358->10450|11420->10483|11450->10484|11497->10502|11553->10529|11583->10530|11637->10555|11711->10600|11741->10601|11795->10626|11853->10655|11883->10656|11938->10682|12012->10727|12042->10728|12094->10751|12124->10752|12211->10810|12241->10811|12288->10829|12344->10856|12374->10857|12428->10882|12504->10929|12534->10930|12588->10955|12646->10984|12676->10985|12731->11011|12807->11058|12837->11059|12889->11082|12919->11083|12996->11131|13026->11132|13077->11154|13133->11181|13163->11182|13217->11207|13361->11322|13391->11323|13445->11348|13503->11377|13533->11378|13588->11404|13732->11519|13762->11520|13814->11543|13844->11544|13931->11602|13961->11603|14013->11626|14069->11653|14099->11654|14155->11681|14300->11797|14330->11798|14384->11823|14442->11852|14472->11853|14528->11880|14673->11996|14703->11997|14755->12020|14785->12021|14873->12080|14903->12081|14955->12104|15011->12131|15041->12132|15097->12159|15243->12276|15273->12277|15327->12302|15385->12331|15415->12332|15473->12361|15619->12478|15649->12479|15701->12502|15731->12503|15819->12562|15849->12563|15901->12586|15957->12613|15987->12614|16043->12641|16190->12759|16220->12760|16274->12785|16332->12814|16362->12815|16420->12844|16567->12962|16597->12963|16649->12986|16679->12987|16770->13049|16800->13050|16852->13073|16908->13100|16938->13101|16994->13128|17142->13247|17172->13248|17226->13273|17284->13302|17314->13303|17372->13332|17520->13451|17550->13452|17602->13475|17632->13476|17723->13538|17753->13539|17805->13562|17861->13589|17891->13590|17947->13617|18096->13737|18126->13738|18180->13763|18238->13792|18268->13793|18326->13822|18475->13942|18505->13943|18557->13966|18587->13967|18639->13990|18669->13991|20608->15901|20638->15902|20721->15956|20778->15984|20808->15985|20891->16039|20947->16066|20977->16067|21063->16124|21291->16323|21321->16324|21407->16381|21497->16442|21527->16443|21614->16501|21842->16700|21872->16701|21956->16756|21986->16757|22102->16844|22132->16845|22216->16900|22272->16927|22302->16928|22388->16985|22617->17185|22647->17186|22733->17243|22823->17304|22853->17305|22941->17364|23170->17564|23200->17565|23284->17620|23314->17621|23430->17708|23460->17709|23544->17764|23600->17791|23630->17792|23718->17851|23948->18052|23978->18053|24064->18110|24154->18171|24184->18172|24274->18233|24504->18434|24534->18435|24618->18490|24648->18491|24764->18578|24794->18579|24878->18634|24934->18661|24964->18662|25052->18721|25283->18923|25313->18924|25399->18981|25489->19042|25519->19043|25609->19104|25840->19306|25870->19307|25954->19362|25984->19363|26109->19459|26139->19460|26223->19515|26279->19542|26309->19543|26397->19602|26629->19805|26659->19806|26745->19863|26835->19924|26865->19925|26955->19986|27187->20189|27217->20190|27301->20245|27331->20246|27415->20301|27445->20302|29698->22526|29728->22527|29807->22577|29864->22605|29894->22606|29977->22660|30033->22687|30063->22688|30149->22745|30373->22940|30403->22941|30489->22998|30579->23059|30609->23060|30696->23118|30920->23313|30950->23314|31034->23369|31064->23370|31183->23460|31213->23461|31297->23516|31353->23543|31383->23544|31469->23601|31694->23797|31724->23798|31810->23855|31900->23916|31930->23917|32018->23976|32243->24172|32273->24173|32357->24228|32387->24229|32511->24324|32541->24325|32625->24380|32681->24407|32711->24408|32799->24467|33025->24664|33055->24665|33141->24722|33231->24783|33261->24784|33351->24845|33577->25042|33607->25043|33691->25098|33721->25099|33849->25198|33879->25199|33963->25254|34019->25281|34049->25282|34137->25341|34364->25539|34394->25540|34480->25597|34570->25658|34600->25659|34690->25720|34917->25918|34947->25919|35031->25974|35061->25975|35192->26077|35222->26078|35306->26133|35362->26160|35392->26161|35480->26220|35708->26419|35738->26420|35824->26477|35914->26538|35944->26539|36034->26600|36262->26799|36292->26800|36376->26855|36406->26856|36530->26951|36560->26952|36644->27007|36700->27034|36730->27035|36818->27094|37047->27294|37077->27295|37163->27352|37253->27413|37283->27414|37373->27475|37602->27675|37632->27676|37716->27731|37746->27732|37872->27829|37902->27830|37986->27885|38042->27912|38072->27913|38160->27972|38390->28173|38420->28174|38506->28231|38596->28292|38626->28293|38716->28354|38946->28555|38976->28556|39060->28611|39090->28612|39174->28667|39204->28668|41298->30733|41328->30734|41407->30784|41474->30822|41504->30823|41587->30877|41643->30904|41673->30905|41759->30962|41985->31159|42015->31160|42101->31217|42191->31278|42221->31279|42308->31337|42534->31534|42564->31535|42648->31590|42678->31591|42802->31686|42832->31687|42916->31742|42972->31769|43002->31770|43088->31827|43315->32025|43345->32026|43431->32083|43521->32144|43551->32145|43639->32204|43866->32402|43896->32403|43980->32458|44010->32459|44134->32554|44164->32555|44248->32610|44304->32637|44334->32638|44422->32697|44650->32896|44680->32897|44766->32954|44856->33015|44886->33016|44976->33077|45204->33276|45234->33277|45318->33332|45348->33333|45472->33428|45502->33429|45586->33484|45642->33511|45672->33512|45760->33571|45989->33771|46019->33772|46105->33829|46195->33890|46225->33891|46315->33952|46544->34152|46574->34153|46658->34208|46688->34209|46815->34307|46845->34308|46929->34363|46985->34390|47015->34391|47103->34450|47333->34651|47363->34652|47449->34709|47539->34770|47569->34771|47659->34832|47889->35033|47919->35034|48003->35089|48033->35090|48151->35179|48181->35180|48265->35235|48321->35262|48351->35263|48439->35322|48670->35524|48700->35525|48786->35582|48876->35643|48906->35644|48996->35705|49227->35907|49257->35908|49341->35963|49371->35964|49498->36062|49528->36063|49612->36118|49668->36145|49698->36146|49786->36205|50018->36408|50048->36409|50134->36466|50224->36527|50254->36528|50344->36589|50576->36792|50606->36793|50690->36848|50720->36849|50804->36904|50834->36905|51936->37976|51970->37982|52339->38322|52369->38323|52401->38327|52464->38361|52494->38362|52529->38369|52582->38394|52611->38395|52645->38401|52674->38402|52748->38447|52778->38448|52811->38453|52909->38522|52939->38523|52973->38529|53062->38590|53091->38591|53198->38670|53227->38671|53313->38728|53343->38729|53377->38735|53477->38807|53506->38808|53575->38848|53605->38849|53639->38855|53740->38928|53769->38929|54050->39181|54080->39182|54117->39191|54325->39370|54355->39371|54398->39385|54467->39425|54497->39426|54532->39433|54571->39444|54600->39445|54631->39448|55033->39821|55063->39822|55102->39832|55132->39833|55163->39835|55193->39836|55225->39840|55278->39864|55308->39865|55341->39870|55672->40172|55702->40173|55762->40204|55792->40205|55840->40224|55870->40225|55931->40257|55961->40258|55995->40264|56024->40265|56096->40308|56126->40309|56159->40314|56232->40359|56261->40360|56366->40437|56395->40438|56428->40443|56457->40444|56487->40446|56516->40447|56582->40484|56612->40485|56643->40488|57042->40858|57072->40859|57111->40869|57141->40870|57172->40872|57202->40873|57234->40877|57287->40901|57317->40902|57350->40907|57707->41235|57737->41236|57778->41248|57808->41249|57860->41272|57890->41273|57970->41324|58000->41325|58034->41331|58063->41332|58135->41375|58165->41376|58198->41381|58271->41426|58300->41427|58405->41504|58434->41505|58466->41509|58495->41510
                  LINES: 19->1|22->1|23->2|78->57|78->57|78->57|132->111|132->111|132->111|132->111|133->112|224->203|224->203|225->204|225->204|225->204|226->205|226->205|226->205|227->206|228->207|228->207|229->208|230->209|230->209|231->210|232->211|232->211|233->212|233->212|234->213|234->213|235->214|235->214|235->214|236->215|237->216|237->216|238->217|239->218|239->218|240->219|241->220|241->220|242->221|242->221|243->222|243->222|244->223|244->223|244->223|245->224|247->226|247->226|248->227|249->228|249->228|250->229|252->231|252->231|253->232|253->232|255->234|255->234|256->235|256->235|256->235|257->236|259->238|259->238|260->239|261->240|261->240|262->241|264->243|264->243|265->244|265->244|267->246|267->246|268->247|268->247|268->247|270->249|272->251|272->251|273->252|274->253|274->253|275->254|277->256|277->256|278->257|278->257|280->259|280->259|281->260|281->260|281->260|283->262|285->264|285->264|286->265|287->266|287->266|288->267|290->269|290->269|291->270|291->270|293->272|293->272|294->273|294->273|294->273|296->275|298->277|298->277|299->278|300->279|300->279|301->280|303->282|303->282|304->283|304->283|306->285|306->285|307->286|307->286|307->286|309->288|311->290|311->290|312->291|313->292|313->292|314->293|316->295|316->295|317->296|317->296|319->298|319->298|347->326|347->326|348->327|348->327|348->327|349->328|349->328|349->328|350->329|352->331|352->331|353->332|354->333|354->333|355->334|357->336|357->336|358->337|358->337|360->339|360->339|361->340|361->340|361->340|362->341|364->343|364->343|365->344|366->345|366->345|367->346|369->348|369->348|370->349|370->349|372->351|372->351|373->352|373->352|373->352|375->354|377->356|377->356|378->357|379->358|379->358|380->359|382->361|382->361|383->362|383->362|385->364|385->364|386->365|386->365|386->365|388->367|390->369|390->369|391->370|392->371|392->371|393->372|395->374|395->374|396->375|396->375|398->377|398->377|399->378|399->378|399->378|401->380|403->382|403->382|404->383|405->384|405->384|406->385|408->387|408->387|409->388|409->388|411->390|411->390|442->421|442->421|443->422|443->422|443->422|444->423|444->423|444->423|445->424|447->426|447->426|448->427|449->428|449->428|450->429|452->431|452->431|453->432|453->432|455->434|455->434|456->435|456->435|456->435|457->436|459->438|459->438|460->439|461->440|461->440|462->441|464->443|464->443|465->444|465->444|467->446|467->446|468->447|468->447|468->447|470->449|472->451|472->451|473->452|474->453|474->453|475->454|477->456|477->456|478->457|478->457|480->459|480->459|481->460|481->460|481->460|483->462|485->464|485->464|486->465|487->466|487->466|488->467|490->469|490->469|491->470|491->470|493->472|493->472|494->473|494->473|494->473|496->475|498->477|498->477|499->478|500->479|500->479|501->480|503->482|503->482|504->483|504->483|506->485|506->485|507->486|507->486|507->486|509->488|511->490|511->490|512->491|513->492|513->492|514->493|516->495|516->495|517->496|517->496|519->498|519->498|520->499|520->499|520->499|522->501|524->503|524->503|525->504|526->505|526->505|527->506|529->508|529->508|530->509|530->509|532->511|532->511|566->545|566->545|567->546|567->546|567->546|568->547|568->547|568->547|569->548|571->550|571->550|572->551|573->552|573->552|574->553|576->555|576->555|577->556|577->556|579->558|579->558|580->559|580->559|580->559|581->560|583->562|583->562|584->563|585->564|585->564|586->565|588->567|588->567|589->568|589->568|591->570|591->570|592->571|592->571|592->571|594->573|596->575|596->575|597->576|598->577|598->577|599->578|601->580|601->580|602->581|602->581|604->583|604->583|605->584|605->584|605->584|607->586|609->588|609->588|610->589|611->590|611->590|612->591|614->593|614->593|615->594|615->594|617->596|617->596|618->597|618->597|618->597|620->599|622->601|622->601|623->602|624->603|624->603|625->604|627->606|627->606|628->607|628->607|630->609|630->609|631->610|631->610|631->610|633->612|635->614|635->614|636->615|637->616|637->616|638->617|640->619|640->619|641->620|641->620|643->622|643->622|644->623|644->623|644->623|646->625|648->627|648->627|649->628|650->629|650->629|651->630|653->632|653->632|654->633|654->633|656->635|656->635|675->654|676->655|692->671|692->671|694->673|694->673|694->673|696->675|697->676|697->676|699->678|699->678|704->683|704->683|705->684|705->684|705->684|706->685|707->686|707->686|709->688|709->688|711->690|711->690|712->691|713->692|713->692|714->693|714->693|715->694|716->695|716->695|724->703|724->703|726->705|729->708|729->708|730->709|731->710|731->710|732->711|733->712|733->712|734->713|746->725|746->725|746->725|746->725|746->725|746->725|747->726|747->726|747->726|748->727|755->734|755->734|755->734|755->734|756->735|756->735|756->735|756->735|757->736|757->736|759->738|759->738|760->739|762->741|762->741|765->744|765->744|766->745|766->745|767->746|767->746|769->748|769->748|770->749|782->761|782->761|782->761|782->761|782->761|782->761|783->762|783->762|783->762|784->763|791->770|791->770|791->770|791->770|792->771|792->771|792->771|792->771|793->772|793->772|795->774|795->774|796->775|798->777|798->777|801->780|801->780|802->781|802->781
                  -- GENERATED --
              */
          