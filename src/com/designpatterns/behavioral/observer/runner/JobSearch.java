package com.designpatterns.behavioral.observer.runner;

import com.designpatterns.behavioral.observer.observable_object.JavaDeveloperJobSite;
import com.designpatterns.behavioral.observer.observers.Observer;
import com.designpatterns.behavioral.observer.observers.Subscriber;

public class JobSearch {
    public static void main(String[] args){
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First Java Position");
        jobSite.addVacancy("Second Java Position");

        Observer firstSubscriber = new Subscriber("Eugene Suleimanov");
        Observer secondSubscriber = new Subscriber("Eugene Suleimanov");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Third Java Position");

        jobSite.removeVacancy("First Java Position");
    }
}
