package Arrays;

import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на масив от числа (разделени с интервал)
        System.out.println("Въведете елементите на масива (разделени с интервал):");
        String input = scanner.nextLine();

        // Разделяне на входните числа в масив от низове
        String[] array = input.split(" ");

        int evenSum = 0;
        int oddSum = 0;

        // Обхождане на масива и преобразуване на всеки елемент в число
        for (String element : array) {
            try {
                // Парсване на елемента към цяло число
                int number = Integer.parseInt(element);

                // Проверка дали числото е четно или нечетно
                if (number % 2 == 0) {
                    evenSum += number;  // Добавяме към сумата на четните числа
                } else {
                    oddSum += number;   // Добавяме към сумата на нечетните числа
                }
            } catch (NumberFormatException e) {
                // Ако някой от низовете не е валидно число, игнорираме го
                System.out.println("'" + element + "' не е валидно число и ще бъде игнорирано.");
            }
        }

        // Изчисляване на разликата между сумата на четните и нечетните числа
        int difference = evenSum - oddSum;

        // Отпечатване на резултата
        System.out.println("Разликата между сумата на четните и сумата на нечетните числа е: " + difference);


    }
}

