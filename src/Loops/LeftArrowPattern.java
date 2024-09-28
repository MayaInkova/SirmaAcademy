package Loops;

import java.util.Scanner;

public class LeftArrowPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на височината на стрелката
        System.out.print("Въведете височина на стрелката: ");
        int n = scanner.nextInt();  // n трябва да е нечетно число за симетрична стрелка

        int mid = n / 2;  // Средната точка на стрелката

        // Горната част на стрелката (включително средния ред)
        for (int i = 0; i <= mid; i++) {
            // Празни интервали
            for (int j = 0; j < mid - i; j++) {
                System.out.print(" ");
            }
            // Звездички
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Долната част на стрелката
        for (int i = mid - 1; i >= 0; i--) {
            // Празни интервали
            for (int j = 0; j < mid - i; j++) {
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
