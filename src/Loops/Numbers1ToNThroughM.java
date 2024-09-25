package Loops;

import java.util.Scanner;

public class Numbers1ToNThroughM {
    public static void printWithStep(int n, int m) {
        for (int i = 1; i <= n; i += m) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input for n and m
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.print("Enter the value of m: ");
        int m = scanner.nextInt();

        // Call the function to print numbers from 1 to n with step m
        printWithStep(n, m);

    }
}

