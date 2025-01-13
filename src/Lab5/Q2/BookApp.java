package Lab5.Q2;

import java.util.ArrayList;
import java.util.List;

public class BookApp {
    public static void main(String[] args) {
        List<Book> bl = new ArrayList<Book>();
        bl.add(new Book("Java in depth", "Zohn"));
        bl.add(new Book("Python", "Gabriel"));
        bl.add(new Book("C++", "Joseph"));

        BookCollection bc = new BookCollection("shaurya", bl);
//        printing the book
        System.out.println(bc);
//        sorting on the basis of the book author
        bc.sortByLexicographicOrderOfAuthor();
        System.out.println("Ordering by book author.");
        System.out.println(bc);
//        sorting on the basis of the book title
        bc.sortByLexicographicOrderOfBookTitle();
        System.out.println("Ordering by book title.");
        System.out.println(bc);
    }
}
