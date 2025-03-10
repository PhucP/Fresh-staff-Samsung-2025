package HUSTack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class State {
    public int row;
    public int col;
    public int step;
    
    public State(int row, int col, int step) {
        this.row = row;
        this.col = col;
        this.step = step;
    }
}

public class maze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n, r, c;
        n = sc.nextInt();
        m = sc.nextInt();
        r = sc.nextInt();
        c = sc.nextInt();

        int[][] maze = new int[n+1][m+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                maze[i][j] = sc.nextInt();
            }
        }

        boolean[][] check = new boolean[n+1][m+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                check[i][j] = false;
            }
        }

        check[r][c] = true;
        Queue<State> queue = new LinkedList<>();
        queue.add(new State(r, c, 0));
        int[] dr = {1, -1, 0, 0};
        int[] dc = {0, 0, 1, -1};
        while (!queue.isEmpty()) {
            State current = queue.remove();
            int row = current.row;
            int col = current.col;
            int step = current.step;

            for(int k = 0; k < 4; k++){
                int newRow = row + dr[k];
                int newCol = col + dc[k];

                if(newRow <= 0 || newRow > n || newCol <= 0 || newCol > m){
                    System.out.println(step+1);
                    return;
                }

                if(maze[newRow][newCol] == 0 && check[newRow][newCol] == false){
                    queue.add(new State(newRow, newCol, step + 1));
                    check[newRow][newCol] = true;
                }
            }
        }
        System.out.println(-1);
    }
}

