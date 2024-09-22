package ConditionalStatements;

import java.util.Scanner;

public class LargerNumber {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Call the function
        printLarger(num1, num2);

    }

    // Function to print the larger of two integers
    public static void printLarger(int a, int b) {
        if (a > b) {
            System.out.println("The larger integer is: " + a);
        } else if (b > a) {
            System.out.println("The larger integer is: " + b);
        } else {
            System.out.println("Both integers are equal: " + a);
        }

    }
}
