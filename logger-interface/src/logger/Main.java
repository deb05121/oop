package logger;

public class Main {
    public static void main(String[] args) {
        ConsoleLogger cLogger = new ConsoleLogger();
        cLogger.getConsolLogger("It's just an info.");

        FileLogger fLogger = new FileLogger();
        fLogger.getFileLogger("parameter1", "parameter2");

    }
}
