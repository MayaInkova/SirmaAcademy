import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете реални числа, разделени с интервали:");
        String input = scanner.nextLine();

        // Разделяне на числата по интервали
        String[] numbers = input.split(" ");
        LinkedHashMap<String, Integer> numberCount = new LinkedHashMap<>();

        // Обработване и броене на числата
        for (String num : numbers) {
            // Форматиране на числото до един знак след десетичната запетая
            double realNum = Double.parseDouble(num);
            String formattedNum = String.format("%.1f", realNum);

            // Увеличаване на броя или добавяне на ново число
            numberCount.put(formattedNum, numberCount.getOrDefault(formattedNum, 0) + 1);
        }

        // Отпечатване на резултатите
        for (Map.Entry<String, Integer> entry : numberCount.entrySet()) {

            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}

