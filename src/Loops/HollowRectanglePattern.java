package Loops;

import java.util.Scanner;

public class HollowRectanglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четене на входни параметри
        System.out.print("Enter the number of rows (n): ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the number of columns (m): ");
        int m = Integer.parseInt(scanner.nextLine());

        // Генериране на и показване на решетката
        displayGrid(n, m);


    }

    public static void displayGrid(int rows, int columns) {
        // Итериране през редовете
        for (int i = 0; i < rows; i++) {
            StringBuilder rowOutput = new StringBuilder();

            // Итериране през колоните
            for (int j = 0; j < columns; j++) {
                // Примерна логика за запълване на решетката
                // Можете да промените логиката за показване на символи
                if ((i + j) % 2 == 0) {
                    rowOutput.append("X "); // Показва X за четни позиции
                } else {
                    rowOutput.append("O "); // Показва O за нечетни позиции
                }
            }

            // Отпечатване на текущия ред
            System.out.println(rowOutput.toString().trim());
        }
    }
}


