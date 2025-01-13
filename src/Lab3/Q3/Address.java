package Lab3.Q3;

import java.io.Serializable;

public class Address implements Serializable {
    private String houseNumber;
    private String streetName;
    private String city;
    private String state;
    private double pinCode;

    public Address(String houseNumber, String streetName, String city, String state, double pinCode) {
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
    }

    public String display() {
        final StringBuilder sb = new StringBuilder("Address{");
        sb.append("houseNumber='").append(houseNumber).append('\'');
        sb.append(", streetName='").append(streetName).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", state='").append(state).append('\'');
        sb.append(", pinCode=").append(pinCode);
        sb.append('}');
        return sb.toString();
    }
}
