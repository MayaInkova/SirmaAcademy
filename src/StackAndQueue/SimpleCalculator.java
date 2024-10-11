package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четене на входа
        String[] tokens = scanner.nextLine().split("\\s+");

        // Използваме стек за съхранение на числата
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        // Първият елемент винаги е число
        stack.push(Integer.parseInt(tokens[0]));

        // Обхождаме израза
        for (int i = 1; i < tokens.length; i++) {
            String token = tokens[i];

            // Ако токенът е "+" или "-", следващият токен ще бъде число
            if (token.equals("+")) {
                int nextNumber = Integer.parseInt(tokens[++i]);
                stack.push(nextNumber);  // Добавяме числото в стека
            } else if (token.equals("-")) {
                int nextNumber = Integer.parseInt(tokens[++i]);
                stack.push(-nextNumber);  // Добавяме отрицателно число в стека
            }
        }

        // Сумираме всички числа в стека
        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        System.out.println(result);
    }
}

