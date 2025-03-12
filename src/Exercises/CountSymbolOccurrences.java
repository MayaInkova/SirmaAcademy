package Exercises;

public class CountSymbolOccurrences {
    public static void main(String[] args) {
        String text = "Примерен текст с някои символи";
        char symbol = 'е';
        int count = countSymbolOccurrences(text, symbol);
        System.out.println("Символът '" + symbol + "' се среща " + count + " пъти.");
    }

    public static int countSymbolOccurrences(String str, char symbol) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == symbol) {
                count++;
            }
        }
        return count;
    }
}
