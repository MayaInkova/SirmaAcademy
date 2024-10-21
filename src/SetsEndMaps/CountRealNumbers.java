package SetsEndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Четем входния ред като низ
        String input = scanner.nextLine();

        // Разделяме входния низ на масив от низове (реални числа)
        String[] numbers = input.split("\\s+");

        // LinkedHashMap, за да запазим реда на появяване на числата
        LinkedHashMap<String, Integer> countMap = new LinkedHashMap<>();

        // Обхождаме масива от числа
        for (String num : numbers) {
            // Преобразуваме числото в double и го форматираме до един знак след десетичната запетая
            double realNumber = Double.parseDouble(num);
            String formattedNumber = String.format("%.1f", realNumber);

            // Актуализираме броя на появяванията в картата (map)
            countMap.put(formattedNumber, countMap.getOrDefault(formattedNumber, 0) + 1);
        }

        // Отпечатваме числата в реда на появяване с техните броеве
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
