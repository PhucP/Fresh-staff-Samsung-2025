package org.example.DesignPattern.BridgePattern;

public class Red implements Color{
    @Override
    public void setColor() {
        System.out.println("with red color");
    }
}
