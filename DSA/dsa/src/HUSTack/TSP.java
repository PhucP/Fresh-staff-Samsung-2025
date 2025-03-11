package HUSTack;

import java.util.Scanner;

public class TSP {
    static int n;
    static int[][] arr;
    static int[] path;
    static boolean[] visited;
    static int min;
    static int sum;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];
        path = new int[n];
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                visited[i] = false;
            }
        }
        min = Integer.MAX_VALUE;
        sum = 0;  
        visited[0] = true;  
        path[0] = 0;
        Try(1);
        System.out.println(min);
    }

    private static void Try(int step){
        for(int i = 1; i < n; i++){
            if(!visited[i]){
                if(sum + arr[path[step - 1]][i] >= min)
                {
                    continue;
                }
                visited[i] = true;
                path[step] = i; 
                sum += arr[path[step - 1]][i];
                if(step == n - 1) {
                    //Out();
                    min = Math.min(min,sum + arr[i][0]);
                } else Try(step + 1);
                sum -= arr[path[step - 1]][i];
                visited[i] = false;
            }
        }
    }

    // private static boolean check(){
        
    // }

    // private static void Out(){
    //     for(int i = 0; i < n; i++)
    //         System.out.print(path[i] + " ");
    //     System.out.println();
    // }
}
