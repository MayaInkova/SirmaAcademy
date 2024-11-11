package BasicSintax;

import java.util.Scanner;

public class AverageSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Въведете разстоянието D (в километри): ");
        double distance = scanner.nextDouble();


        System.out.print("Въведете времето T (в часове): ");
        double time = scanner.nextDouble();

        // Изчисляване на средната скорост със формулата: Средна скорост = D / T
        double averageSpeed = distance / time;


        System.out.printf("Средната скорост на превозното средство е: %.2f км/ч%n", averageSpeed);
        
    }
}
