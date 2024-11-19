package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class MergeLinesFromTwoFiles {
    public static void main(String[] args) {
        // Определяме пътя до текстовия файл
        String fileName = "input.txt";

        // Създаваме обект за четене от файл
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            // Сет за съхранение на уникални думи
            Set<String> uniqueWords = new HashSet<>();

            String line;
            // Четем файла ред по ред
            while ((line = br.readLine()) != null) {
                // Разделяме реда на думи, като използваме регулярни изрази за игнориране на пунктуации
                String[] words = line.split("\\W+");

                // Добавяме всяка дума в сет за уникални думи
                for (String word : words) {
                    if (!word.isEmpty()) {
                        // Превръщаме думите в малки букви, за да не се считат различни думи с големи и малки букви
                        uniqueWords.add(word.toLowerCase());
                    }
                }
            }

            // Отпечатваме броя на уникалните думи
            System.out.println("Unique words: " + uniqueWords.size());
        } catch (IOException e) {
            // Ако има грешка при четенето на файла, извеждаме съобщение за грешка
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}

