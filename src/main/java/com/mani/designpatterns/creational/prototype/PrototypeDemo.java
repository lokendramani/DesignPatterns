package com.mani.designpatterns.creational.prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        Registry registry = new Registry();
        Movie movie = (Movie)registry.creatItem("Movie");
        movie.setTitle("Creation Patterns in Java");
        System.out.println(movie.getTitle());

        Movie anotherMovie = (Movie) registry.creatItem("Movie");
        anotherMovie.setTitle("GOF");
        System.out.println(anotherMovie.getTitle());
    }
}
