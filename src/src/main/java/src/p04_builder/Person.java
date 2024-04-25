package src.p04_builder;

public class Person {
    private String name;
    private String surname;
    private String nick;
    private int age;
    private String sex;

    // Jediný konstruktor, který využívá návrhový vzor Builder
    private Person(String name, String surname, String nick, int age, String sex) {
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

    public static class Builder {
        private String name;
        private String surname;
        private String nick;
        private int age;
        private String sex;

        public Builder withName(final String nname) {
            this.name = nname;
            return this;
        }
        public Builder withSurname(final String ssurname) {
            this.surname = ssurname;
            return this;
        }

        public Builder withNick(final String nnick) {
            surname = nnick;
            return this;
        }
        public Builder withAge(final int aage) {
            if (aage > 0)  {
                this.age = aage;
                return this;
            }
            return this;
        }

        public Builder withSex(final String ssex) {
            this.sex = ssex;
            return this;
        }
        public Person build() {
            return new Person(name, surname, nick, age, sex);
        }
    }
}