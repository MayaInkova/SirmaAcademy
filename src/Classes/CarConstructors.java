package Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class CarConstructors {
    private String brand;
    private String model;
    private int horsepower;

    // Конструктор, който приема само марката на колата
    public CarConstructors(String brand) {
        this.brand = brand;
        this.model = "unknown";
        this.horsepower = -1;
    }

    // Конструктор, който приема марка, модел и мощност (конски сили)
    public CarConstructors(String brand, String model, int horsepower) {
        this.brand = brand;
        this.model = model;
        this.horsepower = horsepower;
    }

    // Метод за отпечатване на информация за колата
    public void printCarInfo() {
        System.out.println("Колата е: " + brand + " " + model + " - " + horsepower + " HP.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<CarConstructors> cars = new ArrayList<>();

        // Четене на броя на линиите
        int n = Integer.parseInt(scanner.nextLine());

        // Цикъл за обработка на всяка входна линия
        for (int i = 0; i < n; i++) {
            String[] carData = scanner.nextLine().split(" ");

            if (carData.length == 1) {
                // Ако има само един елемент (само марка)
                cars.add(new CarConstructors(carData[0]));
            } else if (carData.length == 3) {
                // Ако има три елемента (марка, модел, мощност)
                String brand = carData[0];
                String model = carData[1];
                int horsepower = Integer.parseInt(carData[2]);
                cars.add(new CarConstructors(brand, model, horsepower));
            }
        }

        // Отпечатване на информацията за всички коли
        for (CarConstructors car : cars) {
            car.printCarInfo();  // Извикване на метода 'printCarInfo' за всеки обект
        }
    }
}


