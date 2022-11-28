package main.oop;

public interface Worker {

    void doWork();

    default void rest() {
        System.out.println("I am resting");
    }
}
