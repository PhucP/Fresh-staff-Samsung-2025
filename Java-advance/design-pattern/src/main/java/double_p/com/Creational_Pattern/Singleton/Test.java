package double_p.com.Creational_Pattern.Singleton;

public class Test {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        Singleton singleton2 = Singleton.getInstance();
    }
}
