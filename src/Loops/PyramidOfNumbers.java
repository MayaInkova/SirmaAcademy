package Loops;

import java.util.Scanner;

public class PyramidOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на числото n
        System.out.print("Въведете число n: ");
        int n = scanner.nextInt();

        int currentNumber = 1;  // Започваме с числото 1
        int row = 1;            // Начало от първи ред

        // Външен цикъл за генериране на редовете
        while (currentNumber <= n) {
            for (int i = 0; i < row; i++) {
                // Ако достигнем или надвишим n, прекратяваме
                if (currentNumber > n) {
                    break;
                }

                // Отпечатваме текущото число и увеличаваме броя
                System.out.print(currentNumber + " ");
                currentNumber++;
            }

            // Прехвърляме на нов ред след всяка група числа
            System.out.println();

            // Увеличаваме броя на числата в следващия ред
            row++;
        }
    }

}
