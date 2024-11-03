package Exam;

import java.util.Scanner;
import java.util.Stack;

public class EpicWizardingDuels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Въведете последователността от заклинания и контразаклинания: ");
        String sequence = scanner.nextLine();

        // Проверка дали последователността е епична
        boolean isEpic = isEpicDuel(sequence);

        // Изход на резултата
        if (isEpic) {
            System.out.println("The duel is epic!");
        } else {
            System.out.println("The duel is not epic.");
        }

    }

    public static boolean isEpicDuel(String sequence) {
        Stack<Character> stack = new Stack<>();

        for (char spell : sequence.toCharArray()) {
            // Проверка за заклинание
            if (spell == '/' || spell == '!' || spell == '<') {
                // Добавяме заклинанието в стека
                stack.push(spell);
            } else if (spell == '\\' || spell == '!' || spell == '>') {
                // Проверка за контразаклинание
                if (stack.isEmpty()) {
                    return false; // Няма заклинание за контра
                }

                char lastSpell = stack.pop();

                // Проверка за правилното контразаклинание
                if (!isCounterspell(lastSpell, spell)) {
                    return false; // Неправилно контразаклинание
                }
            }
        }

        return stack.isEmpty(); // Проверка дали всички заклинания са били контрирани
    }

    public static boolean isCounterspell(char spell, char counterspell) {
        switch (spell) {
            case '/':
                return counterspell == '\\';
            case '!':
                return counterspell == '!';
            case '<':
                return counterspell == '>';
            default:
                return false;
        }
    }
}
