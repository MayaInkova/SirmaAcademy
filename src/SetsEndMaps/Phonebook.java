package SetsEndMaps;

import java.util.HashMap;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        // Използваме HashMap за съхранение на телефонния указател
        HashMap<String, String> phonebook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Четене на данни от конзолата за попълване на телефонния указател
        while (true) {
            System.out.println("Въведете име и телефонен номер (или 'search' за търсене):");
            String input = scanner.nextLine();

            // Проверяваме дали командата е 'search'
            if (input.equalsIgnoreCase("search")) {
                break;
            }

            // Разделяме входа на име и номер
            String[] tokens = input.split("\\s+");
            if (tokens.length == 2) {
                String name = tokens[0];
                String phoneNumber = tokens[1];

                // Добавяне или обновяване на запис в указателя
                phonebook.put(name, phoneNumber);
            } else {
                System.out.println("Невалиден вход. Моля, въведете име и номер.");
            }
        }

        // Изпълняваме търсене в телефонния указател
        while (true) {
            System.out.println("Въведете име за търсене (или 'stop' за край):");
            String name = scanner.nextLine();

            // Проверка дали командата е 'stop'
            if (name.equalsIgnoreCase("stop")) {
                break;
            }

            // Търсене на името в указателя и отпечатване на резултата
            if (phonebook.containsKey(name)) {
                System.out.println(name + " -> " + phonebook.get(name));
            } else {
                System.out.println("Contact " + name + " not found.");
            }
        }
    }
}

