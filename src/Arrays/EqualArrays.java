package Arrays;

import java.util.Scanner;

public class EqualArrays {

    // Метод за сравнение на два масива и извеждане на резултата
    public static void compareArrays(String[] array1, String[] array2) {

        // Проверка дали масивите имат еднаква дължина
        if (array1.length != array2.length) {
            System.out.println("Arrays are not identical. Different lengths.");
            return;
        }

        int sum = 0;

        // Iterate through arrays and compare elements
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                // Ако намерим различие, печатаме индекса и излизаме от метода
                System.out.println("Arrays are not identical. Found difference at " + i + " index.");
                return;
            } else {
                // Ако елементите са еднакви, сумираме стойностите (предполага се, че са числа)

                sum += Integer.parseInt(array1[i]);
            }
        }

        // If arrays are identical, print the sum of the first array
        System.out.println("Arrays are identical. Sum: " + sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first array
        System.out.println("Enter the elements of the first array, separated by space: ");
        String input1 = scanner.nextLine();
        String[] array1 = input1.split("");

        System.out.println("Enter the elements of the second array, separated by space: ");
        String input2 = scanner.nextLine();
        String[] array2 = input2.split(" ");


        compareArrays(array1, array2);
    }
}

