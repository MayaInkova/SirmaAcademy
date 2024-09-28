package Loops;

public class NumbersUpTo1000EndingIn7 {
    public static void main(String[] args) {
        System.out.println("Числата в диапазона [1...1000], които завършват на 7:");

        // Цикъл за числата от 1 до 1000
        for (int i = 1; i <= 1000; i++) {
            // Проверка дали числото завършва на 7
            if (i % 10 == 7) {
                System.out.println(i);
            }
        }
    }
}
