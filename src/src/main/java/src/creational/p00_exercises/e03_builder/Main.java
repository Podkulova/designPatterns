package src.creational.p00_exercises.e03_builder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> toys = new ArrayList<>();
        toys.add("balonek");
        toys.add("kačenka");

        Dog dog = new Dog.Builder()
                .withName("Alík")
                .withType("čivava")
                .withToys(toys)
                .build();
        System.out.println(dog);
    }
}
