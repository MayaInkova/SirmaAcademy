package Loops;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на числата n и l
        System.out.print("Въведете число n: ");
        int n = scanner.nextInt();
        System.out.print("Въведете число l: ");
        int l = scanner.nextInt();

        // Генериране на паролите
        System.out.println("Всички възможни пароли:");

        for (int digit1 = 1; digit1 <= n; digit1++) {
            for (int digit2 = 1; digit2 <= n; digit2++) {
                for (char letter1 = 'a'; letter1 < 'a' + l; letter1++) {
                    for (char letter2 = 'a'; letter2 < 'a' + l; letter2++) {
                        for (int digit3 = 1; digit3 <= n; digit3++) {
                            // Символ 5 (digit3) трябва да е по-голям от символ 1 и символ 2
                            if (digit3 > digit1 && digit3 > digit2) {
                                System.out.println("" + digit1 + digit2 + letter1 + letter2 + digit3 + " ");
                            }
                        }
                    }
                }
            }
        }
    }
}
