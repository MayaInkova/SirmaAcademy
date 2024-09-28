package Loops;

import java.util.Scanner;

public class TreePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вход: прочитаме височината на дървото
        System.out.print("Въведете положително цяло число n, представляващо височината на дървото: ");
        int n = scanner.nextInt();

        // Проверка дали n е положително
        if (n <= 0) {
            System.out.println("Моля, въведете положително цяло число.");
            return;
        }

        // Отпечатване на коледното дърво
        printChristmasTree(n);
    }

    private static void printChristmasTree(int n) {
        // Отпечатване на горната част на дървото
        for (int i = 0; i < n; i++) {
            // Отпечатване на интервали за центриране на звездите
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
        for (int i = 0; i < 2; i++) { // Отпечатване на ствола с височина 2
            for (int j = 0; j < n - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("***"); // Широчина на ствола е 3
        }
    }
}
