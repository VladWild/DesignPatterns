package com.designpatterns.creational.abctractFactory.website;

import com.designpatterns.creational.abctractFactory.interfaces.Developer;
import com.designpatterns.creational.abctractFactory.interfaces.ProjectManager;
import com.designpatterns.creational.abctractFactory.interfaces.ProjectTeamFactory;
import com.designpatterns.creational.abctractFactory.interfaces.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory{
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
