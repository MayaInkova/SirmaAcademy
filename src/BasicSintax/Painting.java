package BasicSintax;

import java.util.Scanner;

public class Painting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на скоростта на първата кола (x км/ч)
        System.out.print("Въведете скоростта на първата кола (x км/ч): ");
        double speedCar1 = scanner.nextDouble();

        // Въвеждане на скоростта на втората кола (y км/ч)
        System.out.print("Въведете скоростта на втората кола (y км/ч): ");
        double speedCar2 = scanner.nextDouble();

        // Изчисляване на разстоянието, изминато от първата кола (x * 5 часа)
        double distanceCar1 = speedCar1 * 5;

        // Изчисляване на разстоянието, изминато от втората кола (y * 3 часа)
        double distanceCar2 = speedCar2 * 3;

        // Изчисляване на разстоянието между двете коли
        double distanceBetweenCars = distanceCar1 - distanceCar2;

        // Част 1: Отпечатване на всяка променлива на нов ред в реда, в който са въведени
        System.out.println("Скорост на първата кола: " + speedCar1);
        System.out.println("Скорост на втората кола: " + speedCar2);
        System.out.println("Изминато разстояние от първата кола: " + distanceCar1);
        System.out.println("Изминато разстояние от втората кола: " + distanceCar2);
        System.out.println("Разстояние между колите: " + distanceBetweenCars);

        // Част 2: Отпечатване на всички променливи на един ред
        System.out.print("Скорост на първата кола: " + speedCar1 + ", ");
        System.out.print("Скорост на втората кола: " + speedCar2 + ", ");
        System.out.print("Изминато разстояние от първата кола: " + distanceCar1 + ", ");
        System.out.print("Изминато разстояние от втората кола: " + distanceCar2 + ", ");
        System.out.println("Разстояние между колите: " + distanceBetweenCars);


    }
}
