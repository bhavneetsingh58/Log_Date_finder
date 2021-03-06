package com.bhavneetsingh;

import java.util.ArrayList;

public class compute {

    int[] mainComputeModule(String date,ArrayList<ArrayList<Integer>>list){
        BinSearch BS = new BinSearch();
        int[] Output = new int[2];
        //int listSize = ((list.get(0).size())-1);
        int startYear = Integer.parseInt(date.split("-")[0]);
        int startYearIndex = BS.searchListStart(list.get(2),startYear,0,99);
        //System.out.println(startYearIndex);
        int endYearIndex = BS.searchListEnd(list.get(2),startYear,startYearIndex,99);
        //System.out.println(endYearIndex);
        int startMonth = Integer.parseInt(date.split("-")[1]);
        int startMonthIndex =BS.searchListStart(list.get(1),startMonth,startYearIndex,endYearIndex);
        //System.out.println(startMonthIndex);
        int endMonthIndex =BS.searchListEnd(list.get(1),startMonth,startMonthIndex,endYearIndex);
        //System.out.println(endMonthIndex);
        int startDay = Integer.parseInt(date.split("-")[2]);
        int startDayIndex =BS.searchListStart(list.get(0),startDay,startMonthIndex,endMonthIndex);
        Output[0] = startDayIndex;
        //System.out.println(startDayIndex);
        int endDayIndex =BS.searchListEnd(list.get(0),startDay,startDayIndex,endMonthIndex);
        Output[1] = endDayIndex;
        //System.out.println(endDayIndex);
        return Output;
    }

    ArrayList<String> mainComputeModuleCaller(String startDate,String endDate,ArrayList<ArrayList<Integer>> list,ArrayList<String> logData){
        int[] startIndex = new int[2];
        int[] endIndex = new int[2];
        startIndex = mainComputeModule(startDate, list);
        System.out.println(startIndex);
        endIndex = mainComputeModule(endDate, list);
        System.out.println(endIndex);
        int i;
        int start = startIndex[0];
        int end = endIndex[1];
        for (i=start;i<=end;i++){
             System.out.println(logData.get(i));
        }
        ArrayList<String> subList = new ArrayList<String>(logData.subList(start,end));
        return subList;
    }
    
}