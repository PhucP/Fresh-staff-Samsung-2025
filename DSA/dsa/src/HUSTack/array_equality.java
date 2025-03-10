package HUSTack;

import java.util.Scanner;

public class array_equality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[m];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < m; i++) {
                b[i] = sc.nextInt();
            }

            if(m != n) {
                System.out.println(0);
                continue;
            } else {
                boolean check = true;
                for(int i = 0; i < n; i++){
                    if(a[i] != b[i])
                    {
                        System.out.println(0);
                        check = false;
                        break;
                    }
                }

                if(check)System.out.println(1);
            }
        }
    }
}
