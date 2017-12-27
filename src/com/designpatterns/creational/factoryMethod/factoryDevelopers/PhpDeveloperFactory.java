package com.designpatterns.creational.factoryMethod.factoryDevelopers;

import com.designpatterns.creational.factoryMethod.developers.Developer;
import com.designpatterns.creational.factoryMethod.developers.PhpDeveloper;

public class PhpDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
