package Methods;

import java.util.Scanner;

public class MultiplyEvensByOdds {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Подканяме потребителя да въведе цяло число
        System.out.println("Въведете цяло число:");
        int number = scanner.nextInt(); // Четем числото
        int evenSum = 0; //  четните цифри
        int oddSum = 0; //  нечетните цифри

        // Извършваме цикъл, докато числото не стане 0
        while (number != 0) {
            int digit = number % 10; // Получаваме последната цифра

            // Проверяваме дали цифрата е четна или нечетна
            if (digit % 2 == 0) {
                evenSum += digit; // Добавяме я към сумата на четните цифри
            } else {
                oddSum += digit; // Добавяме я към сумата на нечетните цифри
            }

            number /= 10; // Премахваме последната цифра от числото
        }

        int result = evenSum * oddSum;


        System.out.println("Резултатът от умножението на сумата на четните и нечетните цифри е: " + result);

    }
}

