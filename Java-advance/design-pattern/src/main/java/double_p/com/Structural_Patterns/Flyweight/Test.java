package org.example.DesignPattern.Flyweight;

public class Test {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("red");

        circle.draw(10, 10);

        Shape circle2 = shapeFactory.getShape("red");
        circle2.draw(10, 10);
    }
}
