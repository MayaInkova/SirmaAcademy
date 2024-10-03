package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NegativPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитане на входните числа
        String[] input = scanner.nextLine().split(" ");
        List<Integer> result = new ArrayList<>();

        // Обработваме всеки елемент
        for (String s : input) {
            int number = Integer.parseInt(s);

            if (number < 0) {
                // Добавяме отрицателните числа в началото на резултата
                result.add(0, number);
            } else {
                // Добавяме положителните числа и 0 в края на резултата
                result.add(number);
            }
        }

        // Отпечатване на резултата
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
