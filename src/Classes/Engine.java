package Classes;

public class Engine {
    // Полета на двигателя
    private int power;  // Мощността на двигателя
    private double fuel;  // Количество гориво

    // Конструктор за създаване на двигател с мощност и гориво
    public Engine(int power, double fuel) {
        this.power = power;
        this.fuel = fuel;
    }

    // Метод за достъп до мощността
    public int getPower() {
        return power;
    }

    // Метод за достъп до горивото
    public double getFuel() {
        return fuel;
    }

    // Метод за задаване на горивото
    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    // Метод за "шофиране", който намалява горивото с дадено количество
    public void drive(double fuelLoss) {
        if (fuelLoss > fuel) {
            System.out.println("Not enough fuel for the trip!");
        } else {
            fuel -= fuelLoss;
            System.out.println("Driven successfully! Remaining fuel: " + fuel);
        }
    }
}

