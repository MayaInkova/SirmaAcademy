package Files;

import java.util.Scanner;
import java.io.File;


public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въведете пътя до файла
        System.out.print("Въведете пътя до файла: ");
        String filePath = scanner.nextLine();


        File file = new File(filePath);


        if (file.exists() && file.isFile()) {
            // Извличане на пътя до директорията, без името на файла и разширението
            String parentPath = file.getParent(); // Взема директорията
            String fileName = file.getName();     // Взема името на файла с разширение

            // Отделяне на името и разширението (ако има такова)
            int extensionIndex = fileName.lastIndexOf(".");
            if (extensionIndex > 0) {
                fileName = fileName.substring(0, extensionIndex); // Име на файла без разширението
            }

            // Отпечатване на резултатите
            System.out.println("Път до директорията: " + parentPath);
            System.out.println("Име на файла (без разширение): " + fileName);

            // Размер на файла в байтове
            long fileSizeInBytes = file.length();
            System.out.println("Размер на файла: " + fileSizeInBytes + " байта");
        } else {
            // Ако файлът не съществува или не е валиден
            System.out.println("Файлът не съществува или пътят не е валиден.");
        }
    }
}

