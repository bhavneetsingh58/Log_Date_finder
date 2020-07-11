package com.bhavneetsingh;

import java.util.ArrayList;

public class BinSearch {

    Integer searchListStart(ArrayList<Integer> list,int date, int low, int high){
        boolean startEnd = true;
        return searchList(list,date,low,high,startEnd);
    }

    Integer searchListEnd(ArrayList<Integer> list,int date, int low, int high){
        boolean startEnd = false;
        return searchList(list,date,low,high,startEnd);        
    }

    Integer searchList(ArrayList<Integer> list,int date, int low, int high,boolean startEnd) {
        int mid;        
        int current;
        int lowTemp = low;
        int highTemp = high;
        while(low <= high){
            mid = (low+high)/2;
            current =list.get(mid);
            if(date == current){ 
                if (startEnd){
                    while(((list.get(mid)).equals(list.get(mid-1)))){//insert &&(if(highTemp>=mid))
                        //System.out.println(list.get(PrevOut));
                        mid--;
                    }
                if(lowTemp>mid){return lowTemp;}else{return mid;}   
                }
                else{
                    while(((list.get(mid)).equals(list.get(mid+1)))){
                        //System.out.println(list.get(PrevOut));
                        mid++;
                    }
                if(highTemp<=mid){return highTemp;}else{return mid;}   
                }
            }
            else if(current > date){high = mid-1;}
            else{low = mid+1;}
        }
        return null;
    }
    
    // public static void main(String[] args) {
    //     ArrayList<Integer> list = new ArrayList<Integer>();
    //     list.add(1);
    //     list.add(2);
    //     list.add(4);
    //     list.add(4);
    //     list.add(4);
    //     list.add(9);
    //     list.add(9);
    //     list.add(11);
        
    //     int date =  4;

    //     BinSearch BS = new BinSearch();
    //     System.out.println(BS.searchListStart(list,date,3,7));
    //     //System.out.println(BS.searchListEnd(list,date,0,7));
        
    // }
}

