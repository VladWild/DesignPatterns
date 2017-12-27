package com.designpatterns.behavioral.visitor.project_elements;

import com.designpatterns.behavioral.visitor.developers.Developer;

public interface ProjectElement {
    void beWritten(Developer developer);
}
