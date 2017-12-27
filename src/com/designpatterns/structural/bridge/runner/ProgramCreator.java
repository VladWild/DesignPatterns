package com.designpatterns.structural.bridge.runner;

import com.designpatterns.structural.bridge.developers.CppDeveloper;
import com.designpatterns.structural.bridge.developers.JavaDeveloper;
import com.designpatterns.structural.bridge.programs.BankSystem;
import com.designpatterns.structural.bridge.programs.Program;
import com.designpatterns.structural.bridge.programs.StockExchage;

public class ProgramCreator {
    public static void main(String[] args){
        Program[] programs = {
                new BankSystem(new JavaDeveloper()),
                new StockExchage(new CppDeveloper())
        };

        for (Program program:programs){
            program.developerProgram();
        }
    }
}
