package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProcessOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитане на входните числа
        String[] input = scanner.nextLine().split(" ");
        List<Integer> result = new ArrayList<>();

        // Обхождаме масива и избираме елементите на нечетни позиции (индекси 1, 3, 5, ...)
        for (int i = 1; i < input.length; i += 2) {
            int number = Integer.parseInt(input[i]);
            result.add(number * 2);  // Умножаваме ги по 2 и ги добавяме в списъка
        }

        // Отпечатваме ги в обратен ред
        for (int i = result.size() - 1; i >= 0; i--) {
            System.out.print(result.get(i) + " ");
        }
    }
}
