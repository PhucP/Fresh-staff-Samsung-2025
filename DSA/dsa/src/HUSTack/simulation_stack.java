package HUSTack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class simulation_stack {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader bf =  new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String line = bf.readLine();
            if(line.equals("#")) break;
            String[] codes = line.split(" ");
            switch(codes[0]) {
                case "PUSH":
                    stack.push(Integer.parseInt(codes[1]));
                    break;
                case "POP":
                    if(stack.isEmpty()) System.out.println("NULL");
                    else System.out.println(stack.pop());
                    break;            }
        }
    }
}
