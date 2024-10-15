package StackAndQueue;

import java.util.Stack;

public class BalancedParentheses {
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>(); // Създаваме стек за скобите

        for (char ch : expression.toCharArray()) {
            // Ако срещнем отваряща скоба, я добавяме в стека
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            // Ако срещнем затваряща скоба
            else if (ch == ')' || ch == ']' || ch == '}') {
                // Ако стекът е празен или скобите не съвпадат, низът не е балансиран
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), ch)) {
                    return false;
                }
            }
        }
        // Ако в края на проверката стекът е празен, скобите са балансирани
        return stack.isEmpty();
    }

    // Функция за проверка дали скобите съвпадат
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }

    public static void main(String[] args) {
        String expression = "{[()]}";  // Тук можете да промените низа за проверка

        if (isBalanced(expression)) {
            System.out.println("The string is balanced.");
        } else {
            System.out.println("The string is not balanced.");
        }
    }
}
