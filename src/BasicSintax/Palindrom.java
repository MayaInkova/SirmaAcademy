package BasicSintax;

public class Palindrom {
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar")); // true
        System.out.println(isPalindrome("hello"));   // false
        System.out.println(isPalindrome("madam"));   // true
        System.out.println(isPalindrome("12321"));   // true
        System.out.println(isPalindrome("java"));    // false
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Ако символите не съвпадат, не е палиндром
            }
            left++;
            right--;
        }
        return true; // Ако преминем през всички символи, значи е палиндром
    }
}

//Алтернативно решение с StringBuilder (по-лесен, но по-бавен метод)
//    public static boolean isPalindrome(String str) {
//    return str.equals(new StringBuilder(str).reverse().toString()); }
// .toString() – конвертираме обратно в String.
//  equals() – сравняваме с оригиналния низ.