package com.designpatterns.structural.adapter.runner;

import com.designpatterns.structural.adapter.adapterClass.AdapterJavaToDatabase;
import com.designpatterns.structural.adapter.other.Database;

public class DatabaseRunner {
    public  static void main(String[] args){
        Database database = new AdapterJavaToDatabase();

        database.insert();
        database.select();
        database.update();
        database.remove();
    }
}
