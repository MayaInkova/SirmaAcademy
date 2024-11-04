package Exam;

import java.util.Scanner;

public class OrderOfThePhoenixVotes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Въвеждаме  гласовете, разделени с ',': ");
        String input = scanner.nextLine();

        // Разделяне на входа в масив от гласове
        String[] votes = input.split(",\\s*");

        // Определяне на решението
        String decision = determineDecision(votes);
        System.out.println("Решението на Ордена е: " + decision);


    }

    public static String determineDecision(String[] votes) {
        int yesCount = 0;       // Брояч на гласовете "Yes"
        int noCount = 0;        // Брояч на гласовете "No"
        int abstainCount = 0;   // Брояч на гласовете "Abstain"

        // Броене на гласовете
        for (String vote : votes) {
            switch (vote.trim()) { // Използване на trim() за да премахнем ненужните интервали
                case "Yes":
                    yesCount++;
                    break;
                case "No":
                    noCount++;
                    break;
                case "Abstain":
                    abstainCount++;
                    break;
            }
        }

        // Определяне на решението
        if (yesCount > noCount) {
            return "Yes"; // Повечето гласове са "Да"
        } else if (noCount > yesCount) {
            return "No"; // Повечето гласове са "Не"
        } else if (yesCount == 0 && noCount == 0) {
            return "Abstain"; // Всички гласове са "Въздържал се"
        } else {
            return "Tie"; // Равенство
        }
    }
}


