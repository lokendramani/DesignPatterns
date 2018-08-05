package com.mani.designpatterns.strategy;

public class Dog implements Animal {
    public void FlyingBehaviour(Fly flyingObject) {
        flyingObject.fly();
    }
}
