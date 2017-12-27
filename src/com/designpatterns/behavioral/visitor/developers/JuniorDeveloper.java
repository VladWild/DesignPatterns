package com.designpatterns.behavioral.visitor.developers;

import com.designpatterns.behavioral.visitor.project_elements.Database;
import com.designpatterns.behavioral.visitor.project_elements.ProjectClass;
import com.designpatterns.behavioral.visitor.project_elements.Test;

public class JuniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Writing poor class...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Drop database...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating not reliable test...");
    }
}
