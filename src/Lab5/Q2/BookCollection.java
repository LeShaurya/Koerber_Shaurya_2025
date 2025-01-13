package Lab5.Q2;

import java.util.Collections;
import java.util.List;

public class BookCollection {
    private String owner;
    private List<Book> bookList;

    public BookCollection(String owner, List<Book> bookList) {
        this.owner = owner;
        this.bookList = bookList;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void sortByLexicographicOrderOfBookTitle() {
        Collections.sort(bookList);
    }

    public void sortByLexicographicOrderOfAuthor() {
        Collections.sort(bookList, new OrderByAuthor());
    }

    public void hasBook(Book b) {
        for(Book book : bookList) {
            if(book.equals(b)) {
                System.out.println("the owner has the particular book");
                return;
            }
        }
        System.out.println("The owner doesn't have the book.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BookCollection{");
        sb.append("\nowner='").append(owner).append("' \n");
        sb.append("bookList={\n");
        for (Book book : bookList) {
            sb.append(book).append('\n');
        }
        sb.append("}\n}");
        return sb.toString();
    }

}
