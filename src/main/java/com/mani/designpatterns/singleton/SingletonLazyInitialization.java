package com.mani.designpatterns.singleton;

public class SingletonLazyInitialization {

    private static SingletonLazyInitialization myInstance;

    private SingletonLazyInitialization(){

    }

    public static SingletonLazyInitialization getInstance(){
        if(myInstance == null){
            synchronized (SingletonLazyInitialization.class){
                myInstance = new SingletonLazyInitialization();

                }
            }
        return myInstance;
    }

}
