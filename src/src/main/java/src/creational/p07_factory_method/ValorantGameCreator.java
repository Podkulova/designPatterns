package src.creational.p07_factory_method;

public class ValorantGameCreator implements GameFactory{
    @Override
    public Game create() {
        return new PCGame("Valorant", "Online",4,10,true);
    }
}
