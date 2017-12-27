package com.designpatterns.structural.bridge.programs;

import com.designpatterns.structural.bridge.developers.Developer;

public abstract class Program {
    protected Developer developer;

    protected Program(Developer developer){
        this.developer = developer;
    }

    public abstract void developerProgram();
}
