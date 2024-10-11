package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> historyStack = new ArrayDeque<>();
        String currentURL = null;

        while (true) {
            String command = scanner.nextLine();

            // Проверяваме дали командата е "Home"
            if (command.equals("Home")) {
                break;  // Спиране на програмата
            }

            // Ако командата е "back"
            if (command.equals("back")) {
                if (!historyStack.isEmpty()) {
                    currentURL = historyStack.pop();  // Връщаме се на предишния URL
                } else {
                    System.out.println("no previous URLs");
                    continue;
                }
            } else {
                // Запазваме текущия URL в стека преди да отидем на нова страница
                if (currentURL != null) {
                    historyStack.push(currentURL);
                }
                currentURL = command;  // Настройваме новия URL
            }

            // Отпечатваме текущия URL
            System.out.println(currentURL);
        }
    }
}
