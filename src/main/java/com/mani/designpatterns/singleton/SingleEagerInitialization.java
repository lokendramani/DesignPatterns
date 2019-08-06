package com.mani.designpatterns.singleton;

public class SingleEagerInitialization {

   private final static SingleEagerInitialization myInstance = new SingleEagerInitialization() ;

    private SingleEagerInitialization(){

    }

    public static SingleEagerInitialization getInstance(){
        return myInstance;
    }

}
