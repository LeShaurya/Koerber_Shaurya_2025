package Lab2.Q2;

public class BookStoreApp {
    public static void main(String[] args) {
        BookStore bs = new BookStore();
        bs.display();
        bs.sell("1984", 2);
        bs.display();
        bs.order("1234", 6);
        bs.display();
    }
}
