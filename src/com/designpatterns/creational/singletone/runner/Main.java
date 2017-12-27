package com.designpatterns.creational.singletone.runner;

import com.designpatterns.creational.singletone.loger.ProgramLoger;

public class Main {
    public static  void main(String[] args){
        System.out.println(ProgramLoger.getProgramLoger().toString());
        System.out.println(ProgramLoger.getProgramLoger().toString());
        System.out.println(ProgramLoger.getProgramLoger().toString());
        System.out.println(ProgramLoger.getProgramLoger().toString());

        ProgramLoger.getProgramLoger().addLogInfo("First log...");
        ProgramLoger.getProgramLoger().addLogInfo("Second log...");
        ProgramLoger.getProgramLoger().addLogInfo("Theft log...");

        ProgramLoger.getProgramLoger().showLogFile();
    }
}
