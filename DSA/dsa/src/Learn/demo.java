package Learn;

import java.util.ArrayList;

public class demo {
    int a;
    int b;
    ArrayList<Integer> i;

    public demo(int a, int b) {
        this.a = a;
        this.b = b;
        this.i = new ArrayList<>();
        i.add(1);
        i.add(2);
        i.add(3);
    }

    private int adding(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        demo d =  new demo(5, 6);
        System.out.println(d.adding(d.a, d.b));

        for(int element : d.i){
            if(element%2 == 0) System.out.println("element: " + element + "");
        }
    }
}
