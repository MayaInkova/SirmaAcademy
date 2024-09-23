package ConditionalStatements;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на процентния резултат
        System.out.print("Въведете процентния резултат (0 до 100): ");
        int score = scanner.nextInt();

        // Проверка и извеждане на съответната оценка
        if (score >= 90 && score <= 100) {
            System.out.println("Оценката е: A");
        } else if (score >= 80 && score < 90) {
            System.out.println("Оценката е: B");
        } else if (score >= 70 && score < 80) {
            System.out.println("Оценката е: C");
        } else if (score >= 60 && score < 70) {
            System.out.println("Оценката е: D");
        } else if (score >= 0 && score < 60) {
            System.out.println("Оценката е: F");
        } else {
            System.out.println("Невалиден процентен резултат. Моля, въведете число между 0 и 100.");
        }
    }
}
