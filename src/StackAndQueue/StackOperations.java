package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class StackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четем първия ред: N, S и X
        int N = scanner.nextInt();  // Броят на елементите за добавяне в стека
        int S = scanner.nextInt();  // Броят на елементите за премахване от стека
        int X = scanner.nextInt();  // Елементът, който търсим в стека

        // Четем следващия ред от N елемента
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            stack.push(scanner.nextInt());  // Добавяме елементите в стека
        }

        // Премахваме S елемента от стека
        for (int i = 0; i < S; i++) {
            if (!stack.isEmpty()) {
                stack.pop();
            }
        }

        // Проверяваме дали стекът съдържа X
        if (stack.contains(X)) {
            System.out.println("true");
        } else {
            // Ако стекът е празен, отпечатваме 0
            if (stack.isEmpty()) {
                System.out.println(0);
            } else {
                // Намираме и отпечатваме най-малкия елемент в стека
                System.out.println(findSmallestElement(stack));
            }
        }
    }

    // Функция за намиране на най-малкия елемент в стека
    private static int findSmallestElement(ArrayDeque<Integer> stack) {
        int minElement = Integer.MAX_VALUE;
        for (int element : stack) {
            if (element < minElement) {
                minElement = element;
            }
        }
        return minElement;
    }
}

