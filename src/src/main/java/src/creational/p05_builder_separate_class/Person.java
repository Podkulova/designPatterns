package src.creational.p05_builder_separate_class;

public class Person {
    private String name;
    private String surname;
    private String nick;
    private int age;
    private String sex;

    // Jediný konstruktor, který využívá návrhový vzor Builder
    protected Person(String name, String surname, String nick, int age, String sex) {
        this.name = name;
        this.surname = surname;
        this.nick = nick;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", nick='" + nick + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}