package com.designpatterns.structural.bridge.programs;

import com.designpatterns.structural.bridge.developers.Developer;

public class StockExchage extends Program {
    public StockExchage(Developer developer) {
        super(developer);
    }

    @Override
    public void developerProgram() {
        System.out.println("Stock Exchange development in progress...");
        developer.writeCode();
    }
}
