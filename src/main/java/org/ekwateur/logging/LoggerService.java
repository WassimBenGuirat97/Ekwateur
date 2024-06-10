package org.ekwateur.logging;

import org.ekwateur.exceptions.BillingException;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerService {
    private static final Logger logger = Logger.getLogger(LoggerService.class.getName());

    static {
        try {
            FileHandler fileHandler = new FileHandler("billing_system.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "EK-001 :Failed to initialize logger handler", e);
        }
    }

    public static void logInfo(String message) {
        logger.log(Level.INFO, message);
    }

    public static void logWarning(String message) {
        logger.log(Level.WARNING, message);
    }

    public static void logError(String message, Throwable throwable) {
        logger.log(Level.SEVERE, message, throwable);
    }
}
