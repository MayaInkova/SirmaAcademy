package StackAndQueue;

import java.util.HashMap;
import java.util.Scanner;

public class RecursiveFibonacci {
    // HashMap за запазване на вече изчислените стойности на Фибоначи
    private static HashMap<Integer, Long> memo = new HashMap<>();

    // Рекурсивна функция за изчисление на n-тия Фибоначи с мемоизация
    public static long getFibonacci(int n) {
        // Базови случаи
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Проверяваме дали вече сме изчислили тази стойност
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        // Изчисляваме стойността рекурсивно
        long result = getFibonacci(n - 1) + getFibonacci(n - 2);

        // Съхраняваме резултата в паметта (мемоизация)
        memo.put(n, result);

        return result;
    }

    public static void main(String[] args) {
        // Четене на входа
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Fibonacci number position (N): ");
        int N = sc.nextInt();

        // Уверяваме се, че входът е в допустимите граници
        if (N < 0 || N > 49) {
            System.out.println("Please enter a number between 0 and 49.");
        } else {
            // Извеждаме n-тия член от Фибоначи последователността
            System.out.println("The " + N + "th Fibonacci number is: " + getFibonacci(N));
        }
    }
}

