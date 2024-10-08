package Methods;

import java.util.Scanner;

public class Shop {


    //Метод за изчисляване на общата ценана поръчка
    public static void calculateTotalPrice(String product, int quantity) {
        double price = 0;

        // Определяме цената на продукта в зависимост от въведения тип
        switch (product) {
            case "coffee":
                price = 1.50;
                break;
            case "water":
                price = 1.00;
                break;
            case "coke":
                price = 1.40;
                break;
            case "snacks":
                price = 2.00;
                break;
            default:
                System.out.println("Невалиден продукт.");
                return;
        }

        // Изчисляваме общата цена
        double totalPrice = price * quantity;


        System.out.printf("Общата цена е: %.2f%n", totalPrice);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Подканяме потребителя да въведе продукт
        System.out.println("Моля, въведете продукт (coffee, water, coke, snacks):");
        String product = scanner.nextLine();

        // Подканяме потребителя да въведе количество
        System.out.println("Моля, въведете количество:");
        int quantity = scanner.nextInt();

        // Извикваме метода
        calculateTotalPrice(product, quantity);

    }
}

