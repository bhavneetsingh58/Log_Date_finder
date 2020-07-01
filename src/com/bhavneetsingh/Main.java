package com.bhavneetsingh;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        LogReadFilter LRF = new LogReadFilter();
        BinSearch BS = new BinSearch();
        Calculator CL = new Calculator();
        try {
            //one.Printer();
            CL.ListSlicer(LRF.filter(LRF.readLogFile()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
