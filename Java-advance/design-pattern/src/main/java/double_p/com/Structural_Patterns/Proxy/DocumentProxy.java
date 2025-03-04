package org.example.DesignPattern.Proxy;

import java.util.Objects;

public class DocumentProxy implements Document{
    private RealDocument realDocument;
    private String fileName;
    private String role;

    DocumentProxy(String fileName, String role){
        this.fileName = fileName;
        this.role = role;
    }

    @Override
    public void display() {
        if(Objects.equals(role, "admin")){
            realDocument = new RealDocument(fileName);
            realDocument.display();
        } else {
            System.out.println("access denied");
        }
    }
}
