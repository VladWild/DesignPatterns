package com.designpatterns.creational.builder.other;

import com.designpatterns.creational.builder.typeWebsite.WebsiteBuilder;

public class Director {
    WebsiteBuilder builder;

    public void setBuilder(WebsiteBuilder builder){
        this.builder = builder;
    }

    public Website buildWebsite(){
        builder.createWebsite();
        builder.buildName();
        builder.buildCms();
        builder.buildPrice();

        Website website = builder.getWebsite();

        return website;
    }
}
