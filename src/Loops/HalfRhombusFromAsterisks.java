package Loops;

import java.util.Scanner;

public class HalfRhombusFromAsterisks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вход: прочитаме размера на ромба
        System.out.print("Въведете положително цяло число n за размер на ромба: ");
        int n = scanner.nextInt();

        // Проверка дали n е положително
        if (n <= 0) {
            System.out.println("Моля, въведете положително цяло число.");
            return;
        }

        // Отпечатване на ромба
        printRhombus(n);
    }

    private static void printRhombus(int n) {
        // Отпечатване на горната част на ромба
        for (int i = 0; i < n; i++) {
            // Отпечатване на интервали
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

        // Отпечатване на долната част на ромба
        for (int i = n - 2; i >= 0; i--) {
            // Отпечатване на интервали
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
    }
}
