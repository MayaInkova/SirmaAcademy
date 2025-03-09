package Loops;

public class StringBuilderReverse {

    public static void main(String[] args) {
        System.out.println(reverseString("hello")); // olleh
        System.out.println(reverseString("Java")); // avaJ
    }
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
