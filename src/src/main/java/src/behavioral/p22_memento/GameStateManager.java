package src.behavioral.p22_memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class GameStateManager {
    private final Deque<GameStateSnapshot> snapshots = new ArrayDeque<>();

    public void saveGame(final GameState gameState) {
        GameStateSnapshot gameStateSnapshot = new GameStateSnapshot(gameState);
        snapshots.push(gameStateSnapshot);
    }

    public GameStateSnapshot restorePreviousCheckpoint() {
        return snapshots.pop();
    }
}
