package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитане на масив от продукти
        String[] products = scanner.nextLine().split(" ");

        // Сортиране на продуктите по азбучен ред
        Arrays.sort(products);

        // Отпечатване на номериран списък от продукти
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i]);
        }
    }
}
