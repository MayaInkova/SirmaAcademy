package SetsEndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четем входния низ
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Използваме LinkedHashMap, за да запазим реда на добавяне
        Map<Character, Integer> characterCount = new LinkedHashMap<>();

        // Обхождаме всеки символ в низа
        for (char ch : input.toCharArray()) {
            if (ch != ' ') { // Игнорираме пространствата
                characterCount.put(ch, characterCount.getOrDefault(ch, 0) + 1);
            }
        }

        // Извеждаме резултатите
        for (Map.Entry<Character, Integer> entry : characterCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

