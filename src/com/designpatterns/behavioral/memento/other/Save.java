package com.designpatterns.behavioral.memento.other;

import java.util.Date;

public class Save {
    private final String version;
    private final Date data;

    public Save(String version){
        this.version = version;
        this.data = new Date();
    }

    public String getVersion() {
        return version;
    }

    public Date getData() {
        return data;
    }
}
