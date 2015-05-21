 var EDA_CODE = 3;
 var MOTION_CODE = 6;
 var PERSPIRATION_CODE = 1;
 var BREATHING_CODE = 7;
 var HEART_RATE_CODE = 8;
 var BELT_BREATHING_CODE = 9;
 var TEMPERATURE_CODE = 10;
 var SIMULATION_CODE = 2;
 var HRV_CODE =4;
 var EXPRESSION_CODE = 5;
 var BAR_CHART_CODE =11;

 var VIDEO_CODE =100;
 var INFO_CODE = 101;
 var ACTIVITY_CODE =102;
 var PSYCHOMETRIC_CODE = 103;
 var PERFORMANCE_CODE =104;
 var OTHER_CODE =105;


var goToTime = 0; // when youtube file get read it use this variable to go to a particulare point
var currentVideoButton ="";  // needed

var refreshIntervalId = null;
// we assume that the maximum number of video is 4--- TODO
var player1 = null, player2 = null, player3 = null, player4 = null;
var videonum =0 ;

 var subject;
var session;
var studyId;
var occupied ;

$(document).ready(function(){
// when user click on the tab (i.e., session)


 $('.panel-body.tabs .nav.nav-tabs a').click(function() {


   function intermediate ()
     {
          var counter =0, iterator=0;
          // just to add horzontal axis to the last chart
          $( ".chart" ).each(function( index ) {
            if($(this).attr('session') == session)
                    {
                        counter++;
                    }
          });

          // to show only the first video
          var firstVideo = true;
          // call AJAX method for each signal in the current session and place the return JSON data in (.class) Div
          $( ".chart" ).each(function( index ) {
          if($(this).attr('session') == session)
          {

               var signalType = $(this).attr('signalType');
               var signalSequence = $(this).attr('signalSequence');
               var chartname = "chart"+session+signalSequence;
               var dynamicbtn = "dynamic"+session+signalSequence;
               if(iterator== counter -1){
                 drawStuff_temp1(session, subject , chartname, studyId, signalSequence,signalType, dynamicbtn, info, true);
               }
               else
                 drawStuff_temp1(session, subject , chartname, studyId, signalSequence,signalType, dynamicbtn, info, false);
               info = 0;
               iterator++;
               showVideo($(this).attr('session'),signalSequence);
               // this call is meant to attach some event to show video button
               /*var videoButton = "#showvideo"+$(this).attr('session') + signalSequence;
               if(firstVideo)
               {
                $(videoButton).trigger("click");
                firstVideo = false;
                }*/

          }

          });
     }



       var currentAttrValue = $(this).attr('href');
      $(currentAttrValue).show().siblings().hide();

        subject= $(this).attr('subject');
        session = $(this).attr('session');
        studyId = $(this).attr('studyId');
        occupied = $(this).attr('occupied');

        // to avoid calling the AJAX multiple time

       if(occupied =="no")
       {

            // $("#loading").show();
           $(this).attr("occupied", "yes");
           google.load('visualization', '1', { 'packages': ['corechart', 'bar'], callback: intermediate});
           //e.preventDefault();
           var videoDiv ="#"+session;
            $(videoDiv).slideDown("slow");
       }

    });




    var info = 1; // this var is used to avoid calling the information function every time
     // this is used to automatically request data from the firstt tab
      $('.panel-body.tabs .nav.nav-tabs a').first().trigger("click");
      //$('.btn.btn-default.show-video').first().trigger("click");

       // this is to show the Bar information----
       $(".chartBar" ).each(function() {
            $("#generalInfo" ).show();
             var signalType = $(this).attr('signalType');
             var signalSequence = $(this).attr('signalSequence');
             var chartName = "chartBar"+"BAR"+signalSequence;

             drawStuff_temp1("BAR", subject , chartName, studyId, signalSequence,signalType, "", 1, true);
            });






});

var marker ="";
var stopBar = false;
var STAI = 0;
var TypeAB = 1;

