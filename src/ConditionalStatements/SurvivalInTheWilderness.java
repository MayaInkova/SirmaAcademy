package ConditionalStatements;

import java.util.Scanner;

public class SurvivalInTheWilderness {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: time of day
        System.out.print("Enter the time of day (day/night): ");
        String timeOfDay = scanner.nextLine().trim().toLowerCase();

        // Input: environment
        System.out.print("Enter the environment (forest/desert): ");
        String environment = scanner.nextLine().trim().toLowerCase();

        // Input: item in possession
        System.out.print("Enter the item you have: ");
        String item = scanner.nextLine().trim().toLowerCase();

        // Decision making based on the inputs
        if (timeOfDay.equals("day")) {
            if (environment.equals("forest")) {
                if (item.equals("knife")) {
                    System.out.println("Hunt for food");
                } else if (item.equals("container")) {
                    System.out.println("Collect berries");
                } else {
                    System.out.println("Explore");
                }
            } else if (environment.equals("desert")) {
                if (item.equals("hat")) {
                    System.out.println("Search for water");
                } else {
                    System.out.println("Find shade");
                }
            }
        } else if (timeOfDay.equals("night")) {
            if (environment.equals("forest")) {
                if (item.equals("firestarter")) {
                    System.out.println("Make a campfire");
                } else {
                    System.out.println("Climb a tree for safety");
                }
            } else if (environment.equals("desert")) {
                if (item.equals("blanket")) {
                    System.out.println("Sleep");
                } else {
                    System.out.println("Keep moving to stay warm");
                }
            }
        } else {
            System.out.println("Invalid time of day");
        }
    }


}
