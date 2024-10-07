package Classes;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private double capacity;       // Капацитет на склада (колко продукти може да съхранява)
    private List<Product> storage; // Списък с продуктите в склада

    // Конструктор на класа Storage
    public Storage(double capacity) {
        this.capacity = capacity;
        this.storage = new ArrayList<>();  // Инициализираме празен списък за продуктите
    }

    // Метод за добавяне на продукт
    public void addProduct(Product product) {
        if (this.capacity >= product.getQuantity()) {
            this.storage.add(product);  // Добавяме продукта в списъка
            this.capacity -= product.getQuantity();  // Намаляваме капацитета със същото количество
            System.out.println("Продукт " + product.getName() + " е добавен успешно.");
        } else {
            System.out.println("Недостатъчно място в склада за добавяне на " + product.getName());
        }
    }

    // Метод за връщане на всички продукти във формат JSON-подобен стринг
    public String getProducts() {
        StringBuilder result = new StringBuilder();
        result.append("[\n");
        for (int i = 0; i < storage.size(); i++) {
            result.append(storage.get(i).toJSON());
            if (i < storage.size() - 1) {
                result.append(",\n");
            }
        }
        result.append("\n]");
        return result.toString();
    }

    // Гетър за наличния капацитет
    public double getCapacity() {
        return this.capacity;
    }

    // Метод за изчисляване на общата стойност на продуктите в склада
    public double getTotalCost() {
        double totalCost = 0;
        for (Product product : storage) {
            totalCost += product.getTotalCost();
        }
        return totalCost;
    }
}

