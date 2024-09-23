package ConditionalStatements;

import java.util.Scanner;

public class VegetableMarket {
    public static double getPrice(String vegetable, String day) {
        // Prices for working days (Monday to Friday)
        double tomatoPriceWeek = 2.50;
        double onionPriceWeek = 1.20;
        double lettucePriceWeek = 0.85;
        double cucumberPriceWeek = 1.45;
        double pepperPriceWeek = 5.50;

        // Prices for weekend (Saturday, Sunday)
        double tomatoPriceWeekend = 2.80;
        double onionPriceWeekend = 1.30;
        double lettucePriceWeekend = 0.85; // same as weekday
        double cucumberPriceWeekend = 1.75;
        double pepperPriceWeekend = 3.50;

        boolean isWeekend = day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday");
        boolean isWeekday = day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Tuesday") ||
                day.equalsIgnoreCase("Wednesday") || day.equalsIgnoreCase("Thursday") ||
                day.equalsIgnoreCase("Friday");

        // Check vegetable and return appropriate price based on day
        switch (vegetable.toLowerCase()) {
            case "tomato":
                return isWeekend ? tomatoPriceWeekend : (isWeekday ? tomatoPriceWeek : -1);
            case "onion":
                return isWeekend ? onionPriceWeekend : (isWeekday ? onionPriceWeek : -1);
            case "lettuce":
                return isWeekend ? lettucePriceWeekend : (isWeekday ? lettucePriceWeek : -1);
            case "cucumber":
                return isWeekend ? cucumberPriceWeekend : (isWeekday ? cucumberPriceWeek : -1);
            case "pepper":
                return isWeekend ? pepperPriceWeekend : (isWeekday ? pepperPriceWeek : -1);
            default:
                return -1; // invalid vegetable name
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: vegetable, day of the week, and quantity
        System.out.print("Enter vegetable (tomato/onion/lettuce/cucumber/pepper): ");
        String vegetable = scanner.nextLine();

        System.out.print("Enter day of the week: ");
        String day = scanner.nextLine();

        System.out.print("Enter quantity: ");
        double quantity = scanner.nextDouble();

        // Get price based on the vegetable and day of the week
        double pricePerUnit = getPrice(vegetable, day);

        if (pricePerUnit == -1) {
            System.out.println("error");
        } else {
            double totalPrice = pricePerUnit * quantity;
            // Print result rounded to 2 decimal places
            System.out.printf("Total price: %.2f%n", totalPrice);
        }
    }
}

