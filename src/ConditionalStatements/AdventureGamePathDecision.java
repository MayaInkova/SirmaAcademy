package ConditionalStatements;

import java.util.Scanner;

public class AdventureGamePathDecision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: tools in the right and left hand
        System.out.print("Enter the tool in your right hand: ");
        String rightHand = scanner.nextLine().trim().toLowerCase();

        System.out.print("Enter the tool in your left hand: ");
        String leftHand = scanner.nextLine().trim().toLowerCase();

        // Decision making based on the tools
        if (rightHand.equals("sword")) {
            if (leftHand.equals("shield")) {
                System.out.println("Path to the castle");
            } else {
                System.out.println("Path to the forest");
            }
        } else if (rightHand.equals("map")) {
            if (leftHand.equals("coins")) {
                System.out.println("Go to the town");
            } else {
                System.out.println("Camp");
            }
        } else {
            System.out.println("Wander aimlessly");
        }
    }
}