function showPsychometricScale( id, type, score){

    var target =  "#" + id;
    if(type == "TYPE AB") {


            $(target).igLinearGauge({
                height: "60px",
                width: "100%",
                value: score,
                minimumValue: 35,
                maximumValue: 380,
                ranges: [
                    {
                        startValue: 35, endValue:104, name: "range1"
                    },
                    {
                        startValue: 104, endValue: 173, name: "range2"
                    },
                    {
                        startValue: 173, endValue: 242, name: "range3"
                    },
                    {
                        startValue: 242, endValue: 311, name: "range4"
                    },
                    {
                        startValue: 311, endValue: 380, name: "range5"
                    },
                ]
            });

            }

    else  {

     $(target).igLinearGauge({
                    height: "60px",
                    width: "100%",
                     value: score,
                    minimumValue: 20,
                    maximumValue: 80,
                    ranges: [
                        {
                            brush: '#FFFFCC',
                            startValue: 20, endValue:32, name: "range1"
                        },
                        {
                             brush: '#FFFF99',
                            startValue: 32, endValue: 44, name: "range2"
                        },
                        {
                        brush: '#FFFF66',
                            startValue: 44, endValue: 56, name: "range3"
                        },
                        {
                       brush: '#FFFF33',
                            startValue: 56, endValue: 68, name: "range4"
                        },
                        {
                           brush: '#FFFF00',
                            startValue: 68, endValue: 80, name: "range5"
                        },
                    ]
                });

     }



}

function showInfo(task, subject, chartDestination, studyId, signalSequence)
{
      var jsonDataInfo;
        $.ajax({
             type: 'GET',
             url: "/getInfo",
             dataType:"json",
             data: "task=" + task + "&subject=" + subject + "&studyId=" + studyId  + "&signal_type=" + INFO_CODE ,
             async: true,
            success:function(result) {
                jsonDataInfo = result;
                //jsonDataInfo= JSON.parse(jsonDataInfo);
                       var bio1;
                             $('#Bio').empty();
                           //  alert(jsonDataInfo);
                            if( !jQuery.isEmptyObject(jsonDataInfo))
                            {
                                $("#BioTop" ).show();
                                jQuery.each(jsonDataInfo, function(key, val) {
                               $('#Bio').append( "<p style=\"font-weight: bold\">" + key + ": " + val +" </p>" );
                                });
                            }
                            else{
                               $( "#BioTop" ).hide();
                            }
            }
            });


       var jsonDataPm = '';
        $.ajax({
              type: 'GET',
              url: "/getPsycho",
              dataType:"json",
              data: "task=" + task + "&subject=" + subject + "&studyId=" + studyId  + "&signal_type=" + PSYCHOMETRIC_CODE ,
               async: true,
               success:function(result) {
               jsonDataPm = result;
                 // jsonDataPm= JSON.parse(jsonDataPm);
                        var sycho;
                        var ctr=1;

                       $('#phycho').empty();
                       if( !jQuery.isEmptyObject (jsonDataPm))
                       {
                           $("#phychoTop" ).show();
                           jQuery.each(jsonDataPm, function(key, val) {
                             var name = "lineargauge" + ctr;
                              ctr++;
                            //<div >Absolute Zero</div> <div style="height:60px"> <div id="lineargauge"></div> </div>

                            $('#phycho').append( "<div style=\"font-weight: bold\" >"+ key +": " + val +"</div> <div style=\"height:60px\"> <div id=\"" + name + "\"></div> </div> &nbsp; &nbsp;");
                            showPsychometricScale(name, key, val)

                            // $('#phycho').append( "<p>" + key + ": " + val +" </p>" );
                           });
                       }
                       else{
                          $( "#phychoTop" ).hide();
                       }

               }

              })





         var jsonDataPRF = '';
           $.ajax({
                         type: 'GET',
                         url: "/getPRF",
                         dataType:"json",
                         data: "task=" + task + "&subject=" + subject + "&studyId=" + studyId  + "&signal_type=12" ,
                          async: true,
                          success:function(result) {
                          jsonDataPRF = result;
                         // jsonDataPRF= JSON.parse(jsonDataPRF);
                                var counter = 0;
                                while(counter < jsonDataPRF.length)
                                {
                                    var val =  jsonDataPRF[counter].value
                                    if(!isNaN(parseInt(val))){
                                         var perc = jsonDataPRF[counter].value / jsonDataPRF[counter].max*100;
                                     }
                                    else
                                       { var perc = 0;}


                                    $('#allInfo').append(" <div class=\"col-xs-6 col-md-3\"> \
                                                             <div class=\"panel panel-default\"> \
                                                                <div class=\"panel-body easypiechart-panel\"> <h4>" + jsonDataPRF[counter].name + ":</h4> \
                                                                    <div class=\"easypiechart\" id=\"easypiechart-orange\" data-percent=\""+ perc +"\"><span class=\"percent\">"+ jsonDataPRF[counter].value +"</span> \
                                                                    </div> <script> $('.easypiechart').easyPieChart({ scaleColor: false, barColor: '#ffb53e'}); </script> \
                                                                </div> \
                                                            </div> \
                                                      </div>");
                                    counter++;
                                }
                          }
                         })



}

