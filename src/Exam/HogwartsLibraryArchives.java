package Exam;

import java.util.Scanner;

public class HogwartsLibraryArchives {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Въведете записите (разделени с ','): ");
        String inputRecords = scanner.nextLine();

        // Разделяне на записа в масив
        String[] records = inputRecords.split(",\\s*");


        System.out.println("Въвеждане на  търсения запис ");
        String searchTerm = scanner.nextLine();

        // Намиране на първата и последната поява
        findFirstAndLastOccurrence(records, searchTerm);


    }

    public static void findFirstAndLastOccurrence(String[] records, String searchTerm) {
        int firstIndex = -1; // първа поява
        int lastIndex = -1;  // последна поява

        // Итерация през масива, за да намерим индексите
        for (int i = 0; i < records.length; i++) {
            if (records[i].equals(searchTerm)) {
                if (firstIndex == -1) { // Първа поява
                    firstIndex = i;
                }
                lastIndex = i; // Последна
            }
        }

        // Изход на резултатите
        if (firstIndex == -1) {
            System.out.println("Record not found.");
        } else {
            System.out.println("First Occurrence: " + firstIndex);
            System.out.println("Last Occurrence: " + lastIndex);
        }
    }
}

