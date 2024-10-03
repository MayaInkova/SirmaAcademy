package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayManipulations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитане на входния масив от числа
        String[] input = scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();

        // Преобразуване на входните низове в числа и добавяне към списъка
        for (String s : input) {
            numbers.add(Integer.parseInt(s));
        }

        // Обработване на командите
        String command;
        while (!(command = scanner.nextLine()).equals("end")) {
            String[] tokens = command.split(" ");

            switch (tokens[0]) {
                case "Add":
                    // Добавяне на число в края на списъка
                    int addNumber = Integer.parseInt(tokens[1]);
                    numbers.add(addNumber);
                    break;

                case "Remove":
                    // Премахване на число (ако съществува)
                    int removeNumber = Integer.parseInt(tokens[1]);
                    numbers.remove(Integer.valueOf(removeNumber));  // Премахване по стойност
                    break;

                case "RemoveAt":
                    // Премахване на число по индекс
                    int index = Integer.parseInt(tokens[1]);
                    numbers.remove(index);
                    break;

                case "Insert":
                    // Вмъкване на число на даден индекс
                    int insertNumber = Integer.parseInt(tokens[1]);
                    int insertIndex = Integer.parseInt(tokens[2]);
                    numbers.add(insertIndex, insertNumber);
                    break;
            }
        }

        // Отпечатване на крайното състояние на списъка
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

