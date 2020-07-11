package com.bhavneetsingh;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import org.apache.commons.cli.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> logFileData = new ArrayList<String>();
        CommandLineParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("f",true,"Start Date");
        options.addOption("t",true,"last date");
        options.addOption("i",true,"logFile Loc");
        LogReadFilter LRF = new LogReadFilter();
        compute CP = new compute();
        try {
            input one = new input();
            CommandLine commandLine = parser.parse(options, args);
            one.validateJavaDate(commandLine.getOptionValue("f"));
            one.validateJavaDate(commandLine.getOptionValue("t"));
            one.checkFile(commandLine.getOptionValue("i"));
            logFileData = LRF.readLogFile(commandLine.getOptionValue("i"));
            CP.mainComputeModuleCaller(
                (commandLine.getOptionValue("f")),
                (commandLine.getOptionValue("t")),
                (LRF.filter(logFileData)),
                logFileData
             );
        } catch (org.apache.commons.cli.ParseException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}




