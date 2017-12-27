package com.designpatterns.structural.flyweight.runner;

import com.designpatterns.structural.flyweight.developers.Developer;
import com.designpatterns.structural.flyweight.developerFactory.DevelorerFactory;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {
    public static void main(String[] args){
        DevelorerFactory develorerFactory = new DevelorerFactory();

        List<Developer> developers = new ArrayList<Developer>();

        developers.add(develorerFactory.getDeveloperBySpeciality("java"));
        developers.add(develorerFactory.getDeveloperBySpeciality("java"));
        developers.add(develorerFactory.getDeveloperBySpeciality("java"));
        developers.add(develorerFactory.getDeveloperBySpeciality("java"));
        developers.add(develorerFactory.getDeveloperBySpeciality("java"));
        developers.add(develorerFactory.getDeveloperBySpeciality("java"));
        developers.add(develorerFactory.getDeveloperBySpeciality("c++"));
        developers.add(develorerFactory.getDeveloperBySpeciality("c++"));
        developers.add(develorerFactory.getDeveloperBySpeciality("c++"));
        developers.add(develorerFactory.getDeveloperBySpeciality("c++"));
        developers.add(develorerFactory.getDeveloperBySpeciality("c++"));

        for (Developer developer:developers){
            developer.writeCode();
        }

    }
}
