package double_p.com.Structural_Patterns.Adapter;

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
