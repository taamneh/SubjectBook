
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
      _display_ {import java.math.BigInteger; var j =1;

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

    <script src="http://code.highcharts.com/highcharts.js"></script>
    <script src="http://code.highcharts.com/modules/funnel.js"></script>
    <script src="http://code.highcharts.com/modules/exporting.js"></script>
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
        <li><a href="/createStudy"><span class="glyphicon glyphicon-pencil"></span> Visualize an Existing Study</a></li>
        <li><a href="/InitiateStudy"><span class="glyphicon glyphicon-pencil"></span> Initiate a study</a></li>
        <!-- <li><a href="/showAddDataType"><span class="glyphicon glyphicon-pencil"></span> Add New Data Type</a></li> -->

        <li><a href="/showAllDataTypes"><span class="glyphicon glyphicon-cog"></span> Manage your Data</a></li>
        <li><a href="/showAllPsychometric"><span class="glyphicon glyphicon-cog"></span> Manage your Psychometric data</a></li>
        <li><a href="/realTime"><span class="glyphicon glyphicon-cog"></span>Real-time Streaming</a></li>
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
                    <table data-toggle="table"  data-show-refresh="true" data-show-toggle="true" data-show-columns="true" data-search="true" data-select-item-name="toolbar1" data-pagination="true" data-sort-name="names" data-sort-order="desc">
                        <thead>
                        <tr>
                            <th data-field="state" data-checkbox="true" >Item ID</th>
                            <th data-field="name" data-sortable="false">Study Name</th>
                            <!-- <th data-field="map"  data-sortable="false">Study Map</th> -->
                            <th data-field="price" data-sortable="true">Owner</th>
                            <!-- <th data-field="create" data-sortable="true">Create Summary</th> -->
                            <th data-field="edit" data-sortable="true">Edit</th>
                            <th data-field="export" data-sortable="true">Export</th>
                            <th data-field="delete" data-sortable="true">Delete</th>

                        </tr>
                        </thead>
                        <tbody>

                        """),format.raw/*125.1*/("""                        """),_display_(/*125.26*/for(study <- studies) yield /*125.47*/ {_display_(Seq[Any](format.raw/*125.49*/("""
                        """),format.raw/*126.25*/("""<tr class="table_row_odd table_row_first">
                            <td> </td>
                            <td><a href="/showPyramid?studyNo="""),_display_(/*128.64*/study/*128.69*/._2),format.raw/*128.72*/(""""><span>"""),_display_(/*128.81*/study/*128.86*/._1._1),format.raw/*128.92*/("""</span></a> </td>
                            <!-- <td>  <div class="pyramid"  id="container"""),_display_(/*129.76*/j),format.raw/*129.77*/("""" studyNum="""),_display_(/*129.89*/study/*129.94*/._2),format.raw/*129.97*/(""" """),format.raw/*129.98*/("""style="min-width: 180px; max-width: 200px; height: 140px; margin: 0 auto"></div> </td> -->
                            """),_display_(/*130.30*/{j = j + 1;}),format.raw/*130.42*/("""
                            """),format.raw/*131.29*/("""<td> """),_display_(/*131.35*/study/*131.40*/._1._2),format.raw/*131.46*/(""" """),format.raw/*131.47*/("""</td>
                            <!-- <td> <a href="/showAddTopSummary?studyId="""),_display_(/*132.76*/study/*132.81*/._2),format.raw/*132.84*/(""""><span>Create Summary</span></a> </td> -->


                            <td>
                                <form action="/showAllSubjectsHide" method="GET" enctype="multipart/form-data">
                                    <input type="hidden" name="studyId" id="studyId" value= """),_display_(/*137.94*/study/*137.99*/._2),format.raw/*137.102*/(""">
                                    """),_display_(/*138.38*/if(study._1._2 == userName)/*138.65*/ {_display_(Seq[Any](format.raw/*138.67*/("""

                                    """),format.raw/*140.37*/("""<input type="submit" name="Edit" value="Edit">

                                    """)))}),format.raw/*142.38*/("""
                                """),format.raw/*143.33*/("""</form>
                            </td>

                            <!-- <td><a href="/downloadStudy?studyId="""),_display_(/*146.71*/study/*146.76*/._2),format.raw/*146.79*/("""" class="export">Export</a></td> -->
                            <td><a href="/drp?studyNo="""),_display_(/*147.56*/study/*147.61*/._2),format.raw/*147.64*/("""" class="export">Export</a></td>



                            <td>
                                <form action="/deleteStudy" method="POST" enctype="multipart/form-data" onclick="return confirm('Are you sure you want to delete this item?');">
                                    <input type="hidden" name="study_id" id="study_id" value= """),_display_(/*153.96*/study/*153.101*/._2),format.raw/*153.104*/(""">
                                    """),_display_(/*154.38*/if(study._1._2 == userName)/*154.65*/ {_display_(Seq[Any](format.raw/*154.67*/("""

                                    """),format.raw/*156.37*/("""<input type="submit" name="submit" value="delete">

                                    """)))}),format.raw/*158.38*/("""
                                """),format.raw/*159.33*/("""</form>
                            </td>

                            <!-- <td>
                                 <form action="/addNewSubject" method="GET" enctype="multipart/form-data">
                                     <input type="hidden" name="studyNo" id="studyNo" value= """),_display_(/*164.95*/study/*164.100*/._2),format.raw/*164.103*/(""">
                                     """),_display_(/*165.39*/if(study._1._2 == userName)/*165.66*/ {_display_(Seq[Any](format.raw/*165.68*/("""

                                     """),format.raw/*167.38*/("""<input type="submit" name="Edit" value="Edit2">

                                     """)))}),format.raw/*169.39*/("""
                                 """),format.raw/*170.34*/("""</form>
                             </td> -->





                        </tr>
                        """)))}),format.raw/*178.26*/("""

                        """),format.raw/*180.25*/("""</tbody>
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


$(document).ready(function()"""),format.raw/*196.29*/("""{"""),format.raw/*196.30*/("""


   """),format.raw/*199.4*/("""Highcharts.theme = """),format.raw/*199.23*/("""{"""),format.raw/*199.24*/("""
   """),format.raw/*200.4*/("""colors: ["#55BF3B", "#888888", "#DF5353"]
"""),format.raw/*201.1*/("""}"""),format.raw/*201.2*/(""";
var highchartsOptions = Highcharts.setOptions(Highcharts.theme);

$(".pyramid" ).each(function( index ) """),format.raw/*204.39*/("""{"""),format.raw/*204.40*/("""

"""),format.raw/*206.1*/("""var stdNo= $(this).attr('studyNum');


var name = "#container" + stdNo

 $(this).highcharts("""),format.raw/*211.21*/("""{"""),format.raw/*211.22*/("""
                """),format.raw/*212.17*/("""chart: """),format.raw/*212.24*/("""{"""),format.raw/*212.25*/("""
                    """),format.raw/*213.21*/("""type: 'pyramid',
                    marginRight: 10
                """),format.raw/*215.17*/("""}"""),format.raw/*215.18*/(""",
                title: """),format.raw/*216.24*/("""{"""),format.raw/*216.25*/("""
                    """),format.raw/*217.21*/("""text: '',
                    x: -50
                """),format.raw/*219.17*/("""}"""),format.raw/*219.18*/(""",
                tooltip: """),format.raw/*220.26*/("""{"""),format.raw/*220.27*/("""
            """),format.raw/*221.13*/("""enabled: false
        """),format.raw/*222.9*/("""}"""),format.raw/*222.10*/(""",
                plotOptions: """),format.raw/*223.30*/("""{"""),format.raw/*223.31*/("""
                        """),format.raw/*224.25*/("""series: """),format.raw/*224.33*/("""{"""),format.raw/*224.34*/("""
                           """),format.raw/*225.28*/("""dataLabels: """),format.raw/*225.40*/("""{"""),format.raw/*225.41*/("""
                                """),format.raw/*226.33*/("""enabled: false
                                """),format.raw/*227.33*/("""}"""),format.raw/*227.34*/(""",
                            cursor: 'pointer',
                            point: """),format.raw/*229.36*/("""{"""),format.raw/*229.37*/("""
                                """),format.raw/*230.33*/("""events: """),format.raw/*230.41*/("""{"""),format.raw/*230.42*/("""
                                    """),format.raw/*231.37*/("""click: function (e) """),format.raw/*231.57*/("""{"""),format.raw/*231.58*/("""
                                       """),format.raw/*232.40*/("""// var temp = this.series.data


                                        if(this.x == 2)"""),format.raw/*235.56*/("""{"""),format.raw/*235.57*/("""
                                           """),format.raw/*236.44*/("""window.location = '/showStudy/' + stdNo
                                           """),format.raw/*237.44*/("""}"""),format.raw/*237.45*/("""
                                         """),format.raw/*238.42*/("""else if(this.x ==1)
                                           window.location = '/showStudySkipTop/'+ stdNo
                                         else
                                          window.location = '/displaySubject?studyNo=' + stdNo + '&SubjectId='
                                    """),format.raw/*242.37*/("""}"""),format.raw/*242.38*/("""
                                """),format.raw/*243.33*/("""}"""),format.raw/*243.34*/("""
                            """),format.raw/*244.29*/("""}"""),format.raw/*244.30*/(""",
                            marker: """),format.raw/*245.37*/("""{"""),format.raw/*245.38*/("""
                                """),format.raw/*246.33*/("""lineWidth: 1
                            """),format.raw/*247.29*/("""}"""),format.raw/*247.30*/("""
                        """),format.raw/*248.25*/("""}"""),format.raw/*248.26*/("""
                """),format.raw/*249.17*/("""}"""),format.raw/*249.18*/(""",
                 credits: """),format.raw/*250.27*/("""{"""),format.raw/*250.28*/("""
                  """),format.raw/*251.19*/("""enabled: false
              """),format.raw/*252.15*/("""}"""),format.raw/*252.16*/(""",
                legend: """),format.raw/*253.25*/("""{"""),format.raw/*253.26*/("""
                    """),format.raw/*254.21*/("""enabled: false
                """),format.raw/*255.17*/("""}"""),format.raw/*255.18*/(""",
                exporting: """),format.raw/*256.28*/("""{"""),format.raw/*256.29*/(""" """),format.raw/*256.30*/("""enabled: false """),format.raw/*256.45*/("""}"""),format.raw/*256.46*/(""" """),format.raw/*256.47*/(""",
                series: ["""),format.raw/*257.26*/("""{"""),format.raw/*257.27*/("""
                    """),format.raw/*258.21*/("""name: 'Unique users',
                    data: [
                        ['Session view',   100],
                        ['User Portrait',       100],
                        ['Top Summary', 100],
                    ]
                """),format.raw/*264.17*/("""}"""),format.raw/*264.18*/("""]
            """),format.raw/*265.13*/("""}"""),format.raw/*265.14*/(""");

"""),format.raw/*267.1*/("""}"""),format.raw/*267.2*/(""");


   $('.export').click(function() """),format.raw/*270.34*/("""{"""),format.raw/*270.35*/("""
           """),format.raw/*271.12*/("""var link= $(this).attr('getLink');
           // alert(link);
          // Id of the element that was clicked
         $("#loading").show();

         $("#loading").hide();
    """),format.raw/*277.5*/("""}"""),format.raw/*277.6*/(""");
 """),format.raw/*278.2*/("""}"""),format.raw/*278.3*/(""");

</script>
<script>
		!function ($) """),format.raw/*282.17*/("""{"""),format.raw/*282.18*/("""
			"""),format.raw/*283.4*/("""$(document).on("click","ul.nav li.parent > a > span.icon", function()"""),format.raw/*283.73*/("""{"""),format.raw/*283.74*/("""		  
				"""),format.raw/*284.5*/("""$(this).find('em:first').toggleClass("glyphicon-minus");	  
			"""),format.raw/*285.4*/("""}"""),format.raw/*285.5*/("""); 
			$(".sidebar span.icon").find('em:first').addClass("glyphicon-plus");
		"""),format.raw/*287.3*/("""}"""),format.raw/*287.4*/("""(window.jQuery);

		$(window).on('resize', function () """),format.raw/*289.38*/("""{"""),format.raw/*289.39*/("""
		  """),format.raw/*290.5*/("""if ($(window).width() > 768) $('#sidebar-collapse').collapse('show')
		"""),format.raw/*291.3*/("""}"""),format.raw/*291.4*/(""")
		$(window).on('resize', function () """),format.raw/*292.38*/("""{"""),format.raw/*292.39*/("""
		  """),format.raw/*293.5*/("""if ($(window).width() <= 767) $('#sidebar-collapse').collapse('hide')
		"""),format.raw/*294.3*/("""}"""),format.raw/*294.4*/(""")
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
                  DATE: Wed Dec 28 16:18:33 CST 2016
                  SOURCE: C:/first_play/app/views/ShowStudies.scala.html
                  HASH: ac1661146f895f0a9a6380aa4d9a3bb79e38ad1e
                  MATRIX: 572->1|775->78|803->80|3057->2306|3087->2314|3117->2315|7431->6642|7484->6667|7522->6688|7563->6690|7618->6716|7793->6863|7808->6868|7833->6871|7870->6880|7885->6885|7913->6891|8035->6985|8058->6986|8098->6998|8113->7003|8138->7006|8168->7007|8317->7128|8351->7140|8410->7170|8444->7176|8459->7181|8487->7187|8517->7188|8627->7270|8642->7275|8667->7278|8984->7567|8999->7572|9025->7575|9093->7615|9130->7642|9171->7644|9240->7684|9359->7771|9422->7805|9566->7921|9581->7926|9606->7929|9727->8022|9742->8027|9767->8030|10142->8377|10158->8382|10184->8385|10252->8425|10289->8452|10330->8454|10399->8494|10522->8585|10585->8619|10900->8906|10916->8911|10942->8914|11011->8955|11048->8982|11089->8984|11159->9025|11280->9114|11344->9149|11491->9264|11548->9292|12009->9724|12039->9725|12076->9734|12124->9753|12154->9754|12187->9759|12258->9802|12287->9803|12425->9912|12455->9913|12487->9917|12613->10014|12643->10015|12690->10033|12726->10040|12756->10041|12807->10063|12907->10134|12937->10135|12992->10161|13022->10162|13073->10184|13157->10239|13187->10240|13244->10268|13274->10269|13317->10283|13369->10307|13399->10308|13460->10340|13490->10341|13545->10367|13582->10375|13612->10376|13670->10405|13711->10417|13741->10418|13804->10452|13881->10500|13911->10501|14026->10587|14056->10588|14119->10622|14156->10630|14186->10631|14253->10669|14302->10689|14332->10690|14402->10731|14522->10822|14552->10823|14626->10868|14739->10952|14769->10953|14841->10996|15176->11302|15206->11303|15269->11337|15299->11338|15358->11368|15388->11369|15456->11408|15486->11409|15549->11443|15620->11485|15650->11486|15705->11512|15735->11513|15782->11531|15812->11532|15870->11561|15900->11562|15949->11582|16008->11612|16038->11613|16094->11640|16124->11641|16175->11663|16236->11695|16266->11696|16325->11726|16355->11727|16385->11728|16429->11743|16459->11744|16489->11745|16546->11773|16576->11774|16627->11796|16899->12039|16929->12040|16973->12055|17003->12056|17037->12062|17066->12063|17136->12104|17166->12105|17208->12118|17419->12301|17448->12302|17481->12307|17510->12308|17582->12351|17612->12352|17645->12357|17743->12426|17773->12427|17811->12437|17903->12501|17932->12502|18040->12582|18069->12583|18155->12640|18185->12641|18219->12647|18319->12719|18348->12720|18417->12760|18447->12761|18481->12767|18582->12840|18611->12841
                  LINES: 19->1|22->1|23->2|68->47|68->47|68->47|145->125|145->125|145->125|145->125|146->126|148->128|148->128|148->128|148->128|148->128|148->128|149->129|149->129|149->129|149->129|149->129|149->129|150->130|150->130|151->131|151->131|151->131|151->131|151->131|152->132|152->132|152->132|157->137|157->137|157->137|158->138|158->138|158->138|160->140|162->142|163->143|166->146|166->146|166->146|167->147|167->147|167->147|173->153|173->153|173->153|174->154|174->154|174->154|176->156|178->158|179->159|184->164|184->164|184->164|185->165|185->165|185->165|187->167|189->169|190->170|198->178|200->180|216->196|216->196|219->199|219->199|219->199|220->200|221->201|221->201|224->204|224->204|226->206|231->211|231->211|232->212|232->212|232->212|233->213|235->215|235->215|236->216|236->216|237->217|239->219|239->219|240->220|240->220|241->221|242->222|242->222|243->223|243->223|244->224|244->224|244->224|245->225|245->225|245->225|246->226|247->227|247->227|249->229|249->229|250->230|250->230|250->230|251->231|251->231|251->231|252->232|255->235|255->235|256->236|257->237|257->237|258->238|262->242|262->242|263->243|263->243|264->244|264->244|265->245|265->245|266->246|267->247|267->247|268->248|268->248|269->249|269->249|270->250|270->250|271->251|272->252|272->252|273->253|273->253|274->254|275->255|275->255|276->256|276->256|276->256|276->256|276->256|276->256|277->257|277->257|278->258|284->264|284->264|285->265|285->265|287->267|287->267|290->270|290->270|291->271|297->277|297->277|298->278|298->278|302->282|302->282|303->283|303->283|303->283|304->284|305->285|305->285|307->287|307->287|309->289|309->289|310->290|311->291|311->291|312->292|312->292|313->293|314->294|314->294
                  -- GENERATED --
              */
          