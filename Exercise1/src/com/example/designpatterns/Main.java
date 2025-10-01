package com.example.designpatterns;

import com.example.designpatterns.behavioural.observer.*;
import com.example.designpatterns.behavioural.strategy.*;
import com.example.designpatterns.creational.factory.*;
import com.example.designpatterns.creational.singleton.ConnectionManager;
import com.example.designpatterns.structural.adapter.LoggerAdapter;
import com.example.designpatterns.structural.decorator.*;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Exercise 1: Interactive Design Patterns Demo =====");

        // ===================== Observer Pattern =====================
        System.out.println("\n--- Observer Pattern: Store Promotions ---");
        Store store = new Store();

        System.out.print("Enter number of customers to subscribe: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter customer name: ");
            String name = scanner.nextLine();
            store.subscribe(new Customer(name));
        }

        System.out.print("Enter a promotion message to notify customers: ");
        String promo = scanner.nextLine();
        store.newPromotion(promo);

        // ===================== Strategy Pattern =====================
        System.out.println("\n--- Strategy Pattern: Discounts ---");
        System.out.print("Choose discount type (percentage/flat): ");
        String discountType = scanner.nextLine();

        DiscountStrategy discount;
        if (discountType.equalsIgnoreCase("percentage")) {
            System.out.print("Enter percentage: ");
            double percent = scanner.nextDouble();
            discount = new PercentageDiscount(percent);
        } else {
            System.out.print("Enter flat amount: ");
            double flat = scanner.nextDouble();
            discount = new FlatDiscount(flat);
        }

        System.out.print("Enter original price: ");
        double price = scanner.nextDouble();
        double finalPrice = discount.apply(price);
        System.out.println("[Strategy] Final price: " + finalPrice);

        scanner.nextLine(); // consume newline

        // ===================== Singleton Pattern =====================
        System.out.println("\n--- Singleton Pattern: Connection Manager ---");
        ConnectionManager connection = ConnectionManager.getInstance();
        connection.connect();

        // ===================== Factory Pattern =====================
        System.out.println("\n--- Factory Pattern: Payment Processing ---");
        System.out.print("Enter payment method (card/paypal): ");
        String method = scanner.nextLine();

        System.out.print("Enter amount to pay: ");
        double amount = scanner.nextDouble();
        Payment payment = PaymentFactory.create(method);
        payment.pay(amount);

        scanner.nextLine(); // consume newline

        // ===================== Adapter Pattern =====================
        System.out.println("\n--- Adapter Pattern: Legacy Logger ---");
        LoggerAdapter loggerAdapter = new LoggerAdapter();
        System.out.print("Enter a message to log: ");
        String logMessage = scanner.nextLine();
        loggerAdapter.log("INFO", logMessage);

        // ===================== Decorator Pattern =====================
        System.out.println("\n--- Decorator Pattern: Text Processing ---");
        System.out.print("Enter text to decorate: ");
        String text = scanner.nextLine();
        TextService base = new SimpleText(text);
        TextService decorated = new UppercaseDecorator(base);
        System.out.println("[Decorator] " + decorated.render());

        System.out.println("\n===== Demo Complete =====");
        scanner.close();
    }
}
