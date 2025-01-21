package lab9.com.java11_17.features;

public class C_PatternMatching_instanceOfOpImprovement {
    public static void main(String[] args) {
        Object name = "SHaurya";
        if(name instanceof String string)
            System.out.println(string.length());
        else
            System.out.println("Not string");
    }
}
