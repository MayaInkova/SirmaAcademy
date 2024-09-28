package Loops;

import java.util.Scanner;

public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Искане за въвеждане на цяло число
        System.out.print("Въведете цяло число: ");
        int n = scanner.nextInt();

        // Проверка дали числото е на Армстронг и извеждане на резултата
        if (isArmstrong(n)) {
            System.out.println("Армстронг");
        } else {
            System.out.println("Не е Армстронг");
        }

        // Затваряне на скенера
        scanner.close();
    }

    // Метод за броене на цифрите в числото
    public static int countDigits(int n) {
        return String.valueOf(Math.abs(n)).length();  // Преобразуване към низ, за да се намери дължината (пренебрегва се знакът)
    }

    // Метод за проверка дали числото е число на Армстронг
    public static boolean isArmstrong(int n) {
        int originalNumber = n;
        int digitsCount = countDigits(n);
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;                // Взимане на последната цифра
            sum += Math.pow(digit, digitsCount);  // Добавяне на цифрата, повдигната на степен броя на цифрите
            n /= 10;                           // Премахване на последната цифра
        }

        return sum == originalNumber;  // Ако сумата е равна на оригиналното число, то е число на Армстронг
    }

}

