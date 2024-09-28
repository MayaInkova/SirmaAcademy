package Loops;

import java.util.Scanner;

public class NewBuilding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Входни параметри
        int numberOfFloors = Integer.parseInt(scanner.nextLine());
        int roomsPerFloor = Integer.parseInt(scanner.nextLine());

        displayBuilding(numberOfFloors, roomsPerFloor);

        scanner.close();
    }

    public static void displayBuilding(int floors, int rooms) {
        // Итериране от най-горния етаж до най-долния
        for (int floor = floors; floor >= 1; floor--) {
            StringBuilder line = new StringBuilder();

            // Проверка за етажи
            if (floor % 2 == 0) { // Четни етажи - офис
                for (int office = 0; office < rooms; office++) {
                    line.append("O").append(floor).append(office).append(" ");
                }
            } else { // Нечетни етажи - апартаменти
                for (int apartment = 0; apartment < rooms; apartment++) {
                    if (floor == floors) { // Най-горен етаж - големи апартаменти
                        line.append("L").append(floor).append(apartment).append(" ");
                    } else {
                        line.append("A").append(floor).append(apartment).append(" ");
                    }
                }
            }

            System.out.println(line.toString().trim()); // Отпечатване на текущия етаж
        }
    }
}

