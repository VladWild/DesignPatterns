package com.designpatterns.creational.abctractFactory.interfaces;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}
