package Strings;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName {

    public static void main(String[] args) {
        // Списък с примерни имена за тестване
        List<String> names = List.of(
                "Иван Иванов",
                "Георги Георгиев",
                "иван иванов",
                "Георги георгиев",
                "И. Иванов",
                "Мария Стоянова",
                "Петър Петров",
                "мариа стоянова",
                "Димитър Димитров",
                "Светлин Наков"
        );

        // Регулярен израз за съвпадение на пълни имена на кирилица
        String regex = "\\b[А-Я][а-я]+ [А-Я][а-я]+\\b";

        // Компилиране на шаблона
        Pattern pattern = Pattern.compile(regex);

        System.out.println("Валидни пълни имена:");
        for (String name : names) {
            Matcher matcher = pattern.matcher(name);
            if (matcher.matches()) {
                System.out.println(name);
            }
        }
    }
}

