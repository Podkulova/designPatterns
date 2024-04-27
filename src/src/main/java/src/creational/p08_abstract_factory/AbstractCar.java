package src.creational.p08_abstract_factory;

public abstract class AbstractCar implements Car{
    @Override
    public String toString() {
        return "Car: " + getProducer() + " "
                + getModelName() + " "
                + getType() + " "
                + "cylinders: " + getCylinderNum() + " "
                + "volume: " + getEngineValue();
    }
}
