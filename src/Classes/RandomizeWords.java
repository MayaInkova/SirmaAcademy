package Classes;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
        public static void main(String[] args) {
            // Създаваме обект Scanner за четене на входа
            Scanner scanner = new Scanner(System.in);

            // Четем ред с думи от потребителя
            System.out.println("Въведете списък от думи на един ред:");
            String input = scanner.nextLine();

            // Разделяме низа на масив от думи
            String[] words = input.split(" ");

            // Създаваме обект Random за генериране на случайни числа
            Random rnd = new Random();

            // Разбъркваме думите чрез размяна на всяка дума с друга на произволна позиция
            for (int i = 0; i < words.length; i++) {
                // Генерираме произволен индекс
                int randomIndex = rnd.nextInt(words.length);

                // Разменяме думите на позиции i и randomIndex
                String temp = words[i];
                words[i] = words[randomIndex];
                words[randomIndex] = temp;
            }

            // Отпечатваме всяка дума на нов ред
            System.out.println("Разбъркани думи:");
            for (String word : words) {
                System.out.println(word);
            }
        }
    }

