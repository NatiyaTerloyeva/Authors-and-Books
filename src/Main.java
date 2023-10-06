import com.sun.source.tree.UsesTree;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Opter forfattere

        Author author1 = new Author("Forfatter 1", "mand", "forfatter1@gmail.com");
        Author author2 = new Author("Forfatter 2", "kvinde", "forfatter2@gmail.com");


// Opret bøger og tilføj dem til forfattere
        Book book1 = new Book("Bog 1", author1, 200);
        Book book2 = new Book("Bog 2", author1, 250);
        Book book3 = new Book("Bog 3", author2, 180);

        author1.addBook(book1);
        author1.addBook(book2);
        author2.addBook(book3);

        System.out.println("Liste over forfattere med deres udgivelser");
        System.out.println(author1);
        System.out.println(author2);
    }
}


