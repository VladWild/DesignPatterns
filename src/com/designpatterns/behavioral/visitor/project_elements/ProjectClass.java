package com.designpatterns.behavioral.visitor.project_elements;

import com.designpatterns.behavioral.visitor.developers.Developer;

public class ProjectClass implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
