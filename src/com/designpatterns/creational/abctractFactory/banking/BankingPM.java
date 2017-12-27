package com.designpatterns.creational.abctractFactory.banking;

import com.designpatterns.creational.abctractFactory.interfaces.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void managerProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
