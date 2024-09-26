package Loops;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        // Скенер за въвеждане на низ от потребителя
        Scanner scanner = new Scanner(System.in);

        // Искане за въвеждане на низ
        System.out.print("Въведете низ: ");
        String input = scanner.nextLine();

        // Проверка дали низът е палиндром
        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" е палиндром.");
        } else {
            System.out.println("\"" + input + "\" не е палиндром.");
        }


    }

    // Метод за проверка дали низът е палиндром
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Превръщаме низа в малки букви, за да направим проверката нечувствителна към главни/малки букви
        str = str.toLowerCase();

        // Проверяваме дали символите от началото и края съвпадат, докато се движим към центъра
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false; // Ако символите не съвпадат, не е палиндром
            }
            start++;
            end--;
        }
        return true; // Ако всички символи съвпадат, това е палиндром
    }
}

