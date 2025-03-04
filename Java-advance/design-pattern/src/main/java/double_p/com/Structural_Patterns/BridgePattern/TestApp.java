package double_p.com.Structural_Patterns.BridgePattern;

public class TestApp {
    public static void main(String[] args) {
        Color color = new Red();
        Rectangle rectangle = new Rectangle(color);
        rectangle.draw();
    }
}

