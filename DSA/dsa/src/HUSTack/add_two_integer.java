package HUSTack;

import java.math.BigInteger;
import java.util.Scanner;

public class add_two_integer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger(); 

        System.out.println(a.add(b));
    }
}