function drawStuff_temp1(task, subject, chartDestination, studyId, signalSequence,signal_type, dynamicbtn, info, showhAxis) {


    var signal_title ;
    var ytitle = "";
    var header = "#header"+task+ signalSequence;
    var dash = "dashboard_div"+task+ signalSequence;
    var filter = "filter_div" + task + signalSequence;
    var editme = "#editchart"  + task + signalSequence;

    var jsonData;
     $.ajax({
                         type: 'GET',
                         url: '/GetSignal',
                         dataType:"json",
                         data: "task=" + task + "&subject=" + subject + "&studyId=" + studyId  + "&signal_type=" + signal_type + "&signal_sequence=" + signalSequence,
                         async: true,
                          beforeSend: function() { $('#loading').show(); },
                          complete: function() { $('#loading').hide(); },
                          success:function(result) {
                             jsonData = result;
                              var data = new google.visualization.DataTable(jsonData);
                              if(signal_type ==11){
                                        var options = {
                                         title: 'NASA Task Load Index',
                                          hAxis: {
                                            minValue: 0
                                          },
                                          vAxis: {
                                          },
                                          legend: { position: 'top'},
                                          bars: 'vertical'
                                        };
                               var chart = new google.visualization.ColumnChart(document.getElementById(chartDestination));
                              chart.draw(data,options );
                              }
                                 else{

                                   switch(parseInt(signal_type))
                                   {
                                     case EDA_CODE:
                                        signal_title = "EDA Signal";
                                        ytitle = "Palm EDA [µS]";
                                        break;
                                     case MOTION_CODE:
                                        signal_title = "Motion Signal";
                                        ytitle = "Energy";
                                         break;
                                     case PERSPIRATION_CODE:
                                         signal_title = "Perspiration Signal";
                                     	ytitle = "Perinasal EDA ["+ '\u00B0' +"C"+ '\xB2' +"]";
                                     	break;
                                     case BREATHING_CODE:
                                         signal_title = "Breathing";
                                     	ytitle = "Rate";
                                     	break;
                                     case HEART_RATE_CODE:
                                         signal_title = "Heart Rate";
                                     	ytitle = "Rate";
                                     	break;
                                     case BELT_BREATHING_CODE:
                                         signal_title = "Belt Breathing Signal";
                                         ytitle = "Rate";
                                         break;
                                     case TEMPERATURE_CODE:
                                         signal_title = "Temperature Signal";
                                     	ytitle = "Temperature";
                                     	break;
                                     case SIMULATION_CODE:
                                         signal_title = "Driving Simulator Data";
                                         ytitle = "";
                                        	break;
                                     case HRV_CODE:
                                         signal_title = "Heart Rate Variability";
                                         ytitle = "HRV [bpm]";
                                            break;
                                       case EXPRESSION_CODE:
                                          signal_title = "Facial Expressions";
                                          ytitle = "";
                                             break;
                                     default:
                                       signal_title = "Anonymous Signal";
                                       ytitle = "";
                                   }
                                  // to set the title for each signal
                                  $( header ).html( signal_title );

                                   if(info == 1){
                                     showInfo(task, subject, chartDestination, studyId, signalSequence);
                               }


                                // this is to show the axis for the last chart
                                var showAx = "none";
                                var titleVar =null;
                                if(showhAxis)
                                {
                                    showAx ="out";
                                    titleVar = "Time [s]"
                                }


                                // here we specify the index of the first annotation cloums
                                var indexOfLast = data.getNumberOfColumns();
                                var startAnnotFrom;
                                for( t=0; t< indexOfLast; t++)
                                {
                                  if(data.getColumnId(t).substr(0, 5) == "bgCol")
                                   {
                                     startAnnotFrom = t-3;
                                     break;
                                   }
                                }
                                var colors = ["#dc3912","#3366cc","#ff9900","#109618","#990099","#0099c6","#dd4477","#66aa00","#b82e2e","#316395","#994499","#22aa99","#aaaa11","#6633cc","#e67300",'#e0440e', '#e6693e', '#ec8f6e', '#f3b49f', '#f6c7b6'];
                                 var chart = new google.visualization.LineChart(document.getElementById(chartDestination));
                                 var options = {
                                           //title: signal_title,
                                           legend: { position: 'top' },
                                           curveType: 'function',
                                           colors: colors,
                                          // backgroundColor:  '#F5F5F5',
                                           chartArea:{left:100,top: 50, width:'85%',height:'65%'},
                                             series: {
                                              //2 : {type: "area"}

                                                          },
                                           hAxis: {title: titleVar,
                                           gridlines: {
                                                              color: 'transparent'
                                                          },
                                           textStyle:{
                                                                //color : 'green',
                                                                bold: true,
                                                                italic: false
                                                               },
                                           titleTextStyle:{
                                                            //color : 'green',
                                                             bold: true,
                                                             italic: false
                                           },
                                           textPosition : showAx

                                                },
                                           crosshair: { trigger: 'selection', orientation: 'vertical', color: 'black'},
                                           annotations: {
                                                       //style: 'line',
                                                       color: 'red',
                                                           textStyle: {
                                                             fontName: 'Times-Roman',
                                                             fontSize:5,
                                                             bold: true,
                                                             //italic: true,
                                                             color: 'grey',     // The color of the text.
                                                             auraColor: 'red', // The color of the text outline.
                                                             opacity: 1          // The transparency of the text.
                                                           }
                                                   },
                                           tooltip: { trigger: 'select' },
                                           //tooltip: { trigger: 'none' },
                                           explorer: { actions: ['dragToZoom', 'rightClickToReset'], maxZoomIn: .01 },
                                           animation:{ startup:true},
                                           vAxis: { title: ytitle,
                                            //format: '##.###',
                                             format: '###0.000',
                                            gridlines: {
                                                   color: 'transparent'
                                               },
                                            textStyle:{
                                                    //color : 'green',
                                                    bold: true,
                                                    italic: false
                                           },
                                            titleTextStyle:{
                                                           // color : 'green',
                                                            bold: true,
                                                            italic: false
                                                            }
                                            }
                                      };

                                 // to assigna colors for the annotaiton series....
                                 myObj = {};
                                 var first   = "#FFFF00";
                                 var second  = "#A6408D";
                                 var third  = "#CECEF6";
                                 var colorVar;
                                 var ctrColor =1;
                                 for(t=startAnnotFrom;  t< indexOfLast; t++)
                                 {
                                  switch(ctrColor)
                                   {
                                  case 1:
                                     colorVar = first;
                                     break;
                                  case 2:
                                     colorVar = second;
                                      break;
                                   case 3:
                                     colorVar = third;
                                      break;
                                     }
                                    ctrColor++;
                                    myObj[t] = {type: "area", color: colorVar};
                                 }

                                var columns = [];
                                var series = {};
                                ctrColor =1;
                                for (var i = 0; i < data.getNumberOfColumns(); i++) {
                                    columns.push(i);
                                    if(i>=startAnnotFrom)
                                    {
                                      switch(ctrColor)
                                       {
                                      case 1:
                                         colorVar = first;
                                         break;
                                      case 2:
                                         colorVar = second;
                                          break;
                                       case 3:
                                         colorVar = third;
                                          break;
                                         }
                                        ctrColor++;
                                        series[i] = {type: "area", areaOpacity:0.2, lineWidth:0, color: colorVar};
                                        colors[i] = colorVar;
                                    }
                                    else {
                                        series[i] = {color: colors[i]};
                                    }
                                }

                                 // update the option with new colors for annotations
                                 options.series = series;
                                 chart.draw(data,options );



                                  //  var currentdate = new Date("July 21, 1983 01:15:00:526");
                              google.visualization.events.addListener(chart, 'select', selectHandler);
                              function selectHandler(e) {
                                   var videoButton = "#showvideo"+ task + signalSequence;
                                   var videoBoard = "#videoboard" + task + signalSequence;
                                    var sel =  chart.getSelection();
                                      // if selection length is 0, we deselected an element
                                      if (sel.length > 0) {
                                        if (sel[0].row === null) {
                                                      var col = sel[0].column;
                                                      var shift;
                                                      if (typeof startAnnotFrom === "undefined")
                                                           shift = 0;
                                                      else
                                                           shift = 2;

                                                      if (columns[col] == col) {
                                                          // hide the data series
                                                          columns[col] = {
                                                              label: data.getColumnLabel(col),
                                                              type: data.getColumnType(col),
                                                              calc: function () {
                                                                  return null;
                                                              }
                                                          };

                                                          // grey out the legend entry
                                                          series[col - (shift+1)].color = '#CCCCCC';
                                                      }
                                                      else {
                                                          // show the data series
                                                          columns[col] = col;
                                                          series[col - (shift+1)].color = null;
                                                      }
                                                      var view = new google.visualization.DataView(data);
                                                      view.setColumns(columns);
                                                       //options2.series = myObj;
                                                      chart.draw(view, options);
                                                  }
                                                  else
                                                {
                                                    slidDownVideoPlay(videoButton, videoBoard);
                                                   //var videoButton = "#showvideo"+ task + signalSequence;
                                                    if($(stopv).html()== 'Play Videos')
                                                     {
                                                        $(stopv).html('Stop Videos');
                                                     }
                                                    if($(videoButton).html()!= 'Show Videos')
                                                    {
                                                           // to stop the previous indicator
                                                         if(refreshIntervalId != null){
                                                                       clearInterval(refreshIntervalId);
                                                          }
                                                         var selectedItem = chart.getSelection()[0];
                                                         var diff =data.getValue(selectedItem.row+1, 0)- data.getValue(selectedItem.row, 0)
                                                         // to move second by second
                                                          var addAmount =Math.ceil(1/diff);
                                                          var point = selectedItem.row;
                                                          var pointValue = data.getValue(point,0);
                                                          seek(Math.floor(pointValue), videoButton);
                                                          goToTime= Math.floor(pointValue);  // this is to let the video play when it is not ready yet
                                                          //seek(Math.floor(pointValue));  // this is to play the video when it is rady

                                                          refreshIntervalId =setInterval(function() {
                                                              // only start the indicator if there is a video playing
                                                              if(player1.getPlayerState() == 1)
                                                                {
                                                                    // this will not fire slection handler;
                                                                    chart.setSelection([{row:point}]);
                                                                    point = point + addAmount;
                                                                    //pointValue = data.getValue(point,0);
                                                                }
                                                               },1000);
                                                         currentVideoButton = videoButton;
                                                     }
                                                }
                                      }

                                   }


                                 $(editme).show();
                                 $(editme).click(function()
                                 {
                                      var chartEditor = new google.visualization.ChartEditor();
                                      google.visualization.events.addListener(chartEditor, 'ok', redrawChart);
                                      chartEditor.openDialog(wrapper, {});
                                      function redrawChart(){
                                            //chartEditor.getChartWrapper().draw(document.getElementById('chart1DirectView1'));
                                           var newwrapper = chartEditor.getChartWrapper();
                                            dashboard.bind(donutRangeSlider, newwrapper);
                                                               dashboard.draw(data);

                                                               google.visualization.events.addListener(newwrapper, 'select', function(e) {
                                                                           var selectedItemIn  = newwrapper.getChart().getSelection()[0].row;
                                                                           var point = data.getValue(selectedItemIn, 0);
                                                                           var v = donutRangeSlider.getState();
                                                                                   var absStart = v.range.start;
                                                                                   var end = v.range.end;
                                                                                   var w = wrapper.getChart().getChartLayoutInterface().getChartAreaBoundingBox().width;
                                                                                   move_str =0;
                                                                                   var relStart =  point + absStart;
                                                                                   active++;
                                                                                    stopBar = false;
                                                                                   doMove(absStart, relStart, end, w, active);
                                                                                  seek(point + absStart);
                                                                     });
                                          }
                                  });



                                  var stopv = "#stopvideo"  + task + signalSequence;
                                  $(document).on('keypress', function(e) {
                                      var tag = e.target.tagName.toLowerCase();
                                      if ( e.which === 115 && tag != 'input' && tag != 'textarea')
                                      {
                                         $(stopv).html('Play Videos');
                                         stopvideo();
                                         clearInterval(refreshIntervalId);
                                      }
                                       if ( e.which === 112 && tag != 'input' && tag != 'textarea')
                                       {
                                          $(stopv).html('Stop Videos');
                                          google.visualization.events.trigger(chart, 'select', selectHandler);
                                       }

                                  });

                                   $(stopv).click(function() {
                                     if($(stopv).html()== 'Stop Videos')
                                           {$(stopv).html('Play Videos');
                                             stopvideo();
                                             clearInterval(refreshIntervalId);
                                            }
                                        else
                                            {
                                            $(stopv).html('Stop Videos');
                                             google.visualization.events.trigger(chart, 'select', selectHandler);
                                            }

                                   });

                                  $('#hideSideBar').click(function(){
                                       $('#sidebar-collapse').toggle(
                                        function() {
                                                  $('#main').css('left', '0')
                                                 }, function() {
                                                     $('#main').css('left', '0px')
                                                 });
                                  });




                                    /*var export1 = "#export" + task + signalSequence;
                                    $(export1).show();
                                    var a = document.getElementById("export" + task + signalSequence); //or grab it by tagname etc
                                    var exportLink = "task=" + task + "&subject=" + subject + "&studyId=" + studyId  + "&signal_type=" + signal_type + "&signal_sequence=" + signalSequence;
                                    a.href = "/file?"+ exportLink;*/


                                      var dynamic = dynamicbtn;
                                     $(dynamic).show();
                                     $(dynamic).click(function() {
                                         var result = [];
                                          //var obj = JSON.parse(jsonData);
                                          obj= jsonData;

                                          var points =  obj.rows.length;

                                          var sum = 0;
                                          var counter = 0;
                                          var j = 0;
                                         for (i = 0; i < points; i++) {

                                           sum = sum + obj.rows[i].c[1].v;
                                           counter++;

                                               if(counter == 10)
                                               {
                                                     sum = sum/10;
                                                     result[j] = sum;
                                                     sum = 0;
                                                     counter = 0;
                                                     j++;
                                               }
                                           }
                                         var arr =[100,1000,3000,9000];
                                         window.location = 'http://kyeongan.cpl.uh.edu/projects/css/api/generator.html?data=' + result;
                                         });



                             }
                             }
                         })
      if( jQuery.isEmptyObject(jsonData))
                 {
                    //alert('Data is not there');
      }



}



