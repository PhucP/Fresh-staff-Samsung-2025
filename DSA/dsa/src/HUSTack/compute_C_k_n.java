package HUSTack;

import java.util.Scanner;

public class compute_C_k_n {
    static long mod = 1000000007;
    static long[] factorialStore = new long[100000];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        long[][] store = new long[k+1][n+1];
        for (int i = 0; i < factorialStore.length; i++) {
            factorialStore[i] = -1;
        }


        for (int i = 0; i <= k; i++) {
            for (int j = 0; j <= n; j++) {
                store[i][j] = -1;
            }
        }
        System.out.println(calculateCkn(k, n, store));
        
        long result = factorial(n) / (factorial(k) * factorial(n - k));
        System.out.println(result);
    }

    private static long calculateCkn(int k, int n, long[][] store){
        if( k == 0 || n == k ) return 1;
        if(store[k][n] > 0) return store[k][n];
        return store[k][n] = (calculateCkn(k-1, n-1, store)%mod + calculateCkn(k, n-1, store)%mod)%mod;
    }

    private static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        if (factorialStore[n] > 0) return factorialStore[n];
        return factorialStore[n] = (n * factorial(n - 1)); 
    }
}
