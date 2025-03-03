package double_p.com.Creational_Pattern.Factory;

public class Test {
    public static void main(String[] args) {
        LogisticFactory factory = new LogisticFactory();
        
        Logistic roadLogistic = factory.createLogistic("road");
        Logistic seaLogistic = factory.createLogistic("sea");

        roadLogistic.planDelivery();
        seaLogistic.planDelivery();
    }

}
