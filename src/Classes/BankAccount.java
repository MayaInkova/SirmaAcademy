package Classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankAccount {
    // Частни полета
    private static int idCounter = 1; // За да се увеличава ID-то автоматично
    private int id;
    private double balance;
    private static double interestRate = 0.02; // Статичен лихвен процент (по подразбиране)

    // Конструктор за създаване на нов акаунт с уникално ID
    public BankAccount() {
        this.id = idCounter++;
        this.balance = 0.0;
    }

    // Статичен метод за задаване на лихвения процент
    public static void setInterestRate(double interest) {
        interestRate = interest;
    }

    // Метод за изчисляване на лихвата за определен брой години
    public double getInterest(int years) {
        return this.balance * interestRate * years;
    }

    // Метод за депозиране на средства
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("Amount must be positive.");
        }
    }

    // Гетър за ID-то
    public int getId() {
        return this.id;
    }

    // Гетър за баланс
    public double getBalance() {
        return this.balance;
    }

    public static void main(String[] args) {
        // Създаваме колекция за съхранение на акаунти (HashMap за бърз достъп по ID)
        Map<Integer, BankAccount> accounts = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter command:");
            String[] input = scanner.nextLine().split(" ");

            String command = input[0];

            // Команда "Create" - създава нов акаунт
            if (command.equals("Create")) {
                BankAccount account = new BankAccount();
                accounts.put(account.getId(), account);
                System.out.println("Account ID" + account.getId() + " created");

                // Команда "Deposit {ID} {Amount}" - депозира пари в акаунта
            } else if (command.equals("Deposit")) {
                int id = Integer.parseInt(input[1]);
                double amount = Double.parseDouble(input[2]);
                if (accounts.containsKey(id)) {
                    accounts.get(id).deposit(amount);
                    System.out.println("Deposited " + amount + " to ID" + id);
                } else {
                    System.out.println("Account does not exist");
                }

                // Команда "SetInterest {Interest}" - задава лихвения процент за всички акаунти
            } else if (command.equals("SetInterest")) {
                double interest = Double.parseDouble(input[1]);
                BankAccount.setInterestRate(interest);
                System.out.println("Interest rate set to " + interest);

                // Команда "GetInterest {ID} {Years}" - изчислява лихвата за определен брой години
            } else if (command.equals("GetInterest")) {
                int id = Integer.parseInt(input[1]);
                int years = Integer.parseInt(input[2]);
                if (accounts.containsKey(id)) {
                    double interest = accounts.get(id).getInterest(years);
                    System.out.println("Interest for ID" + id + " for " + years + " years: " + interest);
                } else {
                    System.out.println("Account does not exist");
                }

                // Команда "End" - прекратява програмата
            } else if (command.equals("End")) {
                break;

            } else {
                System.out.println("Invalid command.");
            }
        }
    }
}

