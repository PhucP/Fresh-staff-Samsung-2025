package HUSTack;

import java.util.HashSet;
import java.util.Scanner;

public class check_exited {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] list = new int[n];
        HashSet set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
            if(set.contains(list[i])){
                System.out.println(1);
            } else {
                System.out.println(0);
                set.add(list[i]);
            }
        }
    }
}
