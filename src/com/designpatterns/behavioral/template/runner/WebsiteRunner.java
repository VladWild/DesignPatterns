package com.designpatterns.behavioral.template.runner;

import com.designpatterns.behavioral.template.website.NewsPage;
import com.designpatterns.behavioral.template.website.WebsiteTemplate;
import com.designpatterns.behavioral.template.website.WelcomPage;

public class WebsiteRunner {
    public static void main(String[] args){
        WebsiteTemplate welcomePage = new WelcomPage();
        WebsiteTemplate newsPage = new NewsPage();

        welcomePage.showPage();

        System.out.println("\n===================================================\n");

        newsPage.showPage();
    }
}
