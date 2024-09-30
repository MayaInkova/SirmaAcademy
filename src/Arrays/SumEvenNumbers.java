package Arrays;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на масив от низове (разделени с интервал)
        System.out.println("Въведете елементите на масива (разделени с интервал):");
        String input = scanner.nextLine();

        // Разделяне на входните низове в масив
        String[] array = input.split(" ");

        int sum = 0;

        // Обхождане на масива и преобразуване на всеки елемент в число
        for (String element : array) {
            try {
                // Парсване на елемента към цяло число
                int number = Integer.parseInt(element);

                // Ако числото е четно, добавяме го към сумата
                if (number % 2 == 0) {
                    sum += number;
                }
            } catch (NumberFormatException e) {
                // Ако някой от низовете не е валидно число, можем да го игнорираме или да покажем съобщение
                System.out.println("'" + element + "' не е валидно число и ще бъде игнорирано.");
            }
        }

        // Отпечатване на сумата на четните числа
        System.out.println("Сумата на четните числа е:" + sum);
    }
}


