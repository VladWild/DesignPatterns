package com.designpatterns.structural.composite.runner;

import com.designpatterns.structural.composite.developers.CppDeveloper;
import com.designpatterns.structural.composite.developers.Developer;
import com.designpatterns.structural.composite.developers.JavaDeveloper;
import com.designpatterns.structural.composite.team.Team;

public class Project {
    public static void main(String[] args){
        Team team = new Team();

        Developer firstJavaDeveloper = new JavaDeveloper();
        Developer secondJavaDeveloper = new JavaDeveloper();
        Developer cppDeveloper = new CppDeveloper();

        team.addDeveloper(firstJavaDeveloper);
        team.addDeveloper(secondJavaDeveloper);
        team.addDeveloper(cppDeveloper);

        team.createProject();
    }
}
