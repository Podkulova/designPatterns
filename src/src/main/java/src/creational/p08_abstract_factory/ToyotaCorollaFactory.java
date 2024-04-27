package src.creational.p08_abstract_factory;

public class ToyotaCorollaFactory implements CarFactory{
    @Override
    public Car createCombi() {
        return new ToyotaCorollaCombi();
    }

    @Override
    public Car createsedan() {
        return new ToyotaCorollaSedan();
    }

    @Override
    public Car createHatchback() {
        return new ToyotaCorollaHatchback();
    }
}
