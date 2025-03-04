package org.example.DesignPattern.Decorator;

public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Original Coffee";
    }

    @Override
    public int getPrice() {
        return 20;
    }
}
