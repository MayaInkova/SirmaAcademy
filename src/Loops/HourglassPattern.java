package Loops;

import java.util.Scanner;

public class HourglassPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на размера на часовниковото стъкло
        System.out.print("Въведете размера на часовниковото стъкло: ");
        int n = scanner.nextInt();  // Размерът трябва да бъде нечетно число за симетрия

        // Горната част на часовниковото стъкло
        for (int i = 0; i < n; i++) {
            // Празни интервали
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Звездички
            for (int k = 0; k < n - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Долната част на часовниковото стъкло
        for (int i = 1; i < n; i++) {
            // Празни интервали
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Звездички
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
