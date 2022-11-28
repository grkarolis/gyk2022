package main.oop;

public class OOPBasics {

    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.salary = 500000;
        System.out.println(employee);

        Person person = new Employee();
        System.out.println(person);

        CreditCard creditCard = new CreditCard();
        DebitCard debitCard = new DebitCard();

        System.out.println(creditCard.calculateBalance());
        System.out.println(debitCard.calculateBalance());

        doWork(creditCard);
        doWork(debitCard);
    }

    public static void doWork(Worker worker) {
        worker.doWork();
    }
}
