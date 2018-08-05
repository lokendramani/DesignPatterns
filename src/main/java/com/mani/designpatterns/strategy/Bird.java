package com.mani.designpatterns.strategy;

public class Bird implements Animal{

    public void FlyingBehaviour(Fly flyingObject) {
        flyingObject.fly();
    }
}
