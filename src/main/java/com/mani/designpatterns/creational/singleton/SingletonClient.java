package com.mani.designpatterns.creational.singleton;

public class SingletonClient {
    public static void main(String[] args) {
        SingletonLazyInitialization singleton1= SingletonLazyInitialization.getInstance();
        System.out.println(singleton1.hashCode());
        SingletonLazyInitialization singleton2 = SingletonLazyInitialization.getInstance();
        System.out.println(singleton2.hashCode());

    }
}
