package Arrays;

import java.util.Scanner;

public class LongestSequenceOfIdenticalElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        // Проследяване на най-дългата последователност
        int longestLength = 1;
        int longestElement = numbers[0];
        int currentLength = 1;
        int currentElement = numbers[0];

        // Обхождане на масива
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == currentElement) {
                currentLength++;
            } else {
                currentElement = numbers[i];
                currentLength = 1;
            }

            // Проверка дали намерената последователност е по-дълга
            if (currentLength > longestLength || (currentLength == longestLength && numbers[i] == currentElement)) {
                longestLength = currentLength;
                longestElement = currentElement;
            }
        }

        // Отпечатване на най-дългата последователност
        for (int i = 0; i < longestLength; i++) {
            System.out.print(longestElement + " ");
        }
    }
}
