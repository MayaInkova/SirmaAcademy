package Loops;

import java.util.Scanner;

public class SquareOfAsterisks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Read the size of the square
        System.out.print("Enter a positive integer n to draw a square: ");
        int n = scanner.nextInt();

        // Check if n is positive
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Draw the square
        drawSquare(n);
    }

    private static void drawSquare(int n) {
        // Print n rows
        for (int i = 0; i < n; i++) {
            // Print n asterisks with spaces
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            // New line after each row
            System.out.println();
        }
    }
}
