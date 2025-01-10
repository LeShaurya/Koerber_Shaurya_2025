package Lab3.Q4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BookApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookList bookList = new BookList("data.txt");

        // Display all the books present
        bookList.display();

        // Searching for a book
        try {
            System.out.print("Enter book ID: ");
            int bookId = sc.nextInt();
            Book book = bookList.searchBooks(bookId);
            System.out.println(book);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number for book ID.");
        } catch (BookNotFoundException e) {
            System.out.println("Book with ID not found.");
        }

        // Selling of books
        try {
            System.out.print("Enter ISBN to sell: ");
            String ISBN = sc.next();
            System.out.print("Enter number of copies to sell: ");
            int noOfCopies = sc.nextInt();

            bookList.sellBooks(ISBN, noOfCopies);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid data.");
        } catch (InvalidCountException | BookNotFoundException | NotSufficientBooksException e) {
            System.out.println(e.getMessage());
        }

        // Purchasing of books
        try {
            System.out.print("Enter ISBN to purchase: ");
            String ISBN = sc.next();
            System.out.print("Enter number of copies to purchase: ");
            int noOfCopies = sc.nextInt();
            bookList.purchaseBooks(ISBN, noOfCopies);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid data.");
        } catch (InvalidCountException | BookNotFoundException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
