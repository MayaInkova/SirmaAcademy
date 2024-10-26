package Strings;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четене на масив от низове
        System.out.println("Enter an array of strings separated by space:");
        String[] words = scanner.nextLine().split(" "); // Разделяме думите по интервал

        // StringBuilder за натрупване на резултата
        StringBuilder result = new StringBuilder();

        // За всяка дума в масива
        for (String word : words) {
            int repeatCount = word.length(); // Дължината на думата задава броя повторения

            // Повтаряне на думата и добавяне към резултата
            result.append(word.repeat(repeatCount));
        }

        // Отпечатване на резултата
        System.out.println(result.toString());

    }
}
