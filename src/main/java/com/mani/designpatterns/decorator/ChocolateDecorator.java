package com.mani.designpatterns.decorator;

public class ChocolateDecorator extends BeverageDecorator {

    public ChocolateDecorator(Beaverage beaverage){
        super();
        super.beaverage = beaverage;
    }
    public String getDescription() {
        return super.beaverage.getDescription()+ "with Chocolate";
    }

    public int getCost() {
        return super.beaverage.getCost() + 20;
    }

}
