package double_p.com.Creational_Pattern.Abstract_Factory;

public class ModernFurnitureFactory implements FurnitureFactory{

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
       return new ModernSofa();
    }

}
