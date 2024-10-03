package Arrays;

import java.util.Scanner;

public class LastKNumbersSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четене на стойностите на n и k
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        // Инициализиране на масива с дължина n
        long[] sequence = new long[n];
        sequence[0] = 1;  // Първият елемент винаги е 1

        // Запълване на масива
        for (int i = 1; i < n; i++) {
            long sum = 0;
            // Вземаме сумата на предишните k елемента или толкова, колкото са налични
            for (int j = i - 1; j >= 0 && j >= i - k; j--) {
                sum += sequence[j];
            }
            sequence[i] = sum;  // Присвояваме изчислената сума на текущия елемент
        }

        // Отпечатване на резултата
        for (long num : sequence) {
            System.out.print(num + " ");
        }
    }
}
