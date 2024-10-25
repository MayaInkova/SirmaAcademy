package Classes;

import java.util.ArrayList;
import java.util.List;

// Дефинираме класа Product (Продукт)
class Product {
    private String name;     // Име на продукта
    private double price;    // Цена на един продукт
    private int quantity;    // Количество продукти от този тип

    // Конструктор на класа Product
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Гетър за общата цена на продукта (цена * количество)
    public double getTotalCost() {
        return this.price * this.quantity;
    }

    // Метод за връщане на информацията за продукта във формат JSON-подобен стринг
    public String toJSON() {
        return String.format("{\"name\": \"%s\", \"price\": %.2f, \"quantity\": %d, \"totalCost\": %.2f}",
                this.name, this.price, this.quantity, this.getTotalCost());
    }

    // Гетъри за име и количество
    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }
}

