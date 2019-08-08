package com.mani.designpatterns.decorator;

public class CaramelDecorator extends BeverageDecorator{


    public CaramelDecorator(Beaverage beaverage){
        super();
        super.beaverage = beaverage;
    }

    public String getDescription() {
        return super.beaverage.getDescription()+" with Caramel Decorator";
    }

    public int getCost() {
        return super.beaverage.getCost() + 10;
    }
}
