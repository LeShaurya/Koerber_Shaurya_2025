package Lab3.Q3;

import java.io.Serializable;

public class Employee implements Serializable {
    private int id;
    private String name;
    private Address address;
    transient double salary;

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String display() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", address=").append(address.display());
        sb.append('}');
        return sb.toString();
    }
}
