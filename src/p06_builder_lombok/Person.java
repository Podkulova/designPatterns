package src.p06_builder_lombok;

import lombok.Data
import lombok.NoArgsConstructor
@Data
@Setter
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
}
