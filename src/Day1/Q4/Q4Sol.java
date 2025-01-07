package Day1.Q4;

import java.util.Scanner;

public class Q4Sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int[][] ar;
        n = sc.nextInt();
        ar = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i)
                    ar[i][j] = 1;
                else
                    ar[i][j] = ar[i - 1][j - 1] + ar[i][j - 1];
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }
}
