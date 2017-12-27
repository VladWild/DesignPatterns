package com.designpatterns.structural.facade.runner;

import com.designpatterns.structural.facade.workflow.Workflow;

public class SprintRunner {
    public static void main (String[] args){
        Workflow workflow = new Workflow();

        workflow.solveProblems();
    }
}
