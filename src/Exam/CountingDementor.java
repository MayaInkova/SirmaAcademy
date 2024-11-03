package Exam;

import java.util.Scanner;

public class CountingDementor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Входни данни
        System.out.print("Въведете началното количество (n): ");
        int n = scanner.nextInt();

        System.out.print("Въведете увеличението на количеството (m): ");
        int m = scanner.nextInt();

        System.out.print("Въведете броя на часовете (h): ");
        int h = scanner.nextInt();

        // Изчисляване на общия брой убити Деменитори
        int total = (h * n) + (m * ((h - 1) * h) / 2);


        System.out.println("Общ брой Деменитори, убити след " + h + " часа: " + total);
    }
}
