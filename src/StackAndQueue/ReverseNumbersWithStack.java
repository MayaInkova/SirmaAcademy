package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithStack {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        System.out.println("Въведете броя на числата (N):");
        int N = scanner.nextInt();  // Прочитаме колко числа ще въведем

        System.out.println("Въведете " + N + " числа:");

        // Четем числата и ги добавяме в стека
        for (int i = 0; i < N; i++) {
            int number = scanner.nextInt();
            stack.push(number);  // Добавяме числото в стека
        }

        System.out.println("Числата в обратен ред са:");

        // Извеждаме числата в обратен ред, като използваме pop()
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");  // Взимаме числата в обратен ред
        }
    }
}
