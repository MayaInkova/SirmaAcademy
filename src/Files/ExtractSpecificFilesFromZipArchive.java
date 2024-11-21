package Files;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.io.File;

public class ExtractSpecificFilesFromZipArchive {
    public static void main(String[] args) {
        // Името на архива (ZIP файл)
        String zipFileName = "archive.zip";
        // Папката, в която ще се извлекат файловете
        String outputDirectory = "extracted_files";

        // Създаваме директория за извлечените файлове, ако не съществува
        File directory = new File(outputDirectory);
        if (!directory.exists()) {
            directory.mkdirs(); // Създава директорията
        }

        // Извличаме .txt файловете от архива
        extractTxtFiles(zipFileName, outputDirectory);
    }

    // Метод за извличане на .txt файловете от ZIP архива
    private static void extractTxtFiles(String zipFileName, String outputDirectory) {
        try (ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFileName))) {
            ZipEntry entry;

            // Обработваме всеки входящ запис в архива
            while ((entry = zipInputStream.getNextEntry()) != null) {
                // Проверяваме дали файлът има разширение .txt
                if (entry.getName().endsWith(".txt")) {
                    System.out.println("Извличам файл: " + entry.getName());

                    // Създаваме пълния път за запис на файла в директорията
                    File extractedFile = new File(outputDirectory, entry.getName());
                    // Създаваме родителската директория, ако не съществува
                    extractedFile.getParentFile().mkdirs();

                    // Извеждаме файла в директорията
                    try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(extractedFile))) {
                        byte[] buffer = new byte[1024];
                        int bytesRead;
                        // Четем от ZIP потока и записваме в изходния файл
                        while ((bytesRead = zipInputStream.read(buffer)) != -1) {
                            bos.write(buffer, 0, bytesRead);
                        }
                    }

                    System.out.println("Файлът е извлечен: " + extractedFile.getAbsolutePath());
                }


                zipInputStream.closeEntry();
            }

        } catch (IOException e) {
            System.err.println("Грешка при извличане на файлове: " + e.getMessage());
        }
    }
}
