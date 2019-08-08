package com.mani.designpatterns.decorator;

public class DecoratorClient {
    public static void main(String[] args) {
        Beaverage beaverage = new Latte();

        ChocolateDecorator chocolateDecorator = new ChocolateDecorator(beaverage);
        System.out.println(chocolateDecorator.getDescription());
        System.out.println(chocolateDecorator.getCost());
        CaramelDecorator caramelDecorator = new CaramelDecorator(chocolateDecorator);
        System.out.println(caramelDecorator.getDescription());
        System.out.println("cost:"+caramelDecorator.getCost());
    }



}
