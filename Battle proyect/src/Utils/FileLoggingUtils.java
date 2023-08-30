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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void viewLog() {
    }
    public static void deleteLog() {
    }
}
