package logger;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class FileLogger implements MyLogger {
    @Override
    public void log(String message) {
        Logger logger = Logger.getLogger(FileLogger.class.getName());
        FileHandler fh;
        System.out.println("You should specify the path to the log file:");
        try (Scanner scanner = new Scanner(System.in)){
            String url = scanner.nextLine();
            fh = new FileHandler(url);
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
            logger.log(Level.SEVERE, "logging: {0}", new Object());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
