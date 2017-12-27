package com.designpatterns.behavioral.command.commands;

import com.designpatterns.behavioral.command.other.Database;

public class SelectCommand implements Command {
    Database database;

    public SelectCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.select();
    }
}
