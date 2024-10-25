package SetsEndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueUsernames {
    public static void main(String[] args) {
        // Сет за съхраняване на уникални имена на потребители с поддържане на реда на добавяне
        LinkedHashSet<String> usernames = new LinkedHashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Въведете имена на потребители (въведете 'END', за да спрете):");

        while (true) {
            String input = scanner.nextLine();

            // Проверка за команда за край на въвеждането
            if (input.equals("END")) {
                break; // Излизане от цикъла
            }

            // Добавяне на името на потребителя в набора
            usernames.add(input);
        }

        // Принтиране на уникалните имена на потребителите в реда на добавяне
        System.out.println("Уникални имена на потребители:");
        for (String username : usernames) {
            System.out.println(username);
        }
    }
}

