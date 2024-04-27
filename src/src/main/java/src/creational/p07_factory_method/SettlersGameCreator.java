package src.creational.p07_factory_method;

public class SettlersGameCreator implements GameFactory{
    @Override
    public Game create() {
        return new BoardGame("Settlers", "Family", 3, 4);
    }
}
