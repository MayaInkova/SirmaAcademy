package Files;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class SerializeCustomObjectList {
    public static void main(String[] args) {
        // Създаваме HashMap за съхранение на данни
        Map<String, Integer> dataMap = new HashMap<>();
        dataMap.put("Alice", 30);    // Добавяме запис с ключ "Alice" и стойност 30
        dataMap.put("Bob", 25);      // Добавяме запис с ключ "Bob" и стойност 25
        dataMap.put("Charlie", 35);  // Добавяме запис с ключ "Charlie" и стойност 35

        // Име на файла, в който ще съхраним картата
        String fileName = "map.ser";

        // Записваме картата във файл
        saveMapToFile(dataMap, fileName);

        // Зареждаме картата от файла
        Map<String, Integer> loadedMap = loadMapFromFile(fileName);

        // Показваме заредената карта в конзолата
        System.out.println("Заредена карта: " + loadedMap);
    }

    // Метод за записване на карта във файл
    private static void saveMapToFile(Map<String, Integer> map, String fileName) {
        // Използваме try-with-resources за автоматично затваряне на потоците
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            // Сериализираме картата и я записваме във файла
            oos.writeObject(map);
            System.out.println("Картата е записана в файл: " + fileName);
        } catch (IOException e) {
            // Ако възникне грешка, извеждаме съобщение за грешка
            System.err.println("Грешка при запис на картата във файл: " + e.getMessage());
        }
    }

    // Метод за зареждане на карта от файл
    @SuppressWarnings("unchecked")  // Потиска предупреждението за неясен тип
    private static Map<String, Integer> loadMapFromFile(String fileName) {
        // Използваме try-with-resources за автоматично затваряне на потоците
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            // Десериализираме картата от файла и я връщаме
            return (Map<String, Integer>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            // Ако възникне грешка при зареждането или ако класът не бъде намерен, извеждаме съобщение за грешка
            System.err.println("Грешка при зареждане на картата от файл: " + e.getMessage());
        }
        return null;  // Ако не можем да заредим картата, връщаме null
    }
}

