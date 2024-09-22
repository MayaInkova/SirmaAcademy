package ConditionalStatements;

import java.util.Scanner;

public class Grocery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на данни от потребителя
        System.out.print("Въведи продукт (чай, вода, сок, сладки, чипс): ");
        String product = scanner.nextLine().toLowerCase();

        System.out.print("Въведи град (София, Пловдив, Варна): ");
        String city = scanner.nextLine().toLowerCase();

        System.out.print("Въведи количество: ");
        double quantity = scanner.nextDouble();

        // Деклариране на цената
        double price = 0;

        // Проверка на града и продукта и определяне на цената
        switch (city) {
            case "софия":
                if (product.equals("чай")) {
                    price = 0.50;
                } else if (product.equals("вода")) {
                    price = 0.80;
                } else if (product.equals("сок")) {
                    price = 1.20;
                } else if (product.equals("сладки")) {
                    price = 1.45;
                } else if (product.equals("чипс")) {
                    price = 1.60;
                }
                break;

            case "пловдив":
                if (product.equals("чай")) {
                    price = 0.40;
                } else if (product.equals("вода")) {
                    price = 0.70;
                } else if (product.equals("сок")) {
                    price = 1.15;
                } else if (product.equals("сладки")) {
                    price = 1.30;
                } else if (product.equals("чипс")) {
                    price = 1.50;
                }
                break;

            case "варна":
                if (product.equals("чай")) {
                    price = 0.45;
                } else if (product.equals("вода")) {
                    price = 0.70;
                } else if (product.equals("сок")) {
                    price = 1.10;
                } else if (product.equals("сладки")) {
                    price = 1.35;
                } else if (product.equals("чипс")) {
                    price = 1.55;
                }
                break;

            default:
                System.out.println("Невалиден град!");
                return;
        }

        // Изчисляване на крайната сума
        double total = price * quantity;

        // Извеждане на резултата
        System.out.printf("Крайната цена е: %.2f лв.%n", total);
    }
}


