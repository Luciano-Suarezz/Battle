package Utils;  // Assuming the package name is Utils

import java.io.IOException;
import java.util.logging.*;

public class FileLoggingUtils {

    public static void setupFileLogging() {
        try {
            // Create a logger instance
            Logger logger = Logger.getLogger(FileLoggingUtils.class.getName());

            // Create a file handler and set the formatter
            FileHandler fileHandler = new FileHandler("battles.log", true);
            fileHandler.setFormatter(new SimpleFormatter());

            // Add the file handler to the logger
            logger.addHandler(fileHandler);

            // Set the logging level
            logger.setLevel(Level.INFO);

            // Log messages
            logger.severe("This is a severe message.");
            logger.warning("This is a warning message.");
            logger.info("This is an info message.");
            logger.config("This is a config message.");
            logger.fine("This is a fine message.");
            logger.finer("This is a finer message.");
            logger.finest("This is the finest message.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void viewLog() {
    }
}
