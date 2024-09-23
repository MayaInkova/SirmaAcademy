package ConditionalStatements;

import java.util.Scanner;

public class MakeupShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на входните параметри
        System.out.print("Enter the price of renovation: ");
        double renovationPrice = scanner.nextDouble();

        System.out.print("Enter count of powders: ");
        int powdersCount = scanner.nextInt();

        System.out.print("Enter count of lipsticks: ");
        int lipsticksCount = scanner.nextInt();

        System.out.print("Enter count of spirals: ");
        int spiralsCount = scanner.nextInt();

        System.out.print("Enter count of shadows: ");
        int shadowsCount = scanner.nextInt();

        System.out.print("Enter count of concealers: ");
        int concealersCount = scanner.nextInt();

        // Цени на продуктите
        double powderPrice = 2.60;
        double lipstickPrice = 3.00;
        double spiralPrice = 4.10;
        double shadowsPrice = 8.20;
        double concealerPrice = 2.00;

        // Изчисляване на общата сума от поръчката
        double totalPrice = (powdersCount * powderPrice) + (lipsticksCount * lipstickPrice) +
                (spiralsCount * spiralPrice) + (shadowsCount * shadowsPrice) +
                (concealersCount * concealerPrice);

        // Изчисляване на общия брой на поръчаните продукти
        int totalCount = powdersCount + lipsticksCount + spiralsCount + shadowsCount + concealersCount;

        // При 50 или повече продукта, се прави отстъпка от 25%
        if (totalCount >= 50) {
            totalPrice *= 0.75;
        }

        // Изваждане на 10% за наема
        double profitAfterRent = totalPrice * 0.90;

        // Проверка дали парите са достатъчни за реновацията
        if (profitAfterRent >= renovationPrice) {
            double remainingMoney = profitAfterRent - renovationPrice;
            System.out.printf("Yes! %.2f lv left.%n", remainingMoney);
        } else {
            double neededMoney = renovationPrice - profitAfterRent;
            System.out.printf("Not enough money! %.2f lv needed.%n", neededMoney);
        }
    }
}
