package Methods;

import java.util.Scanner;

public class GreaterOfTwoValues {
    // Метод за сравняване на две цели числа
    public static int getMax(int a, int b) {
        return Math.max(a, b); // Използваме Math.max за опростяване
    }

    // Метод за сравняване на два символа
    public static char getMax(char a, char b) {
        return (a > b) ? a : b; // Сравняваме символите директно
    }

    // Метод за сравняване на два низа
    public static String getMax(String a, String b) {
        return (a.compareTo(b) > 0) ? a : b; // Използваме compareTo() за низове
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четем типа на стойностите за сравнение
        System.out.println("Въведете типа (int, char, string):");
        String type = scanner.nextLine();

        // В зависимост от типа, четем съответните стойности и извикваме getMax()
        switch (type) {
            case "int":
                System.out.println("Въведете първо цяло число:");
                int int1 = scanner.nextInt();
                System.out.println("Въведете второ цяло число:");
                int int2 = scanner.nextInt();
                System.out.println("Максималната стойност: " + getMax(int1, int2));
                break;

            case "char":
                System.out.println("Въведете първи символ:");
                char char1 = scanner.next().charAt(0);
                System.out.println("Въведете втори символ:");
                char char2 = scanner.next().charAt(0);
                System.out.println("Максималната стойност: " + getMax(char1, char2));
                break;

            case "string":
                System.out.println("Въведете първи низ:");
                String str1 = scanner.nextLine(); // Четем първия низ
                // Консумираме остатъчния нов ред
                scanner.nextLine();
                System.out.println("Въведете втори низ:");
                String str2 = scanner.nextLine(); // Четем втория низ
                System.out.println("Максималната стойност: " + getMax(str1, str2));
                break;

            default:
                System.out.println("Въведен е невалиден тип."); // Обработка на невалиден тип
                break;
        }
    }
}

