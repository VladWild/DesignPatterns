package com.designpatterns.creational.factoryMethod.factoryDevelopers;

import com.designpatterns.creational.factoryMethod.developers.CppDeveloper;
import com.designpatterns.creational.factoryMethod.developers.Developer;

public class CppDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
