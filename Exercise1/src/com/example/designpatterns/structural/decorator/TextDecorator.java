package com.example.designpatterns.structural.decorator;

public abstract class TextDecorator implements TextService {
    protected final TextService inner;

    public TextDecorator(TextService inner) {
        this.inner = inner;
    }
}