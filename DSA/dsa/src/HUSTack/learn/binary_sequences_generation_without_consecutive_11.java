package HUSTack.learn;

import java.util.Scanner;

public class binary_sequences_generation_without_consecutive_11 {
    static int n;
    static int[] arr;
    public static void main(String[] args) {
        n = new Scanner(System.in).nextInt();
        arr = new int[n];
        Try(0);
    }

    private static void Try(int step){
        for(int i = 0; i < 2; i++) {
            if(step > 0 && i == 1 & arr[step - 1] == 1) {
                continue;
            }
            else arr[step] = i;
            if(step == n - 1) Out();
            else Try(step + 1);
        }
    }

    private static void Out(){
        for(int i = 0; i < n; i++)
            System.out.print(arr[i]);
        System.out.println();
    }
}
