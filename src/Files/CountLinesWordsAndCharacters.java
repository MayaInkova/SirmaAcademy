package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountLinesWordsAndCharacters {

    public static void main(String[] args) {
        // Името на файла, който ще прочетем
        String inputFile = "input.txt";

        // Извикваме функцията за преброяване на редове, думи и символи
        countFileStatistics(inputFile);
    }

    // Метод за преброяване на редове, думи и символи във файл
    public static void countFileStatistics(String inputFile) {
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;

            // Четем файла ред по ред
            while ((line = reader.readLine()) != null) {

                lineCount++;

                // Броим думите в текущия ред (разделяме по интервали)
                String[] words = line.split("\\s+");
                wordCount += words.length;

                // Добавяме броя символи в текущия ред
                charCount += line.length();
            }


            System.out.println("Number of lines: " + lineCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of characters: " + charCount);
        } catch (IOException e) {
            System.out.println("Възникна грешка при четене на файла: " + e.getMessage());
        }
    }
}

