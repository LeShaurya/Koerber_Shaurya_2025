package Lab1.Q2;

import java.util.Scanner;

public class Q2Sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int num = sc.nextInt();
        int[] grades = new int[num];
        double total = 0.0;
        for(int i = 0; i < num; i++) {
            int marks;
            while(true) {
                System.out.println("Enter the grade for the student" + (i + 1) + ": ");
                marks = sc.nextInt();
                if(marks >= 0 && marks <= 100) {
                    grades[i] = marks;
                    total += marks;
                    break;
                }
                else
                    System.out.println("Enter valid grade");
            }
        }
        System.out.println("total: " + total);
        double avg = total / num;
        System.out.println("Average: " + avg);
    }
}
