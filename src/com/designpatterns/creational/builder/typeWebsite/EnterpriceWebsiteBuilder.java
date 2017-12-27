package com.designpatterns.creational.builder.typeWebsite;

import com.designpatterns.creational.builder.other.Cms;

public class EnterpriceWebsiteBuilder extends WebsiteBuilder {
    @Override
    public void buildName() {
        website.setName("Enterprice web site");
    }

    @Override
    public void buildCms() {
        website.setCms(Cms.ALIFRESCO);
    }

    @Override
    public void buildPrice() {
        website.setPrice(10000);
    }
}
