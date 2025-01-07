package Day1.Q1;

public class Q1Sol {
    public static float fibonnaci(int n) {
        int num1 = 1;
        int num2 = 1;
        int curr, sum = 0;
        for(int i = 0; i < n; i++) {
            System.out.println(num1);
            sum += num1;
            curr = num1 + num2;
            num1 = num2;
            num2 = curr;
        }
        return (float) sum / n;
    }
    public static void main(String[] args) {
        System.out.println("Average of first 20 fibonnaci numbers is " + fibonnaci(20));
    }
}
