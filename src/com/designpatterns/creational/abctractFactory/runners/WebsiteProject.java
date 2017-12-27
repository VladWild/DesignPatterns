package com.designpatterns.creational.abctractFactory.runners;

import com.designpatterns.creational.abctractFactory.interfaces.Developer;
import com.designpatterns.creational.abctractFactory.interfaces.ProjectManager;
import com.designpatterns.creational.abctractFactory.interfaces.ProjectTeamFactory;
import com.designpatterns.creational.abctractFactory.interfaces.Tester;
import com.designpatterns.creational.abctractFactory.website.WebsiteTeamFactory;

public class WebsiteProject {
    public static void main(String[] args){
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating Website:");
        developer.writeCode();
        tester.testCode();
        projectManager.managerProject();

    }
}
