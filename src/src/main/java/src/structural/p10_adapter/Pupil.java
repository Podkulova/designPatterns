package src.structural.p10_adapter;

import java.util.List;

public class Pupil {
    private String firstname;
    private String lastName;
    private String email;
    private Integer age;
    private List<Integer> grades;

    public Pupil(String firstname, String lastName, String email, Integer age, List<Integer> grades) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.grades = grades;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }
}
