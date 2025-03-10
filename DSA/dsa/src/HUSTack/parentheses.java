package HUSTack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class parentheses {
    public static void main(String[] args) throws IOException {
        Stack<Character> stack = new Stack<Character>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        for(int i = 0; i < input.length(); i++) {
            char charAt = input.charAt(i);
            if(charAt == '(' ||
                charAt == '{' ||
                charAt == '[') {
                stack.push(charAt);
            } else {
                if(stack.isEmpty()) {
                    System.out.println(0);
                    return;
                }
                char top = stack.pop();
                if(charAt == ')' && top != '(' ||
                    charAt == '}' && top != '{' ||
                    charAt == ']' && top != '[') {
                    System.out.println(0);
                    return;
                }
            }
        }
        if(stack.isEmpty()) System.out.println(1);
        else System.out.println(0);
    }
}
