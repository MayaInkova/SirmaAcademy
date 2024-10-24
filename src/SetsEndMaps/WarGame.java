package SetsEndMaps;

import java.util.HashSet;
import java.util.Scanner;

public class WarGame {
    public static void main(String[] args) {


        // Множества за съхраняване на VIP и обикновени гости
        HashSet<String> vipGuests = new HashSet<>();
        HashSet<String> regularGuests = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        // Четене на входа до командата "PARTY"
        String input = scanner.nextLine();
        while (!input.equals("PARTY")) {
            // Ако номерът започва с цифра, добавяме го в листа с VIP гости
            if (Character.isDigit(input.charAt(0))) {
                vipGuests.add(input);
            } else {
                // В противен случай добавяме в листа с обикновени гости
                regularGuests.add(input);
            }
            input = scanner.nextLine();
        }

        // Четене на гости, които пристигат на партито
        input = scanner.nextLine();
        while (!input.equals("END")) {
            // Премахваме присъстващите гости от съответния списък
            vipGuests.remove(input);
            regularGuests.remove(input);

            input = scanner.nextLine();
        }

        // Принтираме броя на всички непристигнали гости
        System.out.println(vipGuests.size() + regularGuests.size());

        // Принтираме VIP гостите, които не са дошли
        for (String guest : vipGuests) {
            System.out.println(guest);
        }

        // Принтираме обикновените гости, които не са дошли
        for (String guest : regularGuests) {
            System.out.println(guest);
        }
    }
}

