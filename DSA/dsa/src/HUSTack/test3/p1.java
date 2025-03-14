package HUSTack.test3;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = sc.nextInt();
        int max = sc.nextInt();

        int count = 0;

        for(int i = 0; i < n; i++){
            int temp = sc.nextInt();
            if(temp >= min && temp <= max){
                count++;
            }
        }

        System.out.println(count);
    }
}
