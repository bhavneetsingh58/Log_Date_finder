package com.bhavneetsingh;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LogReadFilter {
    ArrayList<String> readLogFile(String fileLoc) throws FileNotFoundException {//Step1-ReadFile
        try{
            final FileInputStream fstream = new FileInputStream(fileLoc);//"res/LogFile-000006.log"
            final BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            ArrayList<String> logData = new ArrayList<String>();
            String line;
            while ((line = br.readLine()) != null) {
                logData.add(line);
                //System.out.println(line);
            }
            fstream.close();
            return logData;
        } catch (final Exception e) {
            System.out.println("File Not Found");
            return null;
        }
    }

    public ArrayList<ArrayList<Integer>> filter(ArrayList<String> logList){//Step2-FilterData
        ArrayList<Integer> day = new ArrayList<Integer>();
        ArrayList<Integer> month = new ArrayList<Integer>();
        ArrayList<Integer> year = new ArrayList<Integer>();

        ArrayList<ArrayList<Integer>> date =  new ArrayList<ArrayList<Integer>>(3);
        String modLine;
        for(String line:logList){
            modLine=line.split("T")[0];
            day.add(Integer.parseInt(modLine.split("-")[0]));
            month.add(Integer.parseInt(modLine.split("-")[1]));
            year.add(Integer.parseInt(modLine.split("-")[2]));
            //System.out.println(modLine);
        }
        date.add(day);
        date.add(month);
        date.add(year);
        return date;
    }

    void Printer(ArrayList<ArrayList<Integer>> date){

        int i=2;
        for(int j = 0; j < date.get(i).size(); j++){
            System.out.println(date.get(i).get(j));//
        }

    }

}



