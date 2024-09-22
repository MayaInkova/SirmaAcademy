package ConditionalStatements;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read an integer from the user
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        // Check if the number is even or odd and print the result
        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
