package double_p.com.Structural_Patterns.Decorator;

public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Original Coffee";
    }

    @Override
    public int getPrice() {
        return 20;
    }
}
