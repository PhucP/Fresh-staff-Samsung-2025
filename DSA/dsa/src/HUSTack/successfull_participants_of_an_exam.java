package HUSTack;

import java.util.Scanner;

public class successfull_participants_of_an_exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, low;
        n = sc.nextInt();
        low = sc.nextInt();
        int count = 0;


        for (int i = 0; i < n; i++) {
            int score = sc.nextInt();
            if(score >= low) count++;
        }

        System.out.println(count);
    }
}
