package com.mani.designpatterns.decorator;

public class Latte implements Beaverage {
    public String getDescription() {
        return "Latte ";
    }

    public int getCost() {
        return 10;
    }
}
