package com.designpatterns.behavioral.state.runner;

import com.designpatterns.behavioral.state.activities.Activity;
import com.designpatterns.behavioral.state.developer.Developer;
import com.designpatterns.behavioral.state.activities.Sleeping;


public class DeveloperDay {
    public static void main(String[] args){
        Activity activity = new Sleeping();
        Developer developer = new Developer();

        developer.setActivity(activity);

        for (int i = 0; i < 10; i++){
            developer.justDoIt();
            developer.changeActivity();
        }


    }
}
