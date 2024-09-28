package Loops;

import java.util.Scanner;

public class AlternativeConditions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();  // Четене на цял ред от входа
            String[] parts = line.split(" ");  // Разделяне на числата в масив

            // Проверка дали има данни (броят на числата в реда трябва да е поне 2)
            if (parts.length < 2) continue;

            // Пропускаме първото число и отпечатваме останалите
            for (int i = 1; i < parts.length; i++) {
                System.out.print(parts[i] + " ");
            }
            System.out.println();  // Нов ред след всяко изведено число
        }
    }
}
