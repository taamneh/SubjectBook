
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
object ShowCreateStudy extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,List[scala.Tuple3[Option[String], Int, Int]],RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userName: String, explVar : List[(Option[String], Int, Int)])(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.97*/("""
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

        <fieldset  style="width: 700px;">
            <h2 class="fs-title">Experimental Design</h2>
            <h3 class="fs-subtitle"></h3>
            <table id="zob" cellspacing="0" class="data_table" id="add_sessions_table">


                <input type="hidden" name="code" id= "code" value=" ">
                <input type="hidden" name="studyId"  value="1">

                    <label>How many unique sessions your study has? </label>
                    <input type="number" class="form-control"  name="pName", id = "noVar">




                    <label>How many treatem arms this study has? </label>
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
                <td id = "kareem3"><input type="checkbox" id="quickCreation" name="quickCreation" value=1 style="width: 20px">Quick &nbsp;&nbsp;&nbsp;<br> </td>
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
                    <td class="cell_1">Key Explanatory Variable:</td>
                    <td>
                        <select class="select_field"  id="explanatoryPrim" name="study_type"  style="width: 300px" required>
                            """),_display_(/*331.30*/for(temp <- explVar) yield /*331.50*/{_display_(Seq[Any](format.raw/*331.51*/("""
                            """),_display_(/*332.30*/if(temp._3 == 1 )/*332.47*/ {_display_(Seq[Any](format.raw/*332.49*/("""
                             """),format.raw/*333.30*/("""<option id="op1" value="""),_display_(/*333.54*/temp/*333.58*/._2),format.raw/*333.61*/("""  """),format.raw/*333.63*/("""selected ="selected"> """),_display_(/*333.86*/temp/*333.90*/._1),format.raw/*333.93*/(""" """),format.raw/*333.94*/("""</option>
                            """)))}),format.raw/*334.30*/("""
                            """)))}),format.raw/*335.30*/("""
                        """),format.raw/*336.25*/("""</select>
                    </td>
                </tr>

                <tr>
                    <td class="cell_1">Backup Key Explanatory Variables:</td>
                    <td>
                        <select class="select_field"  id="explanatoryPrimBackUp" name="study_type"  style="width: 300px" required>
                            """),_display_(/*344.30*/for(temp <- explVar) yield /*344.50*/{_display_(Seq[Any](format.raw/*344.51*/("""
                            """),_display_(/*345.30*/if(temp._3 == 1 )/*345.47*/ {_display_(Seq[Any](format.raw/*345.49*/("""
                            """),format.raw/*346.29*/("""<option id="op3" value="""),_display_(/*346.53*/temp/*346.57*/._2),format.raw/*346.60*/("""  """),format.raw/*346.62*/("""selected ="selected"> """),_display_(/*346.85*/temp/*346.89*/._1),format.raw/*346.92*/(""" """),format.raw/*346.93*/("""</option>
                            """)))}),format.raw/*347.30*/("""
                            """)))}),format.raw/*348.30*/("""
                        """),format.raw/*349.25*/("""</select>
                    </td>
                </tr>
                <tr>
                    <td class="cell_1">Secondary Explanatory Variables</td>
                    <td>

                        <div class="col-lg-12">
                            <div class="button-group">
                                <button type="button" style="width: 300px" class="btn btn-default btn-sm dropdown-toggle" data-toggle="dropdown"> Select Variables <span class="caret"></span></button>
                                <ul class="dropdown-menu">
                                    """),_display_(/*360.38*/for(temp <- explVar) yield /*360.58*/{_display_(Seq[Any](format.raw/*360.59*/("""
                                    """),_display_(/*361.38*/if(temp._3 == 1 )/*361.55*/ {_display_(Seq[Any](format.raw/*361.57*/("""
                                    """),format.raw/*362.37*/("""<li><a href="#" class="small1" data-value=""""),_display_(/*362.81*/temp/*362.85*/._2),format.raw/*362.88*/("""" tabIndex="-1"><input type="checkbox"/>&nbsp;"""),_display_(/*362.135*/temp/*362.139*/._1),format.raw/*362.142*/("""</a></li>
                                     """)))}),format.raw/*363.39*/("""
                                    """)))}),format.raw/*364.38*/("""
                                """),format.raw/*365.33*/("""</ul>
                            </div>
                        </div>

                    </td>

                </tr>
                <tr>
                    <td class="cell_1">Static Data Before Sessions</td>
                    <td>
                        <select class="select_field"  id="staticB" name="study_type" >

                            """),_display_(/*377.30*/for(temp <- explVar) yield /*377.50*/{_display_(Seq[Any](format.raw/*377.51*/("""
                            """),_display_(/*378.30*/if(temp._3 == 4)/*378.46*/ {_display_(Seq[Any](format.raw/*378.48*/("""
                            """),format.raw/*379.29*/("""<option id="op1" value=""""),_display_(/*379.54*/temp/*379.58*/._2),format.raw/*379.61*/("""" > """),_display_(/*379.66*/temp/*379.70*/._1),format.raw/*379.73*/("""</option>
                            """)))}),format.raw/*380.30*/("""
                            """)))}),format.raw/*381.30*/("""
                            """),format.raw/*382.29*/("""<option id="op1" value=-1 > none </option>
                        </select>

                    </td>

                </tr>
                <tr>
                    <td class="cell_1">Static Data After Sessions</td>
                    <td>
                        <select class="select_field"  id="staticA" name="study_type" >
                            """),_display_(/*392.30*/for(temp <- explVar) yield /*392.50*/{_display_(Seq[Any](format.raw/*392.51*/("""
                            """),_display_(/*393.30*/if(temp._3 == 4)/*393.46*/ {_display_(Seq[Any](format.raw/*393.48*/("""
                            """),format.raw/*394.29*/("""<option id="op1" value=""""),_display_(/*394.54*/temp/*394.58*/._2),format.raw/*394.61*/(""""  > """),_display_(/*394.67*/temp/*394.71*/._1),format.raw/*394.74*/("""</option>
                            """)))}),format.raw/*395.30*/("""
                            """)))}),format.raw/*396.30*/("""
                            """),format.raw/*397.29*/("""<option id="op1" value=-1 > none </option>
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
                            """),_display_(/*416.30*/for(temp <- explVar) yield /*416.50*/{_display_(Seq[Any](format.raw/*416.51*/("""
                                """),_display_(/*417.34*/if(temp._3 == 1)/*417.50*/ {_display_(Seq[Any](format.raw/*417.52*/("""
                                """),format.raw/*418.33*/("""<option id="op1" value="""),_display_(/*418.57*/temp/*418.61*/._2),format.raw/*418.64*/("""  """),format.raw/*418.66*/("""selected ="selected"> """),_display_(/*418.89*/temp/*418.93*/._1),format.raw/*418.96*/(""" """),format.raw/*418.97*/("""</option>
                                """)))}),format.raw/*419.34*/("""
                            """)))}),format.raw/*420.30*/("""

                        """),format.raw/*422.25*/("""</select>
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
                                    """),_display_(/*436.38*/for(temp <- explVar) yield /*436.58*/{_display_(Seq[Any](format.raw/*436.59*/("""
                                    """),_display_(/*437.38*/if(temp._3 == 1 )/*437.55*/ {_display_(Seq[Any](format.raw/*437.57*/("""
                                    """),format.raw/*438.37*/("""<li><a href="#"   class="small2" data-value=""""),_display_(/*438.83*/temp/*438.87*/._2),format.raw/*438.90*/("""" tabIndex="-1"><input type="checkbox"/>&nbsp;"""),_display_(/*438.137*/temp/*438.141*/._1),format.raw/*438.144*/("""</a></li>
                                    """)))}),format.raw/*439.38*/("""
                                    """)))}),format.raw/*440.38*/("""
                                """),format.raw/*441.33*/("""</ul>
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
                            """),_display_(/*465.30*/for(temp <- explVar) yield /*465.50*/{_display_(Seq[Any](format.raw/*465.51*/("""
                            """),_display_(/*466.30*/if(temp._3 == 3 )/*466.47*/ {_display_(Seq[Any](format.raw/*466.49*/("""
                            """),format.raw/*467.29*/("""<option id="op1" value="""),_display_(/*467.53*/temp/*467.57*/._2),format.raw/*467.60*/("""  """),format.raw/*467.62*/("""selected ="selected"> """),_display_(/*467.85*/temp/*467.89*/._1),format.raw/*467.92*/("""</option>
                            """)))}),format.raw/*468.30*/("""
                            """)))}),format.raw/*469.30*/("""
                            """),format.raw/*470.29*/("""<option id="op1" value=-1 > none </option>
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
                    $(document).ready(function()"""),format.raw/*489.49*/("""{"""),format.raw/*489.50*/("""
                    """),format.raw/*490.21*/("""$('#publicCh').change(function() """),format.raw/*490.54*/("""{"""),format.raw/*490.55*/("""
                    """),format.raw/*491.21*/("""if($(this).is(":checked")) """),format.raw/*491.48*/("""{"""),format.raw/*491.49*/("""
                           """),format.raw/*492.28*/("""$("#public").val(1);
                           """),format.raw/*493.28*/("""}"""),format.raw/*493.29*/("""
                           """),format.raw/*494.28*/("""else
                           """),format.raw/*495.28*/("""{"""),format.raw/*495.29*/("""
                            """),format.raw/*496.29*/("""$("#public").val(0);
                           """),format.raw/*497.28*/("""}"""),format.raw/*497.29*/("""
                         """),format.raw/*498.26*/("""}"""),format.raw/*498.27*/(""");
                       $('#portraitCh').change(function() """),format.raw/*499.59*/("""{"""),format.raw/*499.60*/("""
                    """),format.raw/*500.21*/("""if($(this).is(":checked")) """),format.raw/*500.48*/("""{"""),format.raw/*500.49*/("""
                           """),format.raw/*501.28*/("""$("#portrait").val(1);
                           """),format.raw/*502.28*/("""}"""),format.raw/*502.29*/("""
                           """),format.raw/*503.28*/("""else
                           """),format.raw/*504.28*/("""{"""),format.raw/*504.29*/("""
                            """),format.raw/*505.29*/("""$("#portrait").val(0);
                           """),format.raw/*506.28*/("""}"""),format.raw/*506.29*/("""
                         """),format.raw/*507.26*/("""}"""),format.raw/*507.27*/(""");
                    $('#Age').change(function() """),format.raw/*508.49*/("""{"""),format.raw/*508.50*/("""
                        """),format.raw/*509.25*/("""if($(this).is(":checked")) """),format.raw/*509.52*/("""{"""),format.raw/*509.53*/("""
                           """),format.raw/*510.28*/("""var a =  parseInt($("#ir").val()) + 1
                           $("#ir").val(a.toString() );
                           """),format.raw/*512.28*/("""}"""),format.raw/*512.29*/("""
                           """),format.raw/*513.28*/("""else
                           """),format.raw/*514.28*/("""{"""),format.raw/*514.29*/("""
                            """),format.raw/*515.29*/("""var a =  parseInt($("#ir").val()) - 1
                           $("#ir").val(a.toString() );
                           """),format.raw/*517.28*/("""}"""),format.raw/*517.29*/("""
                         """),format.raw/*518.26*/("""}"""),format.raw/*518.27*/(""");

                         $('#Height').change(function() """),format.raw/*520.57*/("""{"""),format.raw/*520.58*/("""
                         """),format.raw/*521.26*/("""if($(this).is(":checked")) """),format.raw/*521.53*/("""{"""),format.raw/*521.54*/("""
                             """),format.raw/*522.30*/("""var a =  parseInt($("#ir").val()) + 10
                           $("#ir").val(a.toString() );
                           """),format.raw/*524.28*/("""}"""),format.raw/*524.29*/("""
                           """),format.raw/*525.28*/("""else
                           """),format.raw/*526.28*/("""{"""),format.raw/*526.29*/("""
                             """),format.raw/*527.30*/("""var a =  parseInt($("#ir").val()) - 10
                           $("#ir").val(a.toString() );
                           """),format.raw/*529.28*/("""}"""),format.raw/*529.29*/("""
                         """),format.raw/*530.26*/("""}"""),format.raw/*530.27*/(""");

                          $('#Weight').change(function() """),format.raw/*532.58*/("""{"""),format.raw/*532.59*/("""
                         """),format.raw/*533.26*/("""if($(this).is(":checked")) """),format.raw/*533.53*/("""{"""),format.raw/*533.54*/("""

                           """),format.raw/*535.28*/("""var a =  parseInt($("#ir").val()) + 100
                           $("#ir").val(a.toString() );
                           """),format.raw/*537.28*/("""}"""),format.raw/*537.29*/("""
                           """),format.raw/*538.28*/("""else
                           """),format.raw/*539.28*/("""{"""),format.raw/*539.29*/("""
                               """),format.raw/*540.32*/("""var a =  parseInt($("#ir").val()) - 100
                           $("#ir").val(a.toString() );
                           """),format.raw/*542.28*/("""}"""),format.raw/*542.29*/("""
                         """),format.raw/*543.26*/("""}"""),format.raw/*543.27*/(""");

                          $('#Gender').change(function() """),format.raw/*545.58*/("""{"""),format.raw/*545.59*/("""
                         """),format.raw/*546.26*/("""if($(this).is(":checked")) """),format.raw/*546.53*/("""{"""),format.raw/*546.54*/("""

                           """),format.raw/*548.28*/("""var a =  parseInt($("#ir").val()) + 1000
                           $("#ir").val(a.toString() );
                           """),format.raw/*550.28*/("""}"""),format.raw/*550.29*/("""
                           """),format.raw/*551.28*/("""else
                           """),format.raw/*552.28*/("""{"""),format.raw/*552.29*/("""
                               """),format.raw/*553.32*/("""var a =  parseInt($("#ir").val()) - 1000
                           $("#ir").val(a.toString() );
                           """),format.raw/*555.28*/("""}"""),format.raw/*555.29*/("""
                         """),format.raw/*556.26*/("""}"""),format.raw/*556.27*/(""");

                          $('#Ethnicity').change(function() """),format.raw/*558.61*/("""{"""),format.raw/*558.62*/("""
                         """),format.raw/*559.26*/("""if($(this).is(":checked")) """),format.raw/*559.53*/("""{"""),format.raw/*559.54*/("""

                           """),format.raw/*561.28*/("""var a =  parseInt($("#ir").val()) + 10000
                           $("#ir").val(a.toString() );
                           """),format.raw/*563.28*/("""}"""),format.raw/*563.29*/("""
                           """),format.raw/*564.28*/("""else
                           """),format.raw/*565.28*/("""{"""),format.raw/*565.29*/("""
                               """),format.raw/*566.32*/("""var a =  parseInt($("#ir").val()) - 10000
                           $("#ir").val(a.toString() );
                           """),format.raw/*568.28*/("""}"""),format.raw/*568.29*/("""
                         """),format.raw/*569.26*/("""}"""),format.raw/*569.27*/(""");

                          $('#Bio_other').change(function() """),format.raw/*571.61*/("""{"""),format.raw/*571.62*/("""
                         """),format.raw/*572.26*/("""if($(this).is(":checked")) """),format.raw/*572.53*/("""{"""),format.raw/*572.54*/("""

                           """),format.raw/*574.28*/("""var a =  parseInt($("#ir").val()) + 100000
                           $("#ir").val(a.toString() );
                           """),format.raw/*576.28*/("""}"""),format.raw/*576.29*/("""
                           """),format.raw/*577.28*/("""else
                           """),format.raw/*578.28*/("""{"""),format.raw/*578.29*/("""
                               """),format.raw/*579.32*/("""var a =  parseInt($("#ir").val()) - 100000
                           $("#ir").val(a.toString() );
                           """),format.raw/*581.28*/("""}"""),format.raw/*581.29*/("""
                         """),format.raw/*582.26*/("""}"""),format.raw/*582.27*/(""");

                     """),format.raw/*584.22*/("""}"""),format.raw/*584.23*/(""");
                                        </script>
            <input type="hidden" name="bio" id='ir' value=0>

            <input type="button" name="previous" class="previous action-button" value="Previous" />
           <!-- <input type="button" name="next" class="next action-button" value="Next" /> -->
            <input type="submit" id="sb" name="submit" class="submit action-button" value="Submit" id="createStudy"/>
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
                                                $(document).ready(function()"""),format.raw/*613.77*/("""{"""),format.raw/*613.78*/("""
                                                    """),format.raw/*614.53*/("""$('#SAI').change(function() """),format.raw/*614.81*/("""{"""),format.raw/*614.82*/("""
                                                    """),format.raw/*615.53*/("""if($(this).is(":checked")) """),format.raw/*615.80*/("""{"""),format.raw/*615.81*/("""
                                                       """),format.raw/*616.56*/("""var a =  parseInt($("#Psychometric").val()) + 1
                                                       $("#Psychometric").val(a.toString() );
                                                       """),format.raw/*618.56*/("""}"""),format.raw/*618.57*/("""
                                                       """),format.raw/*619.56*/("""else
                                                       """),format.raw/*620.56*/("""{"""),format.raw/*620.57*/("""
                                                        """),format.raw/*621.57*/("""var a =  parseInt($("#Psychometric").val()) - 1
                                                       $("#Psychometric").val(a.toString() );
                                                       """),format.raw/*623.56*/("""}"""),format.raw/*623.57*/("""
                                                     """),format.raw/*624.54*/("""}"""),format.raw/*624.55*/(""");

                                                     $('#TAI').change(function() """),format.raw/*626.82*/("""{"""),format.raw/*626.83*/("""
                                                     """),format.raw/*627.54*/("""if($(this).is(":checked")) """),format.raw/*627.81*/("""{"""),format.raw/*627.82*/("""
                                                       """),format.raw/*628.56*/("""var a =  parseInt($("#Psychometric").val()) + 10
                                                       $("#Psychometric").val(a.toString() );
                                                       """),format.raw/*630.56*/("""}"""),format.raw/*630.57*/("""
                                                       """),format.raw/*631.56*/("""else
                                                       """),format.raw/*632.56*/("""{"""),format.raw/*632.57*/("""
                                                         """),format.raw/*633.58*/("""var a =  parseInt($("#Psychometric").val()) - 10
                                                       $("#Psychometric").val(a.toString() );
                                                       """),format.raw/*635.56*/("""}"""),format.raw/*635.57*/("""
                                                     """),format.raw/*636.54*/("""}"""),format.raw/*636.55*/(""");

                                                      $('#PA').change(function() """),format.raw/*638.82*/("""{"""),format.raw/*638.83*/("""
                                                     """),format.raw/*639.54*/("""if($(this).is(":checked")) """),format.raw/*639.81*/("""{"""),format.raw/*639.82*/("""

                                                       """),format.raw/*641.56*/("""var a =  parseInt($("#Psychometric").val()) + 100
                                                       $("#Psychometric").val(a.toString() );
                                                       """),format.raw/*643.56*/("""}"""),format.raw/*643.57*/("""
                                                       """),format.raw/*644.56*/("""else
                                                       """),format.raw/*645.56*/("""{"""),format.raw/*645.57*/("""
                                                           """),format.raw/*646.60*/("""var a =  parseInt($("#Psychometric").val()) - 100
                                                       $("#Psychometric").val(a.toString() );
                                                       """),format.raw/*648.56*/("""}"""),format.raw/*648.57*/("""
                                                     """),format.raw/*649.54*/("""}"""),format.raw/*649.55*/(""");

                                                      $('#NA').change(function() """),format.raw/*651.82*/("""{"""),format.raw/*651.83*/("""
                                                     """),format.raw/*652.54*/("""if($(this).is(":checked")) """),format.raw/*652.81*/("""{"""),format.raw/*652.82*/("""

                                                       """),format.raw/*654.56*/("""var a =  parseInt($("#Psychometric").val()) + 1000
                                                       $("#Psychometric").val(a.toString() );
                                                       """),format.raw/*656.56*/("""}"""),format.raw/*656.57*/("""
                                                       """),format.raw/*657.56*/("""else
                                                       """),format.raw/*658.56*/("""{"""),format.raw/*658.57*/("""
                                                           """),format.raw/*659.60*/("""var a =  parseInt($("#Psychometric").val()) - 1000
                                                       $("#Psychometric").val(a.toString() );
                                                       """),format.raw/*661.56*/("""}"""),format.raw/*661.57*/("""
                                                     """),format.raw/*662.54*/("""}"""),format.raw/*662.55*/(""");

                                                      $('#Trait_Other').change(function() """),format.raw/*664.91*/("""{"""),format.raw/*664.92*/("""
                                                     """),format.raw/*665.54*/("""if($(this).is(":checked")) """),format.raw/*665.81*/("""{"""),format.raw/*665.82*/("""

                                                       """),format.raw/*667.56*/("""var a =  parseInt($("#Psychometric").val()) + 10000
                                                       $("#Psychometric").val(a.toString() );
                                                       """),format.raw/*669.56*/("""}"""),format.raw/*669.57*/("""
                                                       """),format.raw/*670.56*/("""else
                                                       """),format.raw/*671.56*/("""{"""),format.raw/*671.57*/("""
                                                           """),format.raw/*672.60*/("""var a =  parseInt($("#Psychometric").val()) - 10000
                                                       $("#Psychometric").val(a.toString() );
                                                       """),format.raw/*674.56*/("""}"""),format.raw/*674.57*/("""
                                                     """),format.raw/*675.54*/("""}"""),format.raw/*675.55*/(""");

                                                 """),format.raw/*677.50*/("""}"""),format.raw/*677.51*/(""");
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
                                                $(document).ready(function()"""),format.raw/*708.77*/("""{"""),format.raw/*708.78*/("""
                                                """),format.raw/*709.49*/("""$('#EDA').change(function() """),format.raw/*709.77*/("""{"""),format.raw/*709.78*/("""
                                                    """),format.raw/*710.53*/("""if($(this).is(":checked")) """),format.raw/*710.80*/("""{"""),format.raw/*710.81*/("""
                                                       """),format.raw/*711.56*/("""var a =  parseInt($("#physiology").val()) + 1
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*713.56*/("""}"""),format.raw/*713.57*/("""
                                                       """),format.raw/*714.56*/("""else
                                                       """),format.raw/*715.56*/("""{"""),format.raw/*715.57*/("""
                                                        """),format.raw/*716.57*/("""var a =  parseInt($("#physiology").val()) - 1
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*718.56*/("""}"""),format.raw/*718.57*/("""
                                                     """),format.raw/*719.54*/("""}"""),format.raw/*719.55*/(""");

                                                     $('#Motion').change(function() """),format.raw/*721.85*/("""{"""),format.raw/*721.86*/("""
                                                     """),format.raw/*722.54*/("""if($(this).is(":checked")) """),format.raw/*722.81*/("""{"""),format.raw/*722.82*/("""
                                                       """),format.raw/*723.56*/("""var a =  parseInt($("#physiology").val()) + 10
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*725.56*/("""}"""),format.raw/*725.57*/("""
                                                       """),format.raw/*726.56*/("""else
                                                       """),format.raw/*727.56*/("""{"""),format.raw/*727.57*/("""
                                                         """),format.raw/*728.58*/("""var a =  parseInt($("#physiology").val()) - 10
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*730.56*/("""}"""),format.raw/*730.57*/("""
                                                     """),format.raw/*731.54*/("""}"""),format.raw/*731.55*/(""");

                                                      $('#GSR_Finger').change(function() """),format.raw/*733.90*/("""{"""),format.raw/*733.91*/("""
                                                     """),format.raw/*734.54*/("""if($(this).is(":checked")) """),format.raw/*734.81*/("""{"""),format.raw/*734.82*/("""

                                                       """),format.raw/*736.56*/("""var a =  parseInt($("#physiology").val()) + 100
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*738.56*/("""}"""),format.raw/*738.57*/("""
                                                       """),format.raw/*739.56*/("""else
                                                       """),format.raw/*740.56*/("""{"""),format.raw/*740.57*/("""
                                                           """),format.raw/*741.60*/("""var a =  parseInt($("#physiology").val()) - 100
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*743.56*/("""}"""),format.raw/*743.57*/("""
                                                     """),format.raw/*744.54*/("""}"""),format.raw/*744.55*/(""");

                                                      $('#Breathing_Belt').change(function() """),format.raw/*746.94*/("""{"""),format.raw/*746.95*/("""
                                                     """),format.raw/*747.54*/("""if($(this).is(":checked")) """),format.raw/*747.81*/("""{"""),format.raw/*747.82*/("""

                                                       """),format.raw/*749.56*/("""var a =  parseInt($("#physiology").val()) + 1000
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*751.56*/("""}"""),format.raw/*751.57*/("""
                                                       """),format.raw/*752.56*/("""else
                                                       """),format.raw/*753.56*/("""{"""),format.raw/*753.57*/("""
                                                           """),format.raw/*754.60*/("""var a =  parseInt($("#physiology").val()) - 1000
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*756.56*/("""}"""),format.raw/*756.57*/("""
                                                     """),format.raw/*757.54*/("""}"""),format.raw/*757.55*/(""");

                                                      $('#Breathing_Thermal').change(function() """),format.raw/*759.97*/("""{"""),format.raw/*759.98*/("""
                                                     """),format.raw/*760.54*/("""if($(this).is(":checked")) """),format.raw/*760.81*/("""{"""),format.raw/*760.82*/("""

                                                       """),format.raw/*762.56*/("""var a =  parseInt($("#physiology").val()) + 10000
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*764.56*/("""}"""),format.raw/*764.57*/("""
                                                       """),format.raw/*765.56*/("""else
                                                       """),format.raw/*766.56*/("""{"""),format.raw/*766.57*/("""
                                                           """),format.raw/*767.60*/("""var a =  parseInt($("#physiology").val()) - 10000
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*769.56*/("""}"""),format.raw/*769.57*/("""
                                                     """),format.raw/*770.54*/("""}"""),format.raw/*770.55*/(""");

                                                      $('#Heart_Rate').change(function() """),format.raw/*772.90*/("""{"""),format.raw/*772.91*/("""
                                                     """),format.raw/*773.54*/("""if($(this).is(":checked")) """),format.raw/*773.81*/("""{"""),format.raw/*773.82*/("""

                                                       """),format.raw/*775.56*/("""var a =  parseInt($("#physiology").val()) + 100000
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*777.56*/("""}"""),format.raw/*777.57*/("""
                                                       """),format.raw/*778.56*/("""else
                                                       """),format.raw/*779.56*/("""{"""),format.raw/*779.57*/("""
                                                           """),format.raw/*780.60*/("""var a =  parseInt($("#physiology").val()) - 100000
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*782.56*/("""}"""),format.raw/*782.57*/("""
                                                     """),format.raw/*783.54*/("""}"""),format.raw/*783.55*/(""");

                                                      $('#Perspiration').change(function() """),format.raw/*785.92*/("""{"""),format.raw/*785.93*/("""
                                                     """),format.raw/*786.54*/("""if($(this).is(":checked")) """),format.raw/*786.81*/("""{"""),format.raw/*786.82*/("""

                                                       """),format.raw/*788.56*/("""var a =  parseInt($("#physiology").val()) + 1000000
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*790.56*/("""}"""),format.raw/*790.57*/("""
                                                       """),format.raw/*791.56*/("""else
                                                       """),format.raw/*792.56*/("""{"""),format.raw/*792.57*/("""
                                                           """),format.raw/*793.60*/("""var a =  parseInt($("#physiology").val()) - 1000000
                                                       $("#physiology").val(a.toString() );
                                                       """),format.raw/*795.56*/("""}"""),format.raw/*795.57*/("""
                                                     """),format.raw/*796.54*/("""}"""),format.raw/*796.55*/(""");

                                                 """),format.raw/*798.50*/("""}"""),format.raw/*798.51*/(""");
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
                                                $(document).ready(function()"""),format.raw/*832.77*/("""{"""),format.raw/*832.78*/("""
                                                """),format.raw/*833.49*/("""$('#Accelerometer').change(function() """),format.raw/*833.87*/("""{"""),format.raw/*833.88*/("""
                                                    """),format.raw/*834.53*/("""if($(this).is(":checked")) """),format.raw/*834.80*/("""{"""),format.raw/*834.81*/("""
                                                       """),format.raw/*835.56*/("""var a =  parseInt($("#observation").val()) + 1
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*837.56*/("""}"""),format.raw/*837.57*/("""
                                                       """),format.raw/*838.56*/("""else
                                                       """),format.raw/*839.56*/("""{"""),format.raw/*839.57*/("""
                                                        """),format.raw/*840.57*/("""var a =  parseInt($("#observation").val()) - 1
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*842.56*/("""}"""),format.raw/*842.57*/("""
                                                     """),format.raw/*843.54*/("""}"""),format.raw/*843.55*/(""");

                                                     $('#Obser_other').change(function() """),format.raw/*845.90*/("""{"""),format.raw/*845.91*/("""
                                                     """),format.raw/*846.54*/("""if($(this).is(":checked")) """),format.raw/*846.81*/("""{"""),format.raw/*846.82*/("""
                                                       """),format.raw/*847.56*/("""var a =  parseInt($("#observation").val()) + 10
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*849.56*/("""}"""),format.raw/*849.57*/("""
                                                       """),format.raw/*850.56*/("""else
                                                       """),format.raw/*851.56*/("""{"""),format.raw/*851.57*/("""
                                                         """),format.raw/*852.58*/("""var a =  parseInt($("#observation").val()) - 10
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*854.56*/("""}"""),format.raw/*854.57*/("""
                                                     """),format.raw/*855.54*/("""}"""),format.raw/*855.55*/(""");

                                                      $('#Video_Face').change(function() """),format.raw/*857.90*/("""{"""),format.raw/*857.91*/("""
                                                     """),format.raw/*858.54*/("""if($(this).is(":checked")) """),format.raw/*858.81*/("""{"""),format.raw/*858.82*/("""

                                                       """),format.raw/*860.56*/("""var a =  parseInt($("#observation").val()) + 100
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*862.56*/("""}"""),format.raw/*862.57*/("""
                                                       """),format.raw/*863.56*/("""else
                                                       """),format.raw/*864.56*/("""{"""),format.raw/*864.57*/("""
                                                           """),format.raw/*865.60*/("""var a =  parseInt($("#observation").val()) - 100
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*867.56*/("""}"""),format.raw/*867.57*/("""
                                                     """),format.raw/*868.54*/("""}"""),format.raw/*868.55*/(""");

                                                      $('#Video_Room').change(function() """),format.raw/*870.90*/("""{"""),format.raw/*870.91*/("""
                                                     """),format.raw/*871.54*/("""if($(this).is(":checked")) """),format.raw/*871.81*/("""{"""),format.raw/*871.82*/("""

                                                       """),format.raw/*873.56*/("""var a =  parseInt($("#observation").val()) + 1000
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*875.56*/("""}"""),format.raw/*875.57*/("""
                                                       """),format.raw/*876.56*/("""else
                                                       """),format.raw/*877.56*/("""{"""),format.raw/*877.57*/("""
                                                           """),format.raw/*878.60*/("""var a =  parseInt($("#observation").val()) - 1000
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*880.56*/("""}"""),format.raw/*880.57*/("""
                                                     """),format.raw/*881.54*/("""}"""),format.raw/*881.55*/(""");

                                                      $('#Video_Theater').change(function() """),format.raw/*883.93*/("""{"""),format.raw/*883.94*/("""
                                                     """),format.raw/*884.54*/("""if($(this).is(":checked")) """),format.raw/*884.81*/("""{"""),format.raw/*884.82*/("""

                                                       """),format.raw/*886.56*/("""var a =  parseInt($("#observation").val()) + 10000
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*888.56*/("""}"""),format.raw/*888.57*/("""
                                                       """),format.raw/*889.56*/("""else
                                                       """),format.raw/*890.56*/("""{"""),format.raw/*890.57*/("""
                                                           """),format.raw/*891.60*/("""var a =  parseInt($("#observation").val()) - 10000
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*893.56*/("""}"""),format.raw/*893.57*/("""
                                                     """),format.raw/*894.54*/("""}"""),format.raw/*894.55*/(""");

                                                      $('#FACS').change(function() """),format.raw/*896.84*/("""{"""),format.raw/*896.85*/("""
                                                     """),format.raw/*897.54*/("""if($(this).is(":checked")) """),format.raw/*897.81*/("""{"""),format.raw/*897.82*/("""

                                                       """),format.raw/*899.56*/("""var a =  parseInt($("#observation").val()) + 100000
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*901.56*/("""}"""),format.raw/*901.57*/("""
                                                       """),format.raw/*902.56*/("""else
                                                       """),format.raw/*903.56*/("""{"""),format.raw/*903.57*/("""
                                                           """),format.raw/*904.60*/("""var a =  parseInt($("#observation").val()) - 100000
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*906.56*/("""}"""),format.raw/*906.57*/("""
                                                     """),format.raw/*907.54*/("""}"""),format.raw/*907.55*/(""");

                                                      $('#Obser2d_other').change(function() """),format.raw/*909.93*/("""{"""),format.raw/*909.94*/("""
                                                     """),format.raw/*910.54*/("""if($(this).is(":checked")) """),format.raw/*910.81*/("""{"""),format.raw/*910.82*/("""

                                                       """),format.raw/*912.56*/("""var a =  parseInt($("#observation").val()) + 1000000
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*914.56*/("""}"""),format.raw/*914.57*/("""
                                                       """),format.raw/*915.56*/("""else
                                                       """),format.raw/*916.56*/("""{"""),format.raw/*916.57*/("""
                                                           """),format.raw/*917.60*/("""var a =  parseInt($("#observation").val()) - 1000000
                                                       $("#observation").val(a.toString() );
                                                       """),format.raw/*919.56*/("""}"""),format.raw/*919.57*/("""
                                                     """),format.raw/*920.54*/("""}"""),format.raw/*920.55*/(""");

                                                 """),format.raw/*922.50*/("""}"""),format.raw/*922.51*/(""");
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
    """)))}),format.raw/*941.6*/("""
    """),format.raw/*942.5*/("""</form>

    </div>



</div><!--/.main-->

 <div id="loading" style="display:none; position: fixed;height:100%; width:100%; background: rgba( 255, 255, 255, .8 ) url('/assets/images/ajax-loader.gif') 50% 50%    no-repeat;">
     <p> Please wait, study is being created </p>
 </div>

<script>
    var wsUri = """"),_display_(/*955.19*/routes/*955.25*/.Application.socket.webSocketURL()),format.raw/*955.59*/("""";
    var userName = """"),_display_(/*956.22*/userName),format.raw/*956.30*/(""""
</script>



</body>

</html>
"""))}
  }

  def render(userName:String,explVar:List[scala.Tuple3[Option[String], Int, Int]],request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(userName,explVar)(request)

  def f:((String,List[scala.Tuple3[Option[String], Int, Int]]) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (userName,explVar) => (request) => apply(userName,explVar)(request)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Dec 28 16:18:31 CST 2016
                  SOURCE: C:/first_play/app/views/ShowCreateStudy.scala.html
                  HASH: e3682e4d90d31ac372fba1cbf7a7aee89a2dc9ee
                  MATRIX: 574->1|772->96|800->116|909->198|937->199|979->213|1268->475|1297->476|1336->488|2532->1657|2547->1663|2612->1707|2693->1761|2708->1767|2773->1811|4023->3033|4053->3041|4083->3042|6085->5017|6101->5023|6214->5125|6256->5127|6294->5137|12355->11170|12407->11212|12448->11214|12503->11240|12690->11395|12741->11417|15943->14591|15980->14611|16020->14612|16079->14643|16106->14660|16147->14662|16207->14693|16259->14717|16273->14721|16298->14724|16329->14726|16380->14749|16394->14753|16419->14756|16449->14757|16521->14797|16584->14828|16639->14854|17018->15205|17055->15225|17095->15226|17154->15257|17181->15274|17222->15276|17281->15306|17333->15330|17347->15334|17372->15337|17403->15339|17454->15362|17468->15366|17493->15369|17523->15370|17595->15410|17658->15441|17713->15467|18332->16058|18369->16078|18409->16079|18476->16118|18503->16135|18544->16137|18611->16175|18683->16219|18697->16223|18722->16226|18798->16273|18813->16277|18839->16280|18920->16329|18991->16368|19054->16402|19451->16771|19488->16791|19528->16792|19587->16823|19613->16839|19654->16841|19713->16871|19766->16896|19780->16900|19805->16903|19838->16908|19852->16912|19877->16915|19949->16955|20012->16986|20071->17016|20469->17386|20506->17406|20546->17407|20605->17438|20631->17454|20672->17456|20731->17486|20784->17511|20798->17515|20823->17518|20857->17524|20871->17528|20896->17531|20968->17571|21031->17602|21090->17632|22024->18538|22061->18558|22101->18559|22164->18594|22190->18610|22231->18612|22294->18646|22346->18670|22360->18674|22385->18677|22416->18679|22467->18702|22481->18706|22506->18709|22536->18710|22612->18754|22675->18785|22732->18813|23579->19632|23616->19652|23656->19653|23723->19692|23750->19709|23791->19711|23858->19749|23932->19795|23946->19799|23971->19802|24047->19849|24062->19853|24088->19856|24168->19904|24239->19943|24302->19977|25251->20898|25288->20918|25328->20919|25387->20950|25414->20967|25455->20969|25514->20999|25566->21023|25580->21027|25605->21030|25636->21032|25687->21055|25701->21059|25726->21062|25798->21102|25861->21133|25920->21163|27094->22308|27124->22309|27175->22331|27237->22364|27267->22365|27318->22387|27374->22414|27404->22415|27462->22444|27540->22493|27570->22494|27628->22523|27690->22556|27720->22557|27779->22587|27857->22636|27887->22637|27943->22664|27973->22665|28064->22727|28094->22728|28145->22750|28201->22777|28231->22778|28289->22807|28369->22858|28399->22859|28457->22888|28519->22921|28549->22922|28608->22952|28688->23003|28718->23004|28774->23031|28804->23032|28885->23084|28915->23085|28970->23111|29026->23138|29056->23139|29114->23168|29266->23291|29296->23292|29354->23321|29416->23354|29446->23355|29505->23385|29657->23508|29687->23509|29743->23536|29773->23537|29864->23599|29894->23600|29950->23627|30006->23654|30036->23655|30096->23686|30249->23810|30279->23811|30337->23840|30399->23873|30429->23874|30489->23905|30642->24029|30672->24030|30728->24057|30758->24058|30850->24121|30880->24122|30936->24149|30992->24176|31022->24177|31082->24208|31236->24333|31266->24334|31324->24363|31386->24396|31416->24397|31478->24430|31632->24555|31662->24556|31718->24583|31748->24584|31840->24647|31870->24648|31926->24675|31982->24702|32012->24703|32072->24734|32227->24860|32257->24861|32315->24890|32377->24923|32407->24924|32469->24957|32624->25083|32654->25084|32710->25111|32740->25112|32835->25178|32865->25179|32921->25206|32977->25233|33007->25234|33067->25265|33223->25392|33253->25393|33311->25422|33373->25455|33403->25456|33465->25489|33621->25616|33651->25617|33707->25644|33737->25645|33832->25711|33862->25712|33918->25739|33974->25766|34004->25767|34064->25798|34221->25926|34251->25927|34309->25956|34371->25989|34401->25990|34463->26023|34620->26151|34650->26152|34706->26179|34736->26180|34792->26207|34822->26208|36595->27952|36625->27953|36708->28007|36765->28035|36795->28036|36878->28090|36934->28117|36964->28118|37050->28175|37278->28374|37308->28375|37394->28432|37484->28493|37514->28494|37601->28552|37829->28751|37859->28752|37943->28807|37973->28808|38089->28895|38119->28896|38203->28951|38259->28978|38289->28979|38375->29036|38604->29236|38634->29237|38720->29294|38810->29355|38840->29356|38928->29415|39157->29615|39187->29616|39271->29671|39301->29672|39417->29759|39447->29760|39531->29815|39587->29842|39617->29843|39705->29902|39935->30103|39965->30104|40051->30161|40141->30222|40171->30223|40261->30284|40491->30485|40521->30486|40605->30541|40635->30542|40751->30629|40781->30630|40865->30685|40921->30712|40951->30713|41039->30772|41270->30974|41300->30975|41386->31032|41476->31093|41506->31094|41596->31155|41827->31357|41857->31358|41941->31413|41971->31414|42096->31510|42126->31511|42210->31566|42266->31593|42296->31594|42384->31653|42616->31856|42646->31857|42732->31914|42822->31975|42852->31976|42942->32037|43174->32240|43204->32241|43288->32296|43318->32297|43402->32352|43432->32353|45694->34586|45724->34587|45803->34637|45860->34665|45890->34666|45973->34720|46029->34747|46059->34748|46145->34805|46369->35000|46399->35001|46485->35058|46575->35119|46605->35120|46692->35178|46916->35373|46946->35374|47030->35429|47060->35430|47179->35520|47209->35521|47293->35576|47349->35603|47379->35604|47465->35661|47690->35857|47720->35858|47806->35915|47896->35976|47926->35977|48014->36036|48239->36232|48269->36233|48353->36288|48383->36289|48507->36384|48537->36385|48621->36440|48677->36467|48707->36468|48795->36527|49021->36724|49051->36725|49137->36782|49227->36843|49257->36844|49347->36905|49573->37102|49603->37103|49687->37158|49717->37159|49845->37258|49875->37259|49959->37314|50015->37341|50045->37342|50133->37401|50360->37599|50390->37600|50476->37657|50566->37718|50596->37719|50686->37780|50913->37978|50943->37979|51027->38034|51057->38035|51188->38137|51218->38138|51302->38193|51358->38220|51388->38221|51476->38280|51704->38479|51734->38480|51820->38537|51910->38598|51940->38599|52030->38660|52258->38859|52288->38860|52372->38915|52402->38916|52526->39011|52556->39012|52640->39067|52696->39094|52726->39095|52814->39154|53043->39354|53073->39355|53159->39412|53249->39473|53279->39474|53369->39535|53598->39735|53628->39736|53712->39791|53742->39792|53868->39889|53898->39890|53982->39945|54038->39972|54068->39973|54156->40032|54386->40233|54416->40234|54502->40291|54592->40352|54622->40353|54712->40414|54942->40615|54972->40616|55056->40671|55086->40672|55170->40727|55200->40728|57302->42801|57332->42802|57411->42852|57478->42890|57508->42891|57591->42945|57647->42972|57677->42973|57763->43030|57989->43227|58019->43228|58105->43285|58195->43346|58225->43347|58312->43405|58538->43602|58568->43603|58652->43658|58682->43659|58806->43754|58836->43755|58920->43810|58976->43837|59006->43838|59092->43895|59319->44093|59349->44094|59435->44151|59525->44212|59555->44213|59643->44272|59870->44470|59900->44471|59984->44526|60014->44527|60138->44622|60168->44623|60252->44678|60308->44705|60338->44706|60426->44765|60654->44964|60684->44965|60770->45022|60860->45083|60890->45084|60980->45145|61208->45344|61238->45345|61322->45400|61352->45401|61476->45496|61506->45497|61590->45552|61646->45579|61676->45580|61764->45639|61993->45839|62023->45840|62109->45897|62199->45958|62229->45959|62319->46020|62548->46220|62578->46221|62662->46276|62692->46277|62819->46375|62849->46376|62933->46431|62989->46458|63019->46459|63107->46518|63337->46719|63367->46720|63453->46777|63543->46838|63573->46839|63663->46900|63893->47101|63923->47102|64007->47157|64037->47158|64155->47247|64185->47248|64269->47303|64325->47330|64355->47331|64443->47390|64674->47592|64704->47593|64790->47650|64880->47711|64910->47712|65000->47773|65231->47975|65261->47976|65345->48031|65375->48032|65502->48130|65532->48131|65616->48186|65672->48213|65702->48214|65790->48273|66022->48476|66052->48477|66138->48534|66228->48595|66258->48596|66348->48657|66580->48860|66610->48861|66694->48916|66724->48917|66808->48972|66838->48973|67952->50056|67986->50062|68338->50386|68354->50392|68410->50426|68463->50451|68493->50459
                  LINES: 19->1|22->1|23->3|29->9|29->9|30->10|38->18|38->18|42->22|64->44|64->44|64->44|65->45|65->45|65->45|86->66|86->66|86->66|141->121|141->121|141->121|141->121|142->122|287->267|287->267|287->267|288->268|289->269|290->270|351->331|351->331|351->331|352->332|352->332|352->332|353->333|353->333|353->333|353->333|353->333|353->333|353->333|353->333|353->333|354->334|355->335|356->336|364->344|364->344|364->344|365->345|365->345|365->345|366->346|366->346|366->346|366->346|366->346|366->346|366->346|366->346|366->346|367->347|368->348|369->349|380->360|380->360|380->360|381->361|381->361|381->361|382->362|382->362|382->362|382->362|382->362|382->362|382->362|383->363|384->364|385->365|397->377|397->377|397->377|398->378|398->378|398->378|399->379|399->379|399->379|399->379|399->379|399->379|399->379|400->380|401->381|402->382|412->392|412->392|412->392|413->393|413->393|413->393|414->394|414->394|414->394|414->394|414->394|414->394|414->394|415->395|416->396|417->397|436->416|436->416|436->416|437->417|437->417|437->417|438->418|438->418|438->418|438->418|438->418|438->418|438->418|438->418|438->418|439->419|440->420|442->422|456->436|456->436|456->436|457->437|457->437|457->437|458->438|458->438|458->438|458->438|458->438|458->438|458->438|459->439|460->440|461->441|485->465|485->465|485->465|486->466|486->466|486->466|487->467|487->467|487->467|487->467|487->467|487->467|487->467|487->467|488->468|489->469|490->470|509->489|509->489|510->490|510->490|510->490|511->491|511->491|511->491|512->492|513->493|513->493|514->494|515->495|515->495|516->496|517->497|517->497|518->498|518->498|519->499|519->499|520->500|520->500|520->500|521->501|522->502|522->502|523->503|524->504|524->504|525->505|526->506|526->506|527->507|527->507|528->508|528->508|529->509|529->509|529->509|530->510|532->512|532->512|533->513|534->514|534->514|535->515|537->517|537->517|538->518|538->518|540->520|540->520|541->521|541->521|541->521|542->522|544->524|544->524|545->525|546->526|546->526|547->527|549->529|549->529|550->530|550->530|552->532|552->532|553->533|553->533|553->533|555->535|557->537|557->537|558->538|559->539|559->539|560->540|562->542|562->542|563->543|563->543|565->545|565->545|566->546|566->546|566->546|568->548|570->550|570->550|571->551|572->552|572->552|573->553|575->555|575->555|576->556|576->556|578->558|578->558|579->559|579->559|579->559|581->561|583->563|583->563|584->564|585->565|585->565|586->566|588->568|588->568|589->569|589->569|591->571|591->571|592->572|592->572|592->572|594->574|596->576|596->576|597->577|598->578|598->578|599->579|601->581|601->581|602->582|602->582|604->584|604->584|633->613|633->613|634->614|634->614|634->614|635->615|635->615|635->615|636->616|638->618|638->618|639->619|640->620|640->620|641->621|643->623|643->623|644->624|644->624|646->626|646->626|647->627|647->627|647->627|648->628|650->630|650->630|651->631|652->632|652->632|653->633|655->635|655->635|656->636|656->636|658->638|658->638|659->639|659->639|659->639|661->641|663->643|663->643|664->644|665->645|665->645|666->646|668->648|668->648|669->649|669->649|671->651|671->651|672->652|672->652|672->652|674->654|676->656|676->656|677->657|678->658|678->658|679->659|681->661|681->661|682->662|682->662|684->664|684->664|685->665|685->665|685->665|687->667|689->669|689->669|690->670|691->671|691->671|692->672|694->674|694->674|695->675|695->675|697->677|697->677|728->708|728->708|729->709|729->709|729->709|730->710|730->710|730->710|731->711|733->713|733->713|734->714|735->715|735->715|736->716|738->718|738->718|739->719|739->719|741->721|741->721|742->722|742->722|742->722|743->723|745->725|745->725|746->726|747->727|747->727|748->728|750->730|750->730|751->731|751->731|753->733|753->733|754->734|754->734|754->734|756->736|758->738|758->738|759->739|760->740|760->740|761->741|763->743|763->743|764->744|764->744|766->746|766->746|767->747|767->747|767->747|769->749|771->751|771->751|772->752|773->753|773->753|774->754|776->756|776->756|777->757|777->757|779->759|779->759|780->760|780->760|780->760|782->762|784->764|784->764|785->765|786->766|786->766|787->767|789->769|789->769|790->770|790->770|792->772|792->772|793->773|793->773|793->773|795->775|797->777|797->777|798->778|799->779|799->779|800->780|802->782|802->782|803->783|803->783|805->785|805->785|806->786|806->786|806->786|808->788|810->790|810->790|811->791|812->792|812->792|813->793|815->795|815->795|816->796|816->796|818->798|818->798|852->832|852->832|853->833|853->833|853->833|854->834|854->834|854->834|855->835|857->837|857->837|858->838|859->839|859->839|860->840|862->842|862->842|863->843|863->843|865->845|865->845|866->846|866->846|866->846|867->847|869->849|869->849|870->850|871->851|871->851|872->852|874->854|874->854|875->855|875->855|877->857|877->857|878->858|878->858|878->858|880->860|882->862|882->862|883->863|884->864|884->864|885->865|887->867|887->867|888->868|888->868|890->870|890->870|891->871|891->871|891->871|893->873|895->875|895->875|896->876|897->877|897->877|898->878|900->880|900->880|901->881|901->881|903->883|903->883|904->884|904->884|904->884|906->886|908->888|908->888|909->889|910->890|910->890|911->891|913->893|913->893|914->894|914->894|916->896|916->896|917->897|917->897|917->897|919->899|921->901|921->901|922->902|923->903|923->903|924->904|926->906|926->906|927->907|927->907|929->909|929->909|930->910|930->910|930->910|932->912|934->914|934->914|935->915|936->916|936->916|937->917|939->919|939->919|940->920|940->920|942->922|942->922|961->941|962->942|975->955|975->955|975->955|976->956|976->956
                  -- GENERATED --
              */
          