package logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ConsoleLogger implements MyLogger {
    @Override
    public void log(String message) {
        Logger logger = Logger.getLogger(ConsoleLogger.class.getName());
        logger.log(Level.INFO, message);
    }
}
