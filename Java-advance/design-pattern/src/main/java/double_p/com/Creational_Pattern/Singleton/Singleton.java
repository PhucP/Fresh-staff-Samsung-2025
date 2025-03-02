package double_p.com.Creational_Pattern.Singleton;

public class Singleton {
    // Private static instance of the class
    private static Singleton instance;
    
    // Private constructor to prevent instantiation
    private Singleton() {
    }
    
    // Public static method to get the instance
    public static Singleton getInstance() {
        if (instance == null) {
            System.out.println("create new instance");
            instance = new Singleton();
        } else System.out.println("instance has been created");
        return instance;
    }
}
