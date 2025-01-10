package Lab3.Q4;

public class Book {
    private int id;
    private String ISBN;
    private String title;
    private String author;
    private double price;
    private int noOfCopies;

    public Book(int id, String ISBN, String title, String author, double price, int noOfCopies) {
        this.id = id;
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.price = price;
        this.noOfCopies = noOfCopies;
        if(noOfCopies < 0) {
            throw new InvalidCountException("number of copies cannot be less than 0.");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book[");
        sb.append("id=").append(id);
        sb.append(", ISBN='").append(ISBN).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", price=").append(price);
        sb.append(", noOfCopies=").append(noOfCopies);
        sb.append(']');
        return sb.toString();
    }
}
