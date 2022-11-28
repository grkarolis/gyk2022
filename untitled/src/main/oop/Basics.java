package main.oop;

import java.util.Scanner;

public class Basics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name and surname.");
        String nameSurname = scanner.nextLine();

        System.out.println(String.format("Hello I am %s. I am attending GYK 2022!", nameSurname));
    }
}
