package main.collections;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        Student john = new Student("john", 22, 10);
        Student john1 = new Student("john", 22, 10);
        students.add(john);
        students.add(john1);
        students.add(new Student("tom"));

        System.out.println(students.size());
        System.out.println(students);
    }
}
