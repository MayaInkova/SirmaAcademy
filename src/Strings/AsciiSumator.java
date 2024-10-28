package Strings;

import java.util.Scanner;

public class AsciiSumator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четем първия и втория символ от потребителя
        System.out.println("Въведете първия символ:");
        char firstChar = scanner.nextLine().charAt(0);

        System.out.println("Въведете втория символ:");
        char secondChar = scanner.nextLine().charAt(0);

        // Четем произволен низ
        System.out.println("Въведете произволен низ:");
        String randomString = scanner.nextLine();

        // Определяме ASCII границите между двата символа
        int lowerBound = Math.min(firstChar, secondChar);
        int upperBound = Math.max(firstChar, secondChar);

        int sum = 0;

        // Обхождаме всички символи в низа и добавяме към сумата тези, които са в зададения диапазон
        for (char ch : randomString.toCharArray()) {
            if (ch > lowerBound && ch < upperBound) {
                sum += ch; // Добавяме ASCII стойността на символа
            }
        }

        // Отпечатваме резултата
        System.out.println("Сумата на ASCII стойностите на символите между " + firstChar + " и " + secondChar + " е: " + sum);

    }
}

