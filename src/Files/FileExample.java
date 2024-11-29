package Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class FileExample {
    public static void main(String[] args) {
        String inputFileName = "numbers.txt";
        String outputFileName = "result.txt";

        // Създаваме на  числата на входния файл
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFileName))) {
            writer.write("10");
            writer.newLine();
            writer.write("20");
            writer.newLine();
            writer.write("30");
            writer.newLine();
            System.out.println("Файлът с числа е създаден: " + inputFileName);
        } catch (IOException e) {
            System.out.println("Възникна грешка при създаване на входния файл: " + e.getMessage());
            return;
        }

        // Четене на числата от входния файл
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    numbers.add(Integer.parseInt(line.trim()));
                } catch (NumberFormatException e) {
                    System.out.println("Невалиден запис във файла: " + line);
                }
            }
            System.out.println("Числата бяха успешно прочетени от файла.");
        } catch (IOException e) {
            System.out.println("Възникна грешка при четене на входния файл: " + e.getMessage());
            return;
        }

        // Изчисляване на сумата на числата
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Сумата на числата е: " + sum);

        // Записване на резултата в изходен файл
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
            writer.write("Сумата на числата е: " + sum);
            System.out.println("Резултатът беше записан във файла: " + outputFileName);
        } catch (IOException e) {
            System.out.println("Възникна грешка при запис на резултата: " + e.getMessage());
        }
    }
}

