package com.designpatterns.behavioral.visitor.runner;

import com.designpatterns.behavioral.visitor.developers.Developer;
import com.designpatterns.behavioral.visitor.developers.JuniorDeveloper;
import com.designpatterns.behavioral.visitor.project.Project;
import com.designpatterns.behavioral.visitor.developers.SeniorDeveloper;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();

        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();

        System.out.println("Junior in Action... ");
        project.beWritten(junior);

        System.out.println("\n=======================================\n");

        System.out.println("Senior in Action...");
        project.beWritten(senior);
    }
}
