package Classes;

import java.util.Scanner;

public class MainArticle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четем статията в определен формат
        String[] articleData = scanner.nextLine().split(", ");
        String title = articleData[0];
        String content = articleData[1];
        String author = articleData[2];

        // Създаваме статия с получената информация
        Article article = new Article(title, content, author);

        // Четем броя на командите
        int n = Integer.parseInt(scanner.nextLine());

        // Обработваме командите
        for (int i = 0; i < n; i++) {
            String commandLine = scanner.nextLine();
            String[] commandParts = commandLine.split(": ");

            String command = commandParts[0];
            String commandValue = commandParts.length > 1 ? commandParts[1] : "";

            switch (command) {
                case "Edit":
                    article.edit(commandValue);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(commandValue);
                    break;
                case "Rename":
                    article.rename(commandValue);
                    break;
                default:
                    System.out.println("Невалидна команда: " + command);
                    break;
            }
        }

        // Извеждаме финалното състояние на статията
        System.out.println(article);
    }
}

