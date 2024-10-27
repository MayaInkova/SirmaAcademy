package Strings;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четем входния низ, съдържащ имената, разделени със запетая и интервал
        System.out.print("Въведете потребителски имена, разделени със запетая и интервал: ");
        String input = scanner.nextLine();

        // Разделяме входа на отделни потребителски имена
        String[] usernames = input.split(",\\s*");

        // Обхождаме всяко потребителско име и проверяваме дали е валидно
        for (String username : usernames) {
            if (isValidUsername(username)) {
                // Ако потребителското име е валидно, го отпечатваме
                System.out.println(username);
            }
        }

    }

    // Метод за проверка на валидността на потребителското име
    public static boolean isValidUsername(String username) {
        // Проверяваме дали дължината е между 3 и 16 символа
        if (username.length() < 3 || username.length() > 16) {
            return false;
        }

        // Проверяваме дали потребителското име съдържа само букви, цифри, тирета и долни черти
        for (char ch : username.toCharArray()) {
            if (!Character.isLetterOrDigit(ch) && ch != '-' && ch != '_') {
                return false;
            }
        }

        // Ако всички условия са изпълнени, потребителското име е валидно
        return true;
    }
}

