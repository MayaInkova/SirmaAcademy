package Methods;

import java.util.Scanner;

public class RepeatString {
    // Метод за повтаряне на низ n пъти
    public static String repeatString(String str, int n) {
        StringBuilder repeatedString = new StringBuilder();

        // Повтаряме низа n пъти
        for (int i = 0; i < n; i++) {
            repeatedString.append(str);
        }

        // Връщаме новия низ
        return repeatedString.toString();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Подканяме потребителя да въведе низ
        System.out.println("Моля, въведете низ:");
        String inputString = scanner.nextLine();

        // Подканяме потребителя да въведе брой повторения
        System.out.println("Моля, въведете брой повторения:");
        int repeatCount = scanner.nextInt();

        // Извикваме метода за повтаряне на низа
        String result = repeatString(inputString, repeatCount);

        // Отпечатваме получения резултат
        System.out.println("Полученият низ е: " + result);

    }
}

