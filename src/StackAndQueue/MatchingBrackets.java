package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четене на аритметичното израза от клавиатурата
        System.out.println("Въведете аритметичен израз със скоби:");
        String expression = scanner.nextLine();

        // Стек за съхранение на индексите на отварящите скоби
        Stack<Integer> stack = new Stack<>();

        // Обхождане на всеки символ в низа
        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);

            // Ако намерим отваряща скоба, записваме нейния индекс в стека
            if (currentChar == '(') {
                stack.push(i);
            }
            // Ако намерим затваряща скоба, вадим индекса на последната отваряща скоба
            else if (currentChar == ')') {
                // Вземаме индекса на отварящата скоба от стека
                int startIndex = stack.pop();

                // Извличаме подизраза между скобите
                String subExpression = expression.substring(startIndex, i + 1);

                // Принтираме намерения подизраз
                System.out.println("Намерен подизраз: " + subExpression);
            }
        }
    }
}
