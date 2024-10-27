package Strings;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четем текста, който трябва да бъде криптиран
        System.out.print("Въведете текст за криптиране: ");
        String inputText = scanner.nextLine();

        // Създаваме StringBuilder за съхранение на криптирания текст
        StringBuilder encryptedText = new StringBuilder();

        // Обхождаме всеки символ от входния текст
        for (char ch : inputText.toCharArray()) {
            // Преместваме символа с три позиции напред
            char encryptedChar = (char) (ch + 3);

            // Добавяме криптирания символ към резултата
            encryptedText.append(encryptedChar);
        }

        // Отпечатваме криптирания текст
        System.out.println("Криптиран текст: " + encryptedText.toString());

    }
}
