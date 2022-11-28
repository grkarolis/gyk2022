package main.oop;

public class CreditCard extends Card implements Worker {

    @Override
    public Integer calculateBalance() {
        return 600;
    }

    @Override
    public void doWork() {
        System.out.println("I am working credit card");
    }
}
