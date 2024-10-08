package Methods;

import java.util.Scanner;

public class Calculator {
    // Метод за събиране
    public static void add(int a, int b) {
        System.out.println("Резултатът от събирането е: " + (a + b));
    }

    // Метод за умножение
    public static void multiply(int a, int b) {
        System.out.println("Резултатът от умножението е: " + (a * b));
    }

    // Метод за изваждане
    public static void subtract(int a, int b) {
        System.out.println("Резултатът от изваждането е: " + (a - b));
    }

    // Метод за делене
    public static void divide(int a, int b) {
        if (b != 0) {
            System.out.println("Резултатът от деленето е: " + (a / b));
        } else {
            System.out.println("Грешка: деление на нула!");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Подканяме потребителя да въведе команда
        System.out.println("Моля, въведете команда (add, multiply, subtract, divide):");
        String command = scanner.nextLine();

        // Подканяме потребителя да въведе две числа
        System.out.println("Моля, въведете първото число:");
        int firstNumber = scanner.nextInt();

        System.out.println("Моля, въведете второто число:");
        int secondNumber = scanner.nextInt();

        // Извикваме правилния метод в зависимост от командата
        switch (command) {
            case "add":
                add(firstNumber, secondNumber);
                break;
            case "multiply":
                multiply(firstNumber, secondNumber);
                break;
            case "subtract":
                subtract(firstNumber, secondNumber);
                break;
            case "divide":
                divide(firstNumber, secondNumber);
                break;
            default:
                System.out.println("Невалидна команда!");
        }
    }
}

