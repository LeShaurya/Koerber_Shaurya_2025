package lab9.com.java9.features;

 interface Java8DBLogging
{
    default void logInfo(String message)
    {
        System.out.println(" Step1: Connect to DataBase");
        System.out.println(" Step2: Log Info Message");
        System.out.println("Step3: Close the DataBase connection");
    }

    default void logWarn(String message)
    {
        System.out.println(" Step1: Connect to DataBase");
        System.out.println(" Step2: Log warn Message");
        System.out.println("Step3: Close the DataBase connection");
    }

    default void logError(String message)
    {
        System.out.println(" Step1: Connect to DataBase");
        System.out.println(" Step2: Log error Message");
        System.out.println("Step3: Close the DataBase connection");
    }

}

public class A_PrivateMethodInsideInterface {
    public static void main(String[] args) {

    }
}
















