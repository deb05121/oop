package logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ConsoleLogger {
    public void getConsolLogger(String name) {
        Logger logger = Logger.getLogger(ConsoleLogger.class.getName());
        logger.log(Level.INFO, name);

    }
}
