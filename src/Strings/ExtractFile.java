package Strings;

import java.io.File;
import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четем пътя до файла от потребителя
        System.out.print("Въведете пътя до файла: ");
        String filePath = scanner.nextLine();

        // Създаваме File обект от подадения път
        File file = new File(filePath);

        // Извличаме името на файла (включително разширението)
        String fullFileName = file.getName();

        // Намираме позицията на последната точка (.) в името на файла
        int dotIndex = fullFileName.lastIndexOf(".");

        // Проверяваме дали има точка в името и разделяме името и разширението
        if (dotIndex > 0 && dotIndex < fullFileName.length() - 1) {
            // Извличаме името на файла без разширението
            String fileName = fullFileName.substring(0, dotIndex);

            // Извличаме разширението на файла
            String fileExtension = fullFileName.substring(dotIndex + 1);

            // Печатаме резултата
            System.out.println("Име на файла: " + fileName);
            System.out.println("Разширение на файла: " + fileExtension);
        } else {
            // Ако няма разширение, уведомяваме потребителя
            System.out.println("Невалиден формат на файла или липсва разширение.");
        }
    }
}
