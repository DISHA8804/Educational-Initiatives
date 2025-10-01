# Exercise 1 – Design Patterns Demo

## Overview

This project demonstrates the practical use of **six common software design patterns** in Java:

1. **Behavioral Patterns**
   - **Observer Pattern**: Notifies subscribed customers about promotions in a store.
   - **Strategy Pattern**: Dynamically applies different discount strategies (percentage or flat discount) on a product price.

2. **Creational Patterns**
   - **Factory Pattern**: Handles creation of different payment methods (`CreditCardPayment`, `PayPalPayment`).
   - **Singleton Pattern**: Ensures a single instance of `ConnectionManager` to manage resource connections.

3. **Structural Patterns**
   - **Adapter Pattern**: Allows using a legacy logger (`LegacyLogger`) via a modern `LoggerAdapter`.
   - **Decorator Pattern**: Dynamically modifies text output (e.g., converting to uppercase).

The goal is to demonstrate **clean OOP practices, SOLID principles, and design pattern usage** in an interactive console application.

---

## Features

- **Interactive runtime input** for all patterns.
- Supports multiple customers subscribing to promotions.
- Users can choose payment methods and discount types at runtime.
- Real-time logging via Adapter pattern.
- Decorator pattern demonstrates dynamic text transformations.
- Singleton pattern ensures a single connection manager instance.

---

## Technologies Used

- Java 17+
- Java Logging API (`java.util.logging.Logger`)
- Object-Oriented Programming (OOP)
- Design Patterns (Behavioral, Creational, Structural)
- Console-based interactive input (`Scanner`)

---

## Folder Structure

Exercise1/
├── src/
│ ├── com/example/designpatterns/
│ │ ├── behavioural/
│ │ │ ├── observer/
│ │ │ │ ├── Observer.java
│ │ │ │ ├── Customer.java
│ │ │ │ └── Store.java
│ │ │ └── strategy/
│ │ │ ├── DiscountStrategy.java
│ │ │ ├── PercentageDiscount.java
│ │ │ └── FlatDiscount.java
│ │ ├── creational/
│ │ │ ├── factory/
│ │ │ │ ├── Payment.java
│ │ │ │ ├── CreditCardPayment.java
│ │ │ │ ├── PayPalPayment.java
│ │ │ │ └── PaymentFactory.java
│ │ │ └── singleton/
│ │ │ └── ConnectionManager.java
│ │ ├── structural/
│ │ │ ├── adapter/
│ │ │ │ ├── LegacyLogger.java
│ │ │ │ └── LoggerAdapter.java
│ │ │ └── decorator/
│ │ │ ├── TextService.java
│ │ │ ├── SimpleText.java
│ │ │ └── UppercaseDecorator.java
│ │ └── Main.java
└── README.md



---

## How to Compile and Run

1. **Compile all Java files**:

```bash
javac -d out (Get-ChildItem -Recurse -Filter *.java | ForEach-Object { $_.FullName })
```

2. **Run**:
```bash
java -cp out com.example.designpatterns.Main
```
