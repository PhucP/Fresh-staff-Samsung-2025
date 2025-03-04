package org.example.DesignPattern.Decorator;

public class Test {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();

        System.out.println(coffee.getDescription() +  " " + coffee.getPrice());

        Coffee sugerCoffee = new SugarDecorator(coffee);
        System.out.println(sugerCoffee.getDescription() +  " " + sugerCoffee.getPrice());

        Coffee milkCoffee = new MilkDecorator(coffee);
        System.out.println(milkCoffee.getDescription() +  " " + milkCoffee.getPrice());

        Coffee milkSugerCoffee = new SugarDecorator(milkCoffee);
        System.out.println(milkSugerCoffee.getDescription() +  " " + milkSugerCoffee.getPrice());
    }
}
