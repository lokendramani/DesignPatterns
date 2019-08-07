package com.mani.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Magazine implements Item {
    List<Consumer> consumerList;
    int quantity;


    public Magazine() {
        this.consumerList = new ArrayList<Consumer>();
        quantity=0;
    }

    public void register(Consumer consumer) {
        this.consumerList.add(consumer);
    }

    public void unregister(Consumer consumer) {
        this.consumerList.remove(consumer);
    }

    public void notifyObservers() {
        for (Consumer consumer: this.consumerList) {
            consumer.update();
       }
    }

    public boolean isAvailable() {
        return quantity > 0;

    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        notifyObservers();
    }
}
