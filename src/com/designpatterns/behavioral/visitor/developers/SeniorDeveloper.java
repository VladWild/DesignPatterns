package com.designpatterns.behavioral.visitor.developers;

import com.designpatterns.behavioral.visitor.project_elements.Database;
import com.designpatterns.behavioral.visitor.project_elements.ProjectClass;
import com.designpatterns.behavioral.visitor.project_elements.Test;

public class SeniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Rewriting class after junior...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Fixing database...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating reliable test...");
    }
}
