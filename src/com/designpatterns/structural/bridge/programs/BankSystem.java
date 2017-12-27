package com.designpatterns.structural.bridge.programs;

import com.designpatterns.structural.bridge.developers.Developer;

public class BankSystem extends Program {
    public BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developerProgram() {
        System.out.println("Bank system developer in progress...");
        developer.writeCode();
    }
}
