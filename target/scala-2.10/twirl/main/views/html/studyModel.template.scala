
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
object studyModel extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Map[String, List[String]],Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userName: String, sub_sess: Map[String, List[( String)]], studyNo:Int):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import java.math.BigInteger; var i=1;

Seq[Any](format.raw/*1.73*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
    <title>StressBook</title>
    <meta content="width=1170" name="viewport">
    <meta content="text/html; charset=UTF-8" http-equiv="Content-Type"><meta content="IRQcweD5CIs6Qc-uVi9xT3BD-1jPvDxyk3-9LUah9T8" name="google-site-verification">
    <link href="/assets/images/favicon.png" rel="icon" type="image/png">
    <script type="text/javascript" src="/assets/js/jquery-1.9.0.min.js"></script>
    <script type="text/javascript" src="/assets/js/jquery-ui-1.9.2.custom.min.js"></script>
    <script type="text/javascript" src="/assets/js/ow-all.js"></script>
    <script type="text/javascript" src="/assets/js/webapp.js"></script>
    <script type="text/javascript" src="/assets/js/browser-features.js"></script>
    <script type="text/javascript" src="/assets/js/common.js"></script>
    <!-- <script type="text/javascript" src="/assets/js/notifications.js"></script> -->
    <!-- <script type="text/javascript" src="/assets/js/modeler/lib/jquery.caret.1.02.js"></script> -->
    <!--<script type="text/javascript" src="/assets/js/modeler/lib/jquery.mousewheel.min.js"></script> -->
    <script type="text/javascript" src="/assets/js/modeler/lib/jquery.cookie.js"></script>
    <script type="text/javascript" src="/assets/js/modeler/lib/kinetic-v4.7.4.js"></script>
    <script type="text/javascript" src="/assets/js/modeler/lib/underscore.js"></script>
    <script type="text/javascript" src="/assets/js/modeler/lib/backbone.js"></script>
    <script type="text/javascript" src="/assets/js/modeler/lib/undomanager.js"></script>
    <script type="text/javascript" src="/assets/js/modeler/lib/dbwm.check.js"></script>
    <script type="text/javascript" src="/assets/js/modeler/lib/codemirror/codemirror.js"></script>
    <!--<script type="text/javascript" src="/assets/js/modeler/lib/codemirror/sql.js"></script> -->
    <script type="text/javascript" src="/assets/js/modeler/lib/codemirror/fullscreen.js"></script>
    <!--  <script type="text/javascript" src="/assets/js/modeler/lib/codemirror/vertabelo-editor.js"></script> -->
    <!--   <script type="text/javascript" src="/assets/js/modeler/lib/sql-parser-0.4.1.js"></script> -->
       <script type="text/javascript" src="/assets/js/modeler/lib/intro-0.8.0.min.js"></script>
       <script type="text/javascript" src="/assets/js/modeler/lib/highlight.min.js"></script>
       <script type="text/javascript" src="/assets/js/modeler/lib/dbwm-extras.js"></script>
       <script type="text/javascript" src="/assets/js/modeler/modeler.js"></script>
       <script type="text/javascript" src="/assets/js/my_models.js"></script>


       <script type="text/javascript" src="https://www.google.com/jsapi"></script>
       <script type='text/javascript' src='"""),_display_(/*38.45*/routes/*38.51*/.Assets.at("js/drawchart.js")),format.raw/*38.80*/("""'></script>
       <script type='text/javascript' src='"""),_display_(/*39.45*/routes/*39.51*/.Assets.at("js/changevideo.js")),format.raw/*39.82*/("""'></script>
       <script type='text/javascript' src='"""),_display_(/*40.45*/routes/*40.51*/.Assets.at("js/run_activation.js")),format.raw/*40.85*/("""'></script>


       <!-- <script type='text/javascript' src='"""),_display_(/*43.50*/routes/*43.56*/.Assets.at("js/index.js")),format.raw/*43.81*/("""'></script> -->
    <!-- <script type='text/javascript' src='"""),_display_(/*44.47*/routes/*44.53*/.Assets.at("js/Intialization.js")),format.raw/*44.86*/("""'></script> -->
    <!-- <script type='text/javascript' src='"""),_display_(/*45.47*/routes/*45.53*/.Assets.at("js/buildtree.js")),format.raw/*45.82*/("""'></script> -->


     <link rel="stylesheet" href="/assets/stylesheets/portrat.css" type="text/css" />


    <link rel="stylesheet" type="text/css" href="/assets/stylesheets/datePicker.css">
    <link rel="stylesheet" type="text/css" href="/assets/stylesheets/oneweb.css">
    <link rel="stylesheet" type="text/css" href="/assets/stylesheets/dbwm.css">
    <link rel="stylesheet" type="text/css" href="/assets/stylesheets/jquery-ui-1.9.2.css">
    <link rel="stylesheet" type="text/css" href="/assets/stylesheets/modeler.css">
    <link rel="stylesheet" type="text/css" href="/assets/stylesheets/codemirror/codemirror.css">
    <link rel="stylesheet" type="text/css" href="/assets/stylesheets/codemirror/fullscreen.css">
    <link rel="stylesheet" type="text/css" href="/assets/stylesheets/codemirror/vertabelo-editor.css">
    <link rel="stylesheet" type="text/css" href="/assets/stylesheets/qunit-1.14.0.css">
    <link rel="stylesheet" type="text/css" href="/assets/stylesheets/introjs-0.8.0.min.css">
    <link rel="stylesheet" type="text/css" href="/assets/stylesheets/highlight-railscasts.min.css"><!-- start Mixpanel --><script content-type="text/javascript">

              (function(e,b)"""),format.raw/*63.29*/("""{"""),format.raw/*63.30*/("""if(!b.__SV)"""),format.raw/*63.41*/("""{"""),format.raw/*63.42*/("""var a,f,i,g;window.mixpanel=b;a=e.createElement('script');a.type='text/javascript';a.async=!0;a.src=('https:'===e.location.protocol?'https:':'http:')+'//cdn.mxpnl.com/libs/mixpanel-2.2.min.js';f=e.getElementsByTagName('script')[0];f.parentNode.insertBefore(a,f);b._i=[];b.init=function(a,e,d)"""),format.raw/*63.334*/("""{"""),format.raw/*63.335*/("""function f(b,h)"""),format.raw/*63.350*/("""{"""),format.raw/*63.351*/("""var a=h.split('.');2==a.length&&(b=b[a[0]],h=a[1]);b[h]=function()"""),format.raw/*63.417*/("""{"""),format.raw/*63.418*/("""b.push([h].concat(Array.prototype.slice.call(arguments,0)))"""),format.raw/*63.477*/("""}"""),format.raw/*63.478*/("""}"""),format.raw/*63.479*/("""var c=b;'undefined'!==
            typeof d?c=b[d]=[]:d='mixpanel';c.people=c.people||[];c.toString=function(b)"""),format.raw/*64.89*/("""{"""),format.raw/*64.90*/("""var a='mixpanel';'mixpanel'!==d&&(a+='.'+d);b||(a+=' (stub)');return a"""),format.raw/*64.160*/("""}"""),format.raw/*64.161*/(""";c.people.toString=function()"""),format.raw/*64.190*/("""{"""),format.raw/*64.191*/("""return c.toString(1)+'.people (stub)'"""),format.raw/*64.228*/("""}"""),format.raw/*64.229*/(""";i='disable track track_pageview track_links track_forms register register_once alias unregister identify name_tag set_config people.set people.set_once people.increment people.append people.track_charge people.clear_charges people.delete_user'.split(' ');for(g=0;g<i.length;g++)f(c,i[g]);
            b._i.push([a,e,d])"""),format.raw/*65.31*/("""}"""),format.raw/*65.32*/(""";b.__SV=1.2"""),format.raw/*65.43*/("""}"""),format.raw/*65.44*/("""}"""),format.raw/*65.45*/(""")(document,window.mixpanel||[]);


              mixpanel.init("7db79ecd16267922e52d126972ff304e");

              </script><script content-type="text/javascript">mixpanel.people.set("""),format.raw/*70.83*/("""{"""),format.raw/*70.84*/(""""$email": "taamneh_07@hotmail.com",
                                    "Account Plan": "Free",
                                    "Is Trial Plan": false,
                                    "Account Plan Valid To": "",
                                    "Last Login Date": "2014-09-17T21:06:57",
                                    "Active Models":2,
                                    "Largest Own Model":7,
                                    "Sharing Degree":0
                             """),format.raw/*78.30*/("""}"""),format.raw/*78.31*/(""");mixpanel.identify("pr-18363");mixpanel.track_pageview();</script><!-- end Mixpanel -->
    <script type='text/javascript'>    var reader = document.createElement('a');    reader.href = document.location.href;    var ary = reader.pathname.split('/');    var p = null;    if(ary.length > 1) """),format.raw/*79.203*/("""{"""),format.raw/*79.204*/("""        """),format.raw/*79.212*/("""p= '/' + ary[1];    """),format.raw/*79.232*/("""}"""),format.raw/*79.233*/("""    """),format.raw/*79.237*/("""var _gaq = _gaq || [];    _gaq.push(['_setAccount', 'UA-42689964-1']);    _gaq.push(['_setDomainName', 'vertabelo.com']);    _gaq.push(['_setAllowLinker', true]);    if(p = null) """),format.raw/*79.416*/("""{"""),format.raw/*79.417*/("""      """),format.raw/*79.423*/("""_gaq.push(['_trackPageview', p]);    """),format.raw/*79.460*/("""}"""),format.raw/*79.461*/(""" """),format.raw/*79.462*/("""else """),format.raw/*79.467*/("""{"""),format.raw/*79.468*/("""      """),format.raw/*79.474*/("""_gaq.push(['_trackPageview']);    """),format.raw/*79.508*/("""}"""),format.raw/*79.509*/("""    """),format.raw/*79.513*/("""(function() """),format.raw/*79.525*/("""{"""),format.raw/*79.526*/("""      """),format.raw/*79.532*/("""var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;      ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';      var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);    """),format.raw/*79.834*/("""}"""),format.raw/*79.835*/(""")();
							 </script>
</head>
<body>
<!-- <div id="fusebox_ajax_fuse" style="display: none;"></div> -->
<!-- <div class="tooltip"><div class="content"></div> -->
<!-- <div class="decor"></div></div> -->
<div id="wrapper">
<table class="border_layout" style="border:1px solid;width:100%;">
<tr>
    <td class="border_layout_north" colspan="3">
        <div class="border_layout_north">
            <div id="header_wrapper">


                <div id="header">
                    <a class="logo" href="http://www.cpl.uh.edu/"><img alt="Vertabelo Logo" width="70" height="40"  src="/assets/images/cpllogo.png"></a>
                    <ul class="user_menu">
                        <li class="user dropdown_holder"><span class="dropdown"><span>"""),_display_(/*97.88*/userName),format.raw/*97.96*/("""</span></span><div class="dropdown_menu_holder"><div class="dropdown_menu"><ul class="m"><li><a href="/my-account?action=flow.reset&amp;flow.flow=my_account" id="btn31"><span>My account</span></a>
                            <!-- <script type="text/javascript">oneweb.DocumentReadyManager.addOnewebAction(function() """),format.raw/*98.120*/("""{"""),format.raw/*98.121*/("""epoint.ow.Utils.bindEvent("click","btn31","epoint.ow.Utils.buttonDefaultsHandler",null);"""),format.raw/*98.209*/("""}"""),format.raw/*98.210*/(""",90,null);</script> -->
                            <!-- <script type="text/javascript">oneweb.DocumentReadyManager.addOnewebAction(function() """),format.raw/*99.120*/("""{"""),format.raw/*99.121*/("""epoint.ow.Utils.bindEvent("click","btn31","oneweb.CsrfTokenManager.postHandler",null,null);"""),format.raw/*99.212*/("""}"""),format.raw/*99.213*/(""",null,null);</script> -->
                        </li>
                        </ul>
                        </div>
                        </div>
                        </li>
                        <li class="notifications"><div id="flow_notifications_layer_div"><div class="menu_item dropdown_holder"><a class="dropdown notifications" href="?action=flow.transit&amp;flow.flow=notifications_layer&amp;flow.transition=expanded&amp;flow.reloadFlow=notifications_layer" id="btn32"><span></span></a><script type="text/javascript">oneweb.DocumentReadyManager.addOnewebAction(function() """),format.raw/*105.408*/("""{"""),format.raw/*105.409*/("""epoint.ow.Utils.bindEvent("click","btn32","epoint.ow.Utils.buttonDefaultsHandler",null);"""),format.raw/*105.497*/("""}"""),format.raw/*105.498*/(""",90,null);</script><script type="text/javascript">oneweb.DocumentReadyManager.addOnewebAction(function() """),format.raw/*105.603*/("""{"""),format.raw/*105.604*/("""epoint.ow.Utils.bindEvent("click","btn32","epoint.ow.flow.Utils.ajaxFlowHandler",null);"""),format.raw/*105.691*/("""}"""),format.raw/*105.692*/(""",null,null);
                             </script></div>
                       <!--  <script type="text/javascript">oneweb.DocumentReadyManager.addOnewebAction(function() """),format.raw/*107.116*/("""{"""),format.raw/*107.117*/("""pl.epoint.dbwm.war_user.notifications.startNotificationsLayerRefresh("?action=flow.transit&flow.flow=notifications_layer&flow.transition=refresh&flow.reloadFlow=notifications_layer&flow.disableMessagesAddons=true");"""),format.raw/*107.332*/("""}"""),format.raw/*107.333*/(""",null,null);</script> -->
                    </div><script type="text/javascript">oneweb.DocumentReadyManager.addOnewebAction(function() """),format.raw/*108.113*/("""{"""),format.raw/*108.114*/("""epoint.ow.flow.Utils.setCurrentState("notifications_layer","collapsed");"""),format.raw/*108.186*/("""}"""),format.raw/*108.187*/(""",null,null);</script></li><li class="logout"><a href="/logout" id="btn33"><span>Log out</span></a><script type="text/javascript">oneweb.DocumentReadyManager.addOnewebAction(function() """),format.raw/*108.371*/("""{"""),format.raw/*108.372*/("""epoint.ow.Utils.bindEvent("click","btn33","epoint.ow.Utils.buttonDefaultsHandler",null);"""),format.raw/*108.460*/("""}"""),format.raw/*108.461*/(""",90,null);</script><script type="text/javascript">oneweb.DocumentReadyManager.addOnewebAction(function() """),format.raw/*108.566*/("""{"""),format.raw/*108.567*/("""epoint.ow.Utils.bindEvent("click","btn33","oneweb.CsrfTokenManager.postHandler",null,null);"""),format.raw/*108.658*/("""}"""),format.raw/*108.659*/(""",null,null);</script></li>
                    </ul>
                    <ul class="links">
                        <li class="dropdown_holder expandable expand-priority-1"><span class="dropdown"><span>Modules</span></span><div class="dropdown_menu_holder"><div class="dropdown_menu"><ul class="m"><li><a href="/diagram">Diagram</a></li><li><a href="/allStudies" id="btn34"><span>My models</span></a></li><li><a href="/sharing?action=flow.reset&amp;flow.flow=model_sharing" id="btn35"><span>Sharing</span></a><script type="text/javascript">oneweb.DocumentReadyManager.addOnewebAction(function() """),format.raw/*111.504*/("""{"""),format.raw/*111.505*/("""epoint.ow.Utils.bindEvent("click","btn35","epoint.ow.Utils.buttonDefaultsHandler",null);"""),format.raw/*111.593*/("""}"""),format.raw/*111.594*/(""",90,null);</script><script type="text/javascript">oneweb.DocumentReadyManager.addOnewebAction(function() """),format.raw/*111.699*/("""{"""),format.raw/*111.700*/("""epoint.ow.Utils.bindEvent("click","btn35","oneweb.CsrfTokenManager.postHandler",null,null);"""),format.raw/*111.791*/("""}"""),format.raw/*111.792*/(""",null,null);</script></li><li><a href="/recommend-us?action=flow.reset&amp;flow.flow=recommend_us" id="btn36"><span>Recommend us</span></a><script type="text/javascript">oneweb.DocumentReadyManager.addOnewebAction(function() """),format.raw/*111.1017*/("""{"""),format.raw/*111.1018*/("""epoint.ow.Utils.bindEvent("click","btn36","epoint.ow.Utils.buttonDefaultsHandler",null);"""),format.raw/*111.1106*/("""}"""),format.raw/*111.1107*/(""",90,null);</script><script type="text/javascript">oneweb.DocumentReadyManager.addOnewebAction(function() """),format.raw/*111.1212*/("""{"""),format.raw/*111.1213*/("""epoint.ow.Utils.bindEvent("click","btn36","oneweb.CsrfTokenManager.postHandler",null,null);"""),format.raw/*111.1304*/("""}"""),format.raw/*111.1305*/(""",null,null);</script></li></ul></div></div></li><li class="dropdown_holder" id="help-menu"><span class="dropdown"><span>Help</span></span>
                        <div class="dropdown_menu_holder">
                            <div class="dropdown_menu">
                                <ul class="m">
                                    <li>
                                        <a href="javascript: IntroGuide.start();" id="take-application-tour-menu-item" style="display: none;">Take application tour</a>
                                    </li>
                                    <li id="shortcut-helper-menu-item" style="display: none;">
                                        <a href="javascript: app.showShortcutsHelper();">Keyboard shortcuts</a>
                                    </li>
                                    <li>
                                        <a target="_blank" href="http://vertabelo.com">Vertabelo website</a>
                                    </li>
                                    <li>
                                        <a target="_blank" href="http://vertabelo.com/documentation">Documentation</a>
                                    </li>
                                    <li>
                                        <a target="_blank" href="http://vertabelo.com/faq">FAQ</a>
                                    </li>
                                    <li>
                                        <a href="/support/ask-a-question" id="btn37" target="_blank"><span>Ask a question</span></a>
                                        <script type="text/javascript">oneweb.DocumentReadyManager.addOnewebAction(function()
																	"""),format.raw/*133.18*/("""{"""),format.raw/*133.19*/("""epoint.ow.Utils.bindEvent("click","btn37","epoint.ow.Utils.buttonDefaultsHandler",null);"""),format.raw/*133.107*/("""}"""),format.raw/*133.108*/(""",90,null);
																</script>
                                        <script type="text/javascript">oneweb.DocumentReadyManager.addOnewebAction(function()
																	"""),format.raw/*136.18*/("""{"""),format.raw/*136.19*/("""epoint.ow.Utils.bindEvent("click","btn37","oneweb.CsrfTokenManager.postHandler",null,null);"""),format.raw/*136.110*/("""}"""),format.raw/*136.111*/(""",null,null);
																</script>
                                    </li>
                                    <li>
                                        <a href="/support/request-a-feature" id="btn38" target="_blank"><span>Request a feature</span></a>
                                        <script type="text/javascript">oneweb.DocumentReadyManager.addOnewebAction(function()
																   """),format.raw/*142.20*/("""{"""),format.raw/*142.21*/("""epoint.ow.Utils.bindEvent("click","btn38","epoint.ow.Utils.buttonDefaultsHandler",null);"""),format.raw/*142.109*/("""}"""),format.raw/*142.110*/(""",90,null);
																</script>
                                        <script type="text/javascript">oneweb.DocumentReadyManager.addOnewebAction(function()
																   """),format.raw/*145.20*/("""{"""),format.raw/*145.21*/("""epoint.ow.Utils.bindEvent("click","btn38","oneweb.CsrfTokenManager.postHandler",null,null);"""),format.raw/*145.112*/("""}"""),format.raw/*145.113*/(""",null,null);
																</script>
                                    </li>
                                    <li>
                                        <a href="/support/report-a-problem" id="btn39" target="_blank"><span>Report a problem</span></a>
                                        <script type="text/javascript">oneweb.DocumentReadyManager.addOnewebAction(function()
																"""),format.raw/*151.17*/("""{"""),format.raw/*151.18*/("""epoint.ow.Utils.bindEvent("click","btn39","epoint.ow.Utils.buttonDefaultsHandler",null);"""),format.raw/*151.106*/("""}"""),format.raw/*151.107*/(""",90,null);
																</script><script type="text/javascript">oneweb.DocumentReadyManager.addOnewebAction(function()
																"""),format.raw/*153.17*/("""{"""),format.raw/*153.18*/("""epoint.ow.Utils.bindEvent("click","btn39","oneweb.CsrfTokenManager.postHandler",null,null);"""),format.raw/*153.109*/("""}"""),format.raw/*153.110*/(""",null,null);
																</script>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </li>
                    </ul>

                    <div class="clearFix">
                    </div>
                    <div class="clearFix">
                    </div>
                </div>


            </div>

             <table id="toolbar_wrapper"><tr><td class="item wide">



                <div class="block_dialog_container"><div class="popup initialHide" id="popup_flow_share_model_div"><div class="popup_arrow_up"></div><a class="close-popup-button" id="btn2521"><span>X</span></a><script type="text/javascript">oneweb.DocumentReadyManager.addOnewebAction(function() """),format.raw/*175.297*/("""{"""),format.raw/*175.298*/("""epoint.ow.Utils.bindEvent("click","btn2521","epoint.ow.Utils.buttonDefaultsHandler",null);"""),format.raw/*175.388*/("""}"""),format.raw/*175.389*/(""",90,null);</script><script type="text/javascript">oneweb.DocumentReadyManager.addOnewebAction(function() """),format.raw/*175.494*/("""{"""),format.raw/*175.495*/("""epoint.ow.Utils.bindEvent("click","btn2521","epoint.ow.popup.PopupManager.closePopupClickHandler","popup_flow_share_model_div",[]);"""),format.raw/*175.626*/("""}"""),format.raw/*175.627*/(""",null,null);</script><div class="clearFix"></div><div class="popup_inner"><div id="flow_share_model_div"><img src="/assets/images/empty_flow_content.gif"></div><script type="text/javascript">oneweb.DocumentReadyManager.addOnewebAction(function() """),format.raw/*175.873*/("""{"""),format.raw/*175.874*/("""epoint.ow.flow.Utils.setCurrentState("share_model","share");"""),format.raw/*175.934*/("""}"""),format.raw/*175.935*/(""",null,null);</script></div></div></div><span id="share_model_button_wrapper"><a class="button" href="?action=flow.reset&amp;flow.flow=share_model&amp;flow.reloadFlow=share_model" id="btn2522"><span>Share model</span></a><script type="text/javascript">oneweb.DocumentReadyManager.addOnewebAction(function() """),format.raw/*175.1241*/("""{"""),format.raw/*175.1242*/("""epoint.ow.Utils.bindEvent("click","btn2522","epoint.ow.Utils.buttonDefaultsHandler",null);"""),format.raw/*175.1332*/("""}"""),format.raw/*175.1333*/(""",90,null);</script><script type="text/javascript">oneweb.DocumentReadyManager.addOnewebAction(function() """),format.raw/*175.1438*/("""{"""),format.raw/*175.1439*/("""epoint.ow.Utils.bindEvent("click","btn2522","epoint.ow.popup.PopupManager.openPopupAfterAjaxFlowReloadClickHandler","popup_flow_share_model_div","flow_share_model_div",[]);epoint.ow.Utils.bindEvent("click","btn2522","epoint.ow.flow.Utils.ajaxFlowHandler",null);"""),format.raw/*175.1700*/("""}"""),format.raw/*175.1701*/(""",null,null);</script></span><div class="block_dialog_container"><div class="popup initialHide compact" id="sql_generator_form_container"><div class="popup_arrow_up"></div><a class="close-popup-button" id="btn2524"><span>X</span></a><script type="text/javascript">oneweb.DocumentReadyManager.addOnewebAction(function() """),format.raw/*175.2019*/("""{"""),format.raw/*175.2020*/("""epoint.ow.Utils.bindEvent("click","btn2524","epoint.ow.Utils.buttonDefaultsHandler",null);"""),format.raw/*175.2110*/("""}"""),format.raw/*175.2111*/(""",90,null);</script><script type="text/javascript">oneweb.DocumentReadyManager.addOnewebAction(function() """),format.raw/*175.2216*/("""{"""),format.raw/*175.2217*/("""epoint.ow.Utils.bindEvent("click","btn2524","epoint.ow.popup.PopupManager.closePopupClickHandler","sql_generator_form_container",[]);"""),format.raw/*175.2350*/("""}"""),format.raw/*175.2351*/(""",null,null);</script><div class="clearFix"></div><div class="popup_inner"><div class="header"><h1>Generate SQL Script</h1></div><form id="sql_generator_form" onSubmit="return false;"><div class="box_form_section"><div class="box_form_content">
                <table cellspacing="0" class="form_table">
                    <tr class="row_1"><td class="cell_1"><span class="field_label">I want to generate:<span class="mandatory">*</span></span>
                    </td>
                        <td class="cell_2"><div class="h_options"><span class="field_option"><input checked="checked" class="radio_field" id="sql_generator_type_create" name="type" type="radio" value="create"><label for="sql_generator_type_create">Create</label></span><span class="field_option"><input class="radio_field" id="sql_generator_type_drop" name="type" type="radio" value="drop"><label for="sql_generator_type_drop">Drop</label></span></div>
                        </td>
                    </tr>
                    <tr class="row_2"><td class="cell_1"><span class="field_label">For following elements:<span class="mandatory">*</span></span></td>
                        <td class="cell_2"><div class="v_options"><span class="field_option"><input checked="checked" class="radio_field" id="sql_generator_scope_tables" name="scope" type="checkbox" value="tables"><label for="sql_generator_scope_tables">Tables</label></span><span class="field_option"><input checked="checked" class="radio_field" id="sql_generator_scope_references" name="scope" type="checkbox" value="references"><label for="sql_generator_scope_references">References</label></span><span class="field_option"><input checked="checked" class="radio_field" id="sql_generator_scope_sequences" name="scope" type="checkbox" value="sequences"><label for="sql_generator_scope_sequences">Sequences</label></span><span class="field_option"><input checked="checked" class="radio_field" id="sql_generator_scope_views" name="scope" type="checkbox" value="views"><label for="sql_generator_scope_views">Views</label></span><span class="field_option"><input checked="checked" class="radio_field" id="sql_generator_scope_procedures" name="scope" type="checkbox" value="procedures"><label for="sql_generator_scope_procedures">Procedures</label></span></div>
                        </td>
                    </tr>
                </table><p class="sql_generator_errors" id="sql_generator_empty_script">You will get empty sql script. Choose at least one element.</p></div></div></form><div id="sql_generator_problems" style="display: none"><div class="section section__small section__separated_below"><div class="header"><h2>Problems </h2></div><div class="content"><p class="sql_generator_errors">The model you want to generate a SQL script from contains errors&#x2F;warnings.
                The generated script may not be accepted by your database.
                We highly recommend that you correct all errors and warnings before generating the SQL script.</p><div class="accordion" id="sql_generator_problems_list" style="display: none"></div></div><div class="clearFix"></div></div></div><div id="sql_generator_progress_checking" style="display: none"><p><img alt="" class="loading-small" src="/assets/images/loading-small.gif">Checking model. Please wait...</p></div><div id="sql_generator_progress_generating" style="display: none"><p><img alt="" class="loading-small" src="/assets/images/loading-small.gif">Generating SQL script. Please wait...</p></div><div id="sql_generator_download" style="display: none"><div class="box_table">
                <table class="table_table"><thead class="table_header">
                <tr><th colspan="2">Generated file</th></tr></thead><tbody class="table_body">
                <tr class="table_row_odd table_row_first table_row_last"><td class="width_max"><a href="#" id="sql_generator_show_model_link" target="_blank">none.sql</a></td><td><a class="button" href="#" id="sql_generator_download_model_button">Download</a></td>
                </tr></tbody>
                </table></div></div><div class="buttons"><a class="button_primary" id="sql_generator_form_button"><span>Generate</span></a>
                <a class="button_primary" id="sql_generator_form_despite_warnings_button"><span>Ignore warnings and generate</span></a>
                <a class="link" id="btn2523"><span>Cancel</span></a><script type="text/javascript">oneweb.DocumentReadyManager.addOnewebAction(function() """),format.raw/*195.155*/("""{"""),format.raw/*195.156*/("""epoint.ow.Utils.bindEvent("click","btn2523","epoint.ow.Utils.buttonDefaultsHandler",null);"""),format.raw/*195.246*/("""}"""),format.raw/*195.247*/(""",90,null);</script><script type="text/javascript">oneweb.DocumentReadyManager.addOnewebAction(function() """),format.raw/*195.352*/("""{"""),format.raw/*195.353*/("""epoint.ow.Utils.bindEvent("click","btn2523","epoint.ow.popup.PopupManager.closePopupClickHandler","sql_generator_form_container",[]);"""),format.raw/*195.486*/("""}"""),format.raw/*195.487*/(""",null,null);</script></div><p class="mandatory_info">Fields marked with [<span class="mandatory">*</span>] must be filled.</p></div></div></div></td><td class="item"><div id="search-box"></div><script type="text/template" id="search-template"><form name="search"><input class="text_field" name="query" placeholder="Search (Ctrl+F)" type="text"></form></script>
            </td></tr>
            </table>
        </div>
    </td>
</tr>
<tr>
    <td class="border_layout_west" id="left-panel">
        <div class="border_layout_west">
            <div class="accordion">
                <div class="block">
                    <div class="header">
                        <h2>Study Structure</h2>
                    </div>
                    <div class="content" style="height:760px;">
                        <div id="handy-menu1"></div>
                        <script type="text/template" id="handy-menu-template">
                            <form onSubmit="return false;">
                                <button class="handy-menu-create-button" type="button">Add """),format.raw/*213.92*/("""{"""),format.raw/*213.93*/("""{"""),format.raw/*213.94*/("""what"""),format.raw/*213.98*/("""}"""),format.raw/*213.99*/("""}"""),format.raw/*213.100*/("""</button>
                                <button class="handy-menu-create-ghost-button" type="button">Add shortcut """),format.raw/*214.107*/("""{"""),format.raw/*214.108*/("""{"""),format.raw/*214.109*/("""what"""),format.raw/*214.113*/("""}"""),format.raw/*214.114*/("""}"""),format.raw/*214.115*/("""</button>
                                <button class="handy-menu-delete-button" type="button">Delete """),format.raw/*215.95*/("""{"""),format.raw/*215.96*/("""{"""),format.raw/*215.97*/("""what"""),format.raw/*215.101*/("""}"""),format.raw/*215.102*/("""}"""),format.raw/*215.103*/("""</button>
                                <button class="handy-menu-find-button" type="button">Find in diagram</button>
                                <button class="handy-menu-find-outside-area-button" type="button">Find in diagram</button>
                                <button class="handy-menu-create-table-button" type="button">Add table</button>
                                <button class="handy-menu-create-view-button" type="button">Add view</button>
                            </form>
                        </script>
                        <script type="text/template" id="handy-menu-find-in-area-template">
                            <button class="handy-menu-find-in-area-button" type="button">Find in """),format.raw/*223.98*/("""{"""),format.raw/*223.99*/("""{"""),format.raw/*223.100*/("""area"""),format.raw/*223.104*/("""}"""),format.raw/*223.105*/("""}"""),format.raw/*223.106*/("""</button>
                        </script>
                        <div class="tree">
                            <div class="tree_title">Model</div>
                            <ul>
                                <li>
                                    <div id="table-list-root-node"><span class="control"></span><span class="icon"><span class="icon_overlay"></span></span><span class="label">Subjects</span><span class="context-menu-trigger" data-label="table" data-what="tables"></span></div>
                                    <ul id="table-list">
                                        <p hidden id = "studyNo" value = "123" subject ="S001">"""),_display_(/*231.97*/studyNo),format.raw/*231.104*/("""</p>
                                                   <!-- <li><input type="checkbox" id="item-0" /><label for="item-0">Children Study</label> -->
                                                    <!-- <ul class ="subjects"> -->
                                                        """),format.raw/*235.1*/("""                                                        """),_display_(/*235.58*/for((subject,sessions) <- sub_sess) yield /*235.93*/{_display_(Seq[Any](format.raw/*235.94*/("""
                                                        """),format.raw/*236.57*/("""<!-- <li><input type="checkbox" id="item-0-2" />"""),_display_(/*236.106*/subject),format.raw/*236.113*/("""<label for="item-0"></label> -->
                                                        <li> <div ><span class="control"></span><span class="icon"><span class="icon_overlay"></span></span><span class="label"><a href="/displaySubject?studyNo="""),_display_(/*237.211*/studyNo),format.raw/*237.218*/("""&SubjectId="""),_display_(/*237.230*/subject),format.raw/*237.237*/("""">"""),_display_(/*237.240*/subject),format.raw/*237.247*/(""" """),format.raw/*237.248*/("""</a></span><span class="context-menu-trigger" data-label="table" data-what="tables"></span></div>
                                                            <ul>
                                                                """),_display_(/*239.66*/for(session <- sessions) yield /*239.90*/{_display_(Seq[Any](format.raw/*239.91*/("""
                                                                    """),format.raw/*240.69*/("""<!-- <li><input type="checkbox" id="item-0-0-23" /><label for="item-0">"""),_display_(/*240.141*/session),format.raw/*240.148*/("""</label> <ul id=""""),_display_(/*240.166*/subject),_display_(/*240.174*/session),format.raw/*240.181*/(""""> <li class="inner" subject="""),_display_(/*240.211*/subject),format.raw/*240.218*/(""" """),format.raw/*240.219*/("""session="""),_display_(/*240.228*/session),format.raw/*240.235*/("""><a >Run 1</a></li> </ul></li> -->

                                                                <li><div ><span class="control"></span><span class="icon"><span class="icon_overlay"></span></span><span class="label"><a href="/displaySubject?studyNo="""),_display_(/*242.218*/studyNo),format.raw/*242.225*/("""&SubjectId="""),_display_(/*242.237*/subject),format.raw/*242.244*/("""#"""),_display_(/*242.246*/session),format.raw/*242.253*/("""">"""),_display_(/*242.256*/session),format.raw/*242.263*/(""" """),format.raw/*242.264*/("""</a></span><span class="context-menu-trigger" data-label="table" data-what="tables"></span></div>
                                                                   <!-- <ul id=""""),_display_(/*243.82*/subject),_display_(/*243.90*/session),format.raw/*243.97*/("""">
                                                                        <li>
                                                                            <div><span class="control"></span><span class="icon"><span class="icon_overlay"></span></span>
                                                                                <div class="inner" subject="""),_display_(/*246.109*/subject),format.raw/*246.116*/(""" """),format.raw/*246.117*/("""session="""),_display_(/*246.126*/session),format.raw/*246.133*/(""" """),format.raw/*246.134*/("""> <span class="label">Run 1</span> </div>

                                                                                <span class="context-menu-trigger" data-label="table" data-what="tables"></span>
                                                                            </div>
                                                                        </li>
                                                                    </ul> -->
                                                                </li>

                                                                <!-- <li> <div ><span class="control"></span><span class="icon"><span class="icon_overlay"></span></span><span class="label">"""),_display_(/*254.191*/subject),format.raw/*254.198*/("""</span><span class="context-menu-trigger" data-label="table" data-what="tables"></span></div> -->
                                                                """)))}),format.raw/*255.66*/("""

                                                             """),format.raw/*257.62*/("""</ul>
                                                        </li>
                                                        """)))}),format.raw/*259.58*/("""
                                                   """),format.raw/*260.52*/("""<!-- </ul> -->
                                               <!-- </li> -->
                                    </ul>
                                </li>
                                <!--<li>
                                    <div id="reference-list-root-node"><span class="control"></span><span class="icon"><span class="icon_overlay"></span></span><span class="label">References</span><span class="context-menu-trigger" data-label="reference" data-what="references"></span></div><ul id="reference-list"></ul>
                                </li>
                                <li>
                                    <div id="sequence-list-root-node"><span class="control"></span><span class="icon"><span class="icon_overlay"></span></span><span class="label">Sequences</span><span class="context-menu-trigger" data-label="sequence" data-what="sequences"></span></div><ul id="sequence-list"></ul>
                                </li>
                                <li><div id="note-list-root-node"><span class="control"></span><span class="icon"><span class="icon_overlay"></span></span><span class="label">Text notes</span><span class="context-menu-trigger" data-label="note" data-what="notes"></span></div><ul id="note-list"></ul>
                                </li>
                                <li><div id="view-list-root-node"><span class="control"></span><span class="icon"><span class="icon_overlay"></span></span><span class="label">Views</span><span class="context-menu-trigger" data-label="view" data-what="views"></span></div><ul id="view-list"></ul>
                                </li>
                                <li><div id="area-list-root-node"><span class="control"></span><span class="icon"><span class="icon_overlay"></span></span><span class="label">Subject areas</span><span class="context-menu-trigger" data-label="area" data-what="areas"></span></div>
                                    <ul id="area-list">
                                        <li>
                                            <div id="area-list-root-node"><span class="control"></span><span class="icon"><span class="icon_overlay"></span></span><span class="label">Subject areas</span><span class="context-menu-trigger" data-label="area" data-what="areas"></span></div>
                                        </li>
                                    </ul>

                                </li> -->
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </td>
    <!--<td  height="100%"><div  height ="100%">
        <div  id="messages1" style="display:none"></div>
        <div id="parent1" style="border:1px solid;width:100%; float: left" >
            <br>
            <div style="float:left;width:20%;height:1000px;">

            </div>
            <div class="SubjectsDock">


            </div>
    </div>
    </div>
    </td> -->

    <td class="border_layout_center">
        <div class="border_layout_center" >
            <!-- <div class="messages" id="messages" style="display:none"></div> -->
            <div id="diagram_container" >
                <!-- <div id="progress_bar_layer">
                    <div class="progress_bar_wrapper">
                        <div id="progress_bar_content">
                            <span cl
                            ass="progress_bar"></span>
                            <div class="clearFix"></div>
                            <progress max="100" value="1">
                            </progress>
                        </div>
                    </div>
                </div> -->
                <div id="diagram" tabindex="1" >

                    """),_display_(/*321.22*/for((subject,sessions) <- sub_sess) yield /*321.57*/{_display_(Seq[Any](format.raw/*321.58*/("""
                    """),format.raw/*322.21*/("""<div class="vid">
                        <header class="vidTop"><a href="/manchester-city-7-0-sheffield-wednesday-2014-09/">"""),_display_(/*323.109*/subject),format.raw/*323.116*/("""</a></header>
                        <div class="vidthumb">
                            <a href="/displaySubject?studyNo="""),_display_(/*325.63*/studyNo),format.raw/*325.70*/("""&SubjectId="""),_display_(/*325.82*/subject),format.raw/*325.89*/("""">
                                <img src="/assets/images/female.jpg" />
                            </a>
                        </div>
                        <footer class="vidBot">

                            <!-- <div class="postInfo">
                                <div class="views-count"><span class="icon"></span>64050</div>			<div class="comments-count"><span class="icon"></span>55</div>		</div> -->

                            <!-- <span class="vid_category"><a href="/videos/england/carlingcup/">Capital One Cup</a></span> -->
		                    <span class="time_added">
			                    """),_display_(/*336.25*/subject),format.raw/*336.32*/("""		"""),format.raw/*336.34*/("""</span>
                        </footer>
                    </div>
                    """)))}),format.raw/*339.22*/("""

                """),format.raw/*341.17*/("""</div>
                <div id="preview">

                </div>
                <div id="diagram_topbar">
                    <!-- <div class="item">
                        <div id="toolbox-container" style="display: none;"></div>
                        <script type="text/template" id="toolbox-template">
                            <div><button type="button" class="select_mode_button" data-tooltip="(1) Select"><span class="icon"></span><span class="label">(1) Select</span></button>
                                <button type="button" class="select_rect_mode_button" data-tooltip="(2) Select area"><span class="icon"></span><span class="label">(2) Select area</span></button>
                                <button type="button" class="add_table_mode_button" data-tooltip="(3) Add new table"><span class="icon"></span><span class="label">(3) Add new table</span></button>
                                <button type="button" class="add_relationship_mode_button" data-tooltip="(4) Add new reference"><span class="icon"></span><span class="label">(4) Add new reference</span></button>
                                <button type="button" class="add_view_button" data-tooltip="(5) Add new view"><span class="icon"></span><span class="label">(5) Add new view</span></button>
                                <button type="button" class="add_note_button" data-tooltip="(6) Add new note"><span class="icon"></span><span class="label">(6) Add new note</span></button>
                                <button type="button" class="add_area_button" data-tooltip="(7) Add new area"><span class="icon"></span><span class="label">(7) Add new area</span></button>
                            </div>
                        </script>
                    </div> -->
                    <div class="item wide"><div id="notification-container" style="display:none"><div class="content"></div></div></div>
                </div>
            </div>
            <div id="diagram_as_image" style="display:none">
            </div>
        </div>
    </td>


</tr>

</table>

</div>
</body>
</html>"""))}
  }

  def render(userName:String,sub_sess:Map[String, List[String]],studyNo:Int): play.twirl.api.HtmlFormat.Appendable = apply(userName,sub_sess,studyNo)

  def f:((String,Map[String, List[String]],Int) => play.twirl.api.HtmlFormat.Appendable) = (userName,sub_sess,studyNo) => apply(userName,sub_sess,studyNo)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jun 08 21:55:42 CDT 2015
                  SOURCE: C:/first_play/app/views/studyModel.scala.html
                  HASH: 8e770bb542028e701fe3a0ecac40dd5ed08d2227
                  MATRIX: 540->1|736->72|764->74|3607->2890|3622->2896|3672->2925|3755->2981|3770->2987|3822->3018|3905->3074|3920->3080|3975->3114|4065->3177|4080->3183|4126->3208|4215->3270|4230->3276|4284->3309|4373->3371|4388->3377|4438->3406|5663->4603|5692->4604|5731->4615|5760->4616|6081->4908|6111->4909|6155->4924|6185->4925|6280->4991|6310->4992|6398->5051|6428->5052|6458->5053|6597->5164|6626->5165|6725->5235|6755->5236|6813->5265|6843->5266|6909->5303|6939->5304|7287->5624|7316->5625|7355->5636|7384->5637|7413->5638|7624->5821|7653->5822|8178->6320|8207->6321|8527->6612|8557->6613|8594->6621|8643->6641|8673->6642|8706->6646|8914->6825|8944->6826|8979->6832|9045->6869|9075->6870|9105->6871|9139->6876|9169->6877|9204->6883|9267->6917|9297->6918|9330->6922|9371->6934|9401->6935|9436->6941|9767->7243|9797->7244|10568->7988|10597->7996|10942->8312|10972->8313|11089->8401|11119->8402|11291->8545|11321->8546|11441->8637|11471->8638|12086->9223|12117->9224|12235->9312|12266->9313|12401->9418|12432->9419|12549->9506|12580->9507|12783->9680|12814->9681|13059->9896|13090->9897|13258->10035|13289->10036|13391->10108|13422->10109|13636->10293|13667->10294|13785->10382|13816->10383|13951->10488|13982->10489|14103->10580|14134->10581|14759->11176|14790->11177|14908->11265|14939->11266|15074->11371|15105->11372|15226->11463|15257->11464|15513->11689|15545->11690|15664->11778|15696->11779|15832->11884|15864->11885|15986->11976|16018->11977|17741->13671|17771->13672|17889->13760|17920->13761|18129->13941|18159->13942|18280->14033|18311->14034|18746->14440|18776->14441|18894->14529|18925->14530|19136->14712|19166->14713|19287->14804|19318->14805|19748->15206|19778->15207|19896->15295|19927->15296|20094->15434|20124->15435|20245->15526|20276->15527|21096->16317|21127->16318|21247->16408|21278->16409|21413->16514|21444->16515|21605->16646|21636->16647|21912->16893|21943->16894|22033->16954|22064->16955|22401->17261|22433->17262|22554->17352|22586->17353|22722->17458|22754->17459|23046->17720|23078->17721|23427->18039|23459->18040|23580->18130|23612->18131|23748->18236|23780->18237|23944->18370|23976->18371|28473->22838|28504->22839|28624->22929|28655->22930|28790->23035|28821->23036|28984->23169|29015->23170|30114->24240|30144->24241|30174->24242|30207->24246|30237->24247|30268->24248|30414->24364|30445->24365|30476->24366|30510->24370|30541->24371|30572->24372|30705->24476|30735->24477|30765->24478|30799->24482|30830->24483|30861->24484|31614->25208|31644->25209|31675->25210|31709->25214|31740->25215|31771->25216|32451->25868|32481->25875|32798->26203|32883->26260|32935->26295|32975->26296|33061->26353|33139->26402|33169->26409|33441->26652|33471->26659|33512->26671|33542->26678|33574->26681|33604->26688|33635->26689|33891->26917|33932->26941|33972->26942|34070->27011|34171->27083|34201->27090|34248->27108|34278->27116|34308->27123|34367->27153|34397->27160|34428->27161|34466->27170|34496->27177|34778->27430|34808->27437|34849->27449|34879->27456|34910->27458|34940->27465|34972->27468|35002->27475|35033->27476|35240->27655|35269->27663|35298->27670|35686->28029|35716->28036|35747->28037|35785->28046|35815->28053|35846->28054|36579->28758|36609->28765|36804->28928|36896->28991|37053->29116|37134->29168|40896->32902|40948->32937|40988->32938|41038->32959|41193->33085|41223->33092|41374->33215|41403->33222|41443->33234|41472->33241|42118->33859|42147->33866|42178->33868|42300->33958|42347->33976
                  LINES: 19->1|22->1|24->3|59->38|59->38|59->38|60->39|60->39|60->39|61->40|61->40|61->40|64->43|64->43|64->43|65->44|65->44|65->44|66->45|66->45|66->45|84->63|84->63|84->63|84->63|84->63|84->63|84->63|84->63|84->63|84->63|84->63|84->63|84->63|85->64|85->64|85->64|85->64|85->64|85->64|85->64|85->64|86->65|86->65|86->65|86->65|86->65|91->70|91->70|99->78|99->78|100->79|100->79|100->79|100->79|100->79|100->79|100->79|100->79|100->79|100->79|100->79|100->79|100->79|100->79|100->79|100->79|100->79|100->79|100->79|100->79|100->79|100->79|100->79|118->97|118->97|119->98|119->98|119->98|119->98|120->99|120->99|120->99|120->99|126->105|126->105|126->105|126->105|126->105|126->105|126->105|126->105|128->107|128->107|128->107|128->107|129->108|129->108|129->108|129->108|129->108|129->108|129->108|129->108|129->108|129->108|129->108|129->108|132->111|132->111|132->111|132->111|132->111|132->111|132->111|132->111|132->111|132->111|132->111|132->111|132->111|132->111|132->111|132->111|154->133|154->133|154->133|154->133|157->136|157->136|157->136|157->136|163->142|163->142|163->142|163->142|166->145|166->145|166->145|166->145|172->151|172->151|172->151|172->151|174->153|174->153|174->153|174->153|196->175|196->175|196->175|196->175|196->175|196->175|196->175|196->175|196->175|196->175|196->175|196->175|196->175|196->175|196->175|196->175|196->175|196->175|196->175|196->175|196->175|196->175|196->175|196->175|196->175|196->175|196->175|196->175|216->195|216->195|216->195|216->195|216->195|216->195|216->195|216->195|234->213|234->213|234->213|234->213|234->213|234->213|235->214|235->214|235->214|235->214|235->214|235->214|236->215|236->215|236->215|236->215|236->215|236->215|244->223|244->223|244->223|244->223|244->223|244->223|252->231|252->231|255->235|255->235|255->235|255->235|256->236|256->236|256->236|257->237|257->237|257->237|257->237|257->237|257->237|257->237|259->239|259->239|259->239|260->240|260->240|260->240|260->240|260->240|260->240|260->240|260->240|260->240|260->240|260->240|262->242|262->242|262->242|262->242|262->242|262->242|262->242|262->242|262->242|263->243|263->243|263->243|266->246|266->246|266->246|266->246|266->246|266->246|274->254|274->254|275->255|277->257|279->259|280->260|341->321|341->321|341->321|342->322|343->323|343->323|345->325|345->325|345->325|345->325|356->336|356->336|356->336|359->339|361->341
                  -- GENERATED --
              */
          