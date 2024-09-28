package Loops;

import java.util.Scanner;

public class RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въведете броя на нечетните числа, които искате да отпечатате
        System.out.print("Въведете n (броя на нечетните числа): ");
        int n = scanner.nextInt();

        // Проверка дали n е положително
        if (n <= 0) {
            System.out.println("Моля, въведете положително число.");
            return; // Изход от програмата при невалиден вход
        }

        int sum = 0; // Инициализация на сумата
        System.out.println("Следващите " + n + " нечетни числа са:");

        // Генериране и отпечатване на нечетни числа
        for (int i = 0; i < n; i++) {
            int oddNumber = 2 * i + 1; // Формула за изчисляване на нечетните числа
            System.out.println(oddNumber); // Отпечатване на нечетното число
            sum += oddNumber; // Добавяне на нечетното число към сумата
        }

        // Отпечатване на сумата
        System.out.println("Сумата на нечетните числа е: " + sum);


    }
}

