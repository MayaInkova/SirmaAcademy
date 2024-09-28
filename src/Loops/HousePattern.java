package Loops;

import java.util.Scanner;

public class HousePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вход: височина на къщата (трябва да е положително нечетно число)
        System.out.print("Въведете положително нечетно цяло число n, представляващо височината на къщата: ");
        int n = scanner.nextInt();

        // Проверка дали входът е положително нечетно число
        if (n <= 0 || n % 2 == 0) {
            System.out.println("Моля, въведете валидно положително нечетно число.");
            return;
        }

        // Изчисляване на ширината на покрива и стените
        int width = n; // Ширина на къщата (равна на височината за простота)
        int roofHeight = (n / 2) + 1; // Височина на покрива

        // Рисуване на покрива
        for (int i = 0; i < roofHeight; i++) {
            // Отпечатваме водещи интервали за центриране на покрива
            for (int j = 0; j < roofHeight - i - 1; j++) {
                System.out.print(" ");
            }
            // Отпечатваме покрива
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("/");
                if (k < (2 * i)) { // За да избегнем отпечатването на обратно наклонена черта в последната итерация
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Рисуване на стените
        for (int i = 0; i < n / 2; i++) { // Брой редове за стените
            // Рисуваме лявата стена
            System.out.print("|");
            // Отпечатваме пространството вътре в стената
            for (int j = 0; j < width - 2; j++) {
                System.out.print(" ");
            }
            // Рисуваме дясната стена
            System.out.println("|");
        }

        // Рисуване на основата на къщата
        System.out.print("|"); // Лява стена на основата
        for (int j = 0; j < width - 2; j++) {
            System.out.print("_"); // Основа на къщата
        }
        System.out.println("|"); // Дясна стена на основата
    }
}
