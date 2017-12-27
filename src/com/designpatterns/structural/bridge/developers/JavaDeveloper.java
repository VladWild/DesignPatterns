package com.designpatterns.structural.bridge.developers;

public class JavaDeveloper implements Developer {

    public JavaDeveloper(){}

    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}
