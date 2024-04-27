package src.creational.p05_builder_separate_class;
public class Main {
    public static void main(String[] args) {
        Person person = new PersonBuilder()
                .withName("Pepík")
                .withSurname("Opakov")
                .withNick("Pepík")
                .withAge(35)
                .build();

        person.setSex("Muž");
        System.out.println(person);
    }
}
