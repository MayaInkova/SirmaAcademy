package BasicSintax;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first integer
        System.out.print("Enter the first integer (numOne): ");
        int numOne = scanner.nextInt();

        // Read the second integer
        System.out.print("Enter the second integer (numTwo): ");
        int numTwo = scanner.nextInt();

        // Calculate sum, difference multiplication and modulus
        int sum = numOne + numTwo;
        int difference = numOne - numTwo;
        int multiplication = numOne * numTwo;
        int modulus = numOne % numTwo;

        // Print the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Modulus: " + modulus);

    }
}
