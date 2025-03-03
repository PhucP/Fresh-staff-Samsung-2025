package double_p.com.Creational_Pattern.Factory;

public class LogisticFactory {
    public Logistic createLogistic(String type) {
        if(type.equalsIgnoreCase("road")) 
            return new RoadLogistic();
        else return new SeaLogistic();
    }
}
