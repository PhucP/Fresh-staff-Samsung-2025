package double_p.com.Creational_Pattern.Factory;

public class RoadLogistic implements Logistic{

    @Override
    public void planDelivery() {
        System.out.println("plan delivery by road"); 
    }
}
