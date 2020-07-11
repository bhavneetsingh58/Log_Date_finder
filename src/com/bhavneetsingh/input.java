package com.bhavneetsingh;

import java.text.SimpleDateFormat;
import java.util.Date;
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
         try{sdfrmt.parse(strDate); 
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
            //System.out.println(" is a file");
            return true;
        } 
        return false;
    }
    
}