package com.mani.designpatterns.singleton;

public class SingletonLazyInitializationDoubleLock {

    private static SingletonLazyInitializationDoubleLock myInstance;

    private SingletonLazyInitializationDoubleLock(){

    }

    public static SingletonLazyInitializationDoubleLock getInstance(){
        if(myInstance == null){
            synchronized (SingletonLazyInitializationDoubleLock.class){
                if(myInstance == null){
                    myInstance = new SingletonLazyInitializationDoubleLock();
                }

                }
            }
        return myInstance;
    }

}
