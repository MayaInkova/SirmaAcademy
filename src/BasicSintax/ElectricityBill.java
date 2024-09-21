package BasicSintax;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на броя на потребените единици електроенергия
        System.out.print("Въведете броя на потребените единици: ");
        double unitsConsumed = scanner.nextDouble();

        // Въвеждане на цената на една единица електроенергия
        System.out.print("Въведете цената на единица (в $): ");
        double ratePerUnit = scanner.nextDouble();

        // Изчисляване на общата сметка по формулата: Обща сметка = (UnitsConsumed * RatePerUnit) + 10
        double totalBill = (unitsConsumed * ratePerUnit) + 10;

        // Отпечатване на резултата
        System.out.printf("Общата месечна сметка за електричество е: %.2f $%n", totalBill);

    }
}
