package com.mani.designpatterns.observer;

public interface Subject {
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers();

}
