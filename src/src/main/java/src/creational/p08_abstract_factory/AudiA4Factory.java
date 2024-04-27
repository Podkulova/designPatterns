package src.creational.p08_abstract_factory;

public class AudiA4Factory implements CarFactory{
    @Override
    public Car createCombi() {
        return new AudiA4Combi();
    }

    @Override
    public Car createsedan() {
        return new AudiA4Sedan();
    }

    @Override
    public Car createHatchback() {
        return new AudiA4Hatchback();
    }
}
