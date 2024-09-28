package Loops;

import java.util.Scanner;

public class SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вход: прочитаме n
        System.out.print("Въведете положително цяло число n: ");
        int n = scanner.nextInt();

        // Проверка дали n е положително
        if (n <= 0) {
            System.out.println("Моля, въведете положително цяло число.");
            return;
        }

        // Отпечатване на рамката
        printSquareFrame(n);
    }

    private static void printSquareFrame(int n) {
        // Отпечатване на горната част на рамката
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Отпечатване на страничните части на рамката
        for (int i = 0; i < n - 2; i++) {
            System.out.print("*"); // Ляво звездиче
            for (int j = 0; j < n - 2; j++) {
                System.out.print(" "); // Пробели
            }
            System.out.println("*"); // Дясно звездиче
        }

        // Отпечатване на долната част на рамката, ако n > 1
        if (n > 1) {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
