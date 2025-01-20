package lab9.com.java11_17.features;

//DTO: lombok small framewrok to autogen getter...

//class Person{
//    private String name;
//    private String email;
//    private double salary;
//
//    public Person(String name, String email, double salary) {
//        this.name = name;
//        this.email = email;
//        this.salary = salary;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return Double.compare(person.salary, salary) == 0 && name.equals(person.name) && email.equals(person.email);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, email, salary);
//    }
//}
//1. immutable without boilerplate code
//2. aka final class  can not be absttract
//3. can imp new interface

interface Employable{
    public double getNetSalary();
}

record Employee(int id, String firstName, String lastName, double salary) implements Employable {

    @Override
    public int id() {
        return id;
    }

    @Override
    public String firstName() {
        return firstName;
    }

    @Override
    public String lastName() {
        return lastName;
    }

    @Override
    public double salary() {
        return salary;
    }

    @Override
    public double getNetSalary() {
        return 12 * salary;
    }
}

public class E_Records {
    public static void main(String[] args) {
        Employee e = new Employee(1, "shaurya", "raolji", 100);
        System.out.println(e.getNetSalary());
    }
}
















