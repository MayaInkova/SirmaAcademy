package SetsEndMaps;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class WarGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитаме картите на двамата играчи
        LinkedHashSet<Integer> firstPlayerDeck = new LinkedHashSet<>();
        LinkedHashSet<Integer> secondPlayerDeck = new LinkedHashSet<>();

        // Четене на първия играч (20 уникални карти)
        String[] firstPlayerCards = scanner.nextLine().split(" ");
        for (String card : firstPlayerCards) {
            firstPlayerDeck.add(Integer.parseInt(card));
        }

        // Четене на втория играч (20 уникални карти)
        String[] secondPlayerCards = scanner.nextLine().split(" ");
        for (String card : secondPlayerCards) {
            secondPlayerDeck.add(Integer.parseInt(card));
        }

        int round = 0; // Максимум 50 рунда

        // Цикъл за игра, която продължава максимум 50 рунда
        while (!firstPlayerDeck.isEmpty() && !secondPlayerDeck.isEmpty() && round < 50) {
            round++;

            // Взимаме най-горната карта на всеки играч
            Iterator<Integer> firstIterator = firstPlayerDeck.iterator();
            Iterator<Integer> secondIterator = secondPlayerDeck.iterator();

            int firstCard = firstIterator.next();
            int secondCard = secondIterator.next();

            // Премахваме картите от върха на дековете
            firstPlayerDeck.remove(firstCard);
            secondPlayerDeck.remove(secondCard);

            // Сравняваме картите на двамата играчи
            if (firstCard > secondCard) {
                // Първият играч печели картите
                firstPlayerDeck.add(firstCard);
                firstPlayerDeck.add(secondCard);
            } else if (secondCard > firstCard) {
                // Вторият играч печели картите
                secondPlayerDeck.add(firstCard);
                secondPlayerDeck.add(secondCard);
            }
            // Ако картите са равни, няма победител в рунда
        }

        // Проверяваме кой печели играта
        if (firstPlayerDeck.size() > secondPlayerDeck.size()) {
            System.out.println("First player wins!");
        } else if (secondPlayerDeck.size() > firstPlayerDeck.size()) {
            System.out.println("Second player wins!");
        } else {
            System.out.println("Draw!");
        }
    }
}


