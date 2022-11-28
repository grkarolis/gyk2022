package main.oop;

public abstract class Card {
    private String name;
    private String number;

    public abstract Integer calculateBalance();

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
}
