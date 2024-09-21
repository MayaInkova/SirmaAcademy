package BasicSintax;

import java.util.Scanner;

public class Office {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the cost of the first cabinet
        System.out.print("Enter the cost of the first cabinet: ");
        double firstCabinetCost = scanner.nextDouble();

        // Calculate the cost of the second cabinet (20% cheaper than the first)
        double secondCabinetCost = firstCabinetCost * 0.80;

        // Calculate the combined cost of the first and second cabinets
        double combinedCost = firstCabinetCost + secondCabinetCost;

        // Calculate the cost of the third cabinet (15% more than the combined cost)
        double thirdCabinetCost = combinedCost * 1.15;

        // Calculate the total cost
        double totalCost = firstCabinetCost + secondCabinetCost + thirdCabinetCost;

        // Print the total cost rounded to three decimal places
        System.out.printf("Total cost of the cabinets: %.3f%n", totalCost);
    }
}

