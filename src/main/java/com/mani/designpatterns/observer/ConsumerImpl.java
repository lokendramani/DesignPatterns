package com.mani.designpatterns.observer;

public class ConsumerImpl implements Consumer {
    private Magazine magazine;
    private String name;
    public ConsumerImpl(Magazine magazine){
        this.magazine = magazine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "name='" + name + '\'' +
                '}';
    }

    public void update() {
        if(this.magazine.isAvailable()){
            System.out.println("Magazine is available for "+this);
        }



    }
}
