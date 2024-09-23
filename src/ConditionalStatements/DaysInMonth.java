package ConditionalStatements;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        // Input: month number
        System.out.print("Enter month number (1-12): ");
        int month = scanner.nextInt();
        int days;

        // Determine the number of days in the month
        switch (month) {
            case 1:  // January
            case 3:  // March
            case 5:  // May
            case 7:  // July
            case 8:  // August
            case 10: // October
            case 12: // December
                days = 31;
                break;
            case 4:  // April
            case 6:  // June
            case 9:  // September
            case 11: // November
                days = 30;
                break;
            case 2:  // February
                days = 28; // Not a leap year
                break;
            default:
                System.out.println("Invalid month number. Please enter a number between 1 and 12.");
                return; // Exit the program for invalid input
        }

        // Output the number of days
        System.out.println("Number of days: " + days);
    }
}
