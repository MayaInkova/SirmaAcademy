package Methods;

import java.util.Scanner;

public class CalculateRectangleArea {

    // Метод за изчисляване на площта на правоъгълник
    public static double calculateRectangleArea(double width, double length) {
        return width * length;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //  потребителя да въведе ширина
        System.out.println("Моля, въведете ширината на правоъгълника:");
        double width = scanner.nextDouble();

        //  потребителя да въведе дължина
        System.out.println("Моля, въведете дължината на правоъгълника:");
        double length = scanner.nextDouble();

        // Извикваме метода за изчисляване на площта
        double area = calculateRectangleArea(width, length);

        // Отпечатваме площта на правоъгълника
        System.out.printf("Площта на правоъгълника е: %.2f%n", area);

    }

}