// to create a video board for each signal that is called when the user press show video
function showVideo(SessionName, signalSequence) {

   var videoButton = "#showvideo"+SessionName + signalSequence;
   var videoBoard = "#videoboard" + SessionName + signalSequence;
   //$(videoButton).show();

   if($(videoBoard).children().length <= 3 ) {
        $(videoButton).hide();
   }

$(videoButton).click(function(){

       currentVideoButton ="";
      $('div[id^="videoboard"]').each(function() {
              var v_id=  "#" + this.id;
             if(v_id == videoBoard){  // to avoid hidding the video for current  chart
              // player1 = null, player2 = null, player3 = null, player4 = null;
              $(v_id).slideUp();
              $(v_id).hide();
             }
       });
       /* $('a[id^="showvideo"]').each(function() {
            var v_id=  "#" + this.id;
            if(v_id != videoButton)
                 $(v_id).html('Show Videos');
             });

    videonum =0;*/

    //  $(videoButton).html('Hide Videos');

      // slidDownVideoPlay(videoButton, videoBoard);



      $(videoBoard).slideUp();
      $(videoBoard).hide();


  });
}

function slidDownVideoPlay(videoButton, videoBoard){


    $('div[id^="videoboard"]').each(function() {
             var v_id=  "#" + this.id;
             if(v_id != videoBoard){
             $(v_id).slideUp();
             $(v_id).hide();
             }
      });

      /* $('a[id^="showvideo"]').each(function() {
           var v_id=  "#" + this.id;
           if(v_id != videoButton)
                $(v_id).html('Show Videos');
            });*/

   videonum =0;
                //$(videoBoard).toggle();
     $(videoButton).html('Hide Videos');
     $(videoBoard).slideDown();


  }

