package com.mani.designpatterns.observer;

public interface Item {
    void register(Consumer consumer);
    void unregister(Consumer consumer);
    void notifyObservers();
    boolean isAvailable();

}
