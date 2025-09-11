package singleton.game;

import java.util.ArrayList;
import java.util.List;

public class GameSession {
    private static GameSession instance;
    private int pontuation;
    private int level;
    private int lifesLeft;


    private GameSession(){
      pontuation = 0;
      level = 1;
      lifesLeft = 5;
    }

    public static synchronized GameSession getInstance(){
        if(instance == null){
            instance = new GameSession();
        }
        return instance;
    }

    public void addPoints(int points){
        pontuation += points;
    }

    public void upgradeLevel(){
        level++;
    }

    public void looseLifes(){
        if(lifesLeft > 0){
          lifesLeft--;
        }
    }

    private int getPontuation() {
        return pontuation;
    }

    private int getLevel() {
        return level;
    }


    private int getLifesLeft() {
        return lifesLeft;
    }


    public void printCurrentState() {
        System.out.println("=== ESTADO DO JOGO ===");
        System.out.println("Pontuação: " + getPontuation());
        System.out.println("Nível: " + getLevel());
        System.out.println("Vidas: " + getLifesLeft());
    }


}
