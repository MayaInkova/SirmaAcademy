package Loops;

import java.util.Scanner;

public class EvenPairs { // Функция за проверка дали число е просто
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вход на потребителя
        System.out.print("Въведете началната стойност на първата двойка (10-90): ");
        int initialPair1 = scanner.nextInt();

        System.out.print("Въведете началната стойност на втората двойка (10-90): ");
        int initialPair2 = scanner.nextInt();

        System.out.print("Въведете разликата за първата двойка (1-9): ");
        int diff1 = scanner.nextInt();

        System.out.print("Въведете разликата за втората двойка (1-9): ");
        int diff2 = scanner.nextInt();

        // Генериране на четирицифрени числа
        for (int i = initialPair1; i <= initialPair1 + diff1; i++) {
            for (int j = initialPair2; j <= initialPair2 + diff2; j++) {
                // Проверка дали и двете числа са прости
                if (isPrime(i) && isPrime(j)) {
                    // Отпечатване на четирицифреното число
                    System.out.println("" + i + j);
                }
            }
        }

    }
}


