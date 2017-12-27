package com.designpatterns.behavioral.iterator.runner;

import com.designpatterns.behavioral.iterator.interfaces.Iterator;
import com.designpatterns.behavioral.iterator.developers.JavaDeveloper;

public class JavaDeveloperRunner {
    public static void main(String[] args){
        String[] skills = {"Java", "Spring", "Hibernate", "Maven", "PostgreSQL"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Eugene Sulemanov", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.println("Skills: ");

        while (iterator.hasNext()){
            System.out.print(iterator.next().toString() + " ");
        }
    }
}
