package src.creational.p08_abstract_factory;

public abstract class ToyotaCorolla extends AbstractCar{
    @Override
    public String getProducer() {
        return "Toyota";
    }
    @Override
    public String getModelName() {
        return "Corolla";
    }

}
