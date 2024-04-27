package src.creational.p08_abstract_factory;

public interface CarFactory {
    Car createCombi();
    Car createsedan();
    Car createHatchback();
}
