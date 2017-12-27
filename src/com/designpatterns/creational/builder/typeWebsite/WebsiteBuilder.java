package com.designpatterns.creational.builder.typeWebsite;

import com.designpatterns.creational.builder.other.Website;

public abstract class WebsiteBuilder {
    Website website;

    public void createWebsite(){
        website = new Website();
    }

    public abstract void buildName();
    public abstract void buildCms();
    public abstract void buildPrice();

    public Website getWebsite(){
        return website;
    }
}
