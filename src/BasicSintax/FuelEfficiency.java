package BasicSintax;

import java.util.Scanner;

public class FuelEfficiency {
    public static void main(String[] args) {
        // Създаваме обект от класа Scanner за четене на входа от конзолата
        Scanner scanner = new Scanner(System.in);

        // Прочитаме разстоянието D от конзолата
        System.out.print("Въведете изминатото разстояние в километри: ");
        double distance = scanner.nextDouble();

        // Прочитаме количеството изразходвано гориво F
        System.out.print("Въведете изразходваното гориво в литри: ");
        double fuel = scanner.nextDouble();

        // Изчисляваме разхода на гориво по формулата Fuel Efficiency = D / F
        if (fuel != 0) {  // Проверяваме дали горивото не е 0, за да избегнем деление на 0
            double fuelEfficiency = distance / fuel;

            // Отпечатваме резултата
            System.out.printf("Разходът на гориво е: %.2f км/л%n", fuelEfficiency);
        } else {
            System.out.println("Изразходваното гориво не може да бъде нула.");
        }

    }
}
