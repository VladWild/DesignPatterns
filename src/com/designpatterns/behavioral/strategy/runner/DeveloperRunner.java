package com.designpatterns.behavioral.strategy.runner;

import com.designpatterns.behavioral.strategy.activities.*;
import com.designpatterns.behavioral.strategy.developer.Developer;

public class DeveloperRunner {
    public static void main(String[] args){
        Developer developer = new Developer();

        developer.setActivity(new Sleeping());
        developer.executeActivity();

        developer.setActivity(new Training());
        developer.executeActivity();

        developer.setActivity(new Coding());
        developer.executeActivity();

        developer.setActivity(new Reading());
        developer.executeActivity();

        developer.setActivity(new Sleeping());
        developer.executeActivity();

    }
}
