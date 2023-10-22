package logger;

public class Main {
    public static void main(String[] args) {
        ConsoleLogger cLogger = new ConsoleLogger();
        cLogger.log("It's just an info.");

        FileLogger fLogger = new FileLogger();
        fLogger.log("parameter1", "parameter2");

    }
}
