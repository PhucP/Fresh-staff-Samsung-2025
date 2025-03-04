package double_p.com.Structural_Patterns.Adapter;

import lombok.Data;

@Data
public class NewSystem {
    private String content;

    public void sendSMS() {
        System.out.println("SMS content: " + content);
    }
}
