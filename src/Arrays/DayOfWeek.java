package Arrays;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на число от потребителя
        System.out.print("Въведете число: ");
        int day = scanner.nextInt();

        // Превръщане на числото в ден от седмицата
        switch (day) {
            case 1:
                System.out.println("Понеделник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Сряда");
                break;
            case 4:
                System.out.println("Четвъртък");
                break;
            case 5:
                System.out.println("Петък");
                break;
            case 6:
                System.out.println("Събота");
                break;
            case 7:
                System.out.println("Неделя");
                break;
            default:
                System.out.println("Invalid day!");
                break;
        }

    }
}
