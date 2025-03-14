package HUSTack.learn;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge {
    int u;
    int v;
    int w;

    public Edge(int u, int v, int w) {
        this.u = u;
        this.v = v;
        this.w = w;
    }
}

public class shortest_path_between_2_nodes_on_a_directed_graph_with_non_negative_weights {
    static PriorityQueue<Edge> pq;
    static List<Edge>[] nodes;
    static int n;
    static int m;
    static int s;
    static int g;
    static int[] distances; 
    static boolean[] visited;

    private static void init() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        
        nodes = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        distances = new int[n + 1];
        pq = new PriorityQueue<>((a, b) -> a.w - b.w);
        for (int i = 1; i <= n; i++) {
            nodes[i] = new ArrayList<>();
            visited[i] = false;
            distances[i] = Integer.MAX_VALUE; // Initialize distances to infinity
        }

        for (int i = 0; i < m; i++) {
            int U = sc.nextInt();
            int V = sc.nextInt();
            int W = sc.nextInt();

            nodes[U].add(new Edge(U, V, W));
        }

        s = sc.nextInt();
        g = sc.nextInt();

        sc.close();
    }

    private static void solve() {
        distances[s] = 0; 
        pq.add(new Edge(s, s, 0));
        while (!pq.isEmpty()) {
            Edge current = pq.remove();
            if (visited[current.u]) continue; 
            visited[current.u] = true;

            for (Edge e : nodes[current.u]) {
                if (!visited[e.v]) {
                    int newDist = distances[current.u] + e.w;
                    if (newDist < distances[e.v]) {
                        distances[e.v] = newDist;
                        pq.add(new Edge(e.v, e.u, newDist)); 
                    }
                }
            }
        }

      
        System.out.println(distances[g] == Integer.MAX_VALUE ? -1 : distances[g]);
    }

    public static void main(String[] args) {
        init();
        solve();
    }
}
