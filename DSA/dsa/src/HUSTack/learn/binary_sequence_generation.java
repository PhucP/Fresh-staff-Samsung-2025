package HUSTack.learn;

import java.util.Scanner;

public class binary_sequence_generation {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        Try(0, n, arr);
    }

    public static void Try(int step, int n, int[] arr){
        for(int j = 0; j < 2; j++){
            arr[step] = j;
            if(step == n-1) Out(arr);
            else Try(step + 1, n, arr);
        }
    }

    private static void Out(int[] arr) {
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "");
        System.out.println();
    }
}
