package Strings;

import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.Scanner;



public class MyltiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четем голямо число като низ от потребителя
        System.out.println("Въведете голямо число");
        String bigNumberInput = scanner.nextLine();

        // Четем едноцифрено число като цяло число
        System.out.println("Едноцифрено число");
        int singleDigit = scanner.nextInt();

        //Проверяваме дали въведеното число е наистина едноцифрено(0 до 9)
        if (singleDigit < 0 || singleDigit > 9) {
            System.out.println("Грешка:Моля,въведете едноцифрено число между 0 и 9");
            return;
        }

        //Създаваме BigInteger  обект от голямото число
        BigInteger bigNumber = new BigInteger(bigNumberInput);

        //изчисляваме произведението на двете числа
        BigInteger product = bigNumber.multiply(BigInteger.valueOf(singleDigit));

        System.out.println("Произведение:" + product);

    }
}
