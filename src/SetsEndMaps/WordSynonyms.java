package SetsEndMaps;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Създаваме LinkedHashMap за съхраняване на думи и техните синоними
        Map<String, List<String>> synonymMap = new LinkedHashMap<>();

        // Четем числото n (броя на синонимите)
        int n = Integer.parseInt(scanner.nextLine());

        // Четем 2 * n реда
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            // Добавяме синонима към думата в картата
            synonymMap.putIfAbsent(word, new ArrayList<>());
            synonymMap.get(word).add(synonym);
        }

        // Извеждаме думите и техните синоними
        for (Map.Entry<String, List<String>> entry : synonymMap.entrySet()) {
            String word = entry.getKey();
            List<String> synonyms = entry.getValue();
            System.out.println(word + " - " + String.join(", ", synonyms));
        }


    }
}

