package Models;

import java.io.*;
import java.lang.Double;
import java.lang.System;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.*;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidOperationException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.poifs.filesystem.NPOIFSFileSystem;
import org.apache.poi.poifs.filesystem.OfficeXmlFileException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import play.Logger;
import org.json.simple.*;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

/**
 * Created by staamneh on 10/29/2014.
 */
public class ReadExcelJava {
    static String file_location;
    private static String getStyle (int code) {
        final int GREEN =1;
        final int RED =2;
        final int GRAY = 3;

        switch (code) {
            case GREEN:
                return "color: gray; opacity: 0.5;";
            case RED:
                return "color: black; opacity: 0.5;";
            case GRAY:
                return "color: green; opacity: 0.5;";
            default:
                return "color: red; opacity: 0.5;";
        }

    }
    private static int getFrameRate(int signalType) {
        if(signalType == 3 || signalType == 6 || signalType==2 ) {
            return 8;
        }
        else if(signalType ==1  )
            return 4;
        else if(signalType ==5 )
            return 16;
        else
            return 1;
    }


    public static ArrayList<Activity> readActivity(InputStream input)  throws IOException {

        final int ROW_STAR_AT = 5;
        int i = 0, rowNum=0, j=0;
        boolean exit =false, startWroking = false;
        Map<Double, String> code = new TreeMap<>();
        ArrayList<Activity> activities = new ArrayList<Activity>();
        try {

            XSSFWorkbook workbook = new XSSFWorkbook(input);
            XSSFSheet sheet = workbook.getSheetAt(0);
            Row row = null;
            Iterator cellIterator = null;
            Cell cell = null;

            Logger.info("We are trying to read the activity file");
            Iterator rowIterator = sheet.iterator();
            while (rowIterator.hasNext() && !exit) {

                //Logger.info("Just ot cehck if there is an infine loop or not - Rows");
                row = (Row) rowIterator.next();
                // to skip the first 5 rows
                //if (rowNum >= ROW_STAR_AT) {
                if(startWroking){
                    cellIterator = row.cellIterator();
                    i = 0;
                    double start = 0, end = 0;
                    int actionType = 1;
                    String annotation = "", annotationText = "";
                    while (cellIterator.hasNext() && !exit) {
                        cell = (Cell) cellIterator.next();
                        try {
                            switch (i) {
                                case 0:
                                    //start = Double.parseDouble(cell.getStringCellValue());
                                    if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC || cell.getCellType() == Cell.CELL_TYPE_FORMULA) {
                                        start = cell.getNumericCellValue();
                                        if ( start == 0.0)
                                            exit = true;
                                        System.out.println(start);
                                    }
                                    else /*if(cell.getCellType()==Cell.CELL_TYPE_BLANK)*/ {
                                        exit = true;
                                    }
                                    break;
                                case 1:
                                    end =  cell.getNumericCellValue();
                                    break;
                                case 5:
                                    actionType = (int) cell.getNumericCellValue();
                                    break;
                                case 6:
                                    //annotation = cell.getStringCellValue();
                                    if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
                                        annotation = Double.toString(cell.getNumericCellValue());
                                    }
                                    else if(cell.getCellType() == Cell.CELL_TYPE_STRING)
                                    {
                                        annotation = cell.getStringCellValue();
                                    }
                                    annotationText = annotation;
                                    activities.add(new Activity(start, end, actionType, annotation, annotationText, code.get( (double) actionType)));
                                    break;

                            }
                        } catch (NumberFormatException ex) { // handle your exception
                            ex.printStackTrace();;
                        }

                        i++;
                    }
                    System.out.println();

                }
                else
                {
                    // this code is to attached the code for each action type
                    if(rowNum >0) {
                        cellIterator = row.cellIterator();
                        j = 0;
                        double key = 0;
                        while (cellIterator.hasNext()) {
                            cell = (Cell) cellIterator.next();
                            if(cell.getCellType() == Cell.CELL_TYPE_BLANK) {
                                continue;
                            }
                            if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC && j==0) {
                                key= cell.getNumericCellValue();
                            }
                            else if(cell.getCellType() == Cell.CELL_TYPE_STRING && j==1) {
                                code.put(key, cell.getStringCellValue());
                                break;
                            }

                            else {
                                startWroking = true;
                                System.out.println(j );
                            }
                            j++;
                        }
                    }
                    rowNum++;
                }
            }


        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            input.close();
        }
        Logger.info("We " +
                "We finished reading the activity file");
        return activities;
    }

    /**
     * This function is called to generate the percentage of stress and normal states for articular signal based on value max
     *
     * @param max
     * @param fileName
     * @return
     * @throws Exception
     */
    public static BarPercentage findBarFromExcel (double max, String fileName)  throws Exception {



        System.out.println("I am in BarPercentage");
        ArrayList<Double> allNumber = new ArrayList<Double>();
        int counter = 0;

        File file = new File(fileName);
        ForBarFromExcel barRaw = new ForBarFromExcel(fileName, 1);
        try {

            NewExcelFormat newF = new NewExcelFormat(barRaw);
            OldExcelFormat oldF = new OldExcelFormat(barRaw);
            try {

                newF.processAllSheets();
            } catch (InvalidOperationException ioe) {
                oldF.readSheet();
            }

            // actual.put(entry.getKey(), barRaw.getArrayOfDouble());
            allNumber = barRaw.getArrayOfDouble();
        } catch (org.apache.poi.openxml4j.exceptions.InvalidFormatException e) {
            //return null;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            // delete the file
            if (file.delete()) {
                System.out.println("File has been deleted");
            } else {
                System.out.println("File has NOT been deleted");
            }
        }

        double relax = 0, normal = 0, stress = 0, sum =0;
        for(double num: allNumber){
            sum = sum +num;
            if (num < max) {
                normal++;
            } else
                stress++;
        }

        int total = allNumber.size();
            /*double mean = sum / allNumber.size();
            mean = mean - max;
            double k = 0.001701358;
            stress = ((mean) / k) * 100;
            if(stress > 100) stress = 100;
            if(stress < 0) stress =0;
            normal = 100 - stress;*/



        relax = 0;
        normal = (normal / total) * 100;
        stress = (stress / total) * 100;



        System.out.println("relax: " + relax + "  normal: " + normal + "  stress: " + stress);
        return new BarPercentage(0.0, normal, stress);



    }
    public static MeanAndSizeOfSignal findMeanFromExcel (String fileName)  throws Exception {

        System.out.println("I am in findMeanFromExcel");
        ArrayList<Double> allNumber = new ArrayList<Double>();
        int counter = 0;

        File file = new File(fileName);
        ForBarFromExcel barRaw = new ForBarFromExcel(fileName, 1);
        try {

            NewExcelFormat newF = new NewExcelFormat(barRaw);

            try {
                newF.processAllSheets();
            } catch (InvalidOperationException ioe) {
                OldExcelFormat oldF = new OldExcelFormat(barRaw);
                oldF.readSheet();
            }

            // actual.put(entry.getKey(), barRaw.getArrayOfDouble());
            allNumber = barRaw.getArrayOfDouble();
        } catch (org.apache.poi.openxml4j.exceptions.InvalidFormatException e) {
            //return null;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            // delete the file
            if (file.delete()) {
                System.out.println("File has been deleted");
            } else {
                System.out.println("File has NOT been deleted");
            }
        }

        double sum=0;
        for (Double t: allNumber) {
            counter++;
            sum += t;
            //sumSqure += Math.pow(temp, 2);
        }



        double sd = 0;

        double mean = sum / counter;

        System.out.println("The mean is : " +  mean);
        return new MeanAndSizeOfSignal(mean, counter, allNumber);

    }

    public static Double findPerformanceFromExcel (double max, String fileName)  throws Exception {


        System.out.println("I am in findPerformanceFromExcel");
        ArrayList<Double> allNumber = new ArrayList<Double>();
        int counter = 0;

        File file = new File(fileName);
        ForBarFromExcel barRaw = new ForBarFromExcel(fileName, 1, 4);
        try {

            NewExcelFormat newF = new NewExcelFormat(barRaw);
            OldExcelFormat oldF = new OldExcelFormat(barRaw);
            try {

                newF.processAllSheets();
            } catch (InvalidOperationException ioe) {
                oldF.readSheet();
            }

            // actual.put(entry.getKey(), barRaw.getArrayOfDouble());
            allNumber = barRaw.getArrayOfDouble();
        } catch (org.apache.poi.openxml4j.exceptions.InvalidFormatException e) {
            //return null;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            // delete the file
            if (file.delete()) {
                System.out.println("File has been deleted");
            } else {
                System.out.println("File has NOT been deleted");
            }
        }

        double relax = 0, normal = 0, stress = 0;
        for(double num: allNumber){
            if (Math.abs(num) < max) {
                normal++;
            } else
                stress++;
        }

        int total = allNumber.size();
        //relax = (relax / actual.get(i).size())*100;
        relax = 0;
        normal = (normal / total) * 100;
        stress = (stress / total) * 100;

        System.out.println("The totoal is "+ total  +"    The perfromance value is: " + stress   + "    The other one is:  " + normal);

        //returnList.add(new BarPercentage(relax, normal, stress));


        return stress;



    }
    public static MeanAndSizeOfSignal findAbsoluteMeanFromExcel (String fileName)  throws Exception {

        System.out.println("I am in findMeanFromExcel");
        ArrayList<Double> allNumber = new ArrayList<Double>();
        int counter = 0;

        File file = new File(fileName);
        ForBarFromExcel barRaw = new ForBarFromExcel(fileName, 1,4);
        try {

            NewExcelFormat newF = new NewExcelFormat(barRaw);

            try {
                newF.processAllSheets();
            } catch (InvalidOperationException ioe) {
                OldExcelFormat oldF = new OldExcelFormat(barRaw);
                oldF.readSheet();
            }

            // actual.put(entry.getKey(), barRaw.getArrayOfDouble());
            allNumber = barRaw.getArrayOfDouble();
        } catch (org.apache.poi.openxml4j.exceptions.InvalidFormatException e) {
            //return null;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            // delete the file
            if (file.delete()) {
                System.out.println("File has been deleted");
            } else {
                System.out.println("File has NOT been deleted");
            }
        }

        double sum=0;
        for (Double t: allNumber) {
            counter++;
            sum += Math.abs(t);
            //sumSqure += Math.pow(temp, 2);
        }



        double sd = 0;

        double mean = sum / counter;

        System.out.println("The Absolute mean is : " +  mean);
        return new MeanAndSizeOfSignal(mean, counter, allNumber);
    }
    public  static ArrayList<Double> findTotalNASA(int signalType, String fileName)  throws  Exception {
        long startTime =System.nanoTime();
        int i = 0, frameRate = getFrameRate(signalType);
        org.json.simple.JSONObject all = null;
        System.out.println("The frame rate is: " + frameRate);

        System.out.println(fileName);
        File file = new File(fileName);
        BarChartFromExcel jsonForChart = new BarChartFromExcel(fileName, signalType);

        try {

            NewExcelFormatForBarData newF = new NewExcelFormatForBarData(jsonForChart);
            OldExcelFormat oldF = new OldExcelFormat(jsonForChart);
            try {

                newF.processAllSheets();
            } catch(InvalidOperationException ioe)
            {
                oldF.readSheet();
            }
            jsonForChart.finalize();
        }
        catch (org.apache.poi.openxml4j.exceptions.InvalidFormatException e)
        {
            return null;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {


            // delete the file
            if(file.delete()) {
                System.out.println("File has been deleted");
            }
            else
            {
                System.out.println("File has NOT been deleted");
            }
            Logger.info("Singal Type: "+signalType +"  Time spent in method fromExcelInput is :" + ( System.nanoTime()- startTime));
        }
        return jsonForChart.getArrayOfDouble();
    }





    public static JSONObject fromExcelInputTemp(int signalType, ArrayList<Activity> activities, String fileName)  throws Exception {
        long startTime =System.nanoTime();
        int i = 0, frameRate = getFrameRate(signalType);
        org.json.simple.JSONObject all = null;
        System.out.println("The frame rate is: " + frameRate);

        System.out.println(fileName);
        File file = new File(fileName);
        //InputStream input = new FileInputStream(file);
        NPOIFSFileSystem npoifs = null;
        OPCPackage pkg = null;

        try {

            //PlainChartFromExcel jsonForChart = new PlainChartFromExcel(fileName);
            AnnotatedChartFromExcel ann = new AnnotatedChartFromExcel(fileName, activities, signalType);


            NewExcelFormat newF = new NewExcelFormat(ann);
            OldExcelFormat oldF = new OldExcelFormat(ann);
            try {

                newF.processAllSheets();

            } catch(InvalidOperationException ioe)
            {
                oldF.readSheet();
            }

            ann.finalSteps();

            return ann.getJosonForChart();


        }
        catch (org.apache.poi.openxml4j.exceptions.InvalidFormatException e)
        {
            return null;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {


            if (npoifs != null) { npoifs.close(); }
            if (pkg != null) { pkg.close(); }

            // delete the file
            if(file.delete()) {
                System.out.println("File has been deleted");
            }
            else
            {
                System.out.println("File has NOT been deleted");
            }
            Logger.info("Singal Type:  "+signalType +"  Time spent in method fromExcelInput is :" + ( System.nanoTime()- startTime));
        }
        return all;
    }

    public  JSONObject fromExcelInputTemp(int signalType, String fileName)  throws  Exception {
        long startTime =System.nanoTime();
        int i = 0, frameRate = getFrameRate(signalType);
        org.json.simple.JSONObject all = null;
        System.out.println("The frame rate is: " + frameRate);

        System.out.println(fileName);
        File file = new File(fileName);
        PlainChartFromExcel jsonForChart = new PlainChartFromExcel(fileName, signalType);

        try {

            NewExcelFormat newF = new NewExcelFormat(jsonForChart);
            OldExcelFormat oldF = new OldExcelFormat(jsonForChart);
            try {

                newF.processAllSheets();
            } catch(InvalidOperationException ioe)
            {
                oldF.readSheet();
            }
            //jsonForChart.close();
        }
        catch (org.apache.poi.openxml4j.exceptions.InvalidFormatException e)
        {
            return null;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {


            // delete the file
            if(file.delete()) {
                System.out.println("File has been deleted");
            }
            else
            {
                System.out.println("File has NOT been deleted");
            }
            Logger.info("Singal Type: "+signalType +"  Time spent in method fromExcelInput is :" + ( System.nanoTime()- startTime));
        }
        return jsonForChart.getJosonForChart();


    }

    public  JSONObject fromExcelInputToCharTemp(int signalType, String fileName)  throws  Exception {
        long startTime =System.nanoTime();
        int i = 0, frameRate = getFrameRate(signalType);
        org.json.simple.JSONObject all = null;
        System.out.println("The frame rate is: " + frameRate);

        System.out.println(fileName);
        File file = new File(fileName);
        BarChartFromExcel jsonForChart = new BarChartFromExcel(fileName, signalType);

        try {

            NewExcelFormatForBarData newF = new NewExcelFormatForBarData(jsonForChart);
            OldExcelFormat oldF = new OldExcelFormat(jsonForChart);
            try {

                newF.processAllSheets();
            } catch(InvalidOperationException ioe)
            {
                oldF.readSheet();
            }
            jsonForChart.finalize();
            //jsonForChart.getArrayOfDouble();
        }
        catch (org.apache.poi.openxml4j.exceptions.InvalidFormatException e)
        {
            return null;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {


            // delete the file
            if(file.delete()) {
                System.out.println("File has been deleted");
            }
            else
            {
                System.out.println("File has NOT been deleted");
            }
            Logger.info("Singal Type: "+signalType +"  Time spent in method fromExcelInput is :" + ( System.nanoTime()- startTime));
        }
        return jsonForChart.getJosonForChart();


    }

    public static JSONObject fromExcelInput(int signalType, String fileName)  throws IOException {
        long startTime =System.nanoTime();
        int i = 0, frameRate = getFrameRate(signalType);
        org.json.simple.JSONObject all = null;
        System.out.println("The frame rate is: " + frameRate);
        double num;
        boolean isFirst = true;
        int frameRateItr = 0;
        JSONArray header = new JSONArray();
        JSONArray content = new JSONArray();

        Workbook workbook = null;

        File file = new File(fileName);
        NPOIFSFileSystem npoifs = null;
        OPCPackage pkg = null;

        try {


            try {
                npoifs = new NPOIFSFileSystem(file);
                workbook = WorkbookFactory.create(npoifs);
            } catch(OfficeXmlFileException ofe) {
                pkg = OPCPackage.open(file);
                workbook = WorkbookFactory.create(pkg);
            }

            Sheet sheet = workbook.getSheetAt(0);

            int numOFCol = 0;
            Row row = null;
            Iterator cellIterator = null;
            Cell cell = null;

            // we assume that the beginng line in excel is 8;
            row = sheet.getRow(8);
            cellIterator = row.cellIterator();

            // we build the header for the json object..\
            Logger.info("Before Entering the loop that will build the header");
            while (cellIterator.hasNext()) {
                cell = (Cell) cellIterator.next();
                if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
                    if(!isFirst) {   // to avoid the frame column
                        JSONObject obj = new JSONObject();
                        obj.put("id","");
                        obj.put("label",cell.getStringCellValue());
                        obj.put("type", "number");
                        header.add(obj);
                        numOFCol++;
                    }
                    isFirst = false;
                }
                else {
                    System.out.print("  ");
                    break;
                }
            }
            Logger.info("After getting the header");

            boolean isRowEmptyOrBad = false;
            int   numOfBlanks = 0;

            JSONObject obj = new JSONObject();
            JSONArray arr1= new JSONArray();
            JSONObject firstVal = new JSONObject();


            ArrayList<Double> data= new ArrayList<Double>();
            for(int var=0; var < numOFCol; var++)
                data.add(0.0);

            Iterator rowIterator = sheet.iterator();
            // to skip the first 9 lies
            for(int linNo=0; linNo <9; linNo++)
                rowIterator.next();

            Logger.info("Before Entering the loop that will build the Content");
            while (rowIterator.hasNext()) {
                frameRateItr += 1;
                row = (Row) rowIterator.next();
                cellIterator = row.cellIterator();
                i = 0;
                isFirst = true;
                while (cellIterator.hasNext() && !isRowEmptyOrBad && i<= numOFCol) {
                    cell = (Cell) cellIterator.next();
                    if (!isFirst) {   // to avoid the first column
                        switch (cell.getCellType()) {
                            case Cell.CELL_TYPE_BOOLEAN:
                                num = cell.getNumericCellValue();
                                if (i == 1){
                                    data.set(i-1,num);
                                }
                                else
                                    data.set(i-1,num+data.get(i-1));
                                break;
                            case Cell.CELL_TYPE_NUMERIC:
                                num = cell.getNumericCellValue();
                                if (i == 1){
                                    data.set(i-1,num);
                                }
                                else
                                    data.set(i-1, num + data.get(i-1));
                                break;
                            case Cell.CELL_TYPE_STRING: //TODO if string was encounter something has to be decided..
                                //isRowEmptyOrBad = true;
                                break;
                            case Cell.CELL_TYPE_FORMULA:
                                num = cell.getNumericCellValue();
                                if (i == 1) {
                                    data.set(i-1,num);
                                }
                                else
                                    data.set(i-1, num + data.get(i-1));
                                break;
                            default:
                                // to avoid the empty lines
                                isRowEmptyOrBad = true;
                                numOfBlanks = numOfBlanks + 1;
                                System.out.println("Empty");
                                break;
                        }
                    }
                    isFirst = false;
                    i = i + 1;
                }
                // This is used to handle perspiration signal when empty rows at end sometime red as 0's
                if(!( data.get(0)==0.0 /*&& tempSecond==0.0 && tempThird ==0.0*/)) { //TODO why at the begining werid number appear
                    if (frameRateItr >= frameRate) {
                        int divisor = frameRate;

                        obj = new JSONObject();
                        arr1= new JSONArray();

                        firstVal = new JSONObject();
                        firstVal.put("v", new DecimalFormat("#.##").format(data.get(0)));
                        arr1.add(firstVal);

                        for(int var=1; var < numOFCol; var++) {
                            firstVal = new JSONObject();
                            firstVal.put("v",  new DecimalFormat("##.####").format(data.get(var)/divisor));
                            arr1.add(firstVal);
                        }
                        obj.put("c", arr1);

                        content.add(obj);
                        frameRateItr = 0;
                        for(int var=0; var < numOFCol; var++)
                            data.set(var, 0.0);
                    }
                }

                // to handle the empty trial
                //if(numOfBlanks >20 && i == 0)
                if(numOfBlanks >20)
                    break;

            }

            Logger.info("After getting Content");
            //workbook = null;
            all = new JSONObject();
            all.put("cols" , header);
            all.put("rows" , content);

        }
        /*catch(org.apache.poi.POIXMLException e){
            Logger.error("file is not excel  we now call fromExcelInputOldVersion");
            return fromExcelInputOldVersion(input, signalType);
        }*/
        catch (org.apache.poi.openxml4j.exceptions.InvalidFormatException e)
        {
            return null;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (npoifs != null) { npoifs.close(); }
            if (pkg != null) { pkg.close(); }

            // delete the file
            if(file.delete()) {
                System.out.println("File has been deleted");
            }
            else
            {
                System.out.println("File has NOT been deleted");
            }
            Logger.info("Time spent in method fromExcelInput is :" + ( System.nanoTime()- startTime));
        }
        return all;

    }



    public static JSONObject fromExcelInputToChar(int signalType, String fileName)  throws IOException {
        long startTime =System.nanoTime();
        org.json.simple.JSONObject all = null;
        int i = 0;
        boolean isFirst = true;
        JSONArray header = new JSONArray();
        JSONArray content = new JSONArray();

        Workbook workbook = null;

        File file = new File(fileName);
        NPOIFSFileSystem npoifs = null;
        OPCPackage pkg = null;

        try {


            try {
                npoifs = new NPOIFSFileSystem(file);
                workbook = WorkbookFactory.create(npoifs);
            } catch(OfficeXmlFileException ofe) {
                pkg = OPCPackage.open(file);
                workbook = WorkbookFactory.create(pkg);
            }

            Sheet sheet = workbook.getSheetAt(0);

            int numOFCol = 0;
            Row row = null;
            Iterator cellIterator = null;
            Cell cell = null;

            // we assume that the beginng line in excel is 8;
            row = sheet.getRow(8);
            cellIterator = row.cellIterator();

            // we build the header for the json object..\
            Logger.info("Before Entering the loop that will build the header");
            while (cellIterator.hasNext()) {
                cell = (Cell) cellIterator.next();
                if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
                    if(isFirst) {   // to avoid the frame column
                        JSONObject obj = new JSONObject();
                        obj.put("id","");
                        obj.put("label",cell.getStringCellValue());
                        obj.put("type", "string");
                        header.add(obj);
                        numOFCol++;
                        isFirst = false;
                    }else{
                        JSONObject obj = new JSONObject();
                        obj.put("id","");
                        obj.put("label",cell.getStringCellValue());
                        obj.put("type", "number");
                        header.add(obj);
                        numOFCol++;
                    }
                    //
                }
                else {
                    System.out.print("  ");
                    break;
                }
            }
            Logger.info("After getting the header");

            boolean isRowEmptyOrBad = false;
            int   numOfBlanks = 0;

            JSONObject obj = new JSONObject();
            JSONArray arr1= new JSONArray();
            JSONObject firstVal = new JSONObject();


            Iterator rowIterator = sheet.iterator();
            // to skip the title
            for(int linNo=0; linNo <1; linNo++)
                rowIterator.next();

            Logger.info("Before Entering the loop that will build the Content");
            int numOfEmptyRow =0;

            while (rowIterator.hasNext() /*&& !isRowEmptyOrBad*/) {
                i =0;
                numOfBlanks =0;
                obj = new JSONObject();
                arr1= new JSONArray();

                isRowEmptyOrBad = false;
                row = (Row) rowIterator.next();
                cellIterator = row.cellIterator();
                while (cellIterator.hasNext() && i< numOFCol /*!isRowEmptyOrBad && i<= numOFCol*/) {
                    cell = (Cell) cellIterator.next();
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_BLANK:
                            System.out.println("BLANK");
                            numOfBlanks = numOfBlanks + 1;
                            break;
                        case Cell.CELL_TYPE_ERROR:
                            System.out.println("ERROR");
                        case Cell.CELL_TYPE_BOOLEAN:
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            System.out.println("NUMBER");
                            firstVal = new JSONObject();
                            firstVal.put("v", cell.getNumericCellValue());
                            arr1.add(firstVal);
                            System.out.println(cell.getNumericCellValue());
                            break;
                        case Cell.CELL_TYPE_STRING: //TODO if string was encounter something has to be decided..
                            System.out.println("STRING");
                            firstVal = new JSONObject();
                            firstVal.put("v", cell.getStringCellValue());
                            arr1.add(firstVal);
                            System.out.println(cell.getStringCellValue());
                            break;
                        case Cell.CELL_TYPE_FORMULA:
                            System.out.println("FORMULA");
                            System.out.println(cell.getNumericCellValue());
                            firstVal = new JSONObject();
                            firstVal.put("v", cell.getNumericCellValue());
                            arr1.add(firstVal);
                            break;
                        default:

                            System.out.println("DEFAULT");
                            // to avoid the empty lines
                            //  isRowEmptyOrBad = true;
                            numOfBlanks = numOfBlanks + 1;
                            System.out.println("Empty");
                            //break;
                    }
                    i = i + 1;
                }
                // if a line is empty skip it and if 10 were encounterd then stop searching
                if (numOfBlanks >= i){
                    numOfEmptyRow++;
                    // exit if 10 or more lines were empty
                    if(numOfEmptyRow > 10)
                        break;
                }
                else{
                    obj.put("c", arr1);
                    content.add(obj);
                }

                //if(!isRowEmptyOrBad) {

                //}



            }
            Logger.info("After getting Content");
            //workbook = null;
            all = new JSONObject();
            all.put("cols" , header);
            all.put("rows" , content);

        }
        catch (org.apache.poi.openxml4j.exceptions.InvalidFormatException e)
        {
            return null;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (npoifs != null) { npoifs.close(); }
            if (pkg != null) { pkg.close(); }

            // delete the file
            if(file.delete()) {
                System.out.println("File has been deleted");
            }
            else
            {
                System.out.println("File has NOT been deleted");
            }
            Logger.info("Time spent in method fromExcelInput is :" + ( System.nanoTime()- startTime));
        }
        return all;

    }

    private static int readHeader(Iterator cellIterator,  JSONArray header){
        Cell cell;
        int i =0,numOFCol=0;
        JSONObject obj;
        while (cellIterator.hasNext()) {
            cell = (Cell) cellIterator.next();
            if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
                if (i == 0) // skip first columne becuase it is frame
                    i += 1;
                else {
                    obj = new JSONObject();
                    //obj.put("id","");
                    obj.put("label",cell.getStringCellValue());
                    obj.put("type", "number");
                    header.add(obj);
                    numOFCol++;

                    if(i==2) {
                        obj = new JSONObject();
                        // obj.put("id","");
                        obj.put("type","string");
                        obj.put("role", "annotation");
                        header.add(obj);

                        obj = new JSONObject();
                        //obj.put("id","");
                        obj.put("type","string");
                        obj.put("role", "annotationText");
                        header.add(obj);
                    }
                }
            }
            else {
                break;
            }
            i++;
        }
        return  numOFCol;
    }

    private static double readContent(Iterator rowIterator, ArrayList<Activity> activities, ArrayList<Integer> distinctActionType,JSONArray content, int numOFCol, int frameRate){
        Iterator cellIterator;
        int frameRateItr =0, numOfBlanks, i, numOfEmptyRow=0;
        boolean isFirst;
        double num, max=0;
        Row row;
        Cell cell;

        ArrayList<Double> data= new ArrayList<Double>();
        for(int var=0; var < numOFCol; var++)
            data.add(0.0);

        ArrayList<Integer> consumedActivity = new ArrayList<>();
        JSONObject obj;
        JSONArray arr1;

        while (rowIterator.hasNext()) {
            row = (Row) rowIterator.next();
            cellIterator = row.cellIterator();
            i = 0;
            numOfBlanks =0;
            isFirst = true;

            while (cellIterator.hasNext() &&  i<= numOFCol) {
                cell = (Cell) cellIterator.next();
                if (!isFirst) {   // to avoid the first column
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_BOOLEAN:
                            num = cell.getNumericCellValue();
                            if (i == 1)
                                data.set(i-1,num);
                            else
                                data.set(i-1,num+data.get(i-1));
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            num = cell.getNumericCellValue();
                            if (i == 1)
                                data.set(i-1,num);
                            else
                                data.set(i - 1, num + data.get(i - 1));
                            break;
                        case Cell.CELL_TYPE_STRING: //TODO if string was encounter something has to be decided..
                            //isRowEmptyOrBad = true;
                            break;
                        case Cell.CELL_TYPE_FORMULA:
                            num = cell.getNumericCellValue();
                            if (i == 1)
                                data.set(i-1,num);
                            else
                                data.set(i - 1, num + data.get(i - 1));
                            break;

                        case Cell.CELL_TYPE_BLANK:
                            numOfBlanks = numOfBlanks + 1;
                            break;
                        default:
                            numOfBlanks = numOfBlanks + 1;
                            break;
                    }
                }
                isFirst = false;
                i = i + 1;
            }

            if (numOfBlanks >= numOFCol){
                numOfEmptyRow++;
                // exit if 10 or more lines were empty
                if(numOfEmptyRow > 20)
                    break;
            }
            else{
                // if(!(data.get(0)==0.0)) {  frameRateItr += 1;}
                frameRateItr += 1;
                if (frameRateItr >= frameRate  && !( data.get(0)==0.0 )) {
                    obj = new JSONObject();
                    arr1 = new JSONArray();
                    String annotation;

                    // we add the time here
                    addObjectToArrayJson(arr1, new DecimalFormat("#.#").format(data.get(0)));

                    // we check if the current point of time marks the begining of an actitivy
                    annotation = getAnnotation(activities, data.get(0),consumedActivity);
                    if(annotation != null) {
                        addObjectToArrayJson(arr1, ".");
                        addObjectToArrayJson(arr1, annotation);
                    }
                    else {
                        addObjectToArrayJson(arr1, null);
                        addObjectToArrayJson(arr1, null);
                    }

                    // add the real series here
                    double val;
                    for (int var = 1; var < numOFCol; var++) {
                        val = Double.parseDouble(new DecimalFormat("#.####").format(data.get(var)/frameRateItr));
                        // to specify the maximum point for the sake of drawing backgrounds for annotation
                        if(max < val)
                            max = val;
                        addObjectToArrayJson(arr1, Double.toString(val));
                    }
                    // add the background color for each activity
                    // In this loop we check what acticities the current point of time fall in. NOTE: a point of time can belong to more than man activity
                    for(int itr=0; itr<distinctActionType.size(); itr++)
                    {
                        if(inActitivity(activities,data.get(0), distinctActionType.get(itr))){
                            addObjectToArrayJson(arr1, Double.toString(.03));  //.03 is a dummy to distinguish between null and values
                        }
                        else{
                            addObjectToArrayJson(arr1, null);
                        }
                    }

                    obj.put("c", arr1);
                    content.add(obj);

                    frameRateItr = 0;
                    for(int var=0; var < numOFCol; var++)
                        data.set(var, 0.0);
                }

            }
        }
        return max;
    }

    public static JSONObject fromExcelInput(int signalType, ArrayList<Activity> activities, String fileName)  throws IOException {
        long startTime =System.nanoTime();
        int i = 0,  numOFCol =0,frameRate = getFrameRate(signalType),  frameRateItr = 0;
        double num, max = 0;
        org.json.simple.JSONObject all = null;

        JSONArray header = new JSONArray();
        JSONArray content = new JSONArray();
        Workbook workbook = null;

        File file = new File(fileName);
        NPOIFSFileSystem npoifs = null;
        OPCPackage pkg = null;

        try {
            try {
                npoifs = new NPOIFSFileSystem(file);
                workbook = WorkbookFactory.create(npoifs);
            } catch(OfficeXmlFileException ofe) {
                pkg = OPCPackage.open(file);
                workbook = WorkbookFactory.create(pkg);
            }
            Sheet sheet = workbook.getSheetAt(0);

            Row row;
            Iterator cellIterator;
            Cell cell;

            // we assume that the headers start from the eightieth line.
            // at the row before is the title
            //row = sheet.getRow(8);

            Iterator rowIteratorHeader = sheet.iterator();

            for(int linNo=0; linNo <1; linNo++)
                rowIteratorHeader.next();

            row = (Row) rowIteratorHeader.next();


            cellIterator = row.cellIterator();
            JSONObject obj;

            // public the header of JSON file : (Time ,annotation, annotaiton Text, singal, styple, snothersingal, styple , etcccccc

            Logger.info("From ReadExcelJava before getting the header");
            numOFCol = readHeader(cellIterator, header);

            // each activity has the following:  startTime, endTime, actionType, annotation, annotationText, label
            ArrayList<String> distinctAnno = new ArrayList<>();
            ArrayList<Integer> distinctActionType = new ArrayList<>();
            for(Activity temp: activities) {
                if(!distinctActionType.contains(temp.actionType)) {
                    distinctActionType.add(temp.actionType);
                    distinctAnno.add(temp.label);
                }
            }

            // we make each annotaiton cloumn start with bgCol so that javascript can make them of area type..
            // for each unique action type we add a col. This col will be used to be used to draw areas on the chart
            String columnName = "bgCol";
            int util = 1;
            for(int ct=0; ct< distinctAnno.size(); ct++) {
                columnName = columnName + util;
                util++;
                obj = new JSONObject();
                obj.put("id",columnName);
                obj.put("label",distinctAnno.get(ct));
                obj.put("type","number");
                obj.put("color","grey");
                header.add(obj);
            }

            Logger.info("From ReadExcelJava after getting the header");
            boolean isRowEmptyOrBad = false;

            // sheet.groupRow(0, sheet.getLastRowNum())
            Iterator rowIterator = sheet.iterator();

            for(int linNo=0; linNo <2; linNo++)
                rowIterator.next();

            max = readContent(rowIterator, activities, distinctActionType, content, numOFCol,frameRate);

            ////////////////// this is to handle the maxium value of background strips
            if(max ==0)
                max = 0.05;


            JSONObject line,head, cel;
            JSONArray arr;
            int aux =0;
            Iterator each = content.iterator(), it;
            while(each.hasNext()){
                line =  (JSONObject) each.next();
                arr = (JSONArray) line.get("c");
                it =arr.iterator();
                aux =0;
                while(it.hasNext()){
                    head=  (JSONObject)header.get(aux);
                    cel = (JSONObject) it.next();
                    if(head.get("color")=="grey") {
                        if(cel.get("v") !=null)
                            cel.toString();
                        //cel.replace("v", max);
                    }
                    aux++;
                }
            }
            ///////////////////////////////
            all = new JSONObject();
            all.put("cols" , header);
            all.put("rows" , content);
        }
        catch(org.apache.poi.openxml4j.exceptions.InvalidFormatException e){
            Logger.error("file is not excel ");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (npoifs != null) { npoifs.close(); }
            if (pkg != null) { pkg.close(); }

            // delete the file
            if(file.delete()) {
                System.out.println("File has been deleted");
            } else {
                System.out.println("File has NOT been deleted");
            }
            Logger.info("Time spent in method fromExcelInput with activity is :" + ( System.nanoTime()- startTime));
        }

        return all;
    }

    private static void addObjectToArrayJson(JSONArray arr, String val){

        JSONObject style1 = new JSONObject();
        style1.put("v", val);
        arr.add(style1);

    }
    // this function specify if the current point of time in the signal fall in actvity type: actiontype. If yes return true
    // this fucntion will be used to color the actcities
    public static boolean inActitivity( ArrayList<Activity> activities, Double val, int actionType)
    {
        for(Activity act: activities)
        {
            if(Math.floor(val)>= Math.floor(act.startTime) && Math.floor(val)<= Math.floor(act.endTime) && actionType == act.actionType) {
                return true;
            }
        }
        return false;
    }


    // this fucntion will specify if the current point of time(i.e, val) is at the begining of actvity. If yes the annotaiton associated with it will be returedn
    // consumedActicity is list that keep track of already served point so that we do not have multple annoation marks on the chart
    public static String getAnnotation( ArrayList<Activity> activities, Double val,  ArrayList<Integer> consumedActivity)
    {
        int ctr =0;
        for(Activity act: activities)
        {
            if((Math.floor(val)== Math.floor(act.startTime) /*|| Math.floor(val)== Math.floor(act.endTime)*/) && !consumedActivity.contains(ctr)) {
                consumedActivity.add(ctr);
                return act.annotationText;
            }
            ctr++;
        }
        return null;
    }

    // when the signal has activity data

    public static TreeMap<String, BarPercentage> fromExceForPortrait(TreeMap<String,String> input, int signalType)  throws IOException {
        int i = 0;
        double num;

        Workbook workbook = null;
        NPOIFSFileSystem npoifs = null;
        OPCPackage pkg = null;
        TreeMap<String,ArrayList<Double>> actual= new TreeMap<>();

        double all =0;
        ArrayList <Double> allNumber = new ArrayList<Double>();
        int counter =0;
        for(Map.Entry<String,String> entry : input.entrySet()) {

            File file = new File(entry.getValue());
            try {
                ArrayList<Double> templst = new ArrayList<Double>();
                //val file: FileInputStream = new FileInputStream(input)
                try {
                    npoifs = new NPOIFSFileSystem(file);
                    workbook = WorkbookFactory.create(npoifs);
                } catch(OfficeXmlFileException ofe) {
                    pkg = OPCPackage.open(file);
                    workbook = WorkbookFactory.create(pkg);
                }
                Sheet sheet = workbook.getSheetAt(0);




                Row row = null;
                Iterator cellIterator = null;
                Cell cell = null;

                row = sheet.getRow(8);
                cellIterator = row.cellIterator();


                int numOfBlanks = 0, numOfRows =0;
                Iterator rowIterator = sheet.iterator();
                while (rowIterator.hasNext() && numOfRows <15000) {
                    numOfRows++;
                    row = (Row) rowIterator.next();
                    cellIterator = row.cellIterator();
                    i = 0;
                    while (cellIterator.hasNext()) {
                        cell = (Cell) cellIterator.next();
                        if (i > 0) {   // to avoid the first column
                            if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
                                num = cell.getNumericCellValue();
                                if (i == 2){
                                    templst.add(num);
                                    all +=num;
                                    counter++;
                                    allNumber.add(num);
                                }
                            } else if (cell.getCellType() == Cell.CELL_TYPE_FORMULA) {
                                //print(cell.getNumericCellValue + "\t\t")
                                num = cell.getNumericCellValue();
                                if (i == 2) {
                                    templst.add(num);
                                    all +=num;
                                    counter++;
                                    allNumber.add(num);
                                    //  tempSecond = num;
                                }
                            }
                            else {
                                numOfBlanks = numOfBlanks + 1;
                                break;
                            }
                        }
                        i = i + 1;
                    }
                    if (numOfBlanks > 20)
                        break;
                }
                //actual.add(templst);
                actual.put(entry.getKey(), templst);
            }  catch(org.apache.poi.openxml4j.exceptions.InvalidFormatException e){
                Logger.error("file is not excel ");
            }
            catch (IOException e) {

                Logger.error("Happened Inside fromExceForPortrait \n");
                Logger.error(e.toString());
                Logger.error(e.getStackTrace().toString());
                Logger.error(e.getMessage());
            }
            finally {
                if (npoifs != null) { npoifs.close(); }
                if (pkg != null) { pkg.close(); }

                // delete the file
                if(file.delete()) {
                    System.out.println("File has been deleted");
                } else {
                    System.out.println("File has NOT been deleted");
                }
                //   Logger.info("Time spent in method fromExcelInput with activity is :" + ( System.nanoTime()- startTime));
            }
        }

        double mean = all/counter;
        double sd = 0;

        System.out.println("Mean= " + mean + "  Signal Type=" + signalType);
        for ( i=0; i<allNumber.size();i++)
        {
            sd = sd + Math.pow(allNumber.get(i) - mean, 2);
        }
        sd= Math.sqrt((sd)/(allNumber.size()-1));

        System.out.println ("SD= " + sd + "  Signal Type=" + signalType);

        TreeMap<String, BarPercentage> returnList = new TreeMap<>();

        double val;

        for(Map.Entry<String,ArrayList<Double>> entry2 : actual.entrySet()) {
            double relax=0, normal=0, stress=0;
            for(int j=0; j<entry2.getValue().size(); j++)
            {
                val = entry2.getValue().get(j);
                if(val < mean - 1* sd){
                    relax++;
                }
                else if((val>= (mean - 1* sd)) && (val <= (mean + 1* sd))) {
                    normal++;
                }
                else
                    stress++;
            }

            int total = entry2.getValue().size();
            relax = (relax / total)*100;
            normal= (normal /total)*100;
            stress = (stress / total)*100;


            returnList.put(entry2.getKey(), new BarPercentage(relax, normal, stress));

            System.out.println("relax: " + relax + "  normal: " + normal + "  stress: " + stress);
        }
        return returnList;
    }


    public static TreeMap<String, BarPercentage> fromExceForPortraitTemp(TreeMap<String,String> input, int signalType)  throws    Exception {
        {
            int i = 0;
            double num;

            TreeMap<String, ArrayList<Double>> actual = new TreeMap<>();

            double all = 0;
            ArrayList<Double> allNumber = new ArrayList<Double>();
            int counter = 0;
            for (Map.Entry<String, String> entry : input.entrySet()) {

                File file = new File(entry.getValue());
                ForBarFromExcel barRaw = new ForBarFromExcel(entry.getValue(), signalType);
                try {
                    ArrayList<Double> templst = new ArrayList<Double>();


                    NewExcelFormat newF = new NewExcelFormat(barRaw);
                    OldExcelFormat oldF = new OldExcelFormat(barRaw);
                    try {

                        newF.processAllSheets();
                    } catch (InvalidOperationException ioe) {
                        oldF.readSheet();
                    }

                    actual.put(entry.getKey(), barRaw.getArrayOfDouble());
                } catch (org.apache.poi.openxml4j.exceptions.InvalidFormatException e) {
                    return null;
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {


                    // delete the file
                    if (file.delete()) {
                        System.out.println("File has been deleted");
                    } else {
                        System.out.println("File has NOT been deleted");
                    }
                    //       Logger.info("Singal Type: " + signalType + "  Time spent in method fromExcelInput is :" + (System.nanoTime() - startTime));
                }

            }

            //double mean = all / counter;

            double sum=0, sumSqure=0;
            for (Map.Entry<String, ArrayList<Double>> entry2 : actual.entrySet()) {
                for (int j = 0; j < entry2.getValue().size(); j++) {
                    counter++;
                    double temp = entry2.getValue().get(j);
                    sum += temp;
                    //sumSqure += Math.pow(temp, 2);
                }
            }
            //   double sd = Math.sqrt((sumSqure/counter)  - Math.pow(mean/counter, 2));

            double sd = 0;

            double mean = sum / counter;

            for (Map.Entry<String, ArrayList<Double>> entry2 : actual.entrySet()) {
                for (int j = 0; j < entry2.getValue().size(); j++) {
                    //counter++;
                    double temp = entry2.getValue().get(j);
                    sd = sd + Math.pow(temp - mean, 2);
                }
            }

            sd = Math.sqrt((sd) / (counter - 1));


            System.out.println("Mean= " + mean + "  sd=" + sd);
           /* for (i = 0; i < allNumber.size(); i++) {
                sd = sd + Math.pow(allNumber.get(i) - mean, 2);
            }
            sd = Math.sqrt((sd) / (allNumber.size() - 1));

            System.out.println("SD= " + sd + "  Signal Type=" + signalType);*/


            TreeMap<String, BarPercentage> returnList = new TreeMap<>();

            //for(i=0; i< actual.size(); i++){
            double val;
            for (Map.Entry<String, ArrayList<Double>> entry2 : actual.entrySet()) {
                double relax = 0, normal = 0, stress = 0;
                for (int j = 0; j < entry2.getValue().size(); j++) {
                    val = entry2.getValue().get(j);
                    if (val < mean - 1 * sd) {
                        relax++;
                    } else if ((val >= (mean - 1 * sd)) && (val <= (mean + 1 * sd))) {
                        normal++;
                    } else
                        stress++;
                }

                int total = entry2.getValue().size();
                //relax = (relax / actual.get(i).size())*100;
                relax = (relax / total) * 100;
                normal = (normal / total) * 100;
                stress = (stress / total) * 100;

                //returnList.add(new BarPercentage(relax, normal, stress));
                returnList.put(entry2.getKey(), new BarPercentage(relax, normal, stress));

                System.out.println("relax: " + relax + "  normal: " + normal + "  stress: " + stress);
            }
            return returnList;
        }
    }



}
