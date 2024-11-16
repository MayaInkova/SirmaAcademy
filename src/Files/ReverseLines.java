package Files;

import java.io.*;

public class ReverseLines {
    public static void main(String[] args) {
        // Файлове за вход и изход
        String inputFileName = "input.txt";
        String outputFileName = "output.txt";

        try (
                // Създаване на BufferedReader за четене на входния файл
                BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
                // Създаване на PrintWriter за писане в изходния файл
                PrintWriter writer = new PrintWriter(new FileWriter(outputFileName))
        ) {
            String line;

            // Четене на всеки ред от входния файл
            while ((line = reader.readLine()) != null) {
                // Използване на StringBuilder за обръщане на реда
                String reversedLine = new StringBuilder(line).reverse().toString();

                // Писане на обърнатия ред в изходния файл
                writer.println(reversedLine);
            }

            System.out.println("Процесът е завършен. Проверете файла " + outputFileName);
        } catch (IOException e) {
            // Обработка на грешки при четене/писане на файлове
            System.err.println("Грешка: " + e.getMessage());
        }
    }
}

