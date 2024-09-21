package BasicSintax;

import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read the distance in meters
        System.out.print("Enter distance in meters: ");
        int distance = scanner.nextInt();

        // Read the time in hours, minutes, and seconds
        System.out.print("Enter time in hours: ");
        int hours = scanner.nextInt();
        System.out.print("Enter time in minutes: ");
        int minutes = scanner.nextInt();
        System.out.print("Enter time in seconds: ");
        int seconds = scanner.nextInt();

        // Calculate total time in seconds
        int totalTimeInSeconds = hours * 3600 + minutes * 60 + seconds;

        // Calculate speed in meters per second
        double speed = (double) distance / totalTimeInSeconds;

        // Print the result
        System.out.printf("Speed: %.2f meters per second%n", speed);
    }
}

