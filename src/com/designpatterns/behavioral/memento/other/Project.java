package com.designpatterns.behavioral.memento.other;

import java.util.Date;

public class Project {
    private String version;
    private Date date;

    public void setVersionAndData(String version){
        this.version = version;
        this.date = new Date();
    }

    public Save save(){
        return new Save(version);
    }

    public void load(Save save){
        version = save.getVersion();
        date =  save.getData();
    }

    @Override
    public String  toString() {
        return "Project\n" +
                "\nVersion: " + version +
                "\nData: " + date + "\n";
    }
}
