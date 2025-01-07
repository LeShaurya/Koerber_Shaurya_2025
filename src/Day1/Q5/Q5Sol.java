package Day1.Q5;

import java.util.Scanner;

public class Q5Sol {
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0 || year % 100 != 0) && (year % 4 == 0);
    }

    public static int noOfDays(int month, int year) {
        int[] days = {-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(isLeapYear(year))
            days[2] = 29;
        return days[month];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dd = sc.nextInt();
        int mm = sc.nextInt();
        int yyyy = sc.nextInt();
        if(mm % 10 == mm)
            System.out.println("input date is: " + dd +"/0" + mm + "/" + yyyy);
        else
            System.out.println("input date is: " + dd +"/" + mm + "/" + yyyy);
        dd = dd + 1;
        if(dd > noOfDays(mm, yyyy)) {
          dd = 1;
          mm += 1;
          if(mm > 12) {
              mm = 1;
              yyyy += 1;
          }
        }
        if(mm % 10 == mm)
            System.out.println("input date is: " + dd +"/0" + mm + "/" + yyyy);
        else
            System.out.println("input date is: " + dd +"/" + mm + "/" + yyyy);
    }
}
