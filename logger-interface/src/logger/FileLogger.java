package logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class FileLogger {

    public void getFileLogger(String parameterA, String parameterB) {
        Logger logger = Logger.getLogger(FileLogger.class.getName());
        FileHandler fh;
        try{
            fh = new FileHandler("C:/temp/MyLogFile.log");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            logger.log(Level.SEVERE, "logging: {0} {1}", new Object[]{parameterA, parameterB});

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
