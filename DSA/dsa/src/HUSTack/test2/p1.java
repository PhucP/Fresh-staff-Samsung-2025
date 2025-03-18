package HUSTack.test2;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minn = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            int temp = sc.nextInt();
            minn = Math.min(minn, temp);
        }
        System.out.println(minn);
    }
}
