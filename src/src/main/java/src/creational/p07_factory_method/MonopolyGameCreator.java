package src.creational.p07_factory_method;

public class MonopolyGameCreator implements GameFactory{
    @Override
    public Game create() {
        return new BoardGame("Monopoly", "Family",2,4);
    }
}
