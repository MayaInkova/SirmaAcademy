package Arrays;

import java.util.Scanner;

public class FirstAndLastKNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитане на входния масив от числа
        String[] input = scanner.nextLine().split(" ");
        int[] array = new int[input.length];

        // Преобразуване на низа към масив от числа
        for (int i = 0; i < input.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }

        // Прочитане на стойността на k
        int k = scanner.nextInt();

        // Отпечатване на първите k елемента
        for (int i = 0; i < k; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();  // нов ред

        // Отпечатване на последните k елемента
        for (int i = array.length - k; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
