package SetsEndMaps;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четем реда с думите
        String input = scanner.nextLine();
        String[] words = input.split("\\s+"); // Разделяме на думи по пробели

        // Използваме LinkedHashMap, за да запазим реда на добавяне
        Map<String, Integer> wordCount = new LinkedHashMap<>();

        // Преброяваме всяка дума (в долен регистър)
        for (String word : words) {
            String lowerCaseWord = word.toLowerCase();
            wordCount.put(lowerCaseWord, wordCount.getOrDefault(lowerCaseWord, 0) + 1);
        }

        // Списък за съхранение на думите, които се срещат нечетен брой пъти
        List<String> oddOccurrences = new ArrayList<>();

        // Проверяваме преброените думи
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() % 2 != 0) { // Проверка за нечетен брой
                oddOccurrences.add(entry.getKey());
            }
        }

        // Извеждаме резултатаa
        System.out.println(String.join(" ", oddOccurrences));

    }
}


