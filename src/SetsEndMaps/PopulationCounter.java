package SetsEndMaps;

import java.util.*;

public class PopulationCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Картата за съхранение на населението по държави и градове
        Map<String, Map<String, Integer>> countryCityMap = new LinkedHashMap<>();
        // Картата за общото население по държави
        Map<String, Integer> countryPopulationMap = new LinkedHashMap<>();

        // Четем входа, докато не получим "report"
        while (true) {
            String input = scanner.nextLine();
            if ("report".equals(input)) {
                break; // Прекратяваме четенето при "report"
            }

            // Разделяме входния ред на части
            String[] parts = input.split("\\|");
            String city = parts[0]; // Град
            String country = parts[1]; // Държава
            int population = Integer.parseInt(parts[2]); // Население

            // Обновяваме населението на града
            countryCityMap.putIfAbsent(country, new LinkedHashMap<>());
            Map<String, Integer> cities = countryCityMap.get(country);
            cities.put(city, cities.getOrDefault(city, 0) + population);

            // Обновяваме общото население на държавата
            countryPopulationMap.put(country, countryPopulationMap.getOrDefault(country, 0) + population);
        }

        // Сортираме държавите по общо население
        List<Map.Entry<String, Integer>> countryList = new ArrayList<>(countryPopulationMap.entrySet());
        countryList.sort((a, b) -> b.getValue().compareTo(a.getValue())); // Сортиране в низходящ ред

        // Извеждаме резултатите
        for (Map.Entry<String, Integer> countryEntry : countryList) {
            String country = countryEntry.getKey();
            int totalPopulation = countryEntry.getValue();
            System.out.println(country + " | " + totalPopulation);

            // Сортираме градовете в страната по население
            Map<String, Integer> cities = countryCityMap.get(country);
            List<Map.Entry<String, Integer>> cityList = new ArrayList<>(cities.entrySet());
            cityList.sort((a, b) -> b.getValue().compareTo(a.getValue())); // Сортиране в низходящ ред

            for (Map.Entry<String, Integer> cityEntry : cityList) {
                System.out.println("   " + cityEntry.getKey() + " | " + cityEntry.getValue());
            }
        }
    }

}
