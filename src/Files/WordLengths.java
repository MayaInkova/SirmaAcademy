package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordLengths {
      public static void main(String[] args) {
        // Използваме try-with-resources, за да затворим автоматично BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String line;

            // Четем всяка линия от файла
            while ((line = reader.readLine()) != null) {
                // Разделяме линията на думи въз основа на интервали
                String[] words = line.split("\\s+");

                // Принтираме дължината на всяка дума
                for (String word : words) {
                    System.out.print(word.length() + ", ");
                }
            }
            // Добавяме нов ред накрая, за да избегнем запетая в края.
            System.out.println();
        } catch (IOException e) {
            // Ако има грешка при четенето на файла, извеждаме съобщение за грешка
            System.err.println("Грешка при четене на файла: " + e.getMessage());
        }
    }
}
