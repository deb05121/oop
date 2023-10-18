package logger;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class FileLogger {
    private final Logger logger = Logger.getLogger(FileLogger.class.getName());
    private FileHandler fh = null;

    public void getFileLogger(String parameterA, String parameterB) {

        try {
            fh = new FileHandler("C:/temp/FileLogger.log");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            logger.log(Level.SEVERE, "logging: {0} {1}", new Object[]{parameterA, parameterB});

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
