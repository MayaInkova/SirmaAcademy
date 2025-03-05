package BasicSintax;

import java.util.Scanner;

public class Month {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int month =scanner.nextInt(); // или int month = 3 (променяме)

            switch (month) {
                case 1 -> System.out.println("Януари");
                case 2 -> System.out.println("Февруари");
                case 3 -> System.out.println("Март");
                case 4 -> System.out.println("Април");
                case 5 -> System.out.println("Май");
                case 6 -> System.out.println("Юни");
                case 7 -> System.out.println("Юли");
                case 8 -> System.out.println("Август");
                case 9 -> System.out.println("Септември");
                case 10 -> System.out.println("Октомври");
                case 11 -> System.out.println("Ноември");
                case 12 -> System.out.println("Декември");
                default -> System.out.println("Невалиден месец!");
            }
        }
}
