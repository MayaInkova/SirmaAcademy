package Files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;


public class ReplaceWord {

    public static void main(String[] args) {
        // Имената на файловете за четене и запис
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        // Думите, които ще заменяме
        String oldWord = "Java";
        String newWord = "HTML";

        // Извикване на функцията за замяна
        replaceWordInFile(inputFile, outputFile, oldWord, newWord);
    }

    // Метод за замяна на дума в текстов файл и записване в нов файл
    public static void replaceWordInFile(String inputFile, String outputFile, String oldWord, String newWord) {
        try {
            // Четем съдържанието на input файла като един текстов низ
            String content = new String(Files.readAllBytes(Paths.get(inputFile)));

            // Заменяме всички срещания на старата дума с новата
            content = content.replace(oldWord, newWord);

            // Записваме резултата в output файла
            Files.write(Paths.get(outputFile), content.getBytes());

            System.out.println("Думата беше успешно заменена и записана в новия файл.");
        } catch (FileNotFoundException e) {
            System.out.println("Грешка: Файлът не е намерен.");
        } catch (IOException e) {
            System.out.println("Възникна грешка при четенето или записа на файла: " + e.getMessage());
        }
    }
}

