package double_p.com.Creational_Pattern.Factory;

public class SeaLogistic implements Logistic
{
    @Override
    public void planDelivery() {
        System.out.println("plan delivery by sea"); 
    }
}
