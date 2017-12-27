package com.designpatterns.behavioral.observer.observable_object;

import com.designpatterns.behavioral.observer.observers.Observer;

public interface Observed {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
