package Arrays;

import java.util.Scanner;

public class PrintEveryNElementFromAnArray {
    // Method to collect elements at every N-th step
    public static void collectElementsOnSteps(String[] array, int step) {
        for (int i = 0; i < array.length; i += step) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array of strings
        System.out.println("Enter the elements of the array, separated by space: ");
        String input = scanner.nextLine();
        String[] array = input.split(" ");

        // Input the step
        System.out.println("Enter the step (N): ");
        int step = scanner.nextInt();

        // Call method to collect elements on steps
        collectElementsOnSteps(array, step);

    }
}

