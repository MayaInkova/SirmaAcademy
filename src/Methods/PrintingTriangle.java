package Methods;

import java.util.Scanner;

public class PrintingTriangle {
    // Метод, който отпечатва триъгълник по зададен размер
    public static void printTriangle(int size) {
        // Първо отпечатваме горната част на триъгълника
        for (int i = 1; i <= size; i++) {
            printLine(1, i);
        }

        // След това отпечатваме долната част на триъгълника
        for (int i = size - 1; i >= 1; i--) {
            printLine(1, i);
        }
    }

    // Метод за отпечатване на единичен ред от триъгълника
    public static void printLine(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Подканяме потребителя да въведе размер на триъгълника
        System.out.println("Моля, въведете размер на триъгълника:");
        int size = scanner.nextInt();

        // Извикваме метода за отпечатване на триъгълник
        printTriangle(size);
    }

}
