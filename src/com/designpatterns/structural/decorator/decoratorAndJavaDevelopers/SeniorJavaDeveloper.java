package com.designpatterns.structural.decorator.decoratorAndJavaDevelopers;

import com.designpatterns.structural.decorator.other.Developer;

public class SeniorJavaDeveloper extends DeveloperDecorator {

    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview(){
        return " Make code review. ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }
}
