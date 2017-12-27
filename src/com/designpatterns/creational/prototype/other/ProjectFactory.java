package com.designpatterns.creational.prototype.other;

public class ProjectFactory {
    Project project;

    public ProjectFactory(Project project){
        this.project = project;
    }

    public void setProject(Project project){
        this.project = project;
    }

    public Project cloneProject(){
        return (Project) project.copy();
    }
}
