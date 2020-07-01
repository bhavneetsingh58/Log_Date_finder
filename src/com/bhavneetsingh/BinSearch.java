package com.bhavneetsingh;

import java.util.ArrayList;

public class BinSearch {

    Integer Search_list_start(ArrayList<Integer> list,int date){
        int low=0;
        int high = (list.size())-1;
        return Search_list_start(list,date,low,high);
    };

    Integer Search_list_start(ArrayList<Integer> list,int date, int low, int high) {
        //int low = low2.orElse(0);
        //int high = high2.orElse((list.size()) - 1);
        int mid;
        int current;
        while(low <= high){
            mid = (low+high)/2;
            current =list.get(mid);
            if(date == current){
                while((list.get(mid)).equals((list.get(mid-1)))){
                    //System.out.println(list.get(PrevOut));
                    mid--;
                }
                return mid+1;
            }
            else if(current > date){high = mid-1;}
            else{low = mid+1;}
        }
        return null;
    }

    Integer Search_list_end(ArrayList<Integer> list,int low,int date){
        //int low=0;
        int high = (list.size())-1;
        return Search_list_end(list,date,low,high);
    };

    Integer Search_list_end(ArrayList<Integer> list,int date, int low, int high){
        //int low =0;
        //int high=(list.size())-1;
        int mid;
        int current;
        while(low <= high){
            mid = (low+high)/2;
            current =list.get(mid);
            if(date == current){
                while((list.get(mid)).equals((list.get(mid+1)))){
                    //System.out.println(list.get(PrevOut));
                    mid++;
                }
                return mid+1;
            }
            else if(current > date){high = mid-1;}
            else{low = mid+1;}
        }
        return null;

    }

}
