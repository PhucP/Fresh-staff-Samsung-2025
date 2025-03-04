package double_p.com.Structural_Patterns.Proxy;

public class Test {
    public static void main(String[] args) {
        //RealDocument realDocument = new RealDocument("test.doc");

        Document userDoc = new DocumentProxy("myDoc.doc", "admin");
        userDoc.display();

        Document userDoc2 = new DocumentProxy("myDoc2.doc", "user");
        userDoc.display();
    }
}
