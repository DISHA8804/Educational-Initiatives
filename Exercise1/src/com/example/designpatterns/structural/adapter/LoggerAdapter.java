package com.example.designpatterns.structural.adapter;

public class LoggerAdapter {
    private final LegacyLogger legacy = new LegacyLogger();

    // Adapt the legacy logger method
    public void log(String level, String message) {
        legacy.logMessage(level + ": " + message);
    }
}
