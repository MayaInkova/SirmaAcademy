package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> printerQueue = new ArrayDeque<>();

        while (true) {
            String input = scanner.nextLine(); // Четене на вход

            if (input.equals("print")) { // Ако получим команда "print"
                // Печат на файловете в опашката
                while (!printerQueue.isEmpty()) {
                    System.out.println(printerQueue.pollFirst()); // Вземаме и отпечатваме първия елемент
                }
                break; // Излизаме от цикъла след "print"
            } else if (input.equals("cancel")) { // Ако получим команда "cancel"
                if (!printerQueue.isEmpty()) {
                    System.out.println("Canceled " + printerQueue.pollFirst()); // Отменяме първия файл
                } else {
                    System.out.println("Standby"); // Ако няма файлове в опашката
                }
            } else { // Добавяме нов файл към опашката
                printerQueue.offer(input);
            }
        }
    }
}

