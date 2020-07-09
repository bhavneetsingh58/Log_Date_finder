package com.bhavneetsingh;

import java.util.ArrayList;

public class compute {

    void mainComputeModule(ArrayList<ArrayList<Integer>>list){
        BinSearch BS = new BinSearch();
        //Year
        int startYear = 16;
        int startYearIndex = BS.searchListStart(list.get(2),startYear,0,99);
        System.out.println(startYearIndex);
        //int endYear = 14;
        int endYearIndex = BS.searchListEnd(list.get(2),startYear,startYearIndex,99);
        System.out.println(endYearIndex);
        int startMonth = 9;
        int startMonthIndex =BS.searchListStart(list.get(1),startMonth,startYearIndex,endYearIndex);
        System.out.println(startMonthIndex);
        int endMonthIndex =BS.searchListEnd(list.get(1),startMonth,startMonthIndex,endYearIndex);
        System.out.println(endMonthIndex);
        int startDay = 25;
        int startDayIndex =BS.searchListStart(list.get(0),startDay,startMonthIndex,endMonthIndex);
        System.out.println(startDayIndex);
        int endDayIndex =BS.searchListEnd(list.get(0),startDay,startDayIndex,endMonthIndex);
        System.out.println(endDayIndex);
    }
    
}