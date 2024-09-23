package ConditionalStatements;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        calculate(num1, num2, operation);

    }

    public static void calculate(double num1, double num2, char operation) {
        double result;

        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.printf("Result: %.2f%n", result);
                break;
            case '-':
                result = num1 - num2;
                System.out.printf("Result: %.2f%n", result);
                break;
            case '*':
                result = num1 * num2;
                System.out.printf("Result: %.2f%n", result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.printf("Result: %.2f%n", result);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operation.");
        }

    }
}

