package main.oop;

public class Person extends Object {

    private String name;
    private int age = 26;
    private Gender gender;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "main.oop.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
