package com.example.designpatterns.structural.adapter;

public class LegacyLogger {
    public void logMessage(String msg) {
        System.out.println("[LegacyLogger] " + msg);
    }
}
