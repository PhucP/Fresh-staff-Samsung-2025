package double_p.com.Structural_Patterns.Decorator;

public class CoffeeDecorator implements Coffee {
    protected Coffee originalCoffee;

    public CoffeeDecorator(Coffee coffee){
        this.originalCoffee = coffee;
    }
    @Override
    public String getDescription() {
        return originalCoffee.getDescription();
    }

    @Override
    public int getPrice() {
        return originalCoffee.getPrice();
    }
}
