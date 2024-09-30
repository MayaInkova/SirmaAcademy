package Arrays;

import java.util.Scanner;

public class ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на масив от низове (разделени с интервал)
        System.out.println("Въведете елементите на масива (разделени с интервал):");
        String input = scanner.nextLine();

        // Разделяне на входните низове в масив
        String[] array = input.split(" ");

        // Обръщане на масива чрез разменяне на елементите
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            // Разменяме първия с последния, втория с предпоследния и т.н.
            String temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }

        // Отпечатване на обърнатия масив на един ред, разделен с интервал
        System.out.println("Обърнатият масив е:");
        for (String element : array) {
            System.out.print(element + " ");
        }

    }
}

