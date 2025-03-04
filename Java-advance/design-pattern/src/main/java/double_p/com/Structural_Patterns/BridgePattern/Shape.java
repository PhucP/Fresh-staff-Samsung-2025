package double_p.com.Structural_Patterns.BridgePattern;

public abstract class Shape {
    protected Color color;
    public Shape(Color color) {
        this.color = color;
    }

    abstract void draw();
}
