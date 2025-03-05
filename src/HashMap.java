import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//Преброява колко пъти се среща една дума в текста

public class HashMap {
    public static void main(String[] args) {
        String text = " Hello, world!";

        // Премахваме пунктуациите и правим всички букви малки
        text = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        // разделяме текста на думи
        String[] words = text.split("\\s+");

        //Използваме HashMap за да преброим думите
        Map<String, Integer> wordCountMap = new java.util.HashMap<>();
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);

        }
        //Сортиране по стойността на мапа
        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(wordCountMap.entrySet());
        sortedEntries.sort((entry1,entry2) -> entry2.getValue().compareTo(entry1.getValue()));


        for (Map.Entry<String, Integer> entry : sortedEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

