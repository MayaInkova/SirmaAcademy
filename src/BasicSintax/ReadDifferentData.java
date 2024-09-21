package BasicSintax;

import java.util.Scanner;

public class ReadDifferentData {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        // Четене на текст (String)
        System.out.print("Въведете текст: ");
        String text = scanner.nextLine();

        // Четене на символ (char)
        System.out.print("Въведете символ: ");
        char symbol = scanner.next().charAt(0);

        // Четене на цяло число (int)
        System.out.print("Въведете цяло число: ");
        int integerNumber = scanner.nextInt();

        // Четене на реално число (double)
        System.out.print("Въведете реално число: ");
        double realNumber = scanner.nextDouble();

        // Отпечатване на въведените данни
        System.out.println("Въведен текст: " + text);
        System.out.println("Въведен символ: " + symbol);
        System.out.println("Въведено цяло число: " + integerNumber);
        System.out.println("Въведено реално число: " + realNumber);
    }
}
