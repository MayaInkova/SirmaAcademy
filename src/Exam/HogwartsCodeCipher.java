package Exam;

import java.util.Scanner;

public class HogwartsCodeCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Въведете шифрованото съобщение: ");
        String encryptedMessage = scanner.nextLine();

        System.out.println("Въведете стойността на n (колко места назад в азбуката): ");
        int n = scanner.nextInt();

        // Декодиране на съобщението
        String decryptedMessage = decipherMessage(encryptedMessage, n);

        // Изход на декодираното съобщение
        System.out.println("Декодираното съобщение: " + decryptedMessage);

    }

    public static String decipherMessage(String message, int n) {
        StringBuilder decrypted = new StringBuilder();

        for (char ch : message.toCharArray()) {
            if (Character.isLetter(ch)) { // Проверка дали символът е буква
                char base = Character.isLowerCase(ch) ? 'a' : 'A'; // Определяне на базата (малка или голяма буква)
                // Декодиране на буквата
                char decryptedChar = (char) ((ch - base - n + 26) % 26 + base);
                decrypted.append(decryptedChar); // Добавяне на декодирания символ
            } else {
                decrypted.append(ch); // Незаписване на не буквени символи
            }
        }

        return decrypted.toString(); // Връщане на декодираното съобщение
    }
}
