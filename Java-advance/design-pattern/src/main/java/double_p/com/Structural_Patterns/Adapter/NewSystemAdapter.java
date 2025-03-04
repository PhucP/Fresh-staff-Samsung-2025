package double_p.com.Structural_Patterns.Adapter;

import org.example.DesignPattern.Adapter.OldSystemLog;

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
