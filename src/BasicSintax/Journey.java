package BasicSintax;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the speed of the first car (x km/h)
        System.out.print("Enter the speed of the first car (x km/h): ");
        double speedCar1 = scanner.nextDouble();

        // Read the speed of the second car (y km/h)
        System.out.print("Enter the speed of the second car (y km/h): ");
        double speedCar2 = scanner.nextDouble();

        // Calculate the distances
        double distanceCar1 = speedCar1 * 5; // Distance for the first car (5 hours)
        double distanceCar2 = speedCar2 * 3; // Distance for the second car (3 hours)

        // Calculate the distance between the two cars
        double distanceBetweenCars = distanceCar1 - distanceCar2;

        // Print the result
        System.out.printf("The distance between the two cars after 3 hours is: %.2f km%n", distanceBetweenCars);
    }
}

