package com.designpatterns.structural.facade.workflow;

import com.designpatterns.structural.facade.classes.BugTracker;
import com.designpatterns.structural.facade.classes.Developer;
import com.designpatterns.structural.facade.classes.Job;

public class Workflow {
    Developer developer = new Developer();
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();

    public void solveProblems(){
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadLine(bugTracker);
    }
}
