package BasicSintax;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Въвеждане на теглото в килограми
        System.out.print("Въведете теглото (в килограми): ");
        double weight = scanner.nextDouble();

        // Въвеждане на височината в метри
        System.out.print("Въведете височината (в метри): ");
        double height = scanner.nextDouble();

        // Изчисляване на BMI със формулата: BMI = Weight / (Height * Height)
        double bmi = weight / (height * height);

        // Отпечатване на резултата
        System.out.printf("Вашият индекс на телесната маса (BMI) е: %.2f%n", bmi);

    }
}

