package ConditionalStatements;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: customer age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Input: membership status
        System.out.print("Do you have a membership card? (yes/no): ");
        String membershipStatus = scanner.next().toLowerCase();

        // Determine discount based on age and membership
        double discount;

        if (age < 18) {
            discount = 0.10; // 10% discount
        } else if (age >= 18 && age < 65) {
            if (membershipStatus.equals("yes")) {
                discount = 0.20; // 20% discount with membership
            } else {
                discount = 0.10; // 10% discount without membership
            }
        } else {
            discount = 0.30; // 30% discount for age 65+
        }

        // Output the discount percentage
        System.out.printf("You receive a discount of: %.0f%%\n", discount * 100);
    }
}
