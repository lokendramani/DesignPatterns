package com.mani.designpatterns.observer;

public class ObserverClient {
    public static void main(String[] args) {
        Magazine magazine=new Magazine();
        ConsumerImpl consumer = new ConsumerImpl(magazine);
        consumer.setName("Mani");
        ConsumerImpl consumer1 = new ConsumerImpl(magazine);
        consumer1.setName("Kapil");
        magazine.register(consumer);
        magazine.register(consumer1);

        magazine.setQuantity(2);


    }
}
