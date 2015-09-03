
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
object ShowStudies extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,List[scala.Tuple2[scala.Tuple2[String, String], Int]],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userName: String, studies: List[((String,String),Int)], report: String = ""):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.79*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>SubjectBook</title>



    <link href="/assets/stylesheets/bootstrap.min.css" rel="stylesheet">
    <link href="/assets/stylesheets/datepicker3.css" rel="stylesheet">
    <link href="/assets/stylesheets/bootstrap-table.css" rel="stylesheet">
    <link href="/assets/stylesheets/styles.css" rel="stylesheet">

    <!--[if lt IE 9]>
    <script src="/assets/javascripts/html5shiv.js"></script>
    <script src="/assets/javascripts/respond.min.js"></script>
    <![endif]-->

    <script src="/assets/javascripts/jquery-1.11.1.min.js"></script>
    <script src="/assets/javascripts/bootstrap.min.js"></script>
    <script src="/assets/javascripts/chart.min.js"></script>
    <script src="/assets/javascripts/bootstrap-datepicker.js"></script>
    <script src="/assets/javascripts/bootstrap-table.js"></script>

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
            <li><a href="#"><span class="glyphicon glyphicon-home"></span></a></li>
        </ol>
    </div><!--/.row-->

    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">Studies</h1>
        </div>
    </div><!--/.row-->


    <div class="row">
        <div class="col-lg-12">
            <div class="panel panel-default">
                <div class="panel-heading">Your Studies</div>


                <div class="panel-body">
                    <table data-toggle="table"  data-show-refresh="true" data-show-toggle="true" data-show-columns="true" data-search="true" data-select-item-name="toolbar1" data-pagination="true" data-sort-name="name" data-sort-order="desc">
                        <thead>
                        <tr>
                            <th data-field="state" data-checkbox="true" >Item ID</th>
                            <th data-field="id" data-sortable="true">Study Name</th>
                            <th data-field="name"  data-sortable="true">Study Type</th>
                            <th data-field="price" data-sortable="true">Owner</th>
                            <th data-field="export" data-sortable="true">Export</th>
                            <th data-field="delete" data-sortable="true">Delete</th>
                        </tr>
                        </thead>
                        <tbody>


                        """),_display_(/*112.26*/for(study <- studies) yield /*112.47*/ {_display_(Seq[Any](format.raw/*112.49*/("""
                        """),format.raw/*113.25*/("""<tr class="table_row_odd table_row_first">
                            <td>  </td>
                            <td>
                                <a href="/showStudy/"""),_display_(/*116.54*/study/*116.59*/._2),format.raw/*116.62*/(""""><span>"""),_display_(/*116.71*/study/*116.76*/._1._1),format.raw/*116.82*/("""</span></a>
                            </td>
                            <td> Public </td>
                            <td> """),_display_(/*119.35*/study/*119.40*/._1._2),format.raw/*119.46*/(""" """),format.raw/*119.47*/("""</td>
                            <td><a href="/downloadStudy?studyId="""),_display_(/*120.66*/study/*120.71*/._2),format.raw/*120.74*/("""" class="export">Export </a></td>

                            <td>
                                <form action="/deleteStudy" method="POST" enctype="multipart/form-data" onclick="return confirm('Are you sure you want to delete this item?');">
                                    <input type="hidden" name="study_id" id="study_id" value= """),_display_(/*124.96*/study/*124.101*/._2),format.raw/*124.104*/(""">
                                    """),_display_(/*125.38*/if(study._1._2 == userName)/*125.65*/ {_display_(Seq[Any](format.raw/*125.67*/("""
                                    """),format.raw/*126.37*/("""<input type="submit" name="submit" value="delete">
                                    """)))}),format.raw/*127.38*/("""
                                """),format.raw/*128.33*/("""</form>
                            </td>


                        </tr>
                        """)))}),format.raw/*133.26*/("""

                        """),format.raw/*135.25*/("""</tbody>
                    </table>
                </div>
            </div>
        </div>
    </div><!--/.row-->


</div><!--/.main-->

<div id="loading" style="display:none; position: fixed;height:100%; width:100%; background: rgba( 255, 255, 255, .8 ) url('/assets/images/ajax-loader.gif') 50% 50%    no-repeat;">
    <p> Please wait, study is being created </p>
</div>
<script>


 $(document).ready(function()"""),format.raw/*151.30*/("""{"""),format.raw/*151.31*/("""

   """),format.raw/*153.4*/("""$('.export').click(function() """),format.raw/*153.34*/("""{"""),format.raw/*153.35*/("""
           """),format.raw/*154.12*/("""var link= $(this).attr('getLink');
           // alert(link);
          // Id of the element that was clicked
         $("#loading").show();

         $("#loading").hide();
    """),format.raw/*160.5*/("""}"""),format.raw/*160.6*/(""");
 """),format.raw/*161.2*/("""}"""),format.raw/*161.3*/(""");

</script>
<script>
		!function ($) """),format.raw/*165.17*/("""{"""),format.raw/*165.18*/("""
			"""),format.raw/*166.4*/("""$(document).on("click","ul.nav li.parent > a > span.icon", function()"""),format.raw/*166.73*/("""{"""),format.raw/*166.74*/("""		  
				"""),format.raw/*167.5*/("""$(this).find('em:first').toggleClass("glyphicon-minus");	  
			"""),format.raw/*168.4*/("""}"""),format.raw/*168.5*/("""); 
			$(".sidebar span.icon").find('em:first').addClass("glyphicon-plus");
		"""),format.raw/*170.3*/("""}"""),format.raw/*170.4*/("""(window.jQuery);

		$(window).on('resize', function () """),format.raw/*172.38*/("""{"""),format.raw/*172.39*/("""
		  """),format.raw/*173.5*/("""if ($(window).width() > 768) $('#sidebar-collapse').collapse('show')
		"""),format.raw/*174.3*/("""}"""),format.raw/*174.4*/(""")
		$(window).on('resize', function () """),format.raw/*175.38*/("""{"""),format.raw/*175.39*/("""
		  """),format.raw/*176.5*/("""if ($(window).width() <= 767) $('#sidebar-collapse').collapse('hide')
		"""),format.raw/*177.3*/("""}"""),format.raw/*177.4*/(""")
	</script>
</body>

</html>
"""))}
  }

  def render(userName:String,studies:List[scala.Tuple2[scala.Tuple2[String, String], Int]],report:String): play.twirl.api.HtmlFormat.Appendable = apply(userName,studies,report)

  def f:((String,List[scala.Tuple2[scala.Tuple2[String, String], Int]],String) => play.twirl.api.HtmlFormat.Appendable) = (userName,studies,report) => apply(userName,studies,report)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jun 24 02:04:03 CDT 2015
                  SOURCE: C:/first_play/app/views/ShowStudies.scala.html
                  HASH: 7259be0b0c15cf61c88da538113e8b9867899b06
                  MATRIX: 572->1|737->78|765->80|2788->2075|2818->2083|2848->2084|6357->5565|6395->5586|6436->5588|6491->5614|6691->5786|6706->5791|6731->5794|6768->5803|6783->5808|6811->5814|6968->5943|6983->5948|7011->5954|7041->5955|7141->6027|7156->6032|7181->6035|7553->6379|7569->6384|7595->6387|7663->6427|7700->6454|7741->6456|7808->6494|7929->6583|7992->6617|8128->6721|8185->6749|8647->7182|8677->7183|8712->7190|8771->7220|8801->7221|8843->7234|9054->7417|9083->7418|9116->7423|9145->7424|9217->7467|9247->7468|9280->7473|9378->7542|9408->7543|9446->7553|9538->7617|9567->7618|9675->7698|9704->7699|9790->7756|9820->7757|9854->7763|9954->7835|9983->7836|10052->7876|10082->7877|10116->7883|10217->7956|10246->7957
                  LINES: 19->1|22->1|23->2|65->44|65->44|65->44|133->112|133->112|133->112|134->113|137->116|137->116|137->116|137->116|137->116|137->116|140->119|140->119|140->119|140->119|141->120|141->120|141->120|145->124|145->124|145->124|146->125|146->125|146->125|147->126|148->127|149->128|154->133|156->135|172->151|172->151|174->153|174->153|174->153|175->154|181->160|181->160|182->161|182->161|186->165|186->165|187->166|187->166|187->166|188->167|189->168|189->168|191->170|191->170|193->172|193->172|194->173|195->174|195->174|196->175|196->175|197->176|198->177|198->177
                  -- GENERATED --
              */
          