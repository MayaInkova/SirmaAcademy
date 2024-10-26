package Strings;

import java.util.Scanner;

public class SubStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четене на първия низ (текста, който трябва да се премахва)
        System.out.print("Enter the substring to remove: ");
        String toRemove = scanner.nextLine();

        // Четене на втория низ (основния текст)
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        // Докато имаме срещания на `toRemove` в `mainString`
        while (mainString.contains(toRemove)) {
            mainString = mainString.replace(toRemove, ""); // Премахваме всички срещания на `toRemove`
        }

        // Отпечатваме останалия текст
        System.out.println("Resulting string: " + mainString);
    }
}
