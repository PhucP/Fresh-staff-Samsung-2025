package HUSTack.test2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class p2 {
    static int[][] sudocu;
    static Set<Integer> dr, dc, db;

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        List<Integer> listOutput =  new ArrayList<>();
        while(t-- > 0){
            boolean checkInput = true;
            sudocu = new int[9][9];
            for(int i = 0; i < 9; i++){
                for(int j = 0; j < 9; j++){
                    sudocu[i][j] = sc.nextInt();
                    if(sudocu[i][j] < 1 || sudocu[i][j] > 9) checkInput = false;
                }
            }    
            if(checkInput) listOutput.add(checkValid() ? 1: 0);
            else listOutput.add(0);
        }

        for(int i : listOutput){
            System.out.println(i);
        }
    }

    private static boolean checkValid(){
        if(!checkRowCol()) return false;
        
        for(int i = 0; i < 9; i += 3){
            for(int j = 0; j < 9; j += 3){
                int[][] box = new int[3][3];
                for(int x = 0; x < 3; x++){
                    for(int y = 0; y < 3; y++){
                        box[x][y] = sudocu[i + x][j + y];
                    }
                }

                if(!checkBox(box)) return false;
            }
        }

        return true;
    }

    private static boolean checkRowCol(){
        for(int i = 0; i < 9; i++){
            dr = new HashSet<>();
            dc = new HashSet<>();
            for(int j = 0; j < 9; j++){
                if(dr.contains(sudocu[i][j])) return false;
                else dr.add(sudocu[i][j]);

                if(dc.contains(sudocu[j][i])) return false;
                else dc.add(sudocu[j][i]);
            }
        }
        return true;
    }

    private static boolean checkBox(int[][] box){
        db =  new HashSet<>();
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(db.contains(box[i][j])) return false;
                else db.add(box[i][j]);
            }
        }
        return true;
    }
}
