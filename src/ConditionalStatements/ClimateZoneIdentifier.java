package ConditionalStatements;

import java.util.Scanner;

public class ClimateZoneIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: latitude and hemisphere
        System.out.print("Enter latitude (between -90 and 90): ");
        double latitude = Double.parseDouble(scanner.nextLine().trim());

        System.out.print("Enter hemisphere (N/S): ");
        String hemisphere = scanner.nextLine().trim().toUpperCase();

        // Validate inputs
        if (latitude < -90 || latitude > 90 || (!hemisphere.equals("N") && !hemisphere.equals("S"))) {
            System.out.println("Invalid input");
            return;
        }

        // Determine climate zone
        if (latitude == 0) {
            System.out.println("Equator");
        } else if (latitude > 0) {
            if (latitude > 66.5) {
                System.out.println("Arctic Zone");
            } else if (latitude > 23.5) {
                System.out.println("Temperate Zone");
            } else {
                System.out.println("Tropic Zone");
            }
        } else {
            if (Math.abs(latitude) > 66.5) {
                System.out.println("Arctic Zone");
            } else if (Math.abs(latitude) > 23.5) {
                System.out.println("Temperate Zone");
            } else {
                System.out.println("Tropic Zone");
            }
        }
    }
}



