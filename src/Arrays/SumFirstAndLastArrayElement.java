package Arrays;

import java.util.Scanner;

public class SumFirstAndLastArrayElement {

    public static void sumFirstAndLast(String[] arr) {
        // Проверка дали масивът не е празен или съдържа по-малко от 2 елемента
        if (arr == null || arr.length == 0) {
            System.out.println("Масивът е празен.");
            return;
        }

        // Променливи за първия и последния елемент
        String firstElement = arr[0];
        String lastElement = arr[arr.length - 1];

        try {
            // Преобразуване на елементите към цели числа и изчисляване на сумата
            int sum = Integer.parseInt(firstElement) + Integer.parseInt(lastElement);
            System.out.println("Сумата на първия и последния елемент е: " + sum);
        } catch (NumberFormatException e) {
            // Ако има грешка при преобразуването към числа, изведи съобщение
            System.out.println("Елементите не са числа.");
        }
    }

    public static void main(String[] args) {
        // Създаваме скенер за четене на вход от потребителя
        Scanner scanner = new Scanner(System.in);

        // Въвеждаме размер на масива
        System.out.print("Въведете броя на елементите в масива: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // Консумира новия ред след числото

        // Създаваме масив от низове със зададения размер
        String[] inputArray = new String[size];

        // Четем всеки елемент от потребителя
        for (int i = 0; i < size; i++) {
            System.out.print("Въведете елемент " + (i + 1) + ": ");
            inputArray[i] = scanner.nextLine();
        }

        // Извикваме функцията за сумиране на първия и последния елемент
        sumFirstAndLast(inputArray);
    }
}

