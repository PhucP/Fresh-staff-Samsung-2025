package HUSTack.test3;

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int d = sc.nextInt();

        int[] weight = new int[n+1];
        int[] time = new int[n+1];

        for(int i = 1; i <= n; i++){
            weight[i] = sc.nextInt();
        }

        for(int i = 1; i <= n; i++){
            time[i] = sc.nextInt();
        }

        int[][] dp = new int[n+1][n+1];

        for(int i = 1; i <= t; i++){
            for(int j = 1; j <= d; j++){
                int newTimeIndex = Math.max(i - time[j], 0);
                int newWeightIndex =Math.max(j -  weight[j], 0);

                dp[i][j] = Math.max(dp[newTimeIndex][newWeightIndex] + weight[j], dp[i][j-weight[j]]);
            }
        }

        System.out.println(dp[n]);
    }
}
