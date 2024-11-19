package Files;

import java.io.File;

public class CalculateDirectorySize {
    public static void main(String[] args) {
        // Директория, за която искаме да изчислим общия размер на файловете
        String directoryPath = "path/to/your/directory";

        // Създаваме обект за директорията
        File directory = new File(directoryPath);

        // Проверяваме дали пътят води до директория
        if (directory.exists() && directory.isDirectory()) {
            long totalSize = calculateTotalSize(directory);
            System.out.println("Total size: " + totalSize + " bytes");
        } else {
            System.err.println("The path does not exist or is not a directory.");
        }
    }

    // Рекурсивен метод за изчисляване на общия размер на файловете в директорията
    public static long calculateTotalSize(File directory) {
        long totalSize = 0;

        // Получаваме всички файлове и директории в текущата директория
        File[] files = directory.listFiles();

        // Ако има файлове в директорията
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    // Ако е файл, добавяме неговия размер към общия размер
                    totalSize += file.length();
                } else if (file.isDirectory()) {
                    // Ако е директория, извикваме рекурсивно метода за тази поддиректория
                    totalSize += calculateTotalSize(file);
                }
            }
        }

        return totalSize;
    }
}