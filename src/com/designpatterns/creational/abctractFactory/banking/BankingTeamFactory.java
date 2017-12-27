package com.designpatterns.creational.abctractFactory.banking;

import com.designpatterns.creational.abctractFactory.interfaces.Developer;
import com.designpatterns.creational.abctractFactory.interfaces.ProjectManager;
import com.designpatterns.creational.abctractFactory.interfaces.ProjectTeamFactory;
import com.designpatterns.creational.abctractFactory.interfaces.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
