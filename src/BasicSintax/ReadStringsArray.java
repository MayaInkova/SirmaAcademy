package BasicSintax;

import java.util.Scanner;

public class ReadStringsArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четене на входа
        System.out.println("Въведете 5 низа, разделени с интервал:");
        String input = scanner.nextLine();

        // Разделяне на входа в масив
        String[] words = input.split(" ");


        if (words.length != 5) {
            System.out.println("Грешка: Трябва да въведете точно 5 низа!");
        } else {

            System.out.println("Въведените низове са:");
            for (String word : words) {
                System.out.println(word);
            }
        }

    }

}

