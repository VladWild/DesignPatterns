package com.designpatterns.behavioral.chain.notifire;

public class SimpleRoportNtifier extends Notifier {

    public SimpleRoportNtifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifier using simple report: " + message);
    }
}
