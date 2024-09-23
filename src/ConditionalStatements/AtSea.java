package ConditionalStatements;

import java.util.Scanner;

public class AtSea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на данни
        System.out.print("Въведете броя на дните за престой: ");
        int days = scanner.nextInt();
        scanner.nextLine();  // Пропускане на нов ред след въвеждане на цяло число

        System.out.print("Въведете типа стая (single room/apartment/president apartment): ");
        String roomType = scanner.nextLine();

        System.out.print("Въведете оценката (positive/negative): ");
        String assessment = scanner.nextLine();

        // Цени на нощувките
        double singleRoomPrice = 25.00;
        double apartmentPrice = 50.00;
        double presidentialPrice = 100.00;

        // Изчисляване на броя на нощувките (дни - 1)
        int nights = days - 1;
        double totalPrice = 0;

        // Изчисляване на цената без отстъпка
        switch (roomType) {
            case "single room":
                totalPrice = nights * singleRoomPrice;
                break;
            case "apartment":
                totalPrice = nights * apartmentPrice;
                break;
            case "president apartment":
                totalPrice = nights * presidentialPrice;
                break;
            default:
                System.out.println("Невалиден тип стая.");
                return; // Изход, ако типът стая е невалиден
        }

        // Прилагане на отстъпки в зависимост от стаята и броя на дните
        if (roomType.equals("apartment")) {
            if (nights > 15) {
                totalPrice *= 0.50; // 50% отстъпка за над 15 дни
            } else if (nights >= 10) {
                totalPrice *= 0.65; // 35% отстъпка за 10-15 дни
            } else if (nights < 10) {
                totalPrice *= 0.70; // 30% отстъпка за под 10 дни
            }
        } else if (roomType.equals("president apartment")) {
            if (nights > 15) {
                totalPrice *= 0.80; // 20% отстъпка за над 15 дни
            } else if (nights >= 10) {
                totalPrice *= 0.85; // 15% отстъпка за 10-15 дни
            } else if (nights < 10) {
                totalPrice *= 0.90; // 10% отстъпка за под 10 дни
            }
        }

        // Прилагане на оценката (positive/negative)
        if (assessment.equals("positive")) {
            totalPrice *= 1.25; // Добавяне на 25% за положителна оценка
        } else if (assessment.equals("negative")) {
            totalPrice *= 0.90; // Изваждане на 10% за отрицателна оценка
        }

        // Отпечатване на крайния резултат
        System.out.printf("Цената за престоя е: %.2f лв.%n", totalPrice);
    }
}
