package Loops;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на числото n
        System.out.print("Въведете число n: ");
        int n = scanner.nextInt();

        // Обхождане на всички числа от 1111 до 9999
        System.out.println("Специални числа за n = " + n + ":");
        for (int i = 1111; i <= 9999; i++) {
            if (eSpecialno(i, n)) {
                System.out.print(i + " ");
            }
        }
    }

    // Функция за проверка дали дадено число е специално
    public static boolean eSpecialno(int chislo, int n) {
        int originalnoChislo = chislo;

        // Обхождане на всяка цифра от числото
        while (chislo > 0) {
            int cifra = chislo % 10; // Взима последната цифра
            // Проверка дали n се дели на цифрата
            if (cifra == 0 || n % cifra != 0) {
                return false; // Ако n не се дели на някоя от цифрите, връща false
            }
            chislo /= 10; // Премахва последната цифра
        }

        return true; // Ако всички цифри делят n без остатък, числото е специално
    }
}

