package SetsEndMaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a list of integers (type 'end' to finish):");
        List<Integer> numbers = new ArrayList<>();

        // Четене на входа
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            } else if (scanner.next().equals("end")) {
                break; // Прекратяваме при "end"
            }
        }

        // Сортиране на числата в низходящ ред
        Collections.sort(numbers, Collections.reverseOrder());

        // Определяме колко числа да изведем
        int count = Math.min(3, numbers.size());

        // Извеждаме най-големите 3 числа или по-малко, ако няма толкова
        for (int i = 0; i < count; i++) {
            System.out.println(numbers.get(i));
        }
    }
}
