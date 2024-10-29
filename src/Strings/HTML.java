package Strings;

import java.util.Scanner;

public class HTML {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитаме заглавието, съдържанието и коментарите
        String title = scanner.nextLine();
        String content = scanner.nextLine();

        StringBuilder comments = new StringBuilder();
        String line;
        while (!(line = scanner.nextLine()).equals("end of comments")) {
            comments.append("<div>").append(line).append("</div>\n");
        }

        // Създаваме HTML изход
        StringBuilder htmlOutput = new StringBuilder();
        htmlOutput.append("<h1>").append(title).append("</h1>\n")
                .append("<article>").append(content).append("</article>\n")
                .append(comments);

        // Принтираме HTML съдържанието
        System.out.println(htmlOutput.toString());

    }
}

