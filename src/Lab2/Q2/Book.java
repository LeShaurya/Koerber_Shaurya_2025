package Lab2.Q2;

public class Book {
    private final String bookTitle;
    private final String author;
    private final String ISBN;
    private int noOfCopies;

    public Book(String bookTitle, String author, String ISBN, int noOfCopies) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.ISBN = ISBN;
        this.noOfCopies = noOfCopies;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public String getAuthor() {
        return author;
    }

    public void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public void display() {
        System.out.println(bookTitle + "-" + author + "-" + ISBN + "-" + noOfCopies);
    }

}
