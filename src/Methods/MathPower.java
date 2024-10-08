package Methods;

import java.util.Scanner;

public class MathPower {
    // Метод за изчисляване на число, повдигнато на степен
    public static double raiseToPower(double number, int power) {
        // Използваме Math.pow за повдигане на степен
        return Math.pow(number, power);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Подканяме потребителя да въведе число
        System.out.println("Моля, въведете число:");
        double number = scanner.nextDouble();

        // Подканяме потребителя да въведе степен
        System.out.println("Моля, въведете степен:");
        int power = scanner.nextInt();

        // Извикваме метода за повдигане на числото на степен
        double result = raiseToPower(number, power);


        System.out.printf("Резултатът е: %.2f%n", result);

    }
}

