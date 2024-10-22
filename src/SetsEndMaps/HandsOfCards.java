package SetsEndMaps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HandsOfCards {
    public static void main(String[] args) {

        // Мапваме хората и техните уникални карти
        HashMap<String, Set<String>> playerCards = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на данни докато не се въведе "JOKER"
        while (true) {
            String input = scanner.nextLine();

            // Ако въведем "JOKER", приключваме въвеждането
            if (input.equalsIgnoreCase("JOKER")) {
                break;
            }

            // Разделяме входа на име и карти
            String[] tokens = input.split(": ");
            String personName = tokens[0];
            String[] cards = tokens[1].split(", ");

            // Ако човекът не съществува в картата, го добавяме с празен сет от карти
            playerCards.putIfAbsent(personName, new HashSet<>());

            // Добавяме уникални карти за съответния човек
            for (String card : cards) {
                playerCards.get(personName).add(card);
            }
        }

        // Изчисляваме и отпечатваме стойностите за всеки играч
        for (Map.Entry<String, Set<String>> entry : playerCards.entrySet()) {
            String playerName = entry.getKey();
            Set<String> cards = entry.getValue();

            int totalValue = calculateHandValue(cards);

            System.out.println(playerName + ": " + totalValue);
        }
    }

    // Метод за изчисляване на стойността на ръката на играча
    private static int calculateHandValue(Set<String> cards) {
        int totalValue = 0;

        for (String card : cards) {
            String power = card.substring(0, card.length() - 1);
            char type = card.charAt(card.length() - 1);

            int powerValue = getPowerValue(power);
            int typeMultiplier = getTypeMultiplier(type);

            totalValue += powerValue * typeMultiplier;
        }

        return totalValue;
    }

    // Метод за връщане на стойността на силата на картата
    private static int getPowerValue(String power) {
        switch (power) {
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;
            case "A":
                return 14;
            default:
                return Integer.parseInt(power); // За числата от 2 до 10
        }
    }

    // Метод за връщане на множителя за типа на картата
    private static int getTypeMultiplier(char type) {
        switch (type) {
            case 'S':
                return 4; // Спатии
            case 'H':
                return 3; // Купи
            case 'D':
                return 2; // Каро
            case 'C':
                return 1; // Пика
            default:
                return 0; // Невалидна карта
        }
    }
}

