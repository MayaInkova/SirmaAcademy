package SetsEndMaps;

import java.util.*;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Set за съхранение на уникалните химически елементи
        Set<String> uniqueElements = new HashSet<>();

        System.out.println("Въведете химични съединения (въведете 'END', за да спрете):");

        // Четене на химични съединения
        while (true) {
            String compound = scanner.nextLine();
            if (compound.equals("END")) {
                break; // Изход от цикъла, ако се въведе "END"
            }

            // Извличане на уникалните елементи от съединението
            extractElements(compound, uniqueElements);
        }

        // Сортиране на уникалните елементи
        List<String> sortedElements = new ArrayList<>(uniqueElements);
        Collections.sort(sortedElements);

        // Принтиране на уникалните елементи в нарастващ ред
        System.out.println("Уникални химически елементи в нарастващ ред:");
        for (String element : sortedElements) {
            System.out.println(element);
        }

    }

    // Метод за извличане на уникални елементи от химическо съединение
    private static void extractElements(String compound, Set<String> uniqueElements) {
        StringBuilder element = new StringBuilder();
        boolean isPreviousUpper = false;

        // Обход на всеки символ в съединението
        for (char c : compound.toCharArray()) {
            if (Character.isUpperCase(c)) {
                // Ако имаме вече натрупано име на елемент, добавяме го в набора
                if (element.length() > 0) {
                    uniqueElements.add(element.toString());
                }
                // Започваме нов елемент
                element.setLength(0); // Изчистваме предишния елемент
                element.append(c);
                isPreviousUpper = true;
            } else if (Character.isLowerCase(c)) {
                // Добавяме малки букви към името на елемента
                if (isPreviousUpper) {
                    element.append(c);
                } else {
                    // Добавяме малка буква, само ако предишната буква не е била главна
                    element.append(c);
                }
            }
        }

        // Добавяне на последния елемент, ако има такъв
        if (element.length() > 0) {
            uniqueElements.add(element.toString());
        }
    }
}
