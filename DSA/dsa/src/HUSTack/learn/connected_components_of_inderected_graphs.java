package HUSTack.learn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class connected_components_of_inderected_graphs {
    static int n;
    static int m;
    static List<Integer>[] c;
    static boolean[] visited;
    static Queue<Integer> queue;

    private static void input(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        c = new ArrayList[n + 1]; 
        queue = new LinkedList<>();
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

    private static void bfs(int node){
        queue.add(node);
        while (!queue.isEmpty()) {
            int currentNode = queue.remove();
            if(!visited[currentNode]){
                visited[currentNode] = true;
                for (int i = 0; i < c[currentNode].size(); i++) {
                    queue.add(c[currentNode].get(i));
                }
            }
        }
    }

    public static void main(String[] args) {
        input();
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(!visited[i]){
                count++;
                bfs(i);
            }
        }

        System.out.println(count);
    }
}
