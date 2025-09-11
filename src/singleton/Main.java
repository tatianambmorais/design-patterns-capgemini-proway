package singleton;

import singleton.game.GameSession;
import singleton.logger.LoggerGenerator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Singleton - Exercicio 1

        LoggerGenerator logger = LoggerGenerator.getInstance();

        logger.addLogs("Iniciando aplicação...");
        logger.addLogs("Conectando ao banco de dados...");
        logger.addLogs("Processamento concluído com sucesso.");

        logger.printLogs();


        // Singleton - Exercício 2
        GameSession gameSession = GameSession.getInstance();
        gameSession.addPoints(100);
        gameSession.upgradeLevel();
        gameSession.looseLifes();
        gameSession.looseLifes();
        gameSession.printCurrentState();


    }
}
