package Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        String input = "+359 2 123 4567, +359-2-123-4567, +359 2-123 4567, +359 2 123-4567, +359 2 123 456";

        // Регулярен израз за съвпадение на валидни телефонни номера от София
        String regex = "(?<=\\s|^)\\+359([ -])2\\1\\d{3}\\1\\d{4}\\b";

        // Компилираме шаблона
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> validPhones = new ArrayList<>();

        // Намираме всички валидни номера и ги добавяме в списъка
        while (matcher.find()) {
            validPhones.add(matcher.group());
        }

        // Печатаме валидните номера, разделени с ", "
        System.out.println(String.join(", ", validPhones));
    }
}
