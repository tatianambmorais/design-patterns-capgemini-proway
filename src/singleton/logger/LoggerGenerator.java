package singleton.logger;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerGenerator {
    private static LoggerGenerator instance;
    private final List<String> logs;
    private static final Logger logger = Logger.getLogger(LoggerGenerator.class.getName());

    private LoggerGenerator() {
        logs = new ArrayList<>();
    }

    public static synchronized LoggerGenerator getInstance() {
        if (instance == null) {
            instance = new LoggerGenerator();
        }
        return instance;
    }

    public void addLogs(String log) {
        logs.add(log);
        logger.log(Level.INFO, "Log added: {0}", log);
    }

    public void printLogs() {
        logger.info("-- PRINTING LOGS --");
        for (String log : logs) {
            logger.info(log);
        }
    }
}
