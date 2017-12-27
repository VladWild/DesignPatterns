package com.designpatterns.behavioral.command.commands;

import com.designpatterns.behavioral.command.other.Database;

public class DeleteCommand implements Command{
    Database database;

    public DeleteCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.delete();
    }
}
