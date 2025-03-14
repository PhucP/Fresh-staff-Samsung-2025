package HUSTack.learn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;

class backTrackE{
    public int value;
    public backTrackE previous;
    public int currentStep;

    public backTrackE(int value, backTrackE previous, int currentStep){
        this.value = value;
        this.previous = previous;
        this.currentStep = currentStep;
    }
}

public class ship_traversing_island_in_an_ocean {
    static int n;
    static int D;
    static int[][] coordinates;
    static boolean[] visited;
    static Queue<Integer> queue;

    private static void input(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        D = sc.nextInt();

        coordinates = new int[n+1][2];
        visited = new boolean[n+1];
        queue = new LinkedList<>();

        for(int i = 1; i <= n; i++){
            coordinates[i][0] = sc.nextInt();
            coordinates[i][1] = sc.nextInt();
            visited[i] = false;
        }
    }

    private static backTrackE findPre(int preValue, List<backTrackE> traveling){
        for(int i = 0; i < traveling.size(); i++){
            if(preValue == traveling.get(i).value) {
                return traveling.get(i);
            }
        }

        return null;
    }

    private static void solve(){
        List<backTrackE> traveling = new ArrayList<>();
        queue.add(1);
        backTrackE pre = null;
        visited[1] = true;
        while(!queue.isEmpty()){
            int currentNode = queue.remove();
            for(int j = 1; j <= n; j++){
                int distance = calculateDistance(coordinates[currentNode], coordinates[j]);
                if(currentNode != j && !visited[j] && distance <= D){
                    queue.add(j);
                    visited[j] = true;
                    pre = findPre(currentNode , traveling);
                    traveling.add(new backTrackE(j, pre, pre.currentStep + 1));
                    if(currentNode == n) {
                        System.out.println(pre.currentStep + 1);
                    }        
                }
            }
        }

        System.out.println(-1);
    }

    private static int calculateDistance(int[] start, int[] end){
        return (int)Math.sqrt(Math.pow(start[0] - end[0], 2) + Math.pow(start[1] - end[1], 2));
    }

    public static void main(String[] args) {
        input();
        solve();
    }
}
