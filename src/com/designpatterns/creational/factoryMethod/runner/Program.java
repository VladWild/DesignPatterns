package com.designpatterns.creational.factoryMethod.runner;

import com.designpatterns.creational.factoryMethod.developers.Developer;
import com.designpatterns.creational.factoryMethod.factoryDevelopers.CppDeveloperFactory;
import com.designpatterns.creational.factoryMethod.factoryDevelopers.DeveloperFactory;
import com.designpatterns.creational.factoryMethod.factoryDevelopers.JavaDeveloperFactory;
import com.designpatterns.creational.factoryMethod.factoryDevelopers.PhpDeveloperFactory;

public class Program {

    static void l(){}

    public static void main(String[] args){
        DeveloperFactory developerFactory = createDeveloperBySpeciallty(TypeDeveloper.PHP);
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpeciallty(TypeDeveloper type){
        if (type == TypeDeveloper.JAVA){
            return new JavaDeveloperFactory();
        } else if (type == TypeDeveloper.CPP){
            return new CppDeveloperFactory();
        } else if (type == TypeDeveloper.PHP){
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(type.toString() + " is unknown speciality.");
        }
    }
}
