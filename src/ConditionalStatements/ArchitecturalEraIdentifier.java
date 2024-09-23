package ConditionalStatements;

import java.util.Scanner;

public class ArchitecturalEraIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: year of construction and material used
        System.out.print("Enter the year the building was constructed: ");
        int year = Integer.parseInt(scanner.nextLine().trim());

        System.out.print("Enter the primary material used (wood/stone/steel): ");
        String material = scanner.nextLine().trim().toLowerCase();

        // Determine the architectural era
        String era;

        if (year < 500 && material.equals("stone")) {
            era = "Ancient";
        } else if (year >= 500 && year <= 1500 && material.equals("stone")) {
            era = "Medieval";
        } else if (year >= 1500 && year <= 1800 && material.equals("wood")) {
            era = "Colonial";
        } else if (year >= 1800 && year < 1900 && material.equals("steel")) {
            era = "Industrial";
        } else if (year > 1900 && material.equals("steel")) {
            era = "Modern";
        } else {
            era = "Uncertain";
        }

        // Output the result
        System.out.println("Architectural Era: " + era);
    }

}
