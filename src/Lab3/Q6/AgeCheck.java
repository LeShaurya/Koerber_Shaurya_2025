package Lab3.Q6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Name: " + name);
        } catch (InputMismatchException e) {
            System.out.println("There is a mismatch while entering name.");
        }
        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            ageChecker(age);
            System.out.println("Age: " + age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input for age. Please enter an integer.");
        } finally {
            scanner.close();
        }
    }
    private static void ageChecker(int age) throws InvalidAgeException {
        if (!(age >= 18 && age < 60)) {
            throw new InvalidAgeException("Enter age between 18 and 60");
        }
        System.out.println("Age is valid.");
    }
}
