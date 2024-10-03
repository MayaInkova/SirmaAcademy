package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExtractANonDecreasingSubsequenceFromAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитане на входния масив от числа
        String[] input = scanner.nextLine().split(" ");
        List<Integer> result = new ArrayList<>();

        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        // Първият елемент винаги е част от подредената последователност
        int currentBiggest = numbers[0];
        result.add(currentBiggest);

        // Обхождане на масива от втория елемент нататък
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] >= currentBiggest) {
                currentBiggest = numbers[i];  // Обновяване на най-голямото число
                result.add(currentBiggest);   // Добавяне на текущото число в резултата
            }
        }

        // Отпечатване на резултата
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

}
