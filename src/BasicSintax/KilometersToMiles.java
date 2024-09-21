package BasicSintax;

import java.util.Scanner;

public class KilometersToMiles {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        // Четене на километри (реално число)
        System.out.println("Въведете разстояние в километри: ");
        double kilometers = scanner.nextDouble();

        // Преобразуване на километри в мили (1 км = 0.621371192 мили)
        double miles = kilometers * 0.621371192;

        // Отпечатване на резултата
        System.out.printf("Разстоянието в мили е: %.6f%n", miles);
    }
}


