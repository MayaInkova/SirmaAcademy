package SetsEndMaps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        // Използваме TreeMap за подреждане на символите по азбучен ред
        TreeMap<Character, Integer> charCountMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);

        // Четене на текст от конзолата
        System.out.println("Въведете текст:");
        String inputText = scanner.nextLine();

        // Превръщаме текста в масив от символи
        char[] characters = inputText.toCharArray();

        // Преброяване на символите
        for (char ch : characters) {
            // Ако символът вече съществува в картата, увеличаваме стойността
            // В противен случай го добавяме с начална стойност 1
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Отпечатваме резултатите
        System.out.println("\nСрещания на символите:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' -> " + entry.getValue() + " пъти");
        }

    }
}

