package HUSTack;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Queue;

import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class simulation_queue {
    public static void main(String[] args) throws IOException {
        Queue<Integer> queue = new LinkedList<Integer>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String line = bf.readLine();
            if(line.equals("#")) break;
            String[] codes = line.split(" ");
            switch(codes[0]) {
                case "PUSH":
                    queue.add(Integer.parseInt(codes[1]));
                    break;
                case "POP":
                    if(queue.isEmpty()) System.out.println("NULL");
                    else System.out.println(queue.poll());
                    break;            }
        }
    }
}
