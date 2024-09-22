package ConditionalStatements;

import java.util.Scanner;

public class AddressByAgeAndGender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read age and gender from the user
        System.out.print("Enter age: ");
        double age = scanner.nextDouble();

        System.out.print("Enter gender (m/f): ");
        char gender = scanner.next().toLowerCase().charAt(0);

        // Determine and print the appropriate title
        printTitle(age, gender);

    }

    // Function to determine and print the title based on age and gender
    public static void printTitle(double age, char gender) {
        if (gender == 'm') {
            if (age >= 16) {
                System.out.println("Mr.");
            } else {
                System.out.println("Master");
            }
        } else if (gender == 'f') {
            if (age >= 16) {
                System.out.println("Ms.");
            } else {
                System.out.println("Miss");
            }
        } else {
            System.out.println("Invalid gender input.");
        }
    }
}
