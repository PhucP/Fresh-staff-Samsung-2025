package HUSTack.test3;

import java.io.BufferedReader;
import java.nio.Buffer;
import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        boolean check[] = new boolean[n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                if(arr[i][j] == 0) check[j] = true;
            }
        }

        int count = 0;

        for(int i = 0; i < n; i++) {
            if(!check[i]) count++;
        }

        System.out.println(count);
    }
}
