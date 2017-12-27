package com.designpatterns.creational.builder.runner;

import com.designpatterns.creational.builder.other.Director;
import com.designpatterns.creational.builder.typeWebsite.VisitCardWebsiteBuilder;
import com.designpatterns.creational.builder.other.Website;

public class BuildWebsiteRunner {
    public static void main(String[] args){
        Director director = new Director();

        director.setBuilder(new VisitCardWebsiteBuilder());
        Website website = director.buildWebsite();

        System.out.println(website.toString());
    }
}
