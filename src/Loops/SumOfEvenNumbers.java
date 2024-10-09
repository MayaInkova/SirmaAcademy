package Loops;

import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void calculateSumOfEvenNumbers(int n) {
        int sum = 0;

        // Loop to calculate the sum of the first 'n' even numbers
        for (int i = 1; i <= n; i++) {
            sum += 2 * i;  // The i-th even number is 2 * i
        }

        // Display the result
        System.out.println("The sum of the first " + n + " even numbers is: " + sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the input value 'n' from the user
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Call the function
        calculateSumOfEvenNumbers(n);

    }
}

