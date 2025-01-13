package Lab3.Q4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BookList {
    private List<Book> bookList = new ArrayList<Book>();

    public BookList(String filePath) {
        String line = null;
//        this throws IO Exception (Buffered Reader)
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            while((line = br.readLine()) != null) {
                String[] tokens = line.split(":");
                Book book = new Book(Integer.parseInt(tokens[0]),
                        tokens[1],
                        tokens[2],
                        tokens[3],
                        Double.parseDouble(tokens[4]),
                        Integer.parseInt(tokens[5]));
                this.bookList.add(book);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File was not found. " + filePath);
        } catch (IOException e) {
            System.out.println("Error with the input/output.");
        }
    }

    public Book searchBooks(int id) throws BookNotFoundException{
        Book returnedBook = null;
        for(Book book : bookList) {
            if(book.getId() == id) {
                returnedBook = book;
                break;
            }
        }
        if(returnedBook == null) {
            throw new BookNotFoundException("Book with id " + id + "not found.");
        }
        return returnedBook;
    }

    public void display() {
        for(Book book : bookList) {
            System.out.println(book);
        }
    }

    public void sellBooks(String isbn, int noOfCopies) throws InvalidCountException, BookNotFoundException, NotSufficientBooksException{
        if(noOfCopies < 0) {
            throw new InvalidCountException("Book count cannot be negative");
        }
        Book returnedBook = null;
        for(Book book : bookList) {
            if(Objects.equals(book.getISBN(), isbn)) {
                returnedBook = book;
                break;
            }
        }
        if(returnedBook == null) {
            throw new BookNotFoundException("Book with id " + isbn + " not found.");
        }
        if(returnedBook.getNoOfCopies() < noOfCopies) {
            throw new NotSufficientBooksException("Sufficient books are not available");
        }
        returnedBook.setNoOfCopies(returnedBook.getNoOfCopies() - noOfCopies);
    }

    public void purchaseBooks(String isbn, int noOfCopies) throws InvalidCountException, BookNotFoundException{
        if(noOfCopies < 0) {
            throw new InvalidCountException("Book count cannot be negative");
        }
        Book returnedBook = null;
        for(Book book : bookList) {
            if(Objects.equals(book.getISBN(), isbn)) {
                returnedBook = book;
                break;
            }
        }
        if(returnedBook == null) {
            throw new BookNotFoundException("Book with id " + isbn + " not found.");
        }
        returnedBook.setNoOfCopies(returnedBook.getNoOfCopies() + noOfCopies);
    }
}
