package com.designpatterns.creational.abctractFactory.runners;

import com.designpatterns.creational.abctractFactory.interfaces.Developer;
import com.designpatterns.creational.abctractFactory.interfaces.ProjectManager;
import com.designpatterns.creational.abctractFactory.interfaces.ProjectTeamFactory;
import com.designpatterns.creational.abctractFactory.interfaces.Tester;
import com.designpatterns.creational.abctractFactory.banking.BankingTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args){
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating bank system:");
        developer.writeCode();
        tester.testCode();
        projectManager.managerProject();
    }
}
