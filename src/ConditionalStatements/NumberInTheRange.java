package ConditionalStatements;

import java.util.Scanner;

public class NumberInTheRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Въвеждане на число от потребителя
        System.out.print("Въведи число: ");
        int number = scanner.nextInt();

        // Проверка дали числото е в диапазона [-100, 100] и е различно от 0
        if (number >= -100 && number <= 100 && number != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
