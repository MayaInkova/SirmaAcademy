package ConditionalStatements;

import java.util.Scanner;

public class PotionBrewingDecision {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: ingredients
        System.out.print("Enter the first ingredient: ");
        String firstIngredient = scanner.nextLine().trim().toLowerCase();

        System.out.print("Enter the second ingredient: ");
        String secondIngredient = scanner.nextLine().trim().toLowerCase();

        // Decision making based on the ingredients
        if (firstIngredient.equals("herbs")) {
            if (secondIngredient.equals("water")) {
                System.out.println("Health potion");
            } else if (secondIngredient.equals("oil")) {
                System.out.println("Stealth potion");
            } else {
                System.out.println("Minor stamina potion");
            }
        } else if (firstIngredient.equals("berries")) {
            if (secondIngredient.equals("sugar")) {
                System.out.println("Speed potion");
            } else {
                System.out.println("Minor energy potion");
            }
        } else {
            System.out.println("No potion");
        }
    }
}
