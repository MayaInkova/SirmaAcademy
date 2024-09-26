package Loops;

import java.util.Scanner;

public class FactorialCalculation {
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        // Scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Asking the user to input a positive integer
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        // Checking if the input is a positive integer
        if (n < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Calling the factorial method and printing the result
            long result = factorial(n);
            System.out.println("The factorial of " + n + " is: " + result);
        }

    }
}

