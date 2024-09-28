package Loops;

import java.util.Scanner;

public class UniqueCodes {
    // Метод за проверка дали числото е просто
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

    // Метод за генериране на валидни трицифрени кодове
    public static void generateCodes(int limit1, int limit2, int limit3) {
        // Простите числа между 2 и 7
        int[] primeNumbers = {2, 3, 5, 7};

        System.out.println("Валидни трицифрени кодове:");

        for (int first = 0; first <= limit1; first++) {
            if (first % 2 == 0) {  // Първата цифра трябва да бъде четна
                for (int second = 1; second <= limit2; second++) {
                    if (isPrime(second)) {  // Втората цифра трябва да бъде просто число
                        for (int third = 0; third <= limit3; third++) {
                            if (third % 2 == 0) {  // Третата цифра трябва да бъде четна
                                String code = String.format("%d%d%d", first, second, third);
                                System.out.println(code);
                            }
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вход: прочитане на горните граници за цифрите
        System.out.print("Въведете горната граница за първата цифра (1-9): ");
        int limit1 = scanner.nextInt();

        System.out.print("Въведете горната граница за втората цифра (1-9): ");
        int limit2 = scanner.nextInt();

        System.out.print("Въведете горната граница за третата цифра (1-9): ");
        int limit3 = scanner.nextInt();

        // Генериране на валидни кодове
        generateCodes(limit1, limit2, limit3);


    }
}

