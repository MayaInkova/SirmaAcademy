package Files;

import java.io.*;

public class CopyFileContent {
    public static void main(String[] args) {
        // Пътища към входния и изходния файл
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        // Използваме try-with-resources, за да управляваме автоматично ресурсите
        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(inputFilePath));
             BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(outputFilePath))) {

            // Променлива за съхранение на данни, които ще четем от входния файл
            int byteData;

            // Четем от входния файл и записваме в изходния файл
            while ((byteData = inputStream.read()) != -1) {
                outputStream.write(byteData);  // Записваме всеки байт в изходния файл
            }

            System.out.println("File has been copied successfully!");

        } catch (IOException e) {
            // съобщение за грешка
            System.err.println("Error: " + e.getMessage());
        }
    }
}

