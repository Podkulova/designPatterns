package src.behavioral.p22_memento;

import java.util.List;

public class GameStateSnapshot {
    private Integer health;
    private Integer mana;
    private List<String> items;

    public GameStateSnapshot(final GameState gameState) {
        this.health = gameState.getHealth();
        this.mana = gameState.getMana();
        this.items = List.copyOf(gameState.getItems());
    }

    public GameStateSnapshot(Integer health, Integer mana, List<String> items) {
        this.health = health;
        this.mana = mana;
        this.items = items;
    }

    public Integer getHealth() {
        return health;
    }

    public Integer getMana() {
        return mana;
    }

    public List<String> getItems() {
        return items;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }
}
