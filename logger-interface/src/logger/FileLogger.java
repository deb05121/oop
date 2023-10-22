package logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class FileLogger implements MyLogger{

    @Override
    public void log(String message) {

    }

    @Override
    public void log(String messageA, String messageB) {
        Logger logger = Logger.getLogger(FileLogger.class.getName());
        FileHandler fh;
        try{
            fh = new FileHandler("C:/temp/MyLogFile.log");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            logger.log(Level.SEVERE, "logging: {0} {1}", new Object[]{messageA, messageB});

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
