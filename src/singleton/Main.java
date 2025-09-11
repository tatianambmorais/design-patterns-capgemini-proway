package singleton;

import singleton.game.GameSession;
import singleton.logger.LoggerGenerator;

public class Main {
    public static void main(String[] args) {
        // Singleton - Exercicio 1

        LoggerGenerator logger = LoggerGenerator.getInstance();

        logger.addLogs("Iniciando aplicação...", "info");
        logger.addLogs("Conectando ao banco de dados...", "info");
        logger.addLogs("Falha ao conectar banco de dados.", "error");



        // Singleton - Exercício 2
        GameSession gameSession = GameSession.getInstance();
        gameSession.addPoints(100);
        gameSession.upgradeLevel();
        gameSession.looseLifes();
        gameSession.looseLifes();
        gameSession.printCurrentState();


    }
}
