package Exception;

import java.util.Scanner;

public class CustomExceptionExample {
    static void checkEven(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException("Грешка: Въведеното число е нечетно!");
        } else {
            System.out.println("Числото е четно.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете число: ");
        int num = scanner.nextInt();

        try {
            checkEven(num);
        } catch (OddNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
