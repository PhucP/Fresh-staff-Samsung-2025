package HUSTack.test3;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int D = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int arr[] = new int[n];
        int dp[] = new int[n];


        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            dp[i] = 1;
            for(int j = 0; j < i; j++){
                if(arr[i] >= arr[j] + D) { 
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max = Math.max(max, dp[i]); 
        }   

        System.out.println(max);


    }
}
