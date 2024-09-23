package ConditionalStatements;

import java.util.Scanner;

public class MovieClassification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на възрастта на потребителя
        System.out.print("Въведете вашата възраст: ");
        int age = scanner.nextInt();

        // Определяне на категорията на филмите
        if (age < 13) {
            System.out.println("Можете да гледате само филми с оценка U.");
        } else if (age >= 13 && age <= 17) {
            System.out.println("Можете да гледате филми с оценка U и PG-13.");
        } else {
            System.out.println("Можете да гледате всички филми.");
        }
    }
}
