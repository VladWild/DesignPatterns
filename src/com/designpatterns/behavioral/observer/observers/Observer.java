package com.designpatterns.behavioral.observer.observers;

import java.util.List;

public interface Observer {
    public void handleEvent(List<String> vacancies);
}
