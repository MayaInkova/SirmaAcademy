package Strings;

import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четем входния низ от потребителя
        System.out.print("Въведете низ: ");
        String input = scanner.nextLine();

        // Създаваме три StringBuilder обекта, за да съхраняваме различните видове символи
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder others = new StringBuilder();

        // Обхождаме всеки символ от входния низ
        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                // Ако символът е цифра, добавяме го към digits
                digits.append(ch);
            } else if (Character.isLetter(ch)) {
                // Ако символът е буква, добавяме го към letters
                letters.append(ch);
            } else {
                // Ако символът е друг (не е нито буква, нито цифра), добавяме го към others
                others.append(ch);
            }
        }

        // Печатаме резултата - първо цифрите, после буквите, и накрая другите символи
        System.out.println("Цифри: " + digits.toString());
        System.out.println("Букви: " + letters.toString());
        System.out.println("Други символи: " + others.toString());
    }
}
