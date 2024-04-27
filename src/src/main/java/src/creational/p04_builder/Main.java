package src.creational.p04_builder;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder()
                .withName("Pepík")
                .withSurname("Opakov")
                .withNick("Pepík")
                .withAge(35)
                .build();

        person.setSex("Muž");
        System.out.println(person);
    }
}
