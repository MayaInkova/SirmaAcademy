package Algorithm;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Външен цикъл за броя на итерациите
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Вътрешен цикъл за сравнение на съседни елементи
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Размяна на елементите
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // Ако не са направени размени, масивът е вече сортиран
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Преди сортиране:");
        printArray(numbers);

        bubbleSort(numbers);

        System.out.println("\nСлед сортиране:");
        printArray(numbers);
    }


    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
