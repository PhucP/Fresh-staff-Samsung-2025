package double_p.com.Creational_Pattern.Abstract_Factory;

public class ArtDecoFurnitureFactory implements FurnitureFactory{

    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }
    

}
