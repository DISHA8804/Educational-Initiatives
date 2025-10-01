package com.example.designpatterns.creational.factory;

public class PaymentFactory {
    public static Payment create(String type) {
        switch (type.toLowerCase()) {
            case "card":
                return new CreditCardPayment();
            case "paypal":
                return new PayPalPayment();
            default:
                throw new IllegalArgumentException("Unknown type");
        }
    }
}