package Loops;

import java.util.Scanner;

public class NumbersUpTo1000EndingInN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въведете цифрата n от потребителя
        System.out.print("Въведете цифра (0-9): ");
        int n = scanner.nextInt();

        // Проверка дали n е валидна цифра
        if (n < 0 || n > 9) {
            System.out.println("Моля, въведете валидна цифра от 0 до 9.");

            return; // Изход от програмата при невалиден вход
        }

        System.out.println("Числата в диапазона [1...1000], които завършват на " + n + ":");

        // Цикъл за числата от 1 до 1000
        for (int i = 1; i <= 1000; i++) {
            // Проверка дали числото завършва на n
            if (i % 10 == n) {
                System.out.println(i);
            }
        }
    }
}
