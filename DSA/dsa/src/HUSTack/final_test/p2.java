package HUSTack.final_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] results = new int[n];
        String s;
        String[] ss;
        for(int i = 0; i < n; i++){
            s = reader.readLine();
            ss = s.split(" ");
            results[i] = 0;
            for(int j = 0; j < ss.length; j++){
                results[i] += Integer.parseInt(ss[j]);
            }
        }
        reader.close();

        for(int i : results){
            System.out.println(i);
        }
    }
}
