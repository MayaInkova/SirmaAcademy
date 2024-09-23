package ConditionalStatements;

import java.util.Scanner;

public class Holiday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане: бюджет и сезон
        System.out.print("Въведете вашия бюджет: ");
        double budget = scanner.nextDouble();

        System.out.print("Въведете сезона (summer/winter): ");
        String season = scanner.next();

        // Планиране и калкулиране на почивката
        planVacation(budget, season);
    }

    public static void planVacation(double budget, String season) {
        String destination = "";
        String accommodation = "";
        double amountSpent = 0;

        // Определяне на дестинацията и процента на разходите на база бюджет и сезон
        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equalsIgnoreCase("summer")) {
                accommodation = "Camp";
                amountSpent = budget * 0.30; // 30% от бюджета за къмпинг през лятото в България
            } else if (season.equalsIgnoreCase("winter")) {
                accommodation = "Hotel";
                amountSpent = budget * 0.70; // 70% от бюджета за хотел през зимата в България
            }
        } else if (budget <= 1000) {
            destination = "Europe";
            if (season.equalsIgnoreCase("summer")) {
                accommodation = "Camp";
                amountSpent = budget * 0.40; // 40% от бюджета за къмпинг през лятото в Европа
            } else if (season.equalsIgnoreCase("winter")) {
                accommodation = "Hotel";
                amountSpent = budget * 0.80; // 80% от бюджета за хотел през зимата в Европа
            }
        } else {
            destination = "Asia";
            accommodation = "Hotel";
            amountSpent = budget * 0.90; // 90% от бюджета за почивка в Азия, независимо от сезона
        }

        // Отпечатване на резултата
        System.out.printf("Някъде в %s%n", destination);
        System.out.printf("%s – %.2f%n", accommodation, amountSpent);
    }
}

