package src.structural.p14_flyweight;

import lombok.Getter;

public class Engine {
    @Getter
    private static int instance = 0;
    @Getter
    private String identifier;
    @Getter
    private Double volume;
    @Getter
    private EngineType engineType;

    public Engine(String identifier, Double volume, EngineType engineType) {
        instance++;
        this.identifier = identifier;
        this.volume = volume;
        this.engineType = engineType;
    }

    public static void setInstance(int instance) {
        Engine.instance = instance;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "identifier='" + identifier + '\'' +
                ", volume=" + volume +
                ", engineType=" + engineType +
                '}';
    }
}
