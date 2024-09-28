package Loops;

import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Входни параметри
        int first = Integer.parseInt(scanner.nextLine()); // Начало на интервала
        int second = Integer.parseInt(scanner.nextLine()); // Край на интервала
        int magicNumber = Integer.parseInt(scanner.nextLine()); // Магическо число

        int combinationCount = 0; // Брояч на комбинации
        boolean foundCombination = false; // Флаг за намерена комбинация
        int sequenceNumber = 0; // Номерация на комбинациите

        // Проверка на всички комбинации в зададения интервал
        for (int i = first; i <= second; i++) {
            for (int j = first; j <= second; j++) {
                combinationCount++; // Увеличаване на броя на комбинациите
                sequenceNumber++; // Номериране на комбинацията

                if (i + j == magicNumber) { // Проверка дали сумата на комбинацията е равна на магическото число
                    System.out.printf("Combination %d - (%d + %d = %d)%n", sequenceNumber, i, j, magicNumber);
                    foundCombination = true; // Поставяне на флага, че е намерена комбинация
                    break; // Излизане от втория цикъл, ако е намерена комбинация
                }
            }
            if (foundCombination) {
                break; // Излизане от първия цикъл, ако е намерена комбинация
            }
        }

        // Проверка дали е намерена комбинация
        if (!foundCombination) {
            System.out.printf("%d combinations - neither equals %d%n", combinationCount, magicNumber);
        }
    }
}

