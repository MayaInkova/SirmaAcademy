package Loops;

import java.util.Scanner;

public class CoinsAndNotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Въведете брой монети от 1lv: ");
        int oneLvCoins = scanner.nextInt();

        System.out.print("Въведете брой монети от 2lv: ");
        int twoLvCoins = scanner.nextInt();

        System.out.print("Въведете брой банкноти от 5lv: ");
        int fiveLvBanknotes = scanner.nextInt();

        System.out.print("Въведете целевата сума: ");
        int targetSum = scanner.nextInt();

        // Finding combinations
        boolean foundCombination = false;

        for (int i = 0; i <= oneLvCoins; i++) {
            for (int j = 0; j <= twoLvCoins; j++) {
                for (int k = 0; k <= fiveLvBanknotes; k++) {
                    int total = (i * 1) + (j * 2) + (k * 5);

                    if (total == targetSum) {
                        foundCombination = true;
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", i, j, k, total);
                    }
                }
            }
        }

        if (!foundCombination) {
            System.out.println("Няма налични комбинации за постигане на целевата сума.");
        }

    }
}

