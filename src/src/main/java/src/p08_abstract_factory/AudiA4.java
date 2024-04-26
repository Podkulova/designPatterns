package src.p08_abstract_factory;

public abstract class AudiA4 extends AbstractCar {
    @Override
    public String getProducer() {
        return "Audi";
    }
    @Override
    public String getModelName() {
        return "A4";
    }
}
