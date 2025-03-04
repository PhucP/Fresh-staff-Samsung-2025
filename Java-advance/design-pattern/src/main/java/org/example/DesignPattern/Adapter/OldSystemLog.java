package org.example.DesignPattern.Adapter;

public class OldSystemLog {
    public String getSystemInfo() {
        return "OS, Windows, CPU: Intel core i5";
    }

    public void saveLog() {
        System.out.println("Save Log");
        System.out.println(getSystemInfo());
    }
}
