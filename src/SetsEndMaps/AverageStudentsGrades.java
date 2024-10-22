package SetsEndMaps;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        TreeMap<String, ArrayList<Double>> studentRecords = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Въведете име на ученик или 'стоп' за край:");
            String name = scanner.nextLine();

            // Ако потребителят въведе 'стоп', прекъсваме цикъла
            if (name.equalsIgnoreCase("стоп")) {
                break;
            }

            // Проверяваме дали ученикът вече съществува в записа
            studentRecords.putIfAbsent(name, new ArrayList<>());

            System.out.println("Въведете оценка за " + name + " (или 'стоп' за край на въвеждането на оценки):");
            while (true) {
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("стоп")) {
                    break;
                }

                try {
                    double grade = Double.parseDouble(input);
                    studentRecords.get(name).add(grade);
                } catch (NumberFormatException e) {
                    System.out.println("Моля, въведете валидна оценка или 'стоп' за край.");
                }
            }
        }

        // Извеждаме резултатите, подредени по имена
        System.out.println("\nСтудентски записи:");
        for (Map.Entry<String, ArrayList<Double>> entry : studentRecords.entrySet()) {
            String studentName = entry.getKey();
            ArrayList<Double> grades = entry.getValue();
            double average = calculateAverage(grades);
            System.out.println("Ученик: " + studentName);
            System.out.println("Оценки: " + grades);
            System.out.println("Средна оценка: " + average + "\n");
        }


    }

    // Метод за изчисляване на средната оценка
    private static double calculateAverage(ArrayList<Double> grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return grades.isEmpty() ? 0 : sum / grades.size();
    }
}
