package HUSTack.learn;

import java.util.Scanner;

public class permutaton_generation {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean[] visited = new boolean[n+1];
        for (int i = 0; i < n; i++) {
            visited[i] = false;
        }

        Try(0, n, arr, visited);
    }

    private static void Try(int step, int n, int[] arr, boolean[] visited) {
        for(int i = 1; i <= n; i++){
            if(!visited[i]){
                visited[i] = true;
                arr[step] = i;
                if(step == n - 1) Out(arr);
                else Try(step + 1, n, arr, visited);
                visited[i] = false; 
            }
        }
    }

    private static void Out(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
