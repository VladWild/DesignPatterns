package com.designpatterns.creational.abctractFactory.website;

import com.designpatterns.creational.abctractFactory.interfaces.Tester;

public class ManualTester implements Tester{
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website...");
    }
}
