package Arrays;

import java.util.Scanner;

public class ReverseAnArrayOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на броя на елементите
        System.out.print("Въведете броя на елементите n: ");
        int n = scanner.nextInt();

        // Създаване на масив с размер n
        int[] array = new int[n];

        // Въвеждане на елементите в масива
        System.out.println("Въведете " + n + " елемента:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Обръщане на масива и отпечатване на елементите
        System.out.println("Обърнатият масив е:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
