package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HotPatato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на децата и броя на завъртанията
        System.out.println("Enter the names of the children, separated by space:");
        String[] children = scanner.nextLine().split(" ");
        System.out.print("Enter the number of tosses (n): ");
        int n = scanner.nextInt();

        // Създаваме опашката с децата
        Queue<String> queue = new LinkedList<>();
        for (String child : children) {
            queue.offer(child);
        }

        // Докато в опашката има повече от едно дете
        while (queue.size() > 1) {
            // Прехвърляме децата за n-1 пъти
            for (int i = 1; i < n; i++) {
                String currentChild = queue.poll(); // Вземаме първото дете
                queue.offer(currentChild); // Поставяме го на края на опашката
            }
            // Премахваме n-тото дете
            String removedChild = queue.poll();
            System.out.println("Removed " + removedChild);
        }

        // Последното останало дете
        System.out.println("Last is " + queue.poll());
    }
}
