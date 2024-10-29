package Strings;

import java.util.List;

public class Letter {
    public static String zapalniDupkite(String pisamo, List<String> dumi) {
        // Итерация през всяка дума от списъка
        for (String duma : dumi) {
            // Създаване на "дупка" със същата дължина като думата
            String dupka = "_".repeat(duma.length());

            // Замяна само ако съществува "дупка" със същата дължина
            if (pisamo.contains(dupka)) {
                pisamo = pisamo.replaceFirst(dupka, duma);
            }
        }
        return pisamo;
    }

    public static void main(String[] args) {
        // Примерен текст с празни места и списък с думи
        String pisamo = "Здравейте, казвам се ____ и живея в ______. Любимият ми цвят е ____.";
        List<String> dumi = List.of("Иван", "София", "синьо");

        // Извеждане на попълнения текст
        System.out.println(zapalniDupkite(pisamo, dumi));
    }
}
