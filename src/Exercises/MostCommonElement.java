package Exercises;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostCommonElement {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        System.out.println(mostFrequentElement(words)); //apple
    }

    public static <T> T mostFrequentElement(List<T> list) {
        Map<T, Integer> frequencyMap = new HashMap<>();

        // Запълваме HashMap със срещанията на всеки елемент
        for (T element : list) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        // Намираме елемента с най-много срещания
        T mostFrequent = null;
        int maxCount = 0;

        for (Map.Entry<T, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        return mostFrequent;
    }
}

