import com.sun.source.tree.UsesTree;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Opter forfattere

        Author author1 = new Author("H. C. Andersen", "M", "hc@andersen.dk");
        Author author2 = new Author("J.K. Rowling", "F", "jk@rowling.co.uk");
        Author author3 = new Author("Kirkegaard", "M", "kirkeg@ard.dk");


// Opret bøger og tilføj dem til forfattere
        Book book1 = new Book("Klods-Hans", author1, 48);
        Book book2 = new Book("Fyrtøjet", author2, 37);

        Book book3 = new Book("Harry Potter - Part 1", author2, 437);
        Book book4 = new Book("Harry Potter - Part 2", author2, 652);
        Book book5 = new Book("Harry Potter - Part 3", author2, 318);
        Book book6 = new Book("Harry Potter - Part 4", author2, 445);

        Book book7 = new Book("Filosofiens grundviden", author3, 912);
        Book book8 = new Book("Filosofi for viderkomme", author3, 713);
        Book book9 = new Book(" Avanceret akademisk filosofi", author3, 599);


        author1.addBook(book1);
        author1.addBook(book2);
        author2.addBook(book3);
        author2.addBook(book4);
        author2.addBook(book5);
        author2.addBook(book6);
        author3.addBook(book7);
        author3.addBook(book8);
        author3.addBook(book9);

        System.out.println("Liste over forfattere med deres udgivelser");
        System.out.println(author1);
        System.out.println(author2);
        System.out.println(author3);
    }
}


