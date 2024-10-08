package Methods;

import java.util.Scanner;

public class SingOfIntreger {
    // Метод, който отпечатва знака на дадено цяло число
    public static void printSign(int number) {
        if (number > 0) {
            System.out.println("Числото е положително.");
        } else if (number < 0) {
            System.out.println("Числото е отрицателно.");
        } else {
            System.out.println("Числото е нула.");
        }
    }

    public static void main(String[] args) {
        // Създаваме скенер за въвеждане на число от потребителя
        Scanner scanner = new Scanner(System.in);

        // Подканяме потребителя да въведе число
        System.out.println("Моля, въведете цяло число:");
        int inputNumber = scanner.nextInt();

        // Извикваме метода за отпечатване на знака на числото
        printSign(inputNumber);

    }
}

