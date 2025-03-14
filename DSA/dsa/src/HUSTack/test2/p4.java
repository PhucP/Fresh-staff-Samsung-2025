package HUSTack.test2;

import java.util.Scanner;

public class p4 {
    static int n, Q, K;
    static int[] d;
    static int[][] distance;
    static boolean visited[];
    static int[] capacity;
    static int minDistance = Integer.MAX_VALUE;
    public static void main(String[] args) {
        input();
        solve();
    }

    private static void solve(){
        Try(1);
    }

    private static void Try(int step){
        for(int i = 1; i <= K; i++) {
            if(checkCanBring(i, step)){

            }
        }
    }

    private static boolean checkCanBring(int struck, int step){
        return capacity[struck] - d[step] >= 0;
    }

    private static void input(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        K = sc.nextInt();
        Q = sc.nextInt();

        d = new int[n+1];
        visited = new boolean[n+1];
        for(int i = 1; i <= n; i++) {
            d[i] = sc.nextInt();
            capacity[i] = Q;
        }

        distance = new int[n+2][n+2];
        for(int i = 1; i <= n+1; i++) {
            for(int j = 1; j <= n+1; j++){
                distance[i][j] = sc.nextInt();
                visited[i] = false;
            }
        }
    }
}
