package BasicSintax;

import java.util.Scanner;

public class WaterConsumption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на общата седмична консумация на вода в литри
        System.out.print("Въведете общата седмична консумация на вода (в литри): ");
        double totalWeeklyConsumption = scanner.nextDouble();

        // Въвеждане на броя на хората в домакинството
        System.out.print("Въведете броя на хората в домакинството: ");
        int numberOfPeople = scanner.nextInt();

        // Изчисляване на дневната консумация на човек със формулата:
        // Daily consumption per person = Total weekly consumption / 7 / Number of people
        double dailyConsumptionPerPerson = totalWeeklyConsumption / 7 / numberOfPeople;

        // Отпечатване на резултата
        System.out.printf("Дневната консумация на вода на човек е: %.2f литра%n", dailyConsumptionPerPerson);

    }
}



