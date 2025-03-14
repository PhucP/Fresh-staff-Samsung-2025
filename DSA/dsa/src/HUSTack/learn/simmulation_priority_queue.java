package HUSTack.learn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class simmulation_priority_queue {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(;;){
            String line =  reader.readLine();
            if(line.equals("#")) break;

            String[] lines = line.split(" ");

            switch (lines[0]) {
                case "PUSH":
                    pq.add(Integer.parseInt(lines[1]));
                    break;
                default:
                    if(!pq.isEmpty()) System.out.println(pq.remove());
                    break;
            }
        }
    }
}
