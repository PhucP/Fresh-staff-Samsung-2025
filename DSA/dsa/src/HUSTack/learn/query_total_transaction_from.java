package HUSTack.learn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class query_total_transaction_from {
    public static void main(String[] args) throws IOException {
        BufferedReader bf =  new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> account = new HashMap<>();
    
        String[] lines;
        String line;

        while(true){
            line = bf.readLine();
            if(line.equals("#")) break;

            lines = line.split(" ");

            int currentRevenue = Integer.parseInt(lines[2]);
            account.put(lines[0], account.getOrDefault(lines[0], 0) + currentRevenue);
        }

        while(true){
            line = bf.readLine();
            if(line.equals("#")) break;
            lines = line.split(" ");
            System.out.println(account.getOrDefault(lines[1], 0));
        }
    }
}
