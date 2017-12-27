package com.designpatterns.structural.decorator.decoratorAndJavaDevelopers;

import com.designpatterns.structural.decorator.other.Developer;

public class JavaTeamLead extends DeveloperDecorator {
    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeekReport(){
        return "Send week report to customer.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendWeekReport();
    }
}
