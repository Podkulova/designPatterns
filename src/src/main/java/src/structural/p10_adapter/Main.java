package src.structural.p10_adapter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        Pupil pupil = new Pupil("Adam", "Hrneček", "adam@seznam.cz", 21, List.of(1,2,1));

        //students.add(pupil); // nelze
        students.add(new PupilAdapter(pupil));
        students.add(new PupilAdapter(new Pupil("Radek", "Novák", "radek@gmail.com", 25, List.of(2,3,4))));

        for (Student student : students) {
            System.out.println(student.getFullName());
            System.out.println(student.getContactDetails());
            System.out.println(student.getresults());
            System.out.println(student.isAdult());
        }

    }
}
