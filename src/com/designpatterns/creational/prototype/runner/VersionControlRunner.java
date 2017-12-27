package com.designpatterns.creational.prototype.runner;

import com.designpatterns.creational.prototype.other.Project;
import com.designpatterns.creational.prototype.other.ProjectFactory;

public class VersionControlRunner {
    public static void main(String[] args){
        Project master = new Project(1, "SuperProject", "SourceCode sourseCode = new SourseCode()");

        System.out.println(master.toString());

        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();

        System.out.println(masterClone.toString());
    }
}
