package double_p.com.Structural_Patterns.BridgePattern;

public class Rectangle extends Shape {
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println("rectangle: ");
        color.setColor();
    }
}
