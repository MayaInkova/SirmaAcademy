package SetsEndMaps;

import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четем реда с думите
        String input = scanner.nextLine();
        String[] words = input.split("\\s+"); // Разделяме на думи по пробели

        // Обхождаме думите и проверяваме дължината им
        for (String word : words) {
            if (word.length() % 2 == 0) { // Проверка за четна дължина
                System.out.println(word); // Извеждаме думата
            }
        }
    }
}

