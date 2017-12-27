package com.designpatterns.behavioral.command.commands;

import com.designpatterns.behavioral.command.other.Database;

public class UpdateCommand implements Command {
    Database database;

    public UpdateCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();
    }
}
