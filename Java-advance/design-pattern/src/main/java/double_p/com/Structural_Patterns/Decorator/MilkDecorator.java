package org.example.DesignPattern.Decorator;

public class MilkDecorator extends  CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Milk";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }
}
