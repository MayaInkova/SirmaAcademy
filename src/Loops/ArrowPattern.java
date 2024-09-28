package Loops;

import java.util.Scanner;

public class ArrowPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of rows
        System.out.print("Enter a positive integer n representing the number of rows: ");
        int n = scanner.nextInt();

        // Loop to print the right-aligned triangle
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
