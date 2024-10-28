package Strings;

import java.util.HashMap;
import java.util.Scanner;

public class MorseCodeTranslator {

        public static void main(String[] args) {
            // Създаваме карта за преобразуване на морзов код в английски букви
            HashMap<String, String> morseToEnglish = new HashMap<>();

            // Попълваме картата с морзовите кодове за всяка буква
            morseToEnglish.put(".-", "A");
            morseToEnglish.put("-...", "B");
            morseToEnglish.put("-.-.", "C");
            morseToEnglish.put("-..", "D");
            morseToEnglish.put(".", "E");
            morseToEnglish.put("..-.", "F");
            morseToEnglish.put("--.", "G");
            morseToEnglish.put("....", "H");
            morseToEnglish.put("..", "I");
            morseToEnglish.put(".---", "J");
            morseToEnglish.put("-.-", "K");
            morseToEnglish.put(".-..", "L");
            morseToEnglish.put("--", "M");
            morseToEnglish.put("-.", "N");
            morseToEnglish.put("---", "O");
            morseToEnglish.put(".--.", "P");
            morseToEnglish.put("--.-", "Q");
            morseToEnglish.put(".-.", "R");
            morseToEnglish.put("...", "S");
            morseToEnglish.put("-", "T");
            morseToEnglish.put("..-", "U");
            morseToEnglish.put("...-", "V");
            morseToEnglish.put(".--", "W");
            morseToEnglish.put("-..-", "X");
            morseToEnglish.put("-.--", "Y");
            morseToEnglish.put("--..", "Z");

            // Четем съобщението на морзов код от потребителя
            System.out.println("Въведете съобщението на морзов код:");
            Scanner scanner = new Scanner(System.in);
            String morseMessage = scanner.nextLine();
            scanner.close();

            // Заменяме "|" с интервал за разделяне на думите
            morseMessage = morseMessage.replace("|", " ");

            // Разделяме кода по думи и символи
            String[] morseWords = morseMessage.split("  "); // Две интервалчета разделят думите

            StringBuilder englishMessage = new StringBuilder();

            // Обработваме всяка дума от морзовия код
            for (String morseWord : morseWords) {
                String[] morseLetters = morseWord.split(" "); // Разделяме всяка дума по отделните символи
                for (String morseLetter : morseLetters) {
                    String englishLetter = morseToEnglish.get(morseLetter); // Преобразуваме символа в английски буква
                    if (englishLetter != null) {
                        englishMessage.append(englishLetter); // Добавяме преведения символ
                    }
                }
                englishMessage.append(" "); // Добавяме интервал за следващата дума
            }

            // Отпечатваме преведения текст
            System.out.println("Преводът на съобщението е: " + englishMessage.toString().trim());
        }

    }

