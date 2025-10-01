package com.example.designpatterns.behavioural.observer;

public class Customer implements Observer {
    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("[Observer] " + name + " received: " + message);
    }
}