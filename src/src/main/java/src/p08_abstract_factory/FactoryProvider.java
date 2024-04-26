package src.p08_abstract_factory;

public class FactoryProvider {
    public CarFactory createFactory(String carType) {
        if (carType.equals("AudiA4")) {
            return new AudiA4Factory();
        } else if (carType.equals("ToyotaCorolla")) {
            return new ToyotaCorollaFactory();
        } else {
            throw new UnsupportedOperationException("Cannot produce car of this type");
        }
    }
}
