package BasicSintax;

import java.util.Scanner;

public class CircleCircumference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитаме стойността на радиуса R от конзолата
        System.out.print("Въведете радиуса на кръга: ");
        double radius = scanner.nextDouble();

        // Изчисляваме обиколката по формулата C = 2 * π * R
        double circumference = 2 * Math.PI * radius;

        // Отпечатваме резултата
        System.out.printf("The circumference of the circle is: %.2f%n", circumference);

    }
}
