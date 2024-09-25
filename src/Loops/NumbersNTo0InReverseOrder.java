package Loops;

public class NumbersNTo0InReverseOrder {
    public static void printReverse(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        // Example usage
        int n = 10; // You can change this to any positive number
        printReverse(n);
    }
}
