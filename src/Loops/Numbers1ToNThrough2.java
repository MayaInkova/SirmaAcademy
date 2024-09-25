package Loops;

import java.util.Scanner;

public class Numbers1ToNThrough2 {
    public static void printWithStepTwo(int n) {
        for (int i = 1; i <= n; i += 2) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input from the user
        System.out.print("Enter a positive number: ");
        int n = scanner.nextInt();

        // Call the function to print numbers from 1 to n with step 2
        printWithStepTwo(n);

        scanner.close();
    }
}

