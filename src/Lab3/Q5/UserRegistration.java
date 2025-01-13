package Lab3.Q5;

import java.util.Scanner;

public class UserRegistration {
    static void registerUser(String country) throws InvalidCountryException {
        if(!country.equals("India")){
            throw new InvalidCountryException("User outside India cannot register");
        }
        System.out.println("User registration done successfully");
    }

    public static void main(String[] args) {
//        No issues
        registerUser("India");
        try(Scanner sc = new Scanner(System.in)){
            registerUser(sc.next());
        } catch (InvalidCountryException e) {
            System.out.println("User outside India cannot register");
        }
    }
}
