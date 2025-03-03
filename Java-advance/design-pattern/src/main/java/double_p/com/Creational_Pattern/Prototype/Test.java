package double_p.com.Creational_Pattern.Prototype;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Galaxy milkiway = new Galaxy("Milkiway");
        Galaxy andromeda = milkiway.clone();
        andromeda.setName("Andromeda");

        System.out.println(milkiway.getName());
        System.out.println(andromeda.getName());
    }

}
