package Lab1.Q3;

public class Q3Sol {
    public static int[] copyOf(int[] array) {
        int[] copy = new int[array.length];
//        System.arraycopy(array, 0, copy, 0, array.length);
        for(int i = 0; i < array.length; i++)
            copy[i] = array[i];
        return copy;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] copy = copyOf(arr);
        for(int i : copy)
            System.out.println(i);
    }
}
