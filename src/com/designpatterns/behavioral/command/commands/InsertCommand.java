package com.designpatterns.behavioral.command.commands;

import com.designpatterns.behavioral.command.other.Database;

public class InsertCommand implements Command {
    Database database;

    public InsertCommand(Database database){
        this.database = database;
    }

    @Override
    public void execute() {
        database.insert();
    }
}
