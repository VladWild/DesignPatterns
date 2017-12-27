package com.designpatterns.structural.decorator.decoratorAndJavaDevelopers;

import com.designpatterns.structural.decorator.other.Developer;

public class DeveloperDecorator implements Developer {

    Developer developer;

    public DeveloperDecorator(Developer developer){
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
