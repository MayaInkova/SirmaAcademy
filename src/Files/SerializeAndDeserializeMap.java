package Files;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class SerializeAndDeserializeMap {
    public static void main(String[] args) {
        // Създаваме HashMap за съхранение на данните
        Map<String, Integer> dataMap = new HashMap<>();
        dataMap.put("Alice", 30);
        dataMap.put("Bob", 25);
        dataMap.put("Charlie", 35);

        // Име на файла, в който ще съхраним картата
        String fileName = "map.ser";

        // Запазваме картата във файл
        saveMapToFile(dataMap, fileName);

        // Зареждаме картата от файла
        Map<String, Integer> loadedMap = loadMapFromFile(fileName);

        // Показваме заредената карта
        System.out.println("Loaded Map: " + loadedMap);
    }

    // Метод за записване на карта във файл
    private static void saveMapToFile(Map<String, Integer> map, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(map);
            System.out.println("Map saved to file: " + fileName);
        } catch (IOException e) {
            System.err.println("Error saving map to file: " + e.getMessage());
        }
    }

    // Метод за зареждане на карта от файл
    @SuppressWarnings("unchecked")
    private static Map<String, Integer> loadMapFromFile(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Map<String, Integer>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading map from file: " + e.getMessage());
        }
        return null;
    }
}
