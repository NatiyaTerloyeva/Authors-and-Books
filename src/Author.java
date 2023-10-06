import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private String gender;
    private String email;
    private List<Book> books;


    public Author(String name, String gender, String email) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.books = new ArrayList<>();

    }

    public String getName() {
        return  name;
    }

    public void changeEmail(String newEmail) {
        this.email = newEmail;
    }
    public  void addBook(Book book) {
        this.books.add(book);
    }

    public String toString() {
        StringBuilder authorInfo = new StringBuilder();
        authorInfo.append(name).append("(").append(gender).append(") - Email: ").append(email).append("\nUdgivelser: ");
        for (Book book : books) {
            authorInfo.append(book.getTitle()).append(", ");
        }

        if (!books.isEmpty()) {
            authorInfo.delete(authorInfo.length() - 2, authorInfo.length());
        }
        return authorInfo.toString();

        }

    }
