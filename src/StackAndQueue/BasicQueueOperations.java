package StackAndQueue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Прочитаме входните стойности
        int N = sc.nextInt();  // Брой елементи за добавяне (enqueue)
        int S = sc.nextInt();  // Брой елементи за премахване (dequeue)
        int X = sc.nextInt();  // Елемент, който трябва да проверим

        // Инициализираме опашка
        Queue<Integer> queue = new LinkedList<>();

        // Добавяме N елементи в опашката
        for (int i = 0; i < N; i++) {
            queue.offer(sc.nextInt());
        }

        // Премахваме S елементи от опашката
        for (int i = 0; i < S; i++) {
            if (!queue.isEmpty()) {
                queue.poll();
            }
        }

        // Проверяваме дали X присъства в опашката
        if (queue.contains(X)) {
            System.out.println("true");
        } else {
            // Ако опашката не е празна, намираме и отпечатваме най-малкия елемент
            if (!queue.isEmpty()) {
                System.out.println(Collections.min(queue));
            } else {
                // Ако опашката е празна, отпечатваме 0
                System.out.println(0);
            }
        }
    }
}

