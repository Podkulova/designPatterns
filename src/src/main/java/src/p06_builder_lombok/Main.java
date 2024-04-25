package src.p06_builder_lombok;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder()
                .name("Alex")
                .age(25)
                .build();
        System.out.println(person);
    }
}
