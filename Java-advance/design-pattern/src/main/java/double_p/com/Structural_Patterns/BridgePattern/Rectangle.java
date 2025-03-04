package org.example.DesignPattern.BridgePattern;

public class Rectangle extends Shape {
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println("rectangle: ");
        color.setColor();
    }
}
