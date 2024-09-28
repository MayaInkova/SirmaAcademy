package Loops;

import java.util.Scanner;

public class Change {
    public static int calculateCoins(int amount) {
        // Определяме монетните номинали в стотинки
        int[] coinDenominations = {25, 10, 5, 1};
        int coinsNeeded = 0;

        // Обхождаме номиналите
        for (int coin : coinDenominations) {
            if (amount == 0) {
                break; // Ако сумата е нула, спираме
            }
            // Изчисляваме колко монети от текущия номинал са нужни
            coinsNeeded += amount / coin;
            // Обновяваме оставащата сума
            amount %= coin;
        }

        return coinsNeeded;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вход: Прочитане на сумата в стотинки
        System.out.print("Въведете сумата за връщане (в стотинки): ");
        int amount = scanner.nextInt();

        if (amount < 0) {
            System.out.println("Моля, въведете неотрицателна сума.");
            return;
        }

        int result = calculateCoins(amount);
        System.out.println("Минимален брой монети, необходими: " + result);

        scanner.close();
    }
}

