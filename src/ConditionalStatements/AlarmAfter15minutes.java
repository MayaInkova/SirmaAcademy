package ConditionalStatements;

import java.util.Scanner;

public class AlarmAfter15minutes {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        // Read hours and minutes from the user
        System.out.print("Enter hours (0-23): ");
        int hours = scanner.nextInt();

        System.out.print("Enter minutes (0-59): ");
        int minutes = scanner.nextInt();

        // Calculate new time after adding 15 minutes
        calculateNewTime(hours, minutes);

    }

    // Function to calculate and print the new time
    public static void calculateNewTime(int hours, int minutes) {
        // Add 15 minutes
        minutes += 15;

        // Check if minutes exceed 59
        if (minutes >= 60) {
            hours += minutes / 60; // Increment hours
            minutes = minutes % 60; // Keep minutes within 0-59
        }

        // Adjust hours if they exceed 23
        hours = hours % 24;

        // Print result in hours:minutes format
        System.out.printf("%d:%02d%n", hours, minutes);

    }
}
