package Arrays;

import java.util.Scanner;

public class MinMaxInArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четене на броя на елементите
        System.out.print("Въведете броя на елементите в масива: ");
        int n = scanner.nextInt();

        // Създаване на масива
        int[] array = new int[n];

        // Четене на елементите на масива
        System.out.println("Въведете елементите на масива:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Инициализация на минимална и максимална стойност
        int min = array[0];
        int max = array[0];

        // Намиране на минимална и максимална стойност
        for (int i = 1; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }


        System.out.println("Минимална стойност: " + min);
        System.out.println("Максимална стойност: " + max);
    }
}

