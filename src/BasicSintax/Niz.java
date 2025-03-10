package BasicSintax;

public class Niz {
    public static void main(String[] args) {
        System.out.println(countChar("banana", 'a'));
        System.out.println(countChar("apple", 'p'));
        System.out.println(countChar("hello", 'l'));
        System.out.println(countChar("java", 'z'));

    }

    public static int countChar(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }

        }
        return count;
    }

}

