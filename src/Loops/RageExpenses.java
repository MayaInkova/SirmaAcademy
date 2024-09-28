package Loops;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вход на броя на загубените игри
        int lostGames = Integer.parseInt(scanner.nextLine());

        // Вход на цените на компонентите
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        // Инициализиране на броя на унищожените компоненти
        int headsetsDestroyed = lostGames / 2; // всеки втори загубен игра
        int miceDestroyed = lostGames / 3;      // всеки трети загубен игра
        int keyboardsDestroyed = 0;              // брояч за клавиатури
        int displaysDestroyed = 0;                // брояч за дисплеи

        // Изчисляваме броя на унищожените клавиатури
        for (int i = 1; i <= lostGames; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                keyboardsDestroyed++;
            }
        }

        // Всеки втори клавиатура унищожава дисплея
        displaysDestroyed = keyboardsDestroyed / 2;

        // Изчисляваме общите разходи
        double totalExpenses = (headsetsDestroyed * headsetPrice) +
                (miceDestroyed * mousePrice) +
                (keyboardsDestroyed * keyboardPrice) +
                (displaysDestroyed * displayPrice);

        // Отпечатваме резултата
        System.out.printf("Rage expenses: %.2f lv.%n", totalExpenses);
    }
}

