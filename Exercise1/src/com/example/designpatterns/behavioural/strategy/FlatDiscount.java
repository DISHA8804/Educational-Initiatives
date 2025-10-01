package com.example.designpatterns.behavioural.strategy;

public class FlatDiscount implements DiscountStrategy {
    private final double flatAmount;

    public FlatDiscount(double flatAmount) {
        this.flatAmount = flatAmount;
    }

    @Override
    public double apply(double amount) {
        return amount - flatAmount;
    }
}