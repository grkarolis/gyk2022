package main.collections;

import java.util.ArrayList;

public class ArraysList {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student john = new Student("john", 22, 10);
        System.out.println(students.size());
        students.add(john);
        students.add(new Student("john", 10, 10));
        System.out.println(students.size());
        System.out.println(students);

        //REMOVE
        if (students.remove("new ")) {
            System.out.println("removed");
        } else {
            System.out.println("not removed");
        }

        ArrayList<Object> objects = new ArrayList<>();
        objects.add("");
        objects.add(2);
        objects.add(john);
        for (Object s: objects) {
            System.out.println(s);
        }
        students.remove(john);
        System.out.println(students);
        System.out.println(students.size());
    }
}
