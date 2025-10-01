package com.example.designpatterns.creational.singleton;

public class ConnectionManager {
    private static ConnectionManager instance;

    private ConnectionManager() {
        System.out.println("[Singleton] ConnectionManager initialized");
    }

    public static synchronized ConnectionManager getInstance() {
        if (instance == null) {
            instance = new ConnectionManager();
        }
        return instance;
    }

    public void connect() {
        System.out.println("[Singleton] Connecting to DB...");
    }
}
