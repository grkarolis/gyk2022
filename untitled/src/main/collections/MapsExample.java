package main.collections;

import java.util.HashMap;
import java.util.Map;

public class MapsExample {

    public static void main(String[] args) {
        Map<String, Student> studentMap = new HashMap<>();

        Student john = new Student("john", 22, 10);

        studentMap.put("john", john);
        System.out.println(studentMap);

        studentMap.put("john", new Student("3333", 33, 10));
        System.out.println(studentMap);

        Student student = studentMap.get("john");
        System.out.println(student);

        System.out.println(studentMap.get(""));

        studentMap.putIfAbsent("john", new Student("name"));
        studentMap.put("tom", new Student("tom"));

        System.out.println(studentMap);

        System.out.println(studentMap.keySet());
        System.out.println(studentMap.values());
    }
}
