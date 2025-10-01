package com.example.designpatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private final List<Observer> subscribers = new ArrayList<>();

    public void subscribe(Observer o) {
        subscribers.add(o);
    }

    public void unsubscribe(Observer o) {
        subscribers.remove(o);
    }

    public void newPromotion(String promo) {
        System.out.println("[Observer] New promotion: " + promo);
        for (Observer o : subscribers) {
            o.update(promo);
        }
    }
}