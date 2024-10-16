package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Stack<Integer> mainStack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();

        for (int i = 0; i < N; i++) {
            int command = sc.nextInt();

            switch (command) {
                case 1: // "1 X" - Push element X onto the stack
                    int X = sc.nextInt();
                    mainStack.push(X);
                    // Update max stack
                    if (maxStack.isEmpty()) {
                        maxStack.push(X);
                    } else {
                        maxStack.push(Math.max(X, maxStack.peek()));
                    }
                    break;

                case 2: // "2" - Delete the element on the top of the stack
                    if (!mainStack.isEmpty()) {
                        mainStack.pop();
                        maxStack.pop();
                    }
                    break;

                case 3: // "3" - Print the maximum element in the stack
                    if (!maxStack.isEmpty()) {
                        System.out.println(maxStack.peek());
                    }
                    break;
            }
        }
    }
}

