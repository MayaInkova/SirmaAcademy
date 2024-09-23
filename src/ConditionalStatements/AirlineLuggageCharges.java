package ConditionalStatements;

import java.util.Scanner;

public class AirlineLuggageCharges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: luggage weight
        System.out.print("Enter the weight of the luggage (kg): ");
        double weight = scanner.nextDouble();

        // Input: luggage dimensions
        System.out.print("Enter the length of the luggage (cm): ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the luggage (cm): ");
        double width = scanner.nextDouble();
        System.out.print("Enter the height of the luggage (cm): ");
        double height = scanner.nextDouble();

        // Calculate total dimensions
        double totalDimensions = length + width + height;

        // Initialize fees
        double overweightFee = 0;
        double oversizeFee = 0;
        double handlingFee = 0;

        // Check for overweight fee
        if (weight > 50) {
            overweightFee = 100; // Overweight fee
        }

        // Check for oversize fee
        if (totalDimensions > 158) {
            double excess = totalDimensions - 158;
            if (excess >= 1 && excess <= 20) {
                oversizeFee = 50; // Slightly oversize fee
            } else if (excess >= 21 && excess <= 50) {
                oversizeFee = 100; // Moderately oversize fee
            } else if (excess > 50) {
                oversizeFee = 200; // Highly oversize fee
            }
        }

        // Check for handling fee if both overweight and oversize
        if (overweightFee > 0 && oversizeFee > 0) {
            handlingFee = 50; // Handling fee
        }

        // Calculate total charges
        double totalCharges = overweightFee + oversizeFee + handlingFee;

        // Output the total charges and detailed message
        System.out.printf("Total luggage charges: $%.2f", totalCharges);
        System.out.print(" (");

        // Build message based on charges
        if (overweightFee > 0) {
            System.out.print("Overweight");
        }
        if (oversizeFee > 0) {
            if (overweightFee > 0) {
                System.out.print(" + ");
            }
            if (oversizeFee == 50) {
                System.out.print("Slightly oversize");
            } else if (oversizeFee == 100) {
                System.out.print("Oversize");
            } else if (oversizeFee == 200) {
                System.out.print("Highly oversize");
            }
        }
        if (handlingFee > 0) {
            System.out.print(" + Handling");
        }
        System.out.println(")");
    }
}
