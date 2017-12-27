package com.designpatterns.creational.abctractFactory.banking;

import com.designpatterns.creational.abctractFactory.interfaces.Developer;

public class JavaDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}
