package com.bhavneetsingh;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.cli.*;

import java.io.File;
import java.text.ParseException;

public class input {
   
    public boolean validateJavaDate(String strDate)
    {
     if (strDate.trim().equals(""))
     {return true;     /* Check if date is 'null' */
     }else/* Date is not 'null' */
     {
         SimpleDateFormat sdfrmt = new SimpleDateFormat("yyyy-MM-dd");
         sdfrmt.setLenient(false);
         try{Date javaDate = sdfrmt.parse(strDate); 
             System.out.println(strDate+" is valid date format");
         }catch (ParseException e){
             System.out.println(strDate+" is Invalid Date format");
             return false;
         }return true;
     }
    }


    boolean checkFile(String fileName){
        File tmpDir = new File(fileName);
        boolean exists = tmpDir.exists();
        if (exists){
            System.out.println(" is a file");
            return true;
        } 
        return false;
    }
    public static void main(String[] args) {
        try{ 
            input one = new input();
            one.validateJavaDate("2020-09-10");
            one.validateJavaDate("2020-09-20");
            one.checkFile(args[2]);
            //System.out.println("Hello "+args[0]+"_"+args[1]);//
            
        }catch(Exception e){
            e.printStackTrace();
        }

        CommandLineParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("f",true,"Start Date");
        options.addOption("t",true,"last date");
        options.addOption("i",true,"logFile Loc");
        try {
            CommandLine commandLine = parser.parse(options, args);
            System.out.println(commandLine.getOptionValue("f"));
            System.out.println(commandLine.getOptionValue("t"));
            System.out.println(commandLine.getOptionValue("i"));
        } catch (org.apache.commons.cli.ParseException e) {
            e.printStackTrace();
        }





    }
    
}