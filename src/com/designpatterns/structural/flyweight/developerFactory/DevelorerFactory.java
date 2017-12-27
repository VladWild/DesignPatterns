package com.designpatterns.structural.flyweight.developerFactory;

import com.designpatterns.structural.flyweight.developers.CppDeveloper;
import com.designpatterns.structural.flyweight.developers.Developer;
import com.designpatterns.structural.flyweight.developers.JavaDeveloper;

import java.util.HashMap;
import java.util.Map;

public class DevelorerFactory {
    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpeciality(String speciality){
        Developer developer = developers.get(speciality);
        if(developer == null){
            switch ((speciality)){
                case "java":
                    System.out.println("Hiring Java developer...");
                    developer = new JavaDeveloper();
                    break;
                case "c++":
                    System.out.println("Writing C++ developer...");
                    developer = new CppDeveloper();
            }
            developers.put(speciality, developer);
        }
        return developer;
    }

}
