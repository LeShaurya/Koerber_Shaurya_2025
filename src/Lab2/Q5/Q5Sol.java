package Lab2.Q5;

public class Q5Sol {
    public static void main(String[] args) {
        Employee e = new Employee("Shaurya", "1", 15, 12.5);
        Invoice i = new Invoice("Door Hinges", "Chrome coated steel hinges", 100, 3);
        System.out.println(e);
        System.out.println(i);
        i.getPayment();
        e.getPayment();
    }


}
