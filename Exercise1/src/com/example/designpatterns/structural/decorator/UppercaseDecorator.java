package com.example.designpatterns.structural.decorator;

public class UppercaseDecorator extends TextDecorator {
    public UppercaseDecorator(TextService inner) {
        super(inner);
    }

    @Override
    public String render() {
        return inner.render().toUpperCase();
    }
}