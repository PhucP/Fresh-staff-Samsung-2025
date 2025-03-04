package double_p.com.Structural_Patterns.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    public static Map<String, Shape> circleMap = new HashMap<>();

    public Shape getShape(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null){
            circle = new Circle(color);
            circleMap.put(color,circle);
            System.out.println("Create new Circle");
        }
        return circle;
    }
}
