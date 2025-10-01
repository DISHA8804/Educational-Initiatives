package com.example.designpatterns.structural.decorator;

public class SimpleText implements TextService {
    private final String text;

    public SimpleText(String text) {
        this.text = text;
    }

    @Override
    public String render() {
        return text;
    }
}