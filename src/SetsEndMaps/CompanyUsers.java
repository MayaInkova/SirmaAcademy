package SetsEndMaps;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Карта за съхранение на компаниите и техните служители
        Map<String, Set<String>> companyEmployees = new LinkedHashMap<>();

        // Въвеждане на данни до командата "End"
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            // Разделяме входа по " -> ", за да получим името на компанията и ID-то на служителя
            String[] tokens = input.split(" -> ");
            String companyName = tokens[0];
            String employeeId = tokens[1];

            // Ако компанията не съществува в картата, я добавяме с нов HashSet за служители
            companyEmployees.putIfAbsent(companyName, new LinkedHashSet<>());

            // Добавяме ID-то на служителя към компанията (HashSet предотвратява дублирането)
            companyEmployees.get(companyName).add(employeeId);

            // Четене на следващия ред
            input = scanner.nextLine();
        }

        // Принтиране на компаниите и техните служители
        for (Map.Entry<String, Set<String>> entry : companyEmployees.entrySet()) {
            String companyName = entry.getKey();
            Set<String> employees = entry.getValue();

            // Принтираме името на компанията
            System.out.println(companyName);

            // Принтираме всяко ID на служител във формата с " -- "
            for (String employeeId : employees) {
                System.out.println("-- " + employeeId);
            }
        }
    }
}
