package Classes;

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
}

