package Lab2.Q4;

import java.util.ArrayList;

public class Q4Sol {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        Employee e = new SalariedEmployee("Shaurya", 1, 100);
        employees.add(e);
        e = new CommisionEmployee("Rahul", 2, 20, 540);
        employees.add(e);
        e = new HourlyEmployee("Rohit", 3, 20, 2);
        employees.add(e);
        for(Employee employee : employees)
            System.out.println(employee.payment());
    }
}
