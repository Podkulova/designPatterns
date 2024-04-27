package src.creational.p08_abstract_factory;

public class Main {
    public static void main(String[] args) {
        String carType = "AudiA4";

        CarFactory carFactory = new FactoryProvider().createFactory(carType);

        Car carCombi = carFactory.createCombi();
        System.out.println(carCombi);

        Car carSedan = carFactory.createsedan();
        System.out.println(carSedan);

        Car carHatchback = carFactory.createHatchback();
        System.out.println(carHatchback);
    }
}
