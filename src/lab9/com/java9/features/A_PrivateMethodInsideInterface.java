package lab9.com.java9.features;

 interface Java8DBLogging
{
    default void logInfo(String message)
    {
        log("Success ", message);
    }

    default void logWarn(String message)
    {
        log("warn ", message);
    }

    default void logError(String message)
    {
        log("error ", message);
    }
    private void log(String value, String message) {
        System.out.println(message);
        System.out.println(" Step1: Connect to DataBase");
        System.out.println(" Step2: Log" + value +"Message");
        System.out.println("Step3: Close the DataBase connection");
    }
}

class Logger implements Java8DBLogging {

}

public class A_PrivateMethodInsideInterface {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.logInfo("JDBC localhost:3306/123");
        logger.logWarn("JDBC localhost:3306/123");
        logger.logError("JDBC localhost:3306/123");
    }
}
















