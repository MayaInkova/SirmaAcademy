package Loops;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // Входни данни
        double availableMoney = Double.parseDouble(scanner.nextLine());
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        // Изчисляване на нужните артикули
        int requiredLightsabers = (int) Math.ceil(numberOfStudents * 1.1);
        int requiredBelts = numberOfStudents - (numberOfStudents / 6);
        int requiredRobes = numberOfStudents;

        // Изчисляване на общата цена
        double totalCost = (requiredLightsabers * lightsaberPrice) +
                (requiredBelts * beltPrice) +
                (requiredRobes * robePrice);

        // Проверка дали парите са достатъчни и отпечатване на резултата
        if (totalCost <= availableMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.%n", totalCost);
        } else {
            double neededMoney = totalCost - availableMoney;
            System.out.printf("George Lucas will need %.2flv more.%n", neededMoney);
        }
    }
}

