package com.mani.designpatterns.strategy;

public class StrategyDemo {
    public static void main(String[] args){
        Animal dog= new Dog();
        Animal bird=new Bird();
        Fly canFly=new CanFly();
        Fly cantFly=new CantFly();

        dog.FlyingBehaviour(cantFly);
        bird.FlyingBehaviour(canFly);

    }




}
