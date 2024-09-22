package ConditionalStatements;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the mark:");
        double mark = scanner.nextDouble();

        //Check if the mark is 5.5 or higher
        if (mark >= 5.50) {
            System.out.println("Exsellent!:");
        } else {
            System.out.println("no output:");
        }
    }
}

