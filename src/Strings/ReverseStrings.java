package Strings;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четем редове, докато не получим командата "end"
        while (true) {
            String input = scanner.nextLine(); // Четем въведения низ

            // Ако входът е "end", прекратяваме цикъла
            if (input.equals("end")) {
                break;
            }

            // Обръщаме низа, като използваме StringBuilder
            String reversed = new StringBuilder(input).reverse().toString();

            // Отпечатваме резултата във формат "{дума} = {обърната дума}"
            System.out.println(input + " = " + reversed);
        }

    }
}
