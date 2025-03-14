package HUSTack.learn;

import java.util.Scanner;

public class linear_integer_equation_coefficent_1 {
    static int n;
    static int total;
    static int[] arr;
    static int sum;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        total = sc.nextInt();
        arr = new int[n];
        sum = 0;

        Try(0);
    }

    private static void Try(int step){
        for(int i = 1; i <= total; i++){
            arr[step] = i;
            sum += i;
            if(sum > total) {
                sum -= i;
                break;
            }
            if(step == n - 1){
                if(sum == total) Out();
            }
            else Try(step + 1);
            sum -= i;
        }
    }

    private static void Out(){
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
