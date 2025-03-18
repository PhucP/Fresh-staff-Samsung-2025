package HUSTack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class ship_traversing_island_in_ocean {
    static int n, d;
    static int[][] coordinates;
    static List<Integer>[] neighborNodes;
    static boolean[] visited;

    public static void main(String[] args) {
        init();
        solve();
    }

    private static void init(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        d = sc.nextInt();
        coordinates = new int[n+1][3];
        visited = new boolean[n+1];

        neighborNodes = new ArrayList[n+1]; 
        for(int i = 1; i <= n; i++){
            neighborNodes[i] = new ArrayList<>();
            coordinates[i][1] = sc.nextInt();
            coordinates[i][2] = sc.nextInt();
            visited[i] = false;
        }

        sc.close();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(calculateDistance(coordinates[i], coordinates[j]) <= d){
                    neighborNodes[i].add(j);
                    neighborNodes[j].add(i);  
                }
            }
        }
    }

    private static void solve(){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(new Node(1, 0)); 
        visited[1] = true; 
        while(!queue.isEmpty()){
            Node currentNode = queue.remove();
            for(Integer neighbor : neighborNodes[currentNode.value]){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    queue.add(new Node(neighbor, currentNode.step+1));
                    if(neighbor == n){
                        System.out.println(currentNode.step+1);
                        return;
                    }
                }
            }
        }

        System.out.println(-1);
    }

    private static int calculateDistance(int[] start,  int[] end){
        return (int)Math.sqrt(Math.pow(start[2] - end[2], 2) + Math.pow(start[1] - end[1], 2));
    }
}

class Node{
    public int value;
    public int step;

    public Node(int value, int step){
        this.value = value;
        this.step = step;
    }
}


