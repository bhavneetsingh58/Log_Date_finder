package com.bhavneetsingh;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        LogReadFilter LRF = new LogReadFilter();
        //BinSearch BS = new BinSearch();
        //Calculator CL = new Calculator();
        compute CP = new compute();
        try {
            //one.Printer();
           // CL.ListSlicer(LRF.filter(LRF.readLogFile()));
            CP.mainComputeModule(LRF.filter(LRF.readLogFile()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
