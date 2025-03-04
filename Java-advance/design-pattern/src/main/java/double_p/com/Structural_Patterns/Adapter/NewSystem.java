package org.example.DesignPattern.Adapter;

import lombok.Data;

@Data
public class NewSystem {
    private String content;

    public void sendSMS() {
        System.out.println("SMS content: " + content);
    }
}
