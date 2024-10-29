package Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarBattlesEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четем броя на съобщенията
        int n = Integer.parseInt(scanner.nextLine());
        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();

        // Обработка на всяко съобщение
        for (int i = 0; i < n; i++) {
            String message = scanner.nextLine();
            int count = countStarLetters(message);
            String decryptedMessage = decryptMessage(message, count);
            extractInformation(decryptedMessage, attackedPlanets, destroyedPlanets);
        }

        // Печат на резултатите
        System.out.printf("Attacked planets: %d%n", attackedPlanets.size());
        for (String planet : attackedPlanets) {
            System.out.printf("-> %s%n", planet);
        }

        System.out.printf("Destroyed planets: %d%n", destroyedPlanets.size());
        for (String planet : destroyedPlanets) {
            System.out.printf("-> %s%n", planet);
        }

    }

    // Функция за броене на буквите 's', 't', 'a', 'r'
    private static int countStarLetters(String message) {
        int count = 0;
        for (char ch : message.toLowerCase().toCharArray()) {
            if ("star".indexOf(ch) >= 0) {
                count++;
            }
        }
        return count;
    }

    // Декриптиране на съобщението
    private static String decryptMessage(String message, int count) {
        StringBuilder decrypted = new StringBuilder();
        for (char ch : message.toCharArray()) {
            decrypted.append((char) (ch - count));
        }
        return decrypted.toString();
    }

    // Извличане на информация от декриптираното съобщение
    private static void extractInformation(String message, List<String> attacked, List<String> destroyed) {
        // Регулярни изрази за намиране на съответните части от съобщението
        String planetPattern = "@([A-Za-z]+)";
        String populationPattern = ":(\\d+)";
        String attackTypePattern = "!([AD])!";
        String soldierCountPattern = "->(\\d+)";

        Pattern pattern = Pattern.compile(planetPattern + ".*" + populationPattern + ".*" + attackTypePattern + ".*" + soldierCountPattern);
        Matcher matcher = pattern.matcher(message);

        if (matcher.find()) {
            String planet = matcher.group(1);
            int population = Integer.parseInt(matcher.group(2));
            char attackType = matcher.group(3).charAt(0);
            int soldiers = Integer.parseInt(matcher.group(4));

            // Определяне на вида атака
            if (attackType == 'A') {
                attacked.add(planet);
            } else if (attackType == 'D') {
                destroyed.add(planet);
            }
        }
    }
}
