package HUSTack.learn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class sequence_of_node_visited_by_dfs {
    static int n;
    static int m;
    static List<Integer>[] c;
    static boolean[] visited;

    private static void input(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        c = new ArrayList[n + 1]; 
        visited = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            c[i] = new ArrayList<Integer>(); 
            visited[i] = false;
        }

        for (int i = 0; i < m; i++) {
            int t1 = sc.nextInt();
            int t2 = sc.nextInt();
            c[t1].add(t2);
            c[t2].add(t1);
        }

        for(int i = 1; i <= n; i++){
            Collections.sort(c[i]);
        }
    }

    private static void dfs(int node){
        System.out.print(node + " ");
        visited[node] = true; 
        for(int i = 0; i < c[node].size(); i++){
            if(!visited[c[node].get(i)]){
                dfs(c[node].get(i));
            }
        }
    }

    public static void main(String[] args) {
        input();
        for(int i = 1; i <= n; i++){
            if(!visited[i]) dfs(i);
        }
    }

}
