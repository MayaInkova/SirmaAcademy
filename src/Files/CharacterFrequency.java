package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        // Създаваме Map, за да съхраняваме честотата на всеки символ
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Използваме try-with-resources, за да затворим автоматично BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            int character;

            // Четем файла символ по символ
            while ((character = reader.read()) != -1) {
                char ch = (char) character;

                // Проверяваме дали символът вече съществува в Map
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }
            //Хвърляме изключение, ако не съществува
        } catch (IOException e) {
            System.err.println("Грешка при четене на файла: " + e.getMessage());
        }

        // Извеждаме честотата на всеки символ на конзолата
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

