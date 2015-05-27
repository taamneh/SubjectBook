
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
    <script src="/assets/javascripts/chart-data.js"></script>
    <script src="/assets/javascripts/easypiechart.js"></script>
    <script src="/assets/javascripts/easypiechart-data.js"></script>
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
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-user"></span> """),_display_(/*47.128*/userName),format.raw/*47.136*/(""" """),format.raw/*47.137*/("""<span class="caret"></span></a>
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
                    <table data-toggle="table" data-url="tables/data1.json"  data-show-refresh="true" data-show-toggle="true" data-show-columns="true" data-search="true" data-select-item-name="toolbar1" data-pagination="true" data-sort-name="name" data-sort-order="desc">
                        <thead>
                        <tr>
                            <th data-field="state" data-checkbox="true" >Item ID</th>
                            <th data-field="id" data-sortable="true">Study Name</th>
                            <th data-field="name"  data-sortable="true">Study Type</th>
                            <th data-field="price" data-sortable="true">Owner</th>
                            <th data-field="delete" data-sortable="true">Export</th>
                           <!-- <th data-field="delete" data-sortable="true">Delete</th> -->
                        </tr>
                        </thead>
                        <tbody>


                        """),_display_(/*115.26*/for(study <- studies) yield /*115.47*/ {_display_(Seq[Any](format.raw/*115.49*/("""
                        """),format.raw/*116.25*/("""<tr class="table_row_odd table_row_first">
                            <td>  </td>
                            <td>
                                <a href="/showStudy/"""),_display_(/*119.54*/study/*119.59*/._2),format.raw/*119.62*/(""""><span>"""),_display_(/*119.71*/study/*119.76*/._1._1),format.raw/*119.82*/("""</span></a>
                            </td>
                            <td> Public </td>
                            <td> """),_display_(/*122.35*/study/*122.40*/._1._2),format.raw/*122.46*/(""" """),format.raw/*122.47*/("""</td>
                            <td><a href="/downloadStudy?studyId="""),_display_(/*123.66*/study/*123.71*/._2),format.raw/*123.74*/("""" class="export">Export </a></td>

                           <!-- <form action="/deleteStudy" method="POST" enctype="multipart/form-data">
                            <input type="hidden" name="study_id" id="study_id" value= """),_display_(/*126.88*/study/*126.93*/._2),format.raw/*126.96*/(""">
                            """),_display_(/*127.30*/if(study._1._2 == userName)/*127.57*/ {_display_(Seq[Any](format.raw/*127.59*/("""
                             """),format.raw/*128.30*/("""<td> <input type="submit" name="submit" value="delete"> </td>
                            """)))}),format.raw/*129.30*/("""
                            """),format.raw/*130.29*/("""</form> -->


                        </tr>
                        """)))}),format.raw/*134.26*/("""

                        """),format.raw/*136.25*/("""</tbody>
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


 $(document).ready(function()"""),format.raw/*152.30*/("""{"""),format.raw/*152.31*/("""

   """),format.raw/*154.4*/("""$('.export').click(function() """),format.raw/*154.34*/("""{"""),format.raw/*154.35*/("""
           """),format.raw/*155.12*/("""var link= $(this).attr('getLink');
            alert(link);
          // Id of the element that was clicked
         $("#loading").show();

         $("#loading").hide();
    """),format.raw/*161.5*/("""}"""),format.raw/*161.6*/(""");





 """),format.raw/*167.2*/("""}"""),format.raw/*167.3*/(""");

</script>
<script>
		!function ($) """),format.raw/*171.17*/("""{"""),format.raw/*171.18*/("""
			"""),format.raw/*172.4*/("""$(document).on("click","ul.nav li.parent > a > span.icon", function()"""),format.raw/*172.73*/("""{"""),format.raw/*172.74*/("""		  
				"""),format.raw/*173.5*/("""$(this).find('em:first').toggleClass("glyphicon-minus");	  
			"""),format.raw/*174.4*/("""}"""),format.raw/*174.5*/("""); 
			$(".sidebar span.icon").find('em:first').addClass("glyphicon-plus");
		"""),format.raw/*176.3*/("""}"""),format.raw/*176.4*/("""(window.jQuery);

		$(window).on('resize', function () """),format.raw/*178.38*/("""{"""),format.raw/*178.39*/("""
		  """),format.raw/*179.5*/("""if ($(window).width() > 768) $('#sidebar-collapse').collapse('show')
		"""),format.raw/*180.3*/("""}"""),format.raw/*180.4*/(""")
		$(window).on('resize', function () """),format.raw/*181.38*/("""{"""),format.raw/*181.39*/("""
		  """),format.raw/*182.5*/("""if ($(window).width() <= 767) $('#sidebar-collapse').collapse('hide')
		"""),format.raw/*183.3*/("""}"""),format.raw/*183.4*/(""")
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
                  DATE: Fri May 22 00:52:13 CDT 2015
                  SOURCE: C:/first_play/app/views/ShowStudies.scala.html
                  HASH: 574a91cdce9641814f2837a8914aab2c76c8df54
                  MATRIX: 572->1|737->78|765->80|2986->2273|3016->2281|3046->2282|6592->5800|6630->5821|6671->5823|6726->5849|6926->6021|6941->6026|6966->6029|7003->6038|7018->6043|7046->6049|7203->6178|7218->6183|7246->6189|7276->6190|7376->6262|7391->6267|7416->6270|7674->6500|7689->6505|7714->6508|7774->6540|7811->6567|7852->6569|7912->6600|8036->6692|8095->6722|8200->6795|8257->6823|8719->7256|8749->7257|8784->7264|8843->7294|8873->7295|8915->7308|9124->7489|9153->7490|9196->7505|9225->7506|9297->7549|9327->7550|9360->7555|9458->7624|9488->7625|9526->7635|9618->7699|9647->7700|9755->7780|9784->7781|9870->7838|9900->7839|9934->7845|10034->7917|10063->7918|10132->7958|10162->7959|10196->7965|10297->8038|10326->8039
                  LINES: 19->1|22->1|23->2|68->47|68->47|68->47|136->115|136->115|136->115|137->116|140->119|140->119|140->119|140->119|140->119|140->119|143->122|143->122|143->122|143->122|144->123|144->123|144->123|147->126|147->126|147->126|148->127|148->127|148->127|149->128|150->129|151->130|155->134|157->136|173->152|173->152|175->154|175->154|175->154|176->155|182->161|182->161|188->167|188->167|192->171|192->171|193->172|193->172|193->172|194->173|195->174|195->174|197->176|197->176|199->178|199->178|200->179|201->180|201->180|202->181|202->181|203->182|204->183|204->183
                  -- GENERATED --
              */
          