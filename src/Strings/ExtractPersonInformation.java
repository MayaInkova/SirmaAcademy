package Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Подканва потребителя да въведе редове с имена и възрасти.
        System.out.println("Въведете редове с имена и възрасти. Въведете 'край' за край на въвеждането:");

        while (true) {
            String input = scanner.nextLine();

            // Проверка за команда за край на въвеждането
            if (input.equalsIgnoreCase("край")) {
                break;
            }

            // Регулярни изрази за намиране на име и възраст
            Pattern namePattern = Pattern.compile("@(.*?)\\|"); // Намира име между @ и |
            Pattern agePattern = Pattern.compile("#(\\d+?)\\*"); // Намира възраст между # и *

            Matcher nameMatcher = namePattern.matcher(input); // Търсене на име
            Matcher ageMatcher = agePattern.matcher(input);   // Търсене на възраст

            // Ако и двете - име и възраст - са намерени, отпечатва резултата
            if (nameMatcher.find() && ageMatcher.find()) {
                String name = nameMatcher.group(1); // Името между @ и |
                String age = ageMatcher.group(1);   // Възрастта между # и *
                System.out.println(name + " is " + age + " years old.");
            } else {
                // Съобщение, ако не е намерено валидно име или възраст
                System.out.println("Не е намерено валидно име и възраст в този ред.");
            }
        }

    }
}
