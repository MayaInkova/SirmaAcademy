package Classes;

public class Vehicle {
    private String type;
    private String model;
    private Engine engine;
    private double fuel;

    // Конструкторът получава тип, модел, двигател и гориво
    public Vehicle(String type, String model, Engine engine, double fuel) {
        this.type = type;
        this.model = model;
        this.engine = engine;
        this.fuel = fuel;
    }

    // Метод за намаляване на горивото (шофиране)
    public void drive(double fuelLoss) {
        // Намаляване на горивото с подаденото количество fuelLoss
        this.fuel -= fuelLoss;

        // Ако горивото падне под 0, задаваме го на 0
        if (this.fuel < 0) {
            this.fuel = 0;
        }
    }

    // Метод за извеждане на оставащото количество гориво
    public double getFuel() {
        return this.fuel;
    }


    public static void main(String[] args) {
        // Създаване на обект Engine с мощност 100 и гориво 200
        Engine engine = new Engine(100, 200);

        // Създаване на обект Vehicle
        Vehicle vehicle = new Vehicle("Car", "ModelX", engine, 200);

        // Шофиране с разход на 100 единици гориво
        vehicle.drive(100);

        // Извеждане на оставащото гориво след шофирането
        System.out.println("Оставащо гориво: " + vehicle.getFuel() + " литра");  // Output: 100 литра
    }
}

