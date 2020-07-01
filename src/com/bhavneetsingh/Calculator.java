package com.bhavneetsingh;

import java.util.ArrayList;

public class Calculator {

    int[] IndexCal(ArrayList<Integer> list,int date){//make int
        int[] Output = new int[2];
        BinSearch BS= new BinSearch();
        Output[0] = BS.Search_list_start(list,date);
        Output[1] = BS.Search_list_end(list,Output[0],date);
        return Output;
        //System.out.println(startYearIndex);
    }

    ArrayList<Integer> Slicer(ArrayList<ArrayList<Integer>> list,int[] lowHigh,int n){//make int
        ArrayList<Integer> Updated = new ArrayList<>(list.get(n).subList(lowHigh[0],lowHigh[1]));
        return Updated;
        //System.out.println(startYearIndex);
    }


    void CalCaller2(ArrayList<ArrayList<Integer>> list,String date){
        int n;
        int partDate;
        while(( n = (list.size()-1))>=0){
            partDate = Integer.parseInt(date.split("-")[n]);
            IndexCal(list.get(n),partDate);//might not work might have to make the function recurcive
            n--;
        }
    }
    ArrayList<Integer> CalCaller(ArrayList<ArrayList<Integer>> list,String date,int n){
        //int n=2;//recieves default list as year list
        int partDate = Integer.parseInt(date.split("-")[n]);
        int[] yearStartToEndIndex = new int[2];
        yearStartToEndIndex = IndexCal(list.get(n),partDate);//yearIndex Obtained
        n--;
        ArrayList<Integer> monthList = new ArrayList<Integer>();//year part over --month part starts
        monthList = Slicer(list, yearStartToEndIndex,n);
        return monthList;
    }
    void ListSlicer(ArrayList<ArrayList<Integer>> list){
        String date ="08-03-04";
        int n = list.size()-1;
        CalCaller(list,date,n);

    }
    int Splitter(ArrayList<Integer> list,String date,int low,int high,int n){//make int
        int partDate = Integer.parseInt(date.split("-")[n]);
        return partDate;
        //System.out.println(startYearIndex);
        //alpha
    }


    void Printer(ArrayList<Integer> list){ //Printer-Stub
        for(int i :list){
            //for(int i :date){
            System.out.println(i);
            //}
        }
    }

}
