package BasicSintax;
import java.util.Scanner;

public class Days {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Въведи число за ден от седмицата (1-7): ");
            int day = scanner.nextInt();

            switch (day) {
                case 1 -> System.out.println("Понеделник");
                case 2 -> System.out.println("Вторник");
                case 3 -> System.out.println("Сряда");
                case 4 -> System.out.println("Четвъртък");
                case 5 -> System.out.println("Петък");
                case 6 -> System.out.println("Събота");
                case 7 -> System.out.println("Неделя");
                default -> System.out.println("Невалиден ден!");
            }

            scanner.close();
        }
    }