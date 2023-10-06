import java.util.ArrayList;

public class Book {

    private String title;

    private Author author;

    private int pageCount;


    public Book(String title, Author author, int pageCount) {

        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return title + " af " + author.getName() + " ( " + pageCount + "sider";
    }
}
