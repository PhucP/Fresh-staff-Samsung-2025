package HUSTack.final_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int count = 0;
        String s = reader.readLine();
        String[] ss = s.split(" ");
        for(int i = 0; i < ss.length; i++) {
            if(Integer.parseInt(ss[i]) > 0) count++;
        }
        reader.close();
        
        System.out.println(count);
    }
}
