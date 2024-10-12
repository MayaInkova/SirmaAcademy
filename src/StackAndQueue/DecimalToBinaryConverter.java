package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четене на десетично число от конзолата
        int decimal = scanner.nextInt();

        // Ако числото е 0, директно отпечатваме двоичното му представяне
        if (decimal == 0) {
            System.out.println(0);
            return;
        }

        // Стек за съхранение на остатъците
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        // Преобразуване на десетично в двоично
        while (decimal != 0) {
            stack.push(decimal % 2);  // Съхраняваме остатъка от деление на 2
            decimal /= 2;
        }

        // Извличане на двоичното представяне
        StringBuilder binaryRepresentation = new StringBuilder();
        while (!stack.isEmpty()) {
            binaryRepresentation.append(stack.pop());
        }

        // Отпечатваме двоичното представяне
        System.out.println(binaryRepresentation.toString());
    }
}

