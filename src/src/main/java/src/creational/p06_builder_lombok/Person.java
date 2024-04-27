package src.creational.p06_builder_lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person {
    private String name;
    private String surname;
    private String nick;
    private int age;
    private String sex;

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public static class PersonBuilder {
        public int age;

        public PersonBuilder age(int age) {
            if (age > 0) {
                this.age = age;
            }
            return this;
        }
    }
}
