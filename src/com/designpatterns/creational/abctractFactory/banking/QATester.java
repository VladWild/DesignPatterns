package com.designpatterns.creational.abctractFactory.banking;

import com.designpatterns.creational.abctractFactory.interfaces.Tester;

public class QATester implements Tester{
    @Override
    public void testCode() {
        System.out.println("QA tester tests banking code...");
    }
}
