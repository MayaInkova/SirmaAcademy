package Loops;

import java.util.Scanner;

public class PseudoFibonacciSequenceSum {

    // Метод за изчисляване на сумата на първите 'n' числа от Фибоначи
    public static long fibonacciSum(int n) {
        if (n <= 0) return 0;  // Ако n е 0 или отрицателно, връща 0
        long sum = 1;          // Инициализира сумата на 1 (защото първото число от Фибоначи е 1)
        long a = 0, b = 1;     // Първите две числа от Фибоначи: F0 = 0, F1 = 1

        for (int i = 2; i <= n; i++) {
            long next = a + b; // Генерира следващото число от Фибоначи
            sum += next;       // Добавя го към сумата
            a = b;             // Обновява стойностите за следващата итерация
            b = next;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Скенер за въвеждане на число от потребителя
        Scanner scanner = new Scanner(System.in);

        // Искане за въвеждане на положително цяло число
        System.out.print("Въведете положително цяло число: ");
        int n = scanner.nextInt();

        // Проверка дали въведеното число е положително
        if (n <= 0) {
            System.out.println("Моля, въведете положително цяло число.");
        } else {
            // Извиква метода fibonacciSum и отпечатва резултата
            long result = fibonacciSum(n);
            System.out.println("Сумата на първите " + n + " числа от Фибоначи е: " + result);
        }

    }
}

