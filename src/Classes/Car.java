package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Car {

    // Частни полета
    private String brand;
    private String model;
    private int horsepower;

    // Конструктор
    public Car(String brand, String model, int horsepower) {
        this.brand = brand;
        this.model = model;
        this.horsepower = horsepower;
    }

    // Гетър за марка
    public String getBrand() {
        return brand;
    }

    // Сетър за марка
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Гетър за модел
    public String getModel() {
        return model;
    }

    // Сетър за модел
    public void setModel(String model) {
        this.model = model;
    }

    // Гетър за конски сили
    public int getHorsepower() {
        return horsepower;
    }

    // Сетър за конски сили
    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    // Метод за връщане на информация за колата
    public String carInfo() {
        return "The car is: " + this.brand + " " + this.model + " – " + this.horsepower + " HP.";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Колекция за съхранение на обекти от тип Car (ArrayList се използва тук)
        List<Car> cars = new ArrayList<>();

        // Четене на броя на автомобилите
        System.out.println("Enter the number of cars:");
        int N = Integer.parseInt(scanner.nextLine());

        // Цикъл за четене на данни за автомобили и създаване на обекти от тип Car
        for (int i = 0; i < N; i++) {
            System.out.println("Enter car details (format: Brand Model Horsepower):");
            String[] carInfo = scanner.nextLine().split(" ");

            String brand = carInfo[0];
            String model = carInfo[1];
            int horsepower = Integer.parseInt(carInfo[2]);

            // Създаване на нов обект от тип Car и добавяне към списъка
            Car car = new Car(brand, model, horsepower);
            cars.add(car);
        }

        // Принтиране на информацията за всяка кола чрез метода carInfo()
        for (Car car : cars) {
            System.out.println(car.carInfo());
        }
    }
}

