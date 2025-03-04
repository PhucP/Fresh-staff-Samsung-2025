package org.example.DesignPattern.Flyweight;

public class Circle implements Shape {
    private final String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println(color + " circle " + x + " " + y);
    }
}
