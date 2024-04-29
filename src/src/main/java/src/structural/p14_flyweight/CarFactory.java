package src.structural.p14_flyweight;

import java.util.List;

public class CarFactory {
    private static final List<Engine> ENGINES = List.of(
            new Engine("polo", 1.6D, EngineType.DIESEL),
            new Engine("poloGTI", 2.1D, EngineType.GASOLINE),
            new Engine("golf", 1.5D, EngineType.GASOLINE),
            new Engine("e", 0D, EngineType.ELECTRIC)
    );
    private static Engine findEngineBykey(final  String key) {
        return  ENGINES.stream()
                .filter(engine -> engine.getIdentifier().equals(key))
                .findFirst()
                .orElseThrow();
    }
    public Car createVWPolo(final String vin, final String version) {
        return new Car("VW", vin, version, "Polo", findEngineBykey("polo"));
    }
    public Car createVWPoloGTI(final String vin, final String version) {
        return new Car("VW", vin, version, "PoloGTI", findEngineBykey("poloGTI"));
    }

    public Car createVWPoloGolf(final String vin, final String version) {
        return new Car("VW", vin, version, "Golf", findEngineBykey("golf"));
    }
    public Car createSkodaCityGo(final String vin, final String version) {
        return new Car("Škoda", vin, version, "CityGo", findEngineBykey("e"));
    }
}
