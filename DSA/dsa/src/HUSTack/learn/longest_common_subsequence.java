package HUSTack.learn;

import java.util.Scanner;

public class longest_common_subsequence {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n+1];
        int[] arr2 = new int[m+1];
        int[][] arr3 = new int[n+1][m+1];

        for(int i = 1; i <= n; i++){
            arr1[i] = sc.nextInt();
        }

        for(int j = 1; j <= m; j++){
            arr2[j] = sc.nextInt();
        }

        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= m; j++){
                arr3[i][j] = 0;
            }
        }

        int max = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(arr1[i] == arr2[j]){
                    arr3[i][j] = arr3[i-1][j-1] + 1;
                    max = Math.max(max, arr3[i][j]);
                } else {
                    arr3[i][j] = Math.max(arr3[i-1][j], arr3[i][j-1]);
                }
            }
        }

        System.out.println(max);
    }
}
