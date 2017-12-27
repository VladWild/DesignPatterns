package com.designpatterns.structural.decorator.runner;

import com.designpatterns.structural.decorator.other.Developer;
import com.designpatterns.structural.decorator.other.JavaDeveloper;
import com.designpatterns.structural.decorator.decoratorAndJavaDevelopers.JavaTeamLead;
import com.designpatterns.structural.decorator.decoratorAndJavaDevelopers.SeniorJavaDeveloper;

public class Task {
    public static void main(String[] args){
        Developer developer = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));

        System.out.println(developer.makeJob());

        Developer developer2 = new JavaTeamLead(new JavaDeveloper());

        System.out.println(developer2.makeJob());

    }
}
