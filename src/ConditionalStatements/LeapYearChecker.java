package ConditionalStatements;

import java.util.Scanner;

public class LeapYearChecker {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Въвеждане на годината
            System.out.print("Въведете година: ");
            int year = scanner.nextInt();

            // Проверка дали годината е високосна
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " е високосна година.");
            } else {
                System.out.println(year + " не е високосна година.");
            }
        }
    }
