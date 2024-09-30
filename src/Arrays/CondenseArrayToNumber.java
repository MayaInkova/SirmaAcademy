package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {


    // Метод за кондензиране на масива
    public static int condenseArray(int[] numbers) {
        while (numbers.length > 1) {
            int[] condensed = new int[numbers.length - 1];

            // Сумиране на съседните елементи
            for (int i = 0; i < numbers.length - 1; i++) {
                condensed[i] = numbers[i] + numbers[i + 1];
            }

            // Заменяме масива числа с кондензирания масив
            numbers = condensed;
            System.out.println("Condensed: " + Arrays.toString(numbers));
        }

        return numbers[0]; // The last remaining element
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking array size input
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        // Taking array elements input
        System.out.println("Enter " + size + " elements of the array: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calling the method
        int result = condenseArray(numbers);
        System.out.println("Final result: " + result);

        scanner.close();
    }
}
