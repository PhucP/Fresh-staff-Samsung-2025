package HUSTack.final_test;

import java.util.Scanner;

public class p4 {
    static int n;
    static int b;
    static int[] weight;
    static int[] value;
    static int[][] dp;

    private static void init(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        b = sc.nextInt();
        weight = new int[n+1];
        value = new int[n+1];
        dp = new int[b+1][n+1];

        for(int i = 1; i <= n; i++){
            weight[i] = sc.nextInt();
            value[i] = sc.nextInt();
        }

        sc.close();
    }

    private static void solve(){
        for(int i = 0; i <= b; i++){
            for(int j = 1; j <= n; j++){
                if(i >= weight[j]){
                    dp[i][j] = Math.max(dp[i-weight[j]][j-1] + value[j], dp[i][j-1]);
                } else dp[i][j] = dp[i][j-1];
            }
        }

        System.out.println(dp[b][n]);
    }

    public static void main(String[] args) {
        init();
        solve();
    }
}
