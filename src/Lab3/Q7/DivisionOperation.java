package Lab3.Q7;

import java.util.Scanner;

public class DivisionOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dividend");
        int a = sc.nextInt();
        System.out.println("Enter the divisor");
        int b = sc.nextInt();
        try {
            int quotient;
            quotient = a / b;
            System.out.println("the quotient of " + a + "/" + b + "= " + quotient);
        } catch (ArithmeticException e) {
            System.out.println("DivideByZeroException caught");
        } finally {
            System.out.println("Inside finally block");
        }
    }
}
