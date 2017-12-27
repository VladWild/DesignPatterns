package com.designpatterns.structural.adapter.adapterClass;

import com.designpatterns.structural.adapter.other.Database;
import com.designpatterns.structural.adapter.other.JavaApplication;

public class AdapterJavaToDatabase extends JavaApplication implements Database {
    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }
}
