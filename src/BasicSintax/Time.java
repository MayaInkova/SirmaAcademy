package BasicSintax;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of minutes (integer)
        System.out.print("Enter the number of minutes: ");
        int totalMinutes = scanner.nextInt();

        // Calculate hours and remaining minutes
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        // Print the result in HR:MM format
        System.out.printf("Time: %02d:%02d%n", hours, minutes);

    }
}
