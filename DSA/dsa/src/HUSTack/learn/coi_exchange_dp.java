package HUSTack.learn;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class coi_exchange_dp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] dp = new int[x+1];
        Set<Integer> step = new HashSet<>();

        for(int i = 0; i < n; i++){
            int temp = sc.nextInt();
            step.add(temp);
            dp[temp] = 1;
        }

        for(int t : dp) System.out.print(t + " ");
        System.out.println();

        for(int i = 1; i <= x; i++) {
           for(Integer j : step){
            if(i >= j) {
                if(dp[i] != 0) dp[i] = Math.min(dp[i], dp[i-j] + 1);
                else dp[i] = dp[i-j] + 1;

                //System.out.println(i + " : " + j + " - " + dp[i]);

            }           } 
        }

        System.out.println(dp[x]);
    }
}
