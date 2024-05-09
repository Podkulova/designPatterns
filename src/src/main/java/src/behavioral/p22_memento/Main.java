package src.behavioral.p22_memento;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final GameState gameState = new GameState(100,80, new ArrayList<>());
        final GameStateManager gameStateManager = new GameStateManager();

        System.out.println(gameState);
        gameStateManager.saveGame(gameState);

        gameState.addItem("Basic sword");
        gameState.takeDamage(10);
        System.out.println(gameState);
        gameStateManager.saveGame(gameState);

        gameState.takeDamage(50);
        gameState.addItem("Shield");
        System.out.println(gameState);
        gameStateManager.saveGame(gameState);

        gameStateManager.restorePreviousCheckpoint();
        final GameStateSnapshot gameStateSnapshot = gameStateManager.restorePreviousCheckpoint();
        gameState.restoreFromSnapshot(gameStateSnapshot);
        System.out.println("Restored");
        System.out.println(gameState);

    }
}
