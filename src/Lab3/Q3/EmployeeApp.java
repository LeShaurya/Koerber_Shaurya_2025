package Lab3.Q3;

import java.io.*;

public class EmployeeApp {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Address address = new Address("12", "7th cross road", "Bangalore", "Karnataka", 560078);

        Employee employee = new Employee(123, "Shaurya", address);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("employee.txt")));
        oos.writeObject(employee);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("employee.txt")));
        Employee newEmployee = (Employee) ois.readObject();
        System.out.println(newEmployee.display());
    }

}
