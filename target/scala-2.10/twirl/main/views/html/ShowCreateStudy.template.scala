
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
object ShowCreateStudy extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,List[scala.Tuple3[String, Int, Int]],RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userName: String, explVar : List[(String, Int, Int)])(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.89*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
<head>

    <style type="text/css">

        .kareem """),format.raw/*9.17*/("""{"""),format.raw/*9.18*/("""
            """),format.raw/*10.13*/("""padding: 15px;
            border: 1px solid #ccc;
            border-radius: 3px;
            margin-bottom: 10px;
            box-sizing: border-box;
            font-family: montserrat;
            color: #2C3E50;
            font-size: 13px;
        """),format.raw/*18.9*/("""}"""),format.raw/*18.10*/("""



    """),format.raw/*22.5*/("""</style>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta content="width=1170" name="viewport"><meta content="text/html; charset=UTF-8" http-equiv="Content-Type">
    <script type="text/javascript" src="/assets/javascripts/jquery-1.9.0.min.js"></script>
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
    <script src="/assets/javascripts/bootstrap.min.js"></script>
    <script src="/assets/javascripts/bootstrap-datepicker.js"></script>
    <script type="text/javascript" src="/assets/javascripts/ow-all.js"></script>
    <script type='text/javascript' src='"""),_display_(/*44.42*/routes/*44.48*/.Assets.at("javascripts/showCreateStudy.js")),format.raw/*44.92*/("""'></script>
    <script type='text/javascript' src='"""),_display_(/*45.42*/routes/*45.48*/.Assets.at("javascripts/studyDescriptor.js")),format.raw/*45.92*/("""'></script>
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
            <!-- <a class="navbar-brand" href="#"><span></span>Share</a> -->
            <a class="navbar-brand" href="/frontPage"><span></span>Help</a>
            <ul class="user-menu">
                <li class="dropdown pull-right">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-user"></span> """),_display_(/*66.128*/userName),format.raw/*66.136*/(""" """),format.raw/*66.137*/("""<span class="caret"></span></a>
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
        <li role="presentation" class="divider"></li>

    </ul>
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
    <div class="row">
    <div class="col-sm-8">
        <h3> <a href="/setUpStudy">see how to set up your data in SubjectBook </a> </h3>
        <h3> <a href="/howToCreateNewStudy">See how to create a new study in SubjectBook </a> </h3>
    </div>
    </div>

    <div class ="showontop" >

    <form calss="salah" id="msform" method="post">
    <!-- progressbar -->



    """),_display_(/*121.6*/helper/*121.12*/.form(action = routes.Application.InsertNewStudy, 'enctype -> "multipart/form-data", 'id-> "target"  )/*121.114*/ {_display_(Seq[Any](format.raw/*121.116*/("""
        """),format.raw/*122.9*/("""<ul class="taa" id="progressbar1">
        <li class="active">Experimental Design</li>
        <li >Data Source</li>
        <li> Explanatory Variables</li>
        <li> Response Variable </li>
        <li> covariates</li>
       <!-- <li>Performance </li>  -->
    </ul>
    <!-- fieldsets -->

        <button type="button" id="mdl1" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal1" style="display: none;">
            Launch demo modal
        </button>

        <!-- Modal -->
        <div class="modal fade" id="myModal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title" id="myModalLabel">Select Baseline Session</h4>
                    </div>

                    <div class="modal-footer" id = "mdl1Sub">

                    </div>
                </div>
            </div>
        </div>


        <button type="button" id="mdl2" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal2" style="display: none;">
            Launch demo modal
        </button>

        <!-- Modal -->
        <div class="modal fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title" id="myModalLabel">Select the Explanatory Variable</h4>
                    </div>

                    <div class="modal-footer" id = "mdl1Expl">

                    </div>
                </div>
            </div>
        </div>



        <button type="button" id="mdl3" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal3" style="display: none;">
            Launch demo modal
        </button>

        <!-- Modal -->
        <div class="modal fade" id="myModal3" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title" id="myModalLabel">Select the Response Variable</h4>
                    </div>

                    <div class="modal-footer" id = "mdl1Resp">

                    </div>
                </div>
            </div>
        </div>


        <button type="button" id="mdl4" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal4" style="display: none;">
            Launch demo modal
        </button>

        <!-- Modal -->
        <div class="modal fade" id="myModal4" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title" id="myModalLabel">Select the Response Covariate</h4>
                    </div>
                        <input  type="radio" name="baseline" value="female" checked="true" > Gender
                    <div class="modal-footer" id = "mdl1covr">

                    </div>
                </div>
            </div>
        </div>

        <fieldset>
            <h2 class="fs-title">Experimental Design</h2>
            <h3 class="fs-subtitle"></h3>
            <table id="zob" cellspacing="0" class="data_table" id="add_sessions_table">


                <input type="hidden" name="code" id= "code" value=" ">
                <input type="hidden" name="studyId"  value="1">

                    <label>How many unique sessions your study have? </label>
                    <input type="number" class="form-control"  name="pName", id = "noVar">




                    <label>How many treatems arms this study have? </label>
                    <input type="number" class="form-control" name="min" value ="1" id = "noPoints">




                    <table data-toggle="table"  data-show-refresh="true" data-show-toggle="true" data-show-columns="true" data-search="true" data-select-item-name="toolbar1" data-pagination="true" data-sort-name="name" data-sort-order="desc">
                        <thead>
                        <tr id ="head">

                        </tr>
                        </thead>
                        <tbody  id="tableBody">

                        </tbody>
                    </table>




            </table>
            <input id ="zeroNext"  type="button" name="next" class="next0 action-button" value="Next" />



        </fieldset>
        <fieldset>
            <h2 class="fs-title">Data Source</h2>
        <h3 class="fs-subtitle"></h3>
        <table id="zob" cellspacing="0" class="data_table" id="add_sessions_table">

            <tr>
                <td class="cell_1">* Source type:</td>
                <td>
                    <select class="select_field"  id="sourcetype" name="study_type" >
                        <option id="form_versions_avmMoOfAa88BZFkbhDIE2swy6EGJ6QVmwtW7KMk5SbtgxnVrVvxQINqa6aN2CIr4_select_1" value=1  selected ="selected">Google Drive</option>
                        """),_display_(/*267.26*/if( userName =="cplsubjectbook@gmail.com")/*267.68*/ {_display_(Seq[Any](format.raw/*267.70*/("""
                        """),format.raw/*268.25*/("""<option id="form_versions_avmMoOfAa88BZFkbhDIE2swy6EGJ6QVmwtW7KMk5SbtgxnVrVvxQINqa6aN2CIr4_select_2" value=2>CPL Server</option>
                        """)))}),format.raw/*269.26*/("""
                    """),format.raw/*270.21*/("""</select>

                </td>
            </tr>
            <tr>
                <td class="cell_1">* Study name:</td>
                <td id = "kareem">
                    <input  size="200"  type="text" id="study_name" maxlength="50" name="study_name" prompttext="" required>
                </td>
            </tr>
            <tr>
                <td class="cell_1">* URL:</td>
                <td id = "kareem">
                    <input  size="200"  type="text" id="folder_name" maxlength="200" name="url" prompttext="" required>
                        <input size="200"  type="hidden" id="folder_id" maxlength="50" name="folder_id" value="x">
                </td>
                <td id = "kareem">
                    <input  type="button" name="Add" id="browseGD"class="" value="...." />
                </td>
                <script type="text/javascript" src="https://apis.google.com/js/api.js?onload=onApiLoad"></script>
            </tr>
             <tr>
                <td class="cell_1">* Number of subjects:</td>
                <td id = "kareem">
                    <input type="number" class="text_field" name="numSubj" id="numSubj" min="1" max="100" value = 1>
                </td>
            </tr>
            <tr>
                <td class="cell_1">* Sessions per subject:</td>
                <td id = "kareem">
                    <input  type="number" class="text_field" name="numSess" min="0" max="100" value = 1>
                </td>
            </tr>
            <tr>
                <td id = "kareem"><input  type="checkbox" id="publicCh" name="publicCh" value=1 style="width: 20px;">Public study&nbsp;&nbsp;&nbsp;&nbsp;<br> </td>
                <td id = "kareem"><input type="checkbox" id="portraitCh" name="portraitCh" value=1 style="width: 20px">Generate Portrait&nbsp;&nbsp;&nbsp;<br> </td>
                <input  type="hidden" name="public" id='public' value=0>
                <input  type="hidden" name="portrait" id='portrait' value=0>
            </tr>
            <!-- <tr>
                <td class="cell_1"> Runs per session:</td>
                <td> -->
            <input class="kareem" type="hidden" class="text_field" name="numRun" min="1" max="100" value = 1>
            <!-- </td> -->

            <!-- </tr>  -->
        </table>
            <input type="button" name="previous" class="previous0 action-button" value="Previous" />
            <input id ="firstNext"  type="button" name="next" class="next1 action-button" value="Next" />



        </fieldset>
        <fieldset>
            <h2 class="fs-title">Explanatory Variables</h2>
            <table cellspacing="0" class="data_table" id="add_sessions_table">
                <tr>
                    <td class="cell_1">Key Explanatory Variables:</td>
                    <td>
                        <select class="select_field"  id="explanatoryPrim" name="study_type"  style="width: 300px" required>
                            """),_display_(/*330.30*/for(temp <- explVar) yield /*330.50*/{_display_(Seq[Any](format.raw/*330.51*/("""
                            """),_display_(/*331.30*/if(temp._3 == 1 )/*331.47*/ {_display_(Seq[Any](format.raw/*331.49*/("""
                             """),format.raw/*332.30*/("""<option id="op1" value="""),_display_(/*332.54*/temp/*332.58*/._2),format.raw/*332.61*/("""  """),format.raw/*332.63*/("""selected ="selected"> """),_display_(/*332.86*/temp/*332.90*/._1),format.raw/*332.93*/(""" """),format.raw/*332.94*/("""</option>
                            """)))}),format.raw/*333.30*/("""
                            """)))}),format.raw/*334.30*/("""
                        """),format.raw/*335.25*/("""</select>
                    </td>
                </tr>
                <tr>
                    <td class="cell_1">Secondary Explanatory Variables</td>
                    <td>

                        <div class="col-lg-12">
                            <div class="button-group">
                                <button type="button" style="width: 300px" class="btn btn-default btn-sm dropdown-toggle" data-toggle="dropdown"> Select Variables <span class="caret"></span></button>
                                <ul class="dropdown-menu">
                                    """),_display_(/*346.38*/for(temp <- explVar) yield /*346.58*/{_display_(Seq[Any](format.raw/*346.59*/("""
                                    """),_display_(/*347.38*/if(temp._3 == 1 )/*347.55*/ {_display_(Seq[Any](format.raw/*347.57*/("""
                                    """),format.raw/*348.37*/("""<li><a href="#" class="small1" data-value=""""),_display_(/*348.81*/temp/*348.85*/._2),format.raw/*348.88*/("""" tabIndex="-1"><input type="checkbox"/>&nbsp;"""),_display_(/*348.135*/temp/*348.139*/._1),format.raw/*348.142*/("""</a></li>
                                     """)))}),format.raw/*349.39*/("""
                                    """)))}),format.raw/*350.38*/("""
                                """),format.raw/*351.33*/("""</ul>
                            </div>
                        </div>

                    </td>

                </tr>
                <tr>
                    <td class="cell_1">Static Data Before Sessions</td>
                    <td>
                        <select class="select_field"  id="staticB" name="study_type" >

                            """),_display_(/*363.30*/for(temp <- explVar) yield /*363.50*/{_display_(Seq[Any](format.raw/*363.51*/("""
                            """),_display_(/*364.30*/if(temp._3 == 4)/*364.46*/ {_display_(Seq[Any](format.raw/*364.48*/("""
                            """),format.raw/*365.29*/("""<option id="op1" value=""""),_display_(/*365.54*/temp/*365.58*/._2),format.raw/*365.61*/("""" > """),_display_(/*365.66*/temp/*365.70*/._1),format.raw/*365.73*/("""</option>
                            """)))}),format.raw/*366.30*/("""
                            """)))}),format.raw/*367.30*/("""
                            """),format.raw/*368.29*/("""<option id="op1" value=-1 > none </option>
                        </select>

                    </td>

                </tr>
                <tr>
                    <td class="cell_1">Static Data After Sessions</td>
                    <td>
                        <select class="select_field"  id="staticA" name="study_type" >
                            """),_display_(/*378.30*/for(temp <- explVar) yield /*378.50*/{_display_(Seq[Any](format.raw/*378.51*/("""
                            """),_display_(/*379.30*/if(temp._3 == 4)/*379.46*/ {_display_(Seq[Any](format.raw/*379.48*/("""
                            """),format.raw/*380.29*/("""<option id="op1" value=""""),_display_(/*380.54*/temp/*380.58*/._2),format.raw/*380.61*/(""""  > """),_display_(/*380.67*/temp/*380.71*/._1),format.raw/*380.74*/("""</option>
                            """)))}),format.raw/*381.30*/("""
                            """)))}),format.raw/*382.30*/("""
                            """),format.raw/*383.29*/("""<option id="op1" value=-1 > none </option>
                        </select>

                    </td>

                </tr>
            </table>
            <input type="button" name="previous" class="previous action-button" value="Previous" />
            <input type="button" name="next" class="next2 action-button" value="Next" />
            <!--<input type="submit" name="submit" class="submit action-button" value="Submit" id="createStudy"/> -->

        </fieldset>
        <fieldset>
            <h2 class="fs-title">Response Variables</h2>
            <table cellspacing="0" class="data_table" id="add_sessions_table">
                <tr>
                    <td class="cell_1">Key Response Variables:</td>
                    <td>
                        <select class="select_field"  id="responsePrim" name="study_type"  style="width: 300px">
                            """),_display_(/*402.30*/for(temp <- explVar) yield /*402.50*/{_display_(Seq[Any](format.raw/*402.51*/("""
                                """),_display_(/*403.34*/if(temp._3 == 1)/*403.50*/ {_display_(Seq[Any](format.raw/*403.52*/("""
                                """),format.raw/*404.33*/("""<option id="op1" value="""),_display_(/*404.57*/temp/*404.61*/._2),format.raw/*404.64*/("""  """),format.raw/*404.66*/("""selected ="selected"> """),_display_(/*404.89*/temp/*404.93*/._1),format.raw/*404.96*/(""" """),format.raw/*404.97*/("""</option>
                                """)))}),format.raw/*405.34*/("""
                            """)))}),format.raw/*406.30*/("""

                        """),format.raw/*408.25*/("""</select>
                    </td>
                </tr>
                <tr>
                    <td class="cell_1">Secondary Response Variables</td>
                    <td>
                        <!-- <select class="select_field"  id="responseSec" name="study_type" >
                            <option id="op1" value=1  selected ="selected"> EDA Palm</option>
                        </select> -->

                        <div class="col-lg-12">
                            <div class="button-group">
                                <button type="button" style="width: 300px" class="btn btn-default btn-sm dropdown-toggle" data-toggle="dropdown"> Select Variables <span class="caret"></span></button>
                                <ul class="dropdown-menu">
                                    """),_display_(/*422.38*/for(temp <- explVar) yield /*422.58*/{_display_(Seq[Any](format.raw/*422.59*/("""
                                    """),_display_(/*423.38*/if(temp._3 == 1 )/*423.55*/ {_display_(Seq[Any](format.raw/*423.57*/("""
                                    """),format.raw/*424.37*/("""<li><a href="#"   class="small2" data-value=""""),_display_(/*424.83*/temp/*424.87*/._2),format.raw/*424.90*/("""" tabIndex="-1"><input type="checkbox"/>&nbsp;"""),_display_(/*424.137*/temp/*424.141*/._1),format.raw/*424.144*/("""</a></li>
                                    """)))}),format.raw/*425.38*/("""
                                    """)))}),format.raw/*426.38*/("""
                                """),format.raw/*427.33*/("""</ul>
                            </div>
                        </div>


                    </td>

                </tr>

            </table>
            <input type="button" name="previous" class="previous action-button" value="Previous" />
            <input type="button" name="next" class="next3 action-button" value="Next" />
            <!--<input type="submit" name="submit" class="submit action-button" value="Submit" id="createStudy"/> -->

        </fieldset>
        <fieldset>
            <h2 class="fs-title">Covariates</h2>
            <h3 class="fs-subtitle"></h3>

            <table cellspacing="0" class="data_table" id="add_sessions_table">
                <tr>
                    <td class="cell_1">Covariates</td>
                    <td>
                        <select class="select_field"  id="cov" name="study_type"  style="width: 300px">
                            """),_display_(/*451.30*/for(temp <- explVar) yield /*451.50*/{_display_(Seq[Any](format.raw/*451.51*/("""
                            """),_display_(/*452.30*/if(temp._3 == 3 )/*452.47*/ {_display_(Seq[Any](format.raw/*452.49*/("""
                            """),format.raw/*453.29*/("""<option id="op1" value="""),_display_(/*453.53*/temp/*453.57*/._2),format.raw/*453.60*/("""  """),format.raw/*453.62*/("""selected ="selected"> """),_display_(/*453.85*/temp/*453.89*/._1),format.raw/*453.92*/("""</option>
                            """)))}),format.raw/*454.30*/("""
                            """)))}),format.raw/*455.30*/("""
                            """),format.raw/*456.29*/("""<option id="op1" value=-1 > none </option>
                        </select>

                    </td>

                </tr>
                <!-- <tr>
                    <td><input type="checkbox" id="Age" name="Age" value=1 style="width: 20px">Age&nbsp;&nbsp;&nbsp;&nbsp;<br> </td>
                    <td><input type="checkbox" id="Height" name="Height" value=10 style="width: 20px">Height&nbsp;&nbsp;&nbsp;<br> </td>
                    <td><input type="checkbox" id="Weight" name="Weight" value=100 style="width: 20px">Weight&nbsp;&nbsp;&nbsp;<br> </td>
                    <td><input type="checkbox" id="Gender" name="Gender" value=1000 style="width: 20px">Gender&nbsp;&nbsp;&nbsp;<br> </td>
                    <td><input type="checkbox" id="Ethnicity" name="Ethnicity" value=10000 style="width: 20px">Ethnicity<br> </td>
                </tr>
                <tr>
                    <td><input type="checkbox" id="Bio_other"  name="Bio_other" value=100000 style="width: 20px">Other&nbsp;<br> </td>

                </tr> -->
            </table>
            <script>
                    $(document).ready(function()"""),format.raw/*475.49*/("""{"""),format.raw/*475.50*/("""
                    """),format.raw/*476.21*/("""$('#publicCh').change(function() """),format.raw/*476.54*/("""{"""),format.raw/*476.55*/("""
                    """),format.raw/*477.21*/("""if($(this).is(":checked")) """),format.raw/*477.48*/("""{"""),format.raw/*477.49*/("""
                           """),format.raw/*478.28*/("""$("#public").val(1);
                           """),format.raw/*479.28*/("""}"""),format.raw/*479.29*/("""
                           """),format.raw/*480.28*/("""else
                           """),format.raw/*481.28*/("""{"""),format.raw/*481.29*/("""
                            """),format.raw/*482.29*/("""$("#public").val(0);
                           """),format.raw/*483.28*/("""}"""),format.raw/*483.29*/("""
                         """),format.raw/*484.26*/("""}"""),format.raw/*484.27*/(""");
                       $('#portraitCh').change(function() """),format.raw/*485.59*/("""{"""),format.raw/*485.60*/("""
                    """),format.raw/*486.21*/("""if($(this).is(":checked")) """),format.raw/*486.48*/("""{"""),format.raw/*486.49*/("""
                           """),format.raw/*487.28*/("""$("#portrait").val(1);
                           """),format.raw/*488.28*/("""}"""),format.raw/*488.29*/("""
                           """),format.raw/*489.28*/("""else
                           """),format.raw/*490.28*/("""{"""),format.raw/*490.29*/("""
                            """),format.raw/*491.29*/("""$("#portrait").val(0);
                           """),format.raw/*492.28*/("""}"""),format.raw/*492.29*/("""
                         """),format.raw/*493.26*/("""}"""),format.raw/*493.27*/(""");
                    $('#Age').change(function() """),format.raw/*494.49*/("""{"""),format.raw/*494.50*/("""
                        """),format.raw/*495.25*/("""if($(this).is(":checked")) """),format.raw/*495.52*/("""{"""),format.raw/*495.53*/("""
                           """),format.raw/*496.28*/("""var a =  parseInt($("#ir").val()) + 1
                           $("#ir").val(a.toString() );
                           """),format.raw/*498.28*/("""}"""),format.raw/*498.29*/("""
                           """),format.raw/*499.28*/("""else
                           """),format.raw/*500.28*/("""{"""),format.raw/*500.29*/("""
                            """),format.raw/*501.29*/("""var a =  parseInt($("#ir").val()) - 1
                           $("#ir").val(a.toString() );
                           """),format.raw/*503.28*/("""}"""),format.raw/*503.29*/("""
                         """),format.raw/*504.26*/("""}"""),format.raw/*504.27*/(""");

                         $('#Height').change(function() """),format.raw/*506.57*/("""{"""),format.raw/*506.58*/("""
                         """),format.raw/*507.26*/("""if($(this).is(":checked")) """),format.raw/*507.53*/("""{"""),format.raw/*507.54*/("""
                             """),format.raw/*508.30*/("""var a =  parseInt($("#ir").val()) + 10
                           $("#ir").val(a.toString() );
                           """),format.raw/*510.28*/("""}"""),format.raw/*510.29*/("""
                           """),format.raw/*511.28*/("""else
                           """),format.raw/*512.28*/("""{"""),format.raw/*512.29*/("""
                             """),format.raw/*513.30*/("""var a =  parseInt($("#ir").val()) - 10
                           $("#ir").val(a.toString() );
                           """),format.raw/*515.28*/("""}"""),format.raw/*515.29*/("""
                         """),format.raw/*516.26*/("""}"""),format.raw/*516.27*/(""");

                          $('#Weight').change(function() """),format.raw/*518.58*/("""{"""),format.raw/*518.59*/("""
                         """),format.raw/*519.26*/("""if($(this).is(":checked")) """),format.raw/*519.53*/("""{"""),format.raw/*519.54*/("""

                           """),format.raw/*521.28*/("""var a =  parseInt($("#ir").val()) + 100
                           $("#ir").val(a.toString() );
                           """),format.raw/*523.28*/("""}"""),format.raw/*523.29*/("""
                           """),format.raw/*524.28*/("""else
                           """),format.raw/*525.28*/("""{"""),format.raw/*525.29*/("""
                               """),format.raw/*526.32*/("""var a =  parseInt($("#ir").val()) - 100
                           $("#ir").val(a.toString() );
                           """),format.raw/*528.28*/("""}"""),format.raw/*528.29*/("""
                         """),format.raw/*529.26*/("""}"""),format.raw/*529.27*/(""");

                          $('#Gender').change(function() """),format.raw/*531.58*/("""{"""),format.raw/*531.59*/("""
                         """),format.raw/*532.26*/("""if($(this).is(":checked")) """),format.raw/*532.53*/("""{"""),format.raw/*532.54*/("""

                           """),format.raw/*534.28*/("""var a =  parseInt($("#ir").val()) + 1000
                           $("#ir").val(a.toString() );
                           """),format.raw/*536.28*/("""}"""),format.raw/*536.29*/("""
                           """),format.raw/*537.28*/("""else
                           """),format.raw/*538.28*/("""{"""),format.raw/*538.29*/("""
                               """),format.raw/*539.32*/("""var a =  parseInt($("#ir").val()) - 1000
                           $("#ir").val(a.toString() );
                           """),format.raw/*541.28*/("""}"""),format.raw/*541.29*/("""
                         """),format.raw/*542.26*/("""}"""),format.raw/*542.27*/(""");

                          $('#Ethnicity').change(function() """),format.raw/*544.61*/("""{"""),format.raw/*544.62*/("""
                         """),format.raw/*545.26*/("""if($(this).is(":checked")) """),format.raw/*545.53*/("""{"""),format.raw/*545.54*/("""

                           """),format.raw/*547.28*/("""var a =  parseInt($("#ir").val()) + 10000
                           $("#ir").val(a.toString() );
                           """),format.raw/*549.28*/("""}"""),format.raw/*549.29*/("""
                           """),format.raw/*550.28*/("""else
                           """),format.raw/*551.28*/("""{"""),format.raw/*551.29*/("""
                               """),format.raw/*552.32*/("""var a =  parseInt($("#ir").val()) - 10000
                           $("#ir").val(a.toString() );
                           """),format.raw/*554.28*/("""}"""),format.raw/*554.29*/("""
                         """),format.raw/*555.26*/("""}"""),format.raw/*555.27*/(""");

                          $('#Bio_other').change(function() """),format.raw/*557.61*/("""{"""),format.raw/*557.62*/("""
                         """),format.raw/*558.26*/("""if($(this).is(":checked")) """),format.raw/*558.53*/("""{"""),format.raw/*558.54*/("""

                           """),format.raw/*560.28*/("""var a =  parseInt($("#ir").val()) + 100000
                           $("#ir").val(a.toString() );
                           """),format.raw/*562.28*/("""}"""),format.raw/*562.29*/("""
                           """),format.raw/*563.28*/("""else
                           """),format.raw/*564.28*/("""{"""),format.raw/*564.29*/("""
                               """),format.raw/*565.32*/("""var a =  parseInt($("#ir").val()) - 100000
                           $("#ir").val(a.toString() );
                           """),format.raw/*567.28*/("""}"""),format.raw/*567.29*/("""
                         """),format.raw/*568.26*/("""}"""),format.raw/*568.27*/(""");

                     """),format.raw/*570.22*/("""}"""),format.raw/*570.23*/(""");
                                        </script>
            <input type="hidden" name="bio" id='ir' value=0>

            <input type="button" name="previous" class="previous action-button" value="Previous" />
           <!-- <input type="button" name="next" class="next action-button" value="Next" /> -->
            <input type="submit" name="submit" class="submit action-button" value="Submit" id="createStudy"/>
      </fieldset>
    <!--<fieldset>
        <h2 class="fs-title">Psychometrics</h2>
        <h3 class="fs-subtitle"></h3>
        <table cellspacing="0" class="data_table" id="add_sessions_table">
            <tr>
                <td class="cell_1"> State-Trait Anxiety Inventory: </td>
                <td class="cell_2"><input type="checkbox" id="SAI" name="SAI" value=1 style="width: 20px">SAI&nbsp;&nbsp;&nbsp;&nbsp; </td>


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
                                                $(document).ready(function()"""),format.raw/*599.77*/("""{"""),format.raw/*599.78*/("""
                                                    """),format.raw/*600.53*/("""$('#SAI').change(function() """),format.raw/*600.81*/("""{"""),format.raw/*600.82*/("""
                                                    """),format.raw/*601.53*/("""if($(this).is(":checked")) """),format.raw/*601.80*/("""{"""),format.raw/*601.81*/("""
                                                       """),format.raw/*602.56*/("""var a =  parseInt($("#Psychometric").val()) + 1
                                                       $("#Psychometric").val(a.toString() );
                                                       """),format.raw/*604.56*/("""}"""),format.raw/*604.57*/("""
                                                       """),format.raw/*605.56*/("""else
                                                       """),format.raw/*606.56*/("""{"""),format.raw/*606.57*/("""
                                                        """),format.raw/*607.57*/("""var a =  parseInt($("#Psychometric").val()) - 1
                                                       $("#Psychometric").val(a.toString() );
                                                       """),format.raw/*609.56*/("""}"""),format.raw/*609.57*/("""
                                                     """),format.raw/*610.54*/("""}"""),format.raw/*610.55*/(""");

                                                     $('#TAI').change(function() """),format.raw/*612.82*/("""{"""),format.raw/*612.83*/("""
                                                     """),format.raw/*613.54*/("""if($(this).is(":checked")) """),format.raw/*613.81*/("""{"""),format.raw/*613.82*/("""
                                                       """),format.raw/*614.56*/("""var a =  parseInt($("#Psychometric").val()) + 10
                                                       $("#Psychometric").val(a.toString() );
                                                       """),format.raw/*616.56*/("""}"""),format.raw/*616.57*/("""
                                                       """),format.raw/*617.56*/("""else
                                                       """),format.raw/*618.56*/("""{"""),format.raw/*618.57*/("""
                                                         """),format.raw/*619.58*/("""var a =  parseInt($("#Psychometric").val()) - 10
                                                       $("#Psychometric").val(a.toString() );
                                                       """),format.raw/*621.56*/("""}"""),format.raw/*621.57*/("""
                                                     """),format.raw/*622.54*/("""}"""),format.raw/*622.55*/(""");

                                                      $('#PA').change(function() """),format.raw/*624.82*/("""{"""),format.raw/*624.83*/("""
                                                     """),format.raw/*625.54*/("""if($(this).is(":checked")) """),format.raw/*625.81*/("""{"""),format.raw/*625.82*/("""

                                                       """),format.raw/*627.56*/("""var a =  parseInt($("#Psychometric").val()) + 100
                                                       $("#Psychometric").val(a.toString() );
                                                       """),format.raw/*629.56*/("""}"""),format.raw/*629.57*/("""
                                                       """),format.raw/*630.56*/("""else
                                                       """),format.raw/*631.56*/("""{"""),format.raw/*631.57*/("""
                                                           """),format.raw/*632.60*/("""var a =  parseInt($("#Psychometric").val()) - 100
                                                       $("#Psychometric").val(a.toString() );
                                                       """),format.raw/*634.56*/("""}"""),format.raw/*634.57*/("""
                                                     """),format.raw/*635.54*/("""}"""),format.raw/*635.55*/(""");

                                                      $('#NA').change(function() """),format.raw/*637.82*/("""{"""),format.raw/*637.83*/("""
                                                     """),format.raw/*638.54*/("""if($(this).is(":checked")) """),format.raw/*638.81*/("""{"""),format.raw/*638.82*/("""

                                                       """),format.raw/*640.56*/("""var a =  parseInt($("#Psychometric").val()) + 1000
                                                       $("#Psychometric").val(a.toString() );
                                                       """),format.raw/*642.56*/("""}"""),format.raw/*642.57*/("""
                                                       """),format.raw/*643.56*/("""else
                                                       """),format.raw/*644.56*/("""{"""),format.raw/*644.57*/("""
                                                           """),format.raw/*645.60*/("""var a =  parseInt($("#Psychometric").val()) - 1000
                                                       $("#Psychometric").val(a.toString() );
                                                       """),format.raw/*647.56*/("""}"""),format.raw/*647.57*/("""
                                                     """),format.raw/*648.54*/("""}"""),format.raw/*648.55*/(""");

                                                      $('#Trait_Other').change(function() """),format.raw/*650.91*/("""{"""),format.raw/*650.92*/("""
                                                     """),format.raw/*651.54*/("""if($(this).is(":checked")) """),format.raw/*651.81*/("""{"""),format.raw/*651.82*/("""

                                                       """),format.raw/*653.56*/("""var a =  parseInt($("#Psychometric").val()) + 10000
                                                       $("#Psychometric").val(a.toString() );
                                                       """),format.raw/*655.56*/("""}"""),format.raw/*655.57*/("""
                                                       """),format.raw/*656.56*/("""else
                                                       """),format.raw/*657.56*/("""{"""),format.raw/*657.57*/("""
                                                           """),format.raw/*658.60*/("""var a =  parseInt($("#Psychometric").val()) - 10000
                                                       $("#Psychometric").val(a.toString() );
                                                       """),format.raw/*660.56*/("""}"""),format.raw/*660.57*/("""
                                                     """),format.raw/*661.54*/("""}"""),format.raw/*661.55*/(""");

                                                 """),format.raw/*663.50*/("""}"""),format.raw/*663.51*/(""");
                                    </script>
        <input type="hidden" name="psychometric" id='Psychometric' value=0>


        <input type="button" name="previous" class="previous action-button" value="Previous" />
        <input type="button" name="next" class="next action-button" value="Next" />
    </fieldset> -->
    <!-- <fieldset>
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
                                                $(document).ready(function()"""),format.raw/*694.77*/("""{"""),format.raw/*694.78*/("""
                                                """),format.raw/*695.49*/("""$('#EDA').change(function() """),format.raw/*695.77*/("""{"""),format.raw/*695.78*/("""
                                                    """),format.raw/*696.53*/("""if($(this).is(":checked")) """),format.raw/*696.80*/("""{"""),format.raw/*696.81*/("""
                                                       """),format.raw/*697.56*/("""var a =  parseInt($("#physiology").val()) + 1
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*699.56*/("""}"""),format.raw/*699.57*/("""
                                                       """),format.raw/*700.56*/("""else
                                                       """),format.raw/*701.56*/("""{"""),format.raw/*701.57*/("""
                                                        """),format.raw/*702.57*/("""var a =  parseInt($("#physiology").val()) - 1
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*704.56*/("""}"""),format.raw/*704.57*/("""
                                                     """),format.raw/*705.54*/("""}"""),format.raw/*705.55*/(""");

                                                     $('#Motion').change(function() """),format.raw/*707.85*/("""{"""),format.raw/*707.86*/("""
                                                     """),format.raw/*708.54*/("""if($(this).is(":checked")) """),format.raw/*708.81*/("""{"""),format.raw/*708.82*/("""
                                                       """),format.raw/*709.56*/("""var a =  parseInt($("#physiology").val()) + 10
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*711.56*/("""}"""),format.raw/*711.57*/("""
                                                       """),format.raw/*712.56*/("""else
                                                       """),format.raw/*713.56*/("""{"""),format.raw/*713.57*/("""
                                                         """),format.raw/*714.58*/("""var a =  parseInt($("#physiology").val()) - 10
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*716.56*/("""}"""),format.raw/*716.57*/("""
                                                     """),format.raw/*717.54*/("""}"""),format.raw/*717.55*/(""");

                                                      $('#GSR_Finger').change(function() """),format.raw/*719.90*/("""{"""),format.raw/*719.91*/("""
                                                     """),format.raw/*720.54*/("""if($(this).is(":checked")) """),format.raw/*720.81*/("""{"""),format.raw/*720.82*/("""

                                                       """),format.raw/*722.56*/("""var a =  parseInt($("#physiology").val()) + 100
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*724.56*/("""}"""),format.raw/*724.57*/("""
                                                       """),format.raw/*725.56*/("""else
                                                       """),format.raw/*726.56*/("""{"""),format.raw/*726.57*/("""
                                                           """),format.raw/*727.60*/("""var a =  parseInt($("#physiology").val()) - 100
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*729.56*/("""}"""),format.raw/*729.57*/("""
                                                     """),format.raw/*730.54*/("""}"""),format.raw/*730.55*/(""");

                                                      $('#Breathing_Belt').change(function() """),format.raw/*732.94*/("""{"""),format.raw/*732.95*/("""
                                                     """),format.raw/*733.54*/("""if($(this).is(":checked")) """),format.raw/*733.81*/("""{"""),format.raw/*733.82*/("""

                                                       """),format.raw/*735.56*/("""var a =  parseInt($("#physiology").val()) + 1000
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*737.56*/("""}"""),format.raw/*737.57*/("""
                                                       """),format.raw/*738.56*/("""else
                                                       """),format.raw/*739.56*/("""{"""),format.raw/*739.57*/("""
                                                           """),format.raw/*740.60*/("""var a =  parseInt($("#physiology").val()) - 1000
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*742.56*/("""}"""),format.raw/*742.57*/("""
                                                     """),format.raw/*743.54*/("""}"""),format.raw/*743.55*/(""");

                                                      $('#Breathing_Thermal').change(function() """),format.raw/*745.97*/("""{"""),format.raw/*745.98*/("""
                                                     """),format.raw/*746.54*/("""if($(this).is(":checked")) """),format.raw/*746.81*/("""{"""),format.raw/*746.82*/("""

                                                       """),format.raw/*748.56*/("""var a =  parseInt($("#physiology").val()) + 10000
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*750.56*/("""}"""),format.raw/*750.57*/("""
                                                       """),format.raw/*751.56*/("""else
                                                       """),format.raw/*752.56*/("""{"""),format.raw/*752.57*/("""
                                                           """),format.raw/*753.60*/("""var a =  parseInt($("#physiology").val()) - 10000
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*755.56*/("""}"""),format.raw/*755.57*/("""
                                                     """),format.raw/*756.54*/("""}"""),format.raw/*756.55*/(""");

                                                      $('#Heart_Rate').change(function() """),format.raw/*758.90*/("""{"""),format.raw/*758.91*/("""
                                                     """),format.raw/*759.54*/("""if($(this).is(":checked")) """),format.raw/*759.81*/("""{"""),format.raw/*759.82*/("""

                                                       """),format.raw/*761.56*/("""var a =  parseInt($("#physiology").val()) + 100000
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*763.56*/("""}"""),format.raw/*763.57*/("""
                                                       """),format.raw/*764.56*/("""else
                                                       """),format.raw/*765.56*/("""{"""),format.raw/*765.57*/("""
                                                           """),format.raw/*766.60*/("""var a =  parseInt($("#physiology").val()) - 100000
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*768.56*/("""}"""),format.raw/*768.57*/("""
                                                     """),format.raw/*769.54*/("""}"""),format.raw/*769.55*/(""");

                                                      $('#Perspiration').change(function() """),format.raw/*771.92*/("""{"""),format.raw/*771.93*/("""
                                                     """),format.raw/*772.54*/("""if($(this).is(":checked")) """),format.raw/*772.81*/("""{"""),format.raw/*772.82*/("""

                                                       """),format.raw/*774.56*/("""var a =  parseInt($("#physiology").val()) + 1000000
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*776.56*/("""}"""),format.raw/*776.57*/("""
                                                       """),format.raw/*777.56*/("""else
                                                       """),format.raw/*778.56*/("""{"""),format.raw/*778.57*/("""
                                                           """),format.raw/*779.60*/("""var a =  parseInt($("#physiology").val()) - 1000000
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*781.56*/("""}"""),format.raw/*781.57*/("""
                                                     """),format.raw/*782.54*/("""}"""),format.raw/*782.55*/(""");

                                                 """),format.raw/*784.50*/("""}"""),format.raw/*784.51*/(""");
                                    </script>


        <input type="hidden" name="physiology" id='physiology' value=0>
        <input type="button" name="previous" class="previous action-button" value="Previous" />
        <input type="button" name="next" class="next action-button" value="Next" />
    </fieldset> -->
    <!--<fieldset>
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
                                                $(document).ready(function()"""),format.raw/*818.77*/("""{"""),format.raw/*818.78*/("""
                                                """),format.raw/*819.49*/("""$('#Accelerometer').change(function() """),format.raw/*819.87*/("""{"""),format.raw/*819.88*/("""
                                                    """),format.raw/*820.53*/("""if($(this).is(":checked")) """),format.raw/*820.80*/("""{"""),format.raw/*820.81*/("""
                                                       """),format.raw/*821.56*/("""var a =  parseInt($("#observation").val()) + 1
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*823.56*/("""}"""),format.raw/*823.57*/("""
                                                       """),format.raw/*824.56*/("""else
                                                       """),format.raw/*825.56*/("""{"""),format.raw/*825.57*/("""
                                                        """),format.raw/*826.57*/("""var a =  parseInt($("#observation").val()) - 1
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*828.56*/("""}"""),format.raw/*828.57*/("""
                                                     """),format.raw/*829.54*/("""}"""),format.raw/*829.55*/(""");

                                                     $('#Obser_other').change(function() """),format.raw/*831.90*/("""{"""),format.raw/*831.91*/("""
                                                     """),format.raw/*832.54*/("""if($(this).is(":checked")) """),format.raw/*832.81*/("""{"""),format.raw/*832.82*/("""
                                                       """),format.raw/*833.56*/("""var a =  parseInt($("#observation").val()) + 10
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*835.56*/("""}"""),format.raw/*835.57*/("""
                                                       """),format.raw/*836.56*/("""else
                                                       """),format.raw/*837.56*/("""{"""),format.raw/*837.57*/("""
                                                         """),format.raw/*838.58*/("""var a =  parseInt($("#observation").val()) - 10
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*840.56*/("""}"""),format.raw/*840.57*/("""
                                                     """),format.raw/*841.54*/("""}"""),format.raw/*841.55*/(""");

                                                      $('#Video_Face').change(function() """),format.raw/*843.90*/("""{"""),format.raw/*843.91*/("""
                                                     """),format.raw/*844.54*/("""if($(this).is(":checked")) """),format.raw/*844.81*/("""{"""),format.raw/*844.82*/("""

                                                       """),format.raw/*846.56*/("""var a =  parseInt($("#observation").val()) + 100
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*848.56*/("""}"""),format.raw/*848.57*/("""
                                                       """),format.raw/*849.56*/("""else
                                                       """),format.raw/*850.56*/("""{"""),format.raw/*850.57*/("""
                                                           """),format.raw/*851.60*/("""var a =  parseInt($("#observation").val()) - 100
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*853.56*/("""}"""),format.raw/*853.57*/("""
                                                     """),format.raw/*854.54*/("""}"""),format.raw/*854.55*/(""");

                                                      $('#Video_Room').change(function() """),format.raw/*856.90*/("""{"""),format.raw/*856.91*/("""
                                                     """),format.raw/*857.54*/("""if($(this).is(":checked")) """),format.raw/*857.81*/("""{"""),format.raw/*857.82*/("""

                                                       """),format.raw/*859.56*/("""var a =  parseInt($("#observation").val()) + 1000
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*861.56*/("""}"""),format.raw/*861.57*/("""
                                                       """),format.raw/*862.56*/("""else
                                                       """),format.raw/*863.56*/("""{"""),format.raw/*863.57*/("""
                                                           """),format.raw/*864.60*/("""var a =  parseInt($("#observation").val()) - 1000
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*866.56*/("""}"""),format.raw/*866.57*/("""
                                                     """),format.raw/*867.54*/("""}"""),format.raw/*867.55*/(""");

                                                      $('#Video_Theater').change(function() """),format.raw/*869.93*/("""{"""),format.raw/*869.94*/("""
                                                     """),format.raw/*870.54*/("""if($(this).is(":checked")) """),format.raw/*870.81*/("""{"""),format.raw/*870.82*/("""

                                                       """),format.raw/*872.56*/("""var a =  parseInt($("#observation").val()) + 10000
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*874.56*/("""}"""),format.raw/*874.57*/("""
                                                       """),format.raw/*875.56*/("""else
                                                       """),format.raw/*876.56*/("""{"""),format.raw/*876.57*/("""
                                                           """),format.raw/*877.60*/("""var a =  parseInt($("#observation").val()) - 10000
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*879.56*/("""}"""),format.raw/*879.57*/("""
                                                     """),format.raw/*880.54*/("""}"""),format.raw/*880.55*/(""");

                                                      $('#FACS').change(function() """),format.raw/*882.84*/("""{"""),format.raw/*882.85*/("""
                                                     """),format.raw/*883.54*/("""if($(this).is(":checked")) """),format.raw/*883.81*/("""{"""),format.raw/*883.82*/("""

                                                       """),format.raw/*885.56*/("""var a =  parseInt($("#observation").val()) + 100000
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*887.56*/("""}"""),format.raw/*887.57*/("""
                                                       """),format.raw/*888.56*/("""else
                                                       """),format.raw/*889.56*/("""{"""),format.raw/*889.57*/("""
                                                           """),format.raw/*890.60*/("""var a =  parseInt($("#observation").val()) - 100000
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*892.56*/("""}"""),format.raw/*892.57*/("""
                                                     """),format.raw/*893.54*/("""}"""),format.raw/*893.55*/(""");

                                                      $('#Obser2d_other').change(function() """),format.raw/*895.93*/("""{"""),format.raw/*895.94*/("""
                                                     """),format.raw/*896.54*/("""if($(this).is(":checked")) """),format.raw/*896.81*/("""{"""),format.raw/*896.82*/("""

                                                       """),format.raw/*898.56*/("""var a =  parseInt($("#observation").val()) + 1000000
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*900.56*/("""}"""),format.raw/*900.57*/("""
                                                       """),format.raw/*901.56*/("""else
                                                       """),format.raw/*902.56*/("""{"""),format.raw/*902.57*/("""
                                                           """),format.raw/*903.60*/("""var a =  parseInt($("#observation").val()) - 1000000
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*905.56*/("""}"""),format.raw/*905.57*/("""
                                                     """),format.raw/*906.54*/("""}"""),format.raw/*906.55*/(""");

                                                 """),format.raw/*908.50*/("""}"""),format.raw/*908.51*/(""");
                                    </script>

        <input type="hidden" name="observation" id='observation' value=0>
        <input type="button" name="previous" class="previous action-button" value="Previous" />
        <input type="button" name="next" class="next action-button" value="Next" />
    </fieldset> -->
    <!--<fieldset>
        <h2 class="fs-title">Performance</h2>
        <h3 class="fs-subtitle"></h3>
        <input type="text" name="Perfro_name" placeholder="Performance Name" />
        <input type="text" name="Per_min" placeholder="Min" />
        <input type="text" name="Per_mix" placeholder="Max" />
        <input type="button" name="Add" class="next" value="Add" />
        <input type="button" name="previous" class="previous action-button" value="Previous" />
        <input type="submit" name="submit" class="submit action-button" value="Submit" id="createStudy"/>

    </fieldset> -->
    </br></br></br></br></br></br></br></br></br></br></br></br></br></br></br></br></br></br></br></br></br></br></br></br></br></br>
    """)))}),format.raw/*927.6*/("""
    """),format.raw/*928.5*/("""</form>

    </div>



</div><!--/.main-->

 <div id="loading" style="display:none; position: fixed;height:100%; width:100%; background: rgba( 255, 255, 255, .8 ) url('/assets/images/ajax-loader.gif') 50% 50%    no-repeat;">
     <p> Please wait, study is being created </p>
 </div>

<script>
    var wsUri = """"),_display_(/*941.19*/routes/*941.25*/.Application.socket.webSocketURL()),format.raw/*941.59*/("""";
    var userName = """"),_display_(/*942.22*/userName),format.raw/*942.30*/(""""



</script>



</body>

</html>
"""))}
  }

  def render(userName:String,explVar:List[scala.Tuple3[String, Int, Int]],request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(userName,explVar)(request)

  def f:((String,List[scala.Tuple3[String, Int, Int]]) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (userName,explVar) => (request) => apply(userName,explVar)(request)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Apr 01 18:31:40 CDT 2016
                  SOURCE: C:/first_play/app/views/ShowCreateStudy.scala.html
                  HASH: fc00b5b9cddecabc949817f2984e539142556027
                  MATRIX: 566->1|756->88|784->108|893->190|921->191|963->205|1252->467|1281->468|1320->480|2516->1649|2531->1655|2596->1699|2677->1753|2692->1759|2757->1803|4007->3025|4037->3033|4067->3034|6069->5009|6085->5015|6198->5117|6240->5119|6278->5129|12319->11142|12371->11184|12412->11186|12467->11212|12654->11367|12705->11389|15746->14402|15783->14422|15823->14423|15882->14454|15909->14471|15950->14473|16010->14504|16062->14528|16076->14532|16101->14535|16132->14537|16183->14560|16197->14564|16222->14567|16252->14568|16324->14608|16387->14639|16442->14665|17061->15256|17098->15276|17138->15277|17205->15316|17232->15333|17273->15335|17340->15373|17412->15417|17426->15421|17451->15424|17527->15471|17542->15475|17568->15478|17649->15527|17720->15566|17783->15600|18180->15969|18217->15989|18257->15990|18316->16021|18342->16037|18383->16039|18442->16069|18495->16094|18509->16098|18534->16101|18567->16106|18581->16110|18606->16113|18678->16153|18741->16184|18800->16214|19198->16584|19235->16604|19275->16605|19334->16636|19360->16652|19401->16654|19460->16684|19513->16709|19527->16713|19552->16716|19586->16722|19600->16726|19625->16729|19697->16769|19760->16800|19819->16830|20753->17736|20790->17756|20830->17757|20893->17792|20919->17808|20960->17810|21023->17844|21075->17868|21089->17872|21114->17875|21145->17877|21196->17900|21210->17904|21235->17907|21265->17908|21341->17952|21404->17983|21461->18011|22308->18830|22345->18850|22385->18851|22452->18890|22479->18907|22520->18909|22587->18947|22661->18993|22675->18997|22700->19000|22776->19047|22791->19051|22817->19054|22897->19102|22968->19141|23031->19175|23980->20096|24017->20116|24057->20117|24116->20148|24143->20165|24184->20167|24243->20197|24295->20221|24309->20225|24334->20228|24365->20230|24416->20253|24430->20257|24455->20260|24527->20300|24590->20331|24649->20361|25823->21506|25853->21507|25904->21529|25966->21562|25996->21563|26047->21585|26103->21612|26133->21613|26191->21642|26269->21691|26299->21692|26357->21721|26419->21754|26449->21755|26508->21785|26586->21834|26616->21835|26672->21862|26702->21863|26793->21925|26823->21926|26874->21948|26930->21975|26960->21976|27018->22005|27098->22056|27128->22057|27186->22086|27248->22119|27278->22120|27337->22150|27417->22201|27447->22202|27503->22229|27533->22230|27614->22282|27644->22283|27699->22309|27755->22336|27785->22337|27843->22366|27995->22489|28025->22490|28083->22519|28145->22552|28175->22553|28234->22583|28386->22706|28416->22707|28472->22734|28502->22735|28593->22797|28623->22798|28679->22825|28735->22852|28765->22853|28825->22884|28978->23008|29008->23009|29066->23038|29128->23071|29158->23072|29218->23103|29371->23227|29401->23228|29457->23255|29487->23256|29579->23319|29609->23320|29665->23347|29721->23374|29751->23375|29811->23406|29965->23531|29995->23532|30053->23561|30115->23594|30145->23595|30207->23628|30361->23753|30391->23754|30447->23781|30477->23782|30569->23845|30599->23846|30655->23873|30711->23900|30741->23901|30801->23932|30956->24058|30986->24059|31044->24088|31106->24121|31136->24122|31198->24155|31353->24281|31383->24282|31439->24309|31469->24310|31564->24376|31594->24377|31650->24404|31706->24431|31736->24432|31796->24463|31952->24590|31982->24591|32040->24620|32102->24653|32132->24654|32194->24687|32350->24814|32380->24815|32436->24842|32466->24843|32561->24909|32591->24910|32647->24937|32703->24964|32733->24965|32793->24996|32950->25124|32980->25125|33038->25154|33100->25187|33130->25188|33192->25221|33349->25349|33379->25350|33435->25377|33465->25378|33521->25405|33551->25406|35316->27142|35346->27143|35429->27197|35486->27225|35516->27226|35599->27280|35655->27307|35685->27308|35771->27365|35999->27564|36029->27565|36115->27622|36205->27683|36235->27684|36322->27742|36550->27941|36580->27942|36664->27997|36694->27998|36810->28085|36840->28086|36924->28141|36980->28168|37010->28169|37096->28226|37325->28426|37355->28427|37441->28484|37531->28545|37561->28546|37649->28605|37878->28805|37908->28806|37992->28861|38022->28862|38138->28949|38168->28950|38252->29005|38308->29032|38338->29033|38426->29092|38656->29293|38686->29294|38772->29351|38862->29412|38892->29413|38982->29474|39212->29675|39242->29676|39326->29731|39356->29732|39472->29819|39502->29820|39586->29875|39642->29902|39672->29903|39760->29962|39991->30164|40021->30165|40107->30222|40197->30283|40227->30284|40317->30345|40548->30547|40578->30548|40662->30603|40692->30604|40817->30700|40847->30701|40931->30756|40987->30783|41017->30784|41105->30843|41337->31046|41367->31047|41453->31104|41543->31165|41573->31166|41663->31227|41895->31430|41925->31431|42009->31486|42039->31487|42123->31542|42153->31543|44415->33776|44445->33777|44524->33827|44581->33855|44611->33856|44694->33910|44750->33937|44780->33938|44866->33995|45090->34190|45120->34191|45206->34248|45296->34309|45326->34310|45413->34368|45637->34563|45667->34564|45751->34619|45781->34620|45900->34710|45930->34711|46014->34766|46070->34793|46100->34794|46186->34851|46411->35047|46441->35048|46527->35105|46617->35166|46647->35167|46735->35226|46960->35422|46990->35423|47074->35478|47104->35479|47228->35574|47258->35575|47342->35630|47398->35657|47428->35658|47516->35717|47742->35914|47772->35915|47858->35972|47948->36033|47978->36034|48068->36095|48294->36292|48324->36293|48408->36348|48438->36349|48566->36448|48596->36449|48680->36504|48736->36531|48766->36532|48854->36591|49081->36789|49111->36790|49197->36847|49287->36908|49317->36909|49407->36970|49634->37168|49664->37169|49748->37224|49778->37225|49909->37327|49939->37328|50023->37383|50079->37410|50109->37411|50197->37470|50425->37669|50455->37670|50541->37727|50631->37788|50661->37789|50751->37850|50979->38049|51009->38050|51093->38105|51123->38106|51247->38201|51277->38202|51361->38257|51417->38284|51447->38285|51535->38344|51764->38544|51794->38545|51880->38602|51970->38663|52000->38664|52090->38725|52319->38925|52349->38926|52433->38981|52463->38982|52589->39079|52619->39080|52703->39135|52759->39162|52789->39163|52877->39222|53107->39423|53137->39424|53223->39481|53313->39542|53343->39543|53433->39604|53663->39805|53693->39806|53777->39861|53807->39862|53891->39917|53921->39918|56023->41991|56053->41992|56132->42042|56199->42080|56229->42081|56312->42135|56368->42162|56398->42163|56484->42220|56710->42417|56740->42418|56826->42475|56916->42536|56946->42537|57033->42595|57259->42792|57289->42793|57373->42848|57403->42849|57527->42944|57557->42945|57641->43000|57697->43027|57727->43028|57813->43085|58040->43283|58070->43284|58156->43341|58246->43402|58276->43403|58364->43462|58591->43660|58621->43661|58705->43716|58735->43717|58859->43812|58889->43813|58973->43868|59029->43895|59059->43896|59147->43955|59375->44154|59405->44155|59491->44212|59581->44273|59611->44274|59701->44335|59929->44534|59959->44535|60043->44590|60073->44591|60197->44686|60227->44687|60311->44742|60367->44769|60397->44770|60485->44829|60714->45029|60744->45030|60830->45087|60920->45148|60950->45149|61040->45210|61269->45410|61299->45411|61383->45466|61413->45467|61540->45565|61570->45566|61654->45621|61710->45648|61740->45649|61828->45708|62058->45909|62088->45910|62174->45967|62264->46028|62294->46029|62384->46090|62614->46291|62644->46292|62728->46347|62758->46348|62876->46437|62906->46438|62990->46493|63046->46520|63076->46521|63164->46580|63395->46782|63425->46783|63511->46840|63601->46901|63631->46902|63721->46963|63952->47165|63982->47166|64066->47221|64096->47222|64223->47320|64253->47321|64337->47376|64393->47403|64423->47404|64511->47463|64743->47666|64773->47667|64859->47724|64949->47785|64979->47786|65069->47847|65301->48050|65331->48051|65415->48106|65445->48107|65529->48162|65559->48163|66673->49246|66707->49252|67059->49576|67075->49582|67131->49616|67184->49641|67214->49649
                  LINES: 19->1|22->1|23->3|29->9|29->9|30->10|38->18|38->18|42->22|64->44|64->44|64->44|65->45|65->45|65->45|86->66|86->66|86->66|141->121|141->121|141->121|141->121|142->122|287->267|287->267|287->267|288->268|289->269|290->270|350->330|350->330|350->330|351->331|351->331|351->331|352->332|352->332|352->332|352->332|352->332|352->332|352->332|352->332|352->332|353->333|354->334|355->335|366->346|366->346|366->346|367->347|367->347|367->347|368->348|368->348|368->348|368->348|368->348|368->348|368->348|369->349|370->350|371->351|383->363|383->363|383->363|384->364|384->364|384->364|385->365|385->365|385->365|385->365|385->365|385->365|385->365|386->366|387->367|388->368|398->378|398->378|398->378|399->379|399->379|399->379|400->380|400->380|400->380|400->380|400->380|400->380|400->380|401->381|402->382|403->383|422->402|422->402|422->402|423->403|423->403|423->403|424->404|424->404|424->404|424->404|424->404|424->404|424->404|424->404|424->404|425->405|426->406|428->408|442->422|442->422|442->422|443->423|443->423|443->423|444->424|444->424|444->424|444->424|444->424|444->424|444->424|445->425|446->426|447->427|471->451|471->451|471->451|472->452|472->452|472->452|473->453|473->453|473->453|473->453|473->453|473->453|473->453|473->453|474->454|475->455|476->456|495->475|495->475|496->476|496->476|496->476|497->477|497->477|497->477|498->478|499->479|499->479|500->480|501->481|501->481|502->482|503->483|503->483|504->484|504->484|505->485|505->485|506->486|506->486|506->486|507->487|508->488|508->488|509->489|510->490|510->490|511->491|512->492|512->492|513->493|513->493|514->494|514->494|515->495|515->495|515->495|516->496|518->498|518->498|519->499|520->500|520->500|521->501|523->503|523->503|524->504|524->504|526->506|526->506|527->507|527->507|527->507|528->508|530->510|530->510|531->511|532->512|532->512|533->513|535->515|535->515|536->516|536->516|538->518|538->518|539->519|539->519|539->519|541->521|543->523|543->523|544->524|545->525|545->525|546->526|548->528|548->528|549->529|549->529|551->531|551->531|552->532|552->532|552->532|554->534|556->536|556->536|557->537|558->538|558->538|559->539|561->541|561->541|562->542|562->542|564->544|564->544|565->545|565->545|565->545|567->547|569->549|569->549|570->550|571->551|571->551|572->552|574->554|574->554|575->555|575->555|577->557|577->557|578->558|578->558|578->558|580->560|582->562|582->562|583->563|584->564|584->564|585->565|587->567|587->567|588->568|588->568|590->570|590->570|619->599|619->599|620->600|620->600|620->600|621->601|621->601|621->601|622->602|624->604|624->604|625->605|626->606|626->606|627->607|629->609|629->609|630->610|630->610|632->612|632->612|633->613|633->613|633->613|634->614|636->616|636->616|637->617|638->618|638->618|639->619|641->621|641->621|642->622|642->622|644->624|644->624|645->625|645->625|645->625|647->627|649->629|649->629|650->630|651->631|651->631|652->632|654->634|654->634|655->635|655->635|657->637|657->637|658->638|658->638|658->638|660->640|662->642|662->642|663->643|664->644|664->644|665->645|667->647|667->647|668->648|668->648|670->650|670->650|671->651|671->651|671->651|673->653|675->655|675->655|676->656|677->657|677->657|678->658|680->660|680->660|681->661|681->661|683->663|683->663|714->694|714->694|715->695|715->695|715->695|716->696|716->696|716->696|717->697|719->699|719->699|720->700|721->701|721->701|722->702|724->704|724->704|725->705|725->705|727->707|727->707|728->708|728->708|728->708|729->709|731->711|731->711|732->712|733->713|733->713|734->714|736->716|736->716|737->717|737->717|739->719|739->719|740->720|740->720|740->720|742->722|744->724|744->724|745->725|746->726|746->726|747->727|749->729|749->729|750->730|750->730|752->732|752->732|753->733|753->733|753->733|755->735|757->737|757->737|758->738|759->739|759->739|760->740|762->742|762->742|763->743|763->743|765->745|765->745|766->746|766->746|766->746|768->748|770->750|770->750|771->751|772->752|772->752|773->753|775->755|775->755|776->756|776->756|778->758|778->758|779->759|779->759|779->759|781->761|783->763|783->763|784->764|785->765|785->765|786->766|788->768|788->768|789->769|789->769|791->771|791->771|792->772|792->772|792->772|794->774|796->776|796->776|797->777|798->778|798->778|799->779|801->781|801->781|802->782|802->782|804->784|804->784|838->818|838->818|839->819|839->819|839->819|840->820|840->820|840->820|841->821|843->823|843->823|844->824|845->825|845->825|846->826|848->828|848->828|849->829|849->829|851->831|851->831|852->832|852->832|852->832|853->833|855->835|855->835|856->836|857->837|857->837|858->838|860->840|860->840|861->841|861->841|863->843|863->843|864->844|864->844|864->844|866->846|868->848|868->848|869->849|870->850|870->850|871->851|873->853|873->853|874->854|874->854|876->856|876->856|877->857|877->857|877->857|879->859|881->861|881->861|882->862|883->863|883->863|884->864|886->866|886->866|887->867|887->867|889->869|889->869|890->870|890->870|890->870|892->872|894->874|894->874|895->875|896->876|896->876|897->877|899->879|899->879|900->880|900->880|902->882|902->882|903->883|903->883|903->883|905->885|907->887|907->887|908->888|909->889|909->889|910->890|912->892|912->892|913->893|913->893|915->895|915->895|916->896|916->896|916->896|918->898|920->900|920->900|921->901|922->902|922->902|923->903|925->905|925->905|926->906|926->906|928->908|928->908|947->927|948->928|961->941|961->941|961->941|962->942|962->942
                  -- GENERATED --
              */
          