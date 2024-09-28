package Loops;

import java.util.Scanner;

public class CollatzConjecture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вход на положително цяло число n
        System.out.print("Enter a positive integer n: ");
        int n = Integer.parseInt(scanner.nextLine());

        // Проверка дали n е положително
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Изчисляване и отпечатване на последователността на Колац
            System.out.print("Collatz sequence: ");
            printCollatzSequence(n);
        }

    }

    public static void printCollatzSequence(int n) {
        // Цикъл за генериране на последователността
        while (n != 1) {
            System.out.print(n + " "); // Отпечатване на текущото n
            // Приложение на правилата на Колац
            if (n % 2 == 0) {
                n /= 2; // Делене на 2, ако е четно
            } else {
                n = 3 * n + 1; // Умножение по 3 и добавяне на 1, ако е нечетно
            }
        }
        System.out.print(n); // Отпечатване на 1 в края
    }
}

