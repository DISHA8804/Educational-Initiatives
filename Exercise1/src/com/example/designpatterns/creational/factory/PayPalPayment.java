package com.example.designpatterns.creational.factory;

public class PayPalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("[Factory] Paid " + amount + " using PayPal");
    }
}