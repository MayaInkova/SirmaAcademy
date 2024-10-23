package SetsEndMaps;

import java.util.*;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Създаваме LinkedHashMap за континенти, държави и градове
        Map<String, Map<String, List<String>>> continentMap = new LinkedHashMap<>();

        // Четем данни
        System.out.println("Enter data in the format: continent country city. Type 'end' to stop:");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break; // Прекратяваме четенето при "end"
            }

            String[] parts = input.split(" ");
            if (parts.length != 3) {
                System.out.println("Invalid input. Please enter in the format: continent country city.");
                continue; // Проверка на валидността на входа
            }

            String continent = parts[0];
            String country = parts[1];
            String city = parts[2];

            // Добавяме континента в картата, ако не съществува
            continentMap.putIfAbsent(continent, new LinkedHashMap<>());
            Map<String, List<String>> countryMap = continentMap.get(continent);

            // Добавяме държавата в под-картата, ако не съществува
            countryMap.putIfAbsent(country, new ArrayList<>());
            List<String> cities = countryMap.get(country);

            // Добавяме града в списъка
            cities.add(city);
        }

        // Извеждаме резултата
        for (Map.Entry<String, Map<String, List<String>>> continentEntry : continentMap.entrySet()) {
            String continent = continentEntry.getKey();
            System.out.println(continent + ":");

            Map<String, List<String>> countryMap = continentEntry.getValue();
            for (Map.Entry<String, List<String>> countryEntry : countryMap.entrySet()) {
                String country = countryEntry.getKey();
                List<String> cities = countryEntry.getValue();
                System.out.println("  " + country + " -> " + String.join(", ", cities));
            }
        }
    }
}

