package com.mani.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String, Item> items = new HashMap<>();
    public Registry(){
        loadItems();
    }
    public Item creatItem(String itemType){
        Item item = null;
        try {
            item = (Item) (items.get(itemType)).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }

    private void loadItems() {
        Movie movie  = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(25.50);
        movie.setRunTime("2 Hour");
        items.put("Movie", movie);

        Book book = new Book();
        book.setPrice(21);
        book.setTitle("Basic Book");
        book.setNumberOfPages(335);
        items.put("Book",book);
    }

}
