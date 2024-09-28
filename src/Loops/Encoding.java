package Loops;

import java.util.Scanner;

public class Encoding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на цяло число от потребителя
        System.out.print("Въведете цяло число: ");
        int number = scanner.nextInt();

        // Конвертиране на числото в низ и обратен ред
        String reversed = new StringBuilder(String.valueOf(number)).reverse().toString();

        // Обработка на всяка цифра в обърнатия низ
        for (char digitChar : reversed.toCharArray()) {
            int digit = Character.getNumericValue(digitChar);

            if (digit == 0) {
                // Ако цифрата е 0, отпечатваме "ZERO"
                System.out.println("ZERO");
            } else {
                // Изчисляваме ASCII символа, добавяйки 33
                char asciiChar = (char) (digit + 33);
                // Отпечатваме символа, повторен толкова пъти, колкото е стойността на цифрата
                System.out.println(String.valueOf(asciiChar).repeat(digit));
            }
        }

    }
}
