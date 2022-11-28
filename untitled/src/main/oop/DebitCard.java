package main.oop;

public class DebitCard extends Card implements Worker {

    @Override
    public Integer calculateBalance() {
        return 2000;
    }

    @Override
    public void doWork() {
        System.out.println("I am working debit card");
    }
}
