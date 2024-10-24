package SetsEndMaps;

import java.util.HashSet;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // HashSet използваме, за да съхраняваме номерата на колите
        HashSet<String> parkingLot = new HashSet<>();


        while (true) {
            // Четене на вход от потребителя
            String input = scanner.nextLine();

            // Проверка за команда "END"
            if (input.equals("END")) {
                break;
            }

            // Разделяне на входа на две части: посока (IN/OUT) и номер на кола
            String[] tokens = input.split(", ");
            String direction = tokens[0];
            String carNumber = tokens[1];

            // Ако командата е "IN", добавяме номера на колата в паркинга
            if (direction.equals("IN")) {
                parkingLot.add(carNumber);
            }
            // Ако командата е "OUT", премахваме номера на колата от паркинга
            else if (direction.equals("OUT")) {
                parkingLot.remove(carNumber);
            }
        }

        // Проверяваме дали има коли в паркинга
        if (parkingLot.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            // Принтираме номерата на колите в паркинга
            for (String car : parkingLot) {
                System.out.println(car);
            }
        }



    }
}
