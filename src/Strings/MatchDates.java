package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates {

    public static void main(String[] args) {
        // Примерни дати за тестване
        String[] dates = {
                "13-Mar-2016",
                "25.Jul.2020",
                "31/Dec/2021",
                "01-Jan-2020",
                "15/Jun-2022",  // Невалидна
                "28.Aug/2019"   // Невалидна
        };

        // Регулярен израз за съвпадение на дата
        String regex = "(?<day>\\d{2})(?<separator>[./-])(?<month>[A-Z][a-z]{2})\\k<separator>(?<year>\\d{4})";

        // Компилираме шаблона
        Pattern pattern = Pattern.compile(regex);

        // Проверяваме всяка дата
        for (String date : dates) {
            Matcher matcher = pattern.matcher(date);
            if (matcher.matches()) {
                // Печатаме уловените групи
                System.out.printf("Съвпадение: %s | Ден: %s, Месец: %s, Година: %s%n",
                        date,
                        matcher.group("day"),
                        matcher.group("month"),
                        matcher.group("year"));
            } else {
                System.out.println("Невалиден формат на дата: " + date);
            }
        }
    }
}

