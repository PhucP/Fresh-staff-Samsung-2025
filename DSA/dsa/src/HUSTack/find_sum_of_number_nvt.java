package HUSTack;

import java.util.Scanner;

public class find_sum_of_number_nvt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for(int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            sum += temp;
        }

        System.out.println(sum);
    }
}
