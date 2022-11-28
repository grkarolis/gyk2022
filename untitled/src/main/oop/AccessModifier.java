package main.oop;

public class AccessModifier {

    private String name;

    String surname;

    public int age;
    public static int gender;

    protected int year;

    @Override
    public String toString() {
        return "main.oop.AccessModifier{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", year=" + year +
                '}';
    }
}
