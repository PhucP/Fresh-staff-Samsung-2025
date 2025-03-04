package org.example.DesignPattern.Adapter;

public class NewSystemAdapter extends OldSystemLog{
    @Override
    public void saveLog() {
        super.saveLog();
        String content = getSystemInfo();
        NewSystem newSystem = new NewSystem();
        newSystem.setContent(content);
        newSystem.sendSMS();
    }
}
