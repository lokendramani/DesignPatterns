package com.mani.designpatterns.decorator;

public class Capuccino implements Beaverage {
    public String getDescription() {
        return "Capuccino";
    }

    public int getCost() {
        return 10;
    }
}
