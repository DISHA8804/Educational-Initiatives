package com.example.designpatterns.behavioural.strategy;

public class PercentageDiscount implements DiscountStrategy {
    private final double percent;

    public PercentageDiscount(double percent) {
        this.percent = percent;
    }

    @Override
    public double apply(double amount) {
        return amount - (amount * percent / 100);
    }
}