package SetsEndMaps;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четем броя на редовете с данни
        int n = Integer.parseInt(scanner.nextLine());

        // HashMap, в която съхраняваме учениците и техните списъци с оценки
        Map<String, List<Double>> studentGrades = new HashMap<>();

        // Четене на n двойки редове: име на ученик и оценка
        for (int i = 0; i < n; i++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            // Ако ученикът вече съществува, добавяме новата оценка към списъка му
            studentGrades.putIfAbsent(studentName, new ArrayList<>());
            studentGrades.get(studentName).add(grade);
        }

        // Създаваме нова Map за учениците с оценка >= 4.50
        Map<String, Double> averageGrades = new LinkedHashMap<>();

        // Изчисляваме средната оценка за всеки ученик и добавяме в новата Map
        for (Map.Entry<String, List<Double>> entry : studentGrades.entrySet()) {
            String studentName = entry.getKey();
            List<Double> grades = entry.getValue();

            // Изчисляваме средната оценка
            double average = grades.stream().mapToDouble(Double::doubleValue).average().orElse(0);

            // Ако средната оценка е >= 4.50, добавяме ученика в Map
            if (average >= 4.50) {
                averageGrades.put(studentName, average);
            }
        }

        // Принтираме резултатите в желания формат
        for (Map.Entry<String, Double> entry : averageGrades.entrySet()) {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
        }
    }
}

