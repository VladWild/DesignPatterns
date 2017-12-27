package com.designpatterns.creational.factoryMethod.factoryDevelopers;

import com.designpatterns.creational.factoryMethod.developers.Developer;
import com.designpatterns.creational.factoryMethod.developers.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
