package org.example.DesignPattern.Proxy;

public class RealDocument implements  Document{
    private String fileName;

    RealDocument(String fileName){
        this.fileName = fileName;
    }

    private void loadFromDisk() {
        System.out.println("loadFromDisk : " + fileName);
    }

    @Override
    public void display() {

    }
}
