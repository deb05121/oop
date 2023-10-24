package logger;

import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileLogger implements MyLogger {
    private static final Logger logger = Logger.getLogger(FileLogger.class.getName());

    @Override
    public void log(String message) {

        String url;
        System.out.println("You should specify the path to the log file:");
        try (Scanner scanner = new Scanner(System.in)) {
            url = scanner.nextLine();
        }
        try (CustomFileHandler fh = new CustomFileHandler(new FileHandler(url))) {
            logger.addHandler(fh.getFileHandler());
            logger.log(Level.SEVERE, message);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
