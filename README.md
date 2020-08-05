# Log_Date_finder

The Following Data is Passed to The main Class:-
From Date ,To Date ,File Location.

Below Mentioned are the Class Names with Very Brief Explanations of their working

Input Class:-
Contains functions for Validating
The file location & 
The Start and End Date


LogReadFilter Class;-

The File Location received from the user is passed to the 
readLogFile() Method Which returns an ArrayList with the file data

The Output of readLogFile() is passed into filter()

Which then deletes all the data from "T"
And breaks all the dates 
Into ArrayList <ArrayLists<Integer>>
//Nested ArrayList of ArrayLists containing of Year , Month and Day Respectively


BinarySearcher Class

The filtered ArrayList<ArrayList<Integer>>
Received from LogReadFilte()r is then passed to the BinarySearch() function  with the help of methods in Compute class

Here the process is further broken down as follows:-

Year ArrayList is Searched for 1st and last occurrence of the Year
Then
Month ArrayList is Searched for 1st and last occurrence of the Month (Only indices returned by Year are Considered)
And the same procedure  is followed for the day ArrayList

These 3 Steps are performed for Start date and End date

And then using the index number of  first occurrence of start date
And Last occurrence of end Date The Output is printed


