// package com.bhavneetsingh;

// public class deletedcode {
    
//     // Integer Search_list_end(ArrayList<Integer> list,int low,int date){
//     //     //int low=0;
//     //     int high = (list.size())-1;
//     //     return Search_list_end(list,date,low,high);
//     // };

//     // Integer Search_list_end(ArrayList<Integer> list,int date, int low, int high){
//     //     //int low =0;
//     //     //int high=(list.size())-1;
//     //     int mid;
//     //     int current;
//     //     while(low <= high){
//     //         mid = (low+high)/2;
//     //         current =list.get(mid);
//     //         if(date == current){
//     //             while((list.get(mid)).equals((list.get(mid+1)))){
//     //                 //System.out.println(list.get(PrevOut));
//     //                 mid++;
//     //             }
//     //             return mid+1;
//     //         }
//     //         else if(current > date){high = mid-1;}
//     //         else{low = mid+1;}
//     //     }
//     //     return null;

//     // }




//     //------------------------------------------------------------------------------------------
    
    
//     ArrayList<Integer> Slicer(ArrayList<ArrayList<Integer>> list,int[] lowHigh,int n){//make int
//         ArrayList<Integer> Updated = new ArrayList<>(list.get(n).subList(lowHigh[0],lowHigh[1]));
//         return Updated;
//         //System.out.println(startYearIndex);
//     }


//     void CalCaller2(ArrayList<ArrayList<Integer>> list,String date){
//         int n;
//         int partDate;
//         while(( n = (list.size()-1))>=0){
//             partDate = Integer.parseInt(date.split("-")[n]);
//             IndexCal(list.get(n),partDate);//might not work might have to make the function recurcive
//             n--;
//         }
//     }
//     ArrayList<Integer> CalCaller(ArrayList<ArrayList<Integer>> list,String date,int n){
//         //int n=2;//recieves default list as year list
//         int partDate = Integer.parseInt(date.split("-")[n]);
//         int[] yearStartToEndIndex = new int[2];
//         yearStartToEndIndex = IndexCal(list.get(n),partDate);//yearIndex Obtained
//         n--;
//         ArrayList<Integer> monthList = new ArrayList<Integer>();//year part over --month part starts
//         monthList = Slicer(list, yearStartToEndIndex,n);
//         return monthList;


// public class input {
//     void validate(String date){
//         int partDate = Integer.parseInt(date.split("-")[0]);
//         if(0< partDate  && partDate>30){
//             System.out.println("True");
//         }else{System.out.println("false");}

//     }
    



// }