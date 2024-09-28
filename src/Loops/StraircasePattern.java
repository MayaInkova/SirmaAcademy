package Loops;

import java.util.Scanner;

public class StraircasePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на броя стъпки
        System.out.print("Въведете броя на стъпките: ");
        int n = scanner.nextInt();

        // Цикъл за отпечатване на стъпките
        for (int i = 1; i <= n; i++) {
            // Отпечатваме i звездички за всеки ред
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Превключваме на нов ред след всеки ред звезди
        }
    }
}
