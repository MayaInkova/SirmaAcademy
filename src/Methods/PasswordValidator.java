package Methods;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Въведете паролата за валидиране:");
        String password = scanner.nextLine(); // Четем паролата от потребителя

        validatePassword(password);

    }

    // Метод за валидиране на паролата
    public static void validatePassword(String password) {
        boolean isValid = true; // Флаг за валидност на паролата

        // Проверка на дължината на паролата
        if (password.length() < 6 || password.length() > 10) {
            System.out.println("Паролата трябва да бъде между 6 и 10 символа.");
            isValid = false; // Задаваме флага на false
        }

        // Проверка за допустими символи
        if (!password.matches("[a-zA-Z0-9]+")) {
            System.out.println("Паролата трябва да съдържа само букви и цифри.");
            isValid = false; // Задаваме флага на false
        }

        // Проверка за минимум 2 цифри
        int digitCount = 0; // Брояч за цифри
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        if (digitCount < 2) {
            System.out.println("Паролата трябва да има поне 2 цифри.");
            isValid = false; // Задаваме флага на false
        }

        // Проверка на валидността на паролата
        if (isValid) {
            System.out.println("Паролата е валидна.");
        }
    }
}


