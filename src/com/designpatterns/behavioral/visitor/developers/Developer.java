package com.designpatterns.behavioral.visitor.developers;

import com.designpatterns.behavioral.visitor.project_elements.Database;
import com.designpatterns.behavioral.visitor.project_elements.ProjectClass;
import com.designpatterns.behavioral.visitor.project_elements.Test;

public interface Developer {
    void create(ProjectClass projectClass);

    void create(Database database);

    void create(Test test);
}
