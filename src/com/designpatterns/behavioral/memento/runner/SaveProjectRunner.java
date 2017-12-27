package com.designpatterns.behavioral.memento.runner;

import com.designpatterns.behavioral.memento.other.GithubRepo;
import com.designpatterns.behavioral.memento.other.Project;

public class SaveProjectRunner {
    public static void main(String[] args){
        Project project = new Project();
        GithubRepo github = new GithubRepo();

        System.out.println("Creating new project. Version 1.0");
        project.setVersionAndData("Version 1.0");

        System.out.println(project);

        System.out.println("Saving current version to github...");
        github.setSave(project.save());

        System.out.println("Updating project to Version 1.1");

        System.out.println("Writing poor code...");

        project.setVersionAndData("Version 1.1");

        System.out.println(project);

        System.out.println("Something went wrong...");

        System.out.println("Holding back to Version 1.0");
        project.load(github.getSave());

        System.out.println("Project after rollback:");
        System.out.println(project);


    }
}
