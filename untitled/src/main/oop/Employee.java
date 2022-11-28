package main.oop;

public class Employee extends Person implements Worker {

    public int salary;

    public Employee() {
    }

    public Employee(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "main.oop.Employee{" +
                "salary=" + salary +
                '}' + super.toString() + super.getName();
    }

    public double calculateSalary() {
        return salary * Math.random();
    }

    public double calculateSalary(double number) {
        return salary * number;
    }

    public double calculateSalary(String number) {
        return salary * Double.parseDouble(number);
    }

    public double calculateSalary(double number, int penalty) {
        return salary + number - penalty;
    }

    @Override
    public void doWork() {
        System.out.println("I am an employee doing work");
    }
}
