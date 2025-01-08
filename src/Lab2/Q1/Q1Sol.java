package Lab2.Q1;

public class Q1Sol {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Shauryadeep", "Raolji", 100);
//        testing the toString function
        System.out.println(e1);
//        annual salary
        System.out.println(e1.getAnnualSalary());
//        raise salary
        e1.raiseSalary(10);
        System.out.println(e1.getSalary());

    }
}
