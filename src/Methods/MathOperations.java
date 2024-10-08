package Methods;

import java.util.Scanner;

public class MathOperations {

    // Метод за изчисляване на резултата в зависимост от оператора
    public static double calculate(double num1, String operator, double num2) {
        double result = 0; // Инициализация на променлива за резултата

        // Изпълняваме съответната операция в зависимост от оператора
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) { // Проверка за деление на нула
                    result = num1 / num2;
                } else {
                    System.out.println("Грешка: Деление на нула!"); // Съобщение за грешка
                    return 0; // Връщаме 0 при грешка
                }
                break;
            default:
                System.out.println("Грешка: Невалиден оператор!"); // Съобщение за невалиден оператор
                return 0; // Връщаме 0 при грешка
        }
        return result; // Връщаме резултата
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четем входните данни
        System.out.println("Въведете първото число:");
        double firstNumber = scanner.nextDouble(); // Четем първото число
        scanner.nextLine(); // Консумираме остатъчния нов ред

        System.out.println("Въведете оператор (+, -, *, /):");
        String operator = scanner.nextLine(); // Четем оператора

        System.out.println("Въведете второто число:");
        double secondNumber = scanner.nextDouble(); // Четем второто число

        // Извикваме метода за изчисление
        double result = calculate(firstNumber, operator, secondNumber);

        System.out.printf("Резултат: %.2f%n", result);
    }
}

