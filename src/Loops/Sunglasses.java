package Loops;

import java.util.Scanner;

public class Sunglasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вход: прочитаме n
        System.out.print("Въведете цяло число n (3 ≤ n ≤ 100): ");
        int n = scanner.nextInt();

        // Проверка дали n е в допустимия диапазон
        if (n < 3 || n > 100) {
            System.out.println("Невалиден вход. Моля, въведете число между 3 и 100.");
            return;
        }

        // Отпечатване на модела на слънчевите очила
        printSunglasses(n);
    }

    private static void printSunglasses(int n) {
        // Горна част
        System.out.printf("  .-");
        for (int i = 0; i < n; i++) {
            System.out.print("\"");
        }
        System.out.println("-.");

        System.out.print(" .'");
        for (int i = 0; i < 2 * n; i++) {
            System.out.print(" ");
        }
        System.out.println("'.");

        // Част с очите
        System.out.print("/  ");
        for (int i = 0; i < (n - 1); i++) {
            System.out.print(" ");
        }
        System.out.print("O"); // Ляво око
        for (int i = 0; i < (n - 1); i++) {
            System.out.print(" ");
        }
        System.out.print("O"); // Дясно око
        System.out.println("  \\");

        // Средна част
        System.out.print("|");
        for (int i = 0; i < (n - 1); i++) {
            System.out.print(" ");
        }
        System.out.print(" ".repeat(2)); // Разстояние между очите
        System.out.print("|");
        for (int i = 0; i < (n - 1); i++) {
            System.out.print(" ");
        }
        System.out.println("|");

        // Част с моста
        System.out.print("|    \\"); // Мост
        for (int i = 0; i < (n - 2); i++) {
            System.out.print(" ");
        }
        System.out.print("/");
        System.out.print(" ".repeat(2));
        System.out.println("|");

        // Долна част
        System.out.print(" \\    '");
        for (int i = 0; i < (n - 2); i++) {
            System.out.print("-");
        }
        System.out.println("'/");

        // Закриване на долната част
        System.out.print("  '. ");
        for (int i = 0; i < 2 * n; i++) {
            System.out.print(" ");
        }
        System.out.print(".'");
        System.out.println();

        System.out.print("    '-");
        for (int i = 0; i < n; i++) {
            System.out.print("'");
        }
        System.out.println("-");
    }
}
