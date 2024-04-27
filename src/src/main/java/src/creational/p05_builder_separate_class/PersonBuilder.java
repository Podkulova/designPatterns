package src.creational.p05_builder_separate_class;

public class PersonBuilder {
    private String name;
    private String surname;
    private String nick;
    private int age;
    private String sex;

    public PersonBuilder withName(final String nname) {
        this.name = nname;
        return this;
    }

    public PersonBuilder withSurname(final String ssurname) {
        this.surname = ssurname;
        return this;
    }

    public PersonBuilder withNick(final String nnick) {
        surname = nnick;
        return this;
    }

    public PersonBuilder withAge(final int aage) {
        if (aage > 0) {
            this.age = aage;
            return this;
        }
        return this;
    }

    public PersonBuilder withSex(final String ssex) {
        this.sex = ssex;
        return this;
    }
    public Person build() {
        return new Person(name, surname, nick, age, sex);
    }
}
