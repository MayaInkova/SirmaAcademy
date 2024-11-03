package Exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AurorBattleFormation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Четене на началната формация на идентификаторите на Аурорите
        System.out.println("Въведете началната формация (идентификатори, разделени с запетая):");
        String input = scanner.nextLine();
        String[] initialIds = input.split(",\\s*");

        // Създаване на списък за съхранение на идентификаторите на Аурорите
        List<Integer> formation = new ArrayList<>();
        for (String id : initialIds) {
            formation.add(Integer.parseInt(id.trim()));
        }

        // Обработка на командите до въвеждане на "end"
        String command;
        System.out.println("Въведете команди (написете 'end', за да завършите):");
        while (!(command = scanner.nextLine()).equals("end")) {
            handleCommand(formation, command);
        }

    }

    // Функция за обработка на командите
    public static void handleCommand(List<Integer> formation, String command) {
        String[] parts = command.split("\\s+");
        String action = parts[0];

        switch (action) {
            case "destroy": // Изтриване на Аурор по индекс
                if (parts.length == 2) {
                    int indexToDestroy = Integer.parseInt(parts[1]);
                    if (indexToDestroy >= 0 && indexToDestroy < formation.size()) {
                        formation.remove(indexToDestroy);
                    }
                }
                break;

            case "swap": // Размяна на позициите на двама Аурори
                if (parts.length == 3) {
                    int index1 = Integer.parseInt(parts[1]);
                    int index2 = Integer.parseInt(parts[2]);
                    if (index1 >= 0 && index1 < formation.size() && index2 >= 0 && index2 < formation.size()) {
                        int temp = formation.get(index1);
                        formation.set(index1, formation.get(index2));
                        formation.set(index2, temp);
                    }
                }
                break;

            case "add": // Добавяне на нов Аурор в края на формацията
                if (parts.length == 2) {
                    int newId = Integer.parseInt(parts[1]);
                    formation.add(newId);
                }
                break;

            case "insert": // Вмъкване на нов Аурор на определена позиция
                if (parts.length == 3) {
                    int newId = Integer.parseInt(parts[1]);
                    int indexToInsert = Integer.parseInt(parts[2]);
                    if (indexToInsert >= 0 && indexToInsert <= formation.size()) {
                        formation.add(indexToInsert, newId);
                    }
                }
                break;

            case "center": // Показване на Аурорите в центъра на формацията
                displayCenter(formation);
                return; // Пропускаме печатането на формацията, тъй като "center" го обработва

            default:
                System.out.println("Неизвестна команда!");
                return;
        }

        // Печат на текущата формация след изпълнение на валидна команда
        printFormation(formation);
    }

    // Функция за печат на текущата формация
    public static void printFormation(List<Integer> formation) {
        System.out.println(String.join(" ", formation.stream()
                .map(String::valueOf)
                .toArray(String[]::new)));
    }

    // Функция за показване на централния Аурор или Аурори
    public static void displayCenter(List<Integer> formation) {
        int size = formation.size();
        if (size == 0) {
            System.out.println("Формацията е празна.");
            return;
        }

        if (size % 2 == 1) {
            // Непарен брой: един централен елемент
            int centerIndex = size / 2;
            System.out.println(formation.get(centerIndex));
        } else {
            // Парен брой: два централни елемента
            int centerIndex1 = (size / 2) - 1;
            int centerIndex2 = size / 2;
            System.out.println(formation.get(centerIndex1) + " " + formation.get(centerIndex2));
        }
    }
}

