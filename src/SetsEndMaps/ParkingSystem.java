package SetsEndMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ParkingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Създаваме HashMap за съхранение на потребителите и техните регистрационни номера
        Map<String, String> parkingData = new HashMap<>();

        // Четем броя на командите
        int n = Integer.parseInt(scanner.nextLine());

        // Обработваме всяка команда
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String command = tokens[0];
            String username = tokens[1];

            if (command.equals("register")) {
                String licensePlateNumber = tokens[2];

                // Проверяваме дали потребителят вече е регистриран
                if (parkingData.containsKey(username)) {
                    System.out.printf("ERROR: already registered with plate number %s%n", parkingData.get(username));
                } else {
                    // Регистрираме нов потребител
                    parkingData.put(username, licensePlateNumber);
                    System.out.printf("%s registered %s successfully.%n", username, licensePlateNumber);
                }
            } else if (command.equals("unregister")) {
                // Проверяваме дали потребителят съществува в базата данни
                if (!parkingData.containsKey(username)) {
                    System.out.printf("ERROR: user %s not found.%n", username);
                } else {
                    // Отписваме потребителя
                    parkingData.remove(username);
                    System.out.printf("%s unregistered successfully.%n", username);
                }
            }
        }

        // Извеждаме регистрираните потребители и техните регистрационни номера
        for (Map.Entry<String, String> entry : parkingData.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }
    }
}
