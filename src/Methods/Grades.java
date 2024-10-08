package Methods;

import java.util.Scanner;

public class Grades {
    // Метод, който получава оценка и отпечатва съответната оценка с думи
    public static void printGradeInWords(double grade) {
        if (grade >= 2.00 && grade <= 2.99) {
            System.out.println("Fail");
        } else if (grade >= 3.00 && grade <= 3.49) {
            System.out.println("Poor");
        } else if (grade >= 3.50 && grade <= 4.49) {
            System.out.println("Good");
        } else if (grade >= 4.50 && grade <= 5.49) {
            System.out.println("Very good");
        } else if (grade >= 5.50 && grade <= 6.00) {
            System.out.println("Excellent");
        } else {
            System.out.println("Невалидна оценка. Оценката трябва да бъде между 2.00 и 6.00.");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Подканяме потребителя да въведе оценка
        System.out.println("Моля, въведете оценка (между 2.00 и 6.00):");
        double grade = scanner.nextDouble();

        // Извикваме метода, който отпечатва съответната оценка с думи
        printGradeInWords(grade);
    }
}

