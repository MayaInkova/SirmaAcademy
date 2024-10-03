package Arrays;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитане на входния масив
        String input = scanner.nextLine();
        String[] array = input.split(" ");

        // Прочитане на броя на ротациите
        int rotations = scanner.nextInt();

        // Изчисляване на ефективния брой ротации (премахваме излишните пълни завъртания)
        int n = array.length;
        rotations = rotations % n;  // Намаляване на ненужни пълни ротации

        // Извършване на ротацията
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            // Поставяме всеки елемент на новата му позиция
            result[(i + rotations) % n] = array[i];
        }

        // Отпечатване на резултата
        for (String s : result) {
            System.out.print(s + " ");
        }
    }
}