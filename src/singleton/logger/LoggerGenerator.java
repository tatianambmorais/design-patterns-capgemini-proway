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

    public void addLogs(String log, String level) {
        logs.add(log);
        Level logLevel;
        switch(level){
            case "info":
                logLevel = Level.INFO;
                break;
            case "warning":
                logLevel = Level.WARNING;
                break;
            case "error":
                logLevel = Level.SEVERE;
                break;

            default:
                logLevel = Level.INFO; // ou você pode lançar uma exceção ou usar um nível padrão
                logger.warning("Nível de log desconhecido: " + level + ". Usando INFO como padrão");

        }
        logger.log(logLevel, "Log added: {0}", log);

    }


}
