package src.structural.p14_flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Main {
    private static final int ITERATIONS = 1000;
    private static final int AVAILABLE_CAR_TYPES = 4;
    private static final List<String> VERSIONS = List.of("Basic", "Premium,", "Comfort");

    public static void main(String[] args) {

        final CarFactory carFactory = new CarFactory();

        final List<Car> cars = new ArrayList<>(ITERATIONS);

        for (int i = 0; i < ITERATIONS; i++) {
            final int carType = new Random().nextInt(AVAILABLE_CAR_TYPES);
            switch (carType) {
                case 0:
                    cars.add(carFactory.createVWPolo(UUID.randomUUID().toString(), getVersion()));
                    break;
                case 1:
                    cars.add(carFactory.createVWPoloGTI(UUID.randomUUID().toString(), getVersion()));
                    break;
                case 2:
                    cars.add(carFactory.createVWPoloGolf(UUID.randomUUID().toString(), getVersion()));
                    break;
                case 3:
                    cars.add(carFactory.createSkodaCityGo(UUID.randomUUID().toString(), getVersion()));
                    break;
                default:
                    System.out.println("Unoknown carType" + carType);
            }
        }
        cars.stream().forEach(System.out::println);

        System.out.println("I created: " + cars.size() + "car, but only " + Engine.getInstance() + "" + " references to Engine object");
    }

    private static String getVersion() {
        return VERSIONS.get(new Random().nextInt(VERSIONS.size()));
    }
}
