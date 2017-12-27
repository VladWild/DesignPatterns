package com.designpatterns.creational.abctractFactory.website;

import com.designpatterns.creational.abctractFactory.interfaces.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void managerProject() {
        System.out.println("Website PM managers Website project...");
    }
}
