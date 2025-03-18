package HUSTack.learn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Edge{
    public int u;
    public int v;
    public int w;

    public Edge(int u, int v, int w) {
        this.u = u;
        this.v = v;
        this.w = w;
    }

    @Override
    public String toString() {
        return u + " " + v + " " + w;
    }
}

public class Kruskal {
    static int n;
    static int m;
    static List<Edge> E;
    static int[] p;
    static int[] r;
    static Set<Edge> S;

    private static void makeSet(int x){
        p[x] = x;
        r[x] = 0;
    }

    private static int find(int x){
        if(x != p[x]) p[x] =  find(p[x]);
        return p[x];
    }

    private static void unify(int ru, int rv){
        if(ru > rv) p[rv] = ru;
        else{
            p[ru] = rv;
            if(r[ru] == r[rv]) r[rv]++;
        }
    }
    
    private static void input() throws IOException{
        BufferedReader bf =  new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine();
        String[] s = line.split(" ");

        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);

        E = new ArrayList<>();
        S = new HashSet<>();
        p = new int[n+1];
        r = new int[n+1];
        for(int i = 1; i <= n; i++) makeSet(i);

        for(int i = 1; i <= m; i++){
            line = bf.readLine();
            s = line.split(" ");
            int u = Integer.parseInt(s[0]);
            int v = Integer.parseInt(s[1]);
            int w = Integer.parseInt(s[2]);
            E.add(new Edge(u, v, w));
        }
    }

    private static void kruskal(){
        Collections.sort(E, new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                return o1.w - o2.w;
            }
        });

        int result = 0;

        for(Edge e : E){
            int ru = find(e.u);
            int rv = find(e.v);

            if(ru != rv) {result += e.w;
                unify(ru, rv);
                S.add(e);
                if(S.size() ==  n-1) break;
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) throws IOException {
        input();
        kruskal();
    }   
}   
