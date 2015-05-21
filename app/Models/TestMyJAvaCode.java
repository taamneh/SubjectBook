package Models;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by staamneh on 3/4/2015.
 */
public class TestMyJAvaCode {

    private static class Dat
    {
        public Dat(int var1, int var2)
        {
            x = var1;
            y = var2;
        }
        public int x;
        public int y;

    }
    public static void main(String[] args)
    {

        TreeMap<Integer, Dat> mp= new TreeMap();
        ArrayList<Dat> lst = new ArrayList<>();

        Dat x = new Dat(0, 0);
        for(int i=0; i<5; i++)
        {
             x.x= i+2;
            x.y= i+4;
            mp.put(i, x);
        }

        System.out.print(mp.get(0).x + "    " + mp.get(0).y);
        System.out.print(mp.get(1).x + "    " + mp.get(1).y);


        Dat y = new Dat(0,0);
        for(int i=0; i<5; i++)
        {
            y.x= i+2;
            y.y= i+4;
            lst.add(y);
        }

        System.out.print(lst.get(0).x + "    " +  lst.get(0).y);
        System.out.print(lst.get(1).x + "    " +  lst.get(1).y);

        /*System.out.print("salah");
        try {
            InputStream input = new FileInputStream("C:\\Users\\staamneh\\Desktop\\test\\RI_S001-001.Z_ECG");
            InputStream act = new FileInputStream("C:\\Users\\staamneh\\Desktop\\test\\RI_S001-001[ErrorReport].activity");
            OutputStream output= new FileOutputStream("C:\\Users\\staamneh\\Desktop\\test\\result.txt");
            PrintWriter print = new PrintWriter(output);



            print.write(ReadExcelJava.fromExcelInput( 1, ReadExcelJava.readActivity(act), "").toString());

        }
        catch (IOException e)
        {

        }*/


    }
}
