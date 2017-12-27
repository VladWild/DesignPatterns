package com.designpatterns.behavioral.command.runner;

import com.designpatterns.behavioral.command.commands.DeleteCommand;
import com.designpatterns.behavioral.command.commands.InsertCommand;
import com.designpatterns.behavioral.command.commands.SelectCommand;
import com.designpatterns.behavioral.command.commands.UpdateCommand;
import com.designpatterns.behavioral.command.other.Database;
import com.designpatterns.behavioral.command.other.Developer;

public class    DatabaseRunner {
    public static void main(String[] args){
        Database database = new Database();

        Developer developer = new Developer(
                new InsertCommand(database),
                new UpdateCommand(database),
                new SelectCommand(database),
                new DeleteCommand(database)
        );

        developer.insertRecord();
        developer.updateRecord();
        developer.selectRecord();
        developer.deleteRecord();
    }
}
