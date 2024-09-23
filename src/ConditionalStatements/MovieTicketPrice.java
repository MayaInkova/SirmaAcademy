package ConditionalStatements;

import java.util.Scanner;

public class MovieTicketPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: age of the user
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        int ticketPrice;

        // Determine ticket price based on age
        if (age >= 0 && age <= 12) {
            ticketPrice = 5; // Child
        } else if (age >= 13 && age <= 19) {
            ticketPrice = 8; // Teen
        } else if (age >= 20) {
            ticketPrice = 10; // Adult
        } else {
            System.out.println("Invalid age entered.");
            return; // Exit if the age is negative
        }

        // Output the ticket price
        System.out.println("The price of the movie ticket is: $" + ticketPrice);
    }
}
