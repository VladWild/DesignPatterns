package com.designpatterns.behavioral.visitor.project;

import com.designpatterns.behavioral.visitor.developers.Developer;
import com.designpatterns.behavioral.visitor.project_elements.Database;
import com.designpatterns.behavioral.visitor.project_elements.ProjectClass;
import com.designpatterns.behavioral.visitor.project_elements.ProjectElement;
import com.designpatterns.behavioral.visitor.project_elements.Test;

public class Project implements ProjectElement {
    ProjectElement[] projectElements;

    public Project(){
        this.projectElements = new ProjectElement[]{
                new ProjectClass(),
                new Database(),
                new Test()
        };
    }

    @Override
    public void beWritten(Developer developer) {
        for (ProjectElement element : projectElements) {
            element.beWritten(developer);
        }
    }
}