// this fucntion is called whenever whe show the videoboard becuase that create new videos...
function onYouTubePlayerReady(playerId)
{
  switch(videonum)
     {
       case 0:
         player1 = document.getElementById(playerId);
         player1.seekTo(goToTime, true);
         player1.playVideo();
         //player1.pauseVideo();

         player1.addEventListener("onStateChange", "onytplayerStateChange");
          break;
       case 1:
          player2 = document.getElementById(playerId);
          player2.seekTo(goToTime, true);
          player2.playVideo();
          //player2.pauseVideo();

          player2.addEventListener("onStateChange", "onytplayerStateChange");
        break;
       case 2:
           player3 = document.getElementById(playerId);
           player3.seekTo(goToTime, true);
           player3.playVideo();
           player3.addEventListener("onStateChange", "onytplayerStateChange");
        break;
       case 3:
           player4 = document.getElementById(playerId);
           player4.seekTo(goToTime, true);
           player4.playVideo();
           //player4.pauseVideo();
           player4.addEventListener("onStateChange", "onytplayerStateChange");
        break;
       case 4:
           player5 = document.getElementById(playerId);
            player5.playVideo();
            //player5.pauseVideo();
            player5.seekTo(goToTime, true);
           player5.addEventListener("onStateChange", "onytplayerStateChange");
         break;
     }
  videonum++;
}

function onytplayerStateChange(newState) {
  // alert("Player's new state: " + newState);
}

function seek(to, videoButton) {


if(videoButton == currentVideoButton){
 if(player1 != null ){
      player1.seekTo(to, true);
      player1.playVideo();
     }
 if(player2 != null ){
      player2.seekTo(to, true);
      player2.playVideo();
     }
  if(player3 != null ){
      player3.seekTo(to, true);
      player3.playVideo();
  }
  if(player4 != null ){
    player4.seekTo(to, true);
    player4.playVideo();
       }
   }
}

// to play after pause
function playPausedVideos() {
 if(player1 != null) {
   player1.playVideo();
 }
 if(player2 != null){
  player2.playVideo();
  }
  if(player3 != null){
    player3.playVideo();
  }
  if(player4 != null){
    player4.playVideo();
   }
}

function stopvideo() {
 if(player1 != null) {
  player1.pauseVideo();
 }
  if(player2 != null){
  player2.pauseVideo();
  }
  if(player3 != null){
    player3.pauseVideo();
  }
  if(player4 != null){
    player4.pauseVideo();
   }
}
