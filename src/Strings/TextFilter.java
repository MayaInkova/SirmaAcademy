package Strings;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четене на списъка със забранените думи
        System.out.print("Enter the banned words (separated by \", \"): ");
        String[] bannedWords = scanner.nextLine().split(", ");

        // Четене на текста, в който ще се заместват думите
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        // За всяка забранена дума в списъка
        for (String bannedWord : bannedWords) {
            // Генерираме звездички с дължина равна на забранената дума
            String replacement = "*".repeat(bannedWord.length());

            // Заменяме всички срещания на забранената дума с генерираните звездички
            text = text.replace(bannedWord, replacement);
        }

        // Отпечатваме текста с цензурираните думи
        System.out.println("Censored text: " + text);
    }
}

