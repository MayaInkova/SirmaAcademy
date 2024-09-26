package Loops;

import java.util.Scanner;

import static java.lang.Integer.reverse;

public class NumberReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer:");
        int n = scanner.nextInt();

        int reversedNumber = reverse(n);
        System.out.println("The reverse of " + n + "is: " + reversedNumber);

    }

    public static int reverse(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;

        }
        return  reversed;
    }
}
