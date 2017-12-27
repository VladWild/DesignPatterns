package com.designpatterns.behavioral.template.website;

public class WelcomPage extends WebsiteTemplate{
    @Override
    public void showPageContent() {
        System.out.println("Welcome");
    }
}
