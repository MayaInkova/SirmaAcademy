package Arrays;

import java.util.ArrayList;
import java.util.List;

public class AddAndRemoveElementsFromArray {
    public static void main(String[] args) {
        // входен масив с команди
        String[] commands = {"add", "add", "remove", "add", "add"};

        // списък за съхранение на числата
        List<Integer> numbers = new ArrayList<>();

        // Инициализиране на началното число
        int currentNumber = 1;


        for (String command : commands) {
            if (command.equals("add")) {

                numbers.add(currentNumber);
            } else if (command.equals("remove")) {
                // Премахване на последното число, ако списъкът не е празен
                if (!numbers.isEmpty()) {
                    numbers.remove(numbers.size() - 1);
                }
            }

            currentNumber++;
        }
         //проверка
        if (numbers.isEmpty()) {
            System.out.println("Empty");
        } else {
            for (int number : numbers) {
                System.out.print(number + " ");
            }
        }
    }
}

