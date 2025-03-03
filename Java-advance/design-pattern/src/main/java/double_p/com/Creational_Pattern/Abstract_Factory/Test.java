package double_p.com.Creational_Pattern.Abstract_Factory;

public class Test {
    public static void main(String[] args) {
        FurnitureFactory factory = new ArtDecoFurnitureFactory();
        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();

        chair.sitOn();
        sofa.layOn();

        factory = new ModernFurnitureFactory();
        chair = factory.createChair();
        sofa = factory.createSofa();

        chair.sitOn();
        sofa.layOn();

    }

}
