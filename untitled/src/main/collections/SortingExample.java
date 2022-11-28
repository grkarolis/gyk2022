package main.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExample {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("john", 22, 10));
        students.add(new Student("tom", 40, 8));

        students.addAll(List.of(
                new Student("tom", 40, 8),
                new Student("tom", 40, 8),
                new Student("tom", 40, 8),
                new Student("tom", 40, 8)));
        System.out.println(students);

        students.sort(Comparator.reverseOrder());

        System.out.println(students);

        students.sort(Comparator.naturalOrder());

        System.out.println(students);
    }
}
