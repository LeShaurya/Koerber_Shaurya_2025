package Lab2.Q2;

import java.util.Objects;

public class BookStore {
    private Book[] books = new Book[10];

    public BookStore() {
        books[0] = new Book("1984", "George Orwell", "1234", 5);
        books[1] = new Book("1984", "George Orwell", "1234", 5);
        books[2] = new Book("1984", "George Orwell", "1234", 5);
        books[3] = new Book("1984", "George Orwell", "1234", 5);
    }

    public void sell(String bookTitle, int noOfCopies) {
        for(Book book : books) {
            if(Objects.equals(book.getBookTitle(), bookTitle)) {
                book.setNoOfCopies(book.getNoOfCopies() - noOfCopies);
                System.out.println("updated the count");
                return;
            }
            System.out.println("cannot find the book");
            return;
        }
    }

    public void order(String ISBN, int noOfCopies) {
        for(Book book : books) {
            if(Objects.equals(book.getISBN(), ISBN)) {
                book.setNoOfCopies(book.getNoOfCopies() + noOfCopies);
                System.out.println("updated the count");
                return;
            }
            System.out.println("cannot find the book");
            return;
        }
    }

    public void display() {
        for(Book book : books)
            if(book != null)
                book.display();
    }
}


