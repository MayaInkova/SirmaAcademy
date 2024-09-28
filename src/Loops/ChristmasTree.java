package Loops;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вход: прочитаме n
        System.out.print("Въведете цяло число n (1 ≤ n ≤ 100): ");
        int n = scanner.nextInt();

        // Проверка дали n е в допустимия диапазон
        if (n < 1 || n > 100) {
            System.out.println("Невалиден вход. Моля, въведете число между 1 и 100.");
            return;
        }

        // Отпечатване на модела на коледното дърво
        printChristmasTree(n);
    }

    private static void printChristmasTree(int n) {
        // Отпечатване на горната част на дървото
        for (int i = 0; i < n; i++) {
            // Отпечатване на интервали за центриране
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Отпечатване на звездите
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            // Превод на ред
            System.out.println();
        }

        // Отпечатване на ствола на дървото
        for (int i = 0; i < 2; i++) { // Долна част на дървото с 2 реда
            for (int j = 0; j < n - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("***"); // Широчина на ствола
        }
    }
}
