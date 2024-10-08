package Classes;

import java.util.Scanner;

public class Article {
    private String title;   // Заглавие на статията
    private String content; // Съдържание на статията
    private String author;  // Автор на статията

    // Конструктор на класа Article
    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    // Метод за редактиране на съдържанието на статията
    public void edit(String newContent) {
        this.content = newContent;
    }

    // Метод за смяна на автора на статията
    public void changeAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    // Метод за преименуване на статията
    public void rename(String newTitle) {
        this.title = newTitle;
    }

    // Метод за форматирано извеждане на статията
    @Override
    public String toString() {
        return title + " - " + content + ": " + author;
    }
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


