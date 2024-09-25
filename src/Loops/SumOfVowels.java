package Loops;

import java.util.Scanner;

public class SumOfVowels {
    public static void calculateVowelSum(String text) {
        int sum = 0;

        // Convert the text to lowercase to handle both uppercase and lowercase vowels
        text = text.toLowerCase();

        // Loop through each character in the string
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            // Check the value of the vowel and add to sum accordingly
            switch (c) {
                case 'a':
                    sum += 1;
                    break;
                case 'e':
                    sum += 2;
                    break;
                case 'i':
                    sum += 3;
                    break;
                case 'o':
                    sum += 4;
                    break;
                case 'u':
                    sum += 5;
                    break;
                default:
                    break;
            }
        }

        // Print the sum of vowel values
        System.out.println("The sum of the vowel values is: " + sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input text from the user
        System.out.print("Enter some text: ");
        String text = scanner.nextLine();

        // Call the function to calculate and print the sum of vowel values
        calculateVowelSum(text);


    }
}
