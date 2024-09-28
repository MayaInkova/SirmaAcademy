package Loops;

import java.util.Scanner;

public class EqualSumOfOddAndEvenPositions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на две шестцифрени числа
        System.out.print("Въведете първото число (>= 100000): ");
        int start = scanner.nextInt();
        System.out.print("Въведете второто число (<= 300000): ");
        int end = scanner.nextInt();

        boolean found = false; // Флаг за проверка дали има намерени числа

        // Обхождане на числата в диапазона от start до end
        for (int number = start; number <= end; number++) {
            if (isSumEqual(number)) {
                System.out.print(number + " ");
                found = true;
            }
        }

        // Ако няма намерени числа
        if (!found) {
            System.out.println("None");
        }
    }

    // Метод за проверка дали сумата на цифрите на четни и нечетни позиции е равна
    public static boolean isSumEqual(int number) {
        String numStr = Integer.toString(number);

        int oddSum = 0;  // Сума на цифрите на нечетни позиции (1, 3, 5)
        int evenSum = 0; // Сума на цифрите на четни позиции (2, 4, 6)

        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));

            if ((i + 1) % 2 == 0) {
                // Четна позиция (в Java индексите са от 0, затова добавяме 1)
                evenSum += digit;
            } else {
                // Нечетна позиция
                oddSum += digit;
            }
        }

        // Връща true, ако сумите са равни
        return oddSum == evenSum;
    }
}
