package HUSTack;

import java.util.Scanner;

public class max_subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] sum = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (i == 0) {
                sum[i] = arr[i];
            } else {
                sum[i] = Math.max(arr[i], sum[i - 1] + arr[i]);
            }
        }

        int max = sum[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(max, sum[i]);
        }
        System.out.println(max);
    }
}
