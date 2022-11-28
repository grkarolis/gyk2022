package main.oop;

public class Main {

    public static final String LETTER = "L";

    public static void main(String[] args) {
//        String name = "Karolis";
//        int day = 11;
//        day += 23;
//        day = day + 23;
//        System.out.println(day++);
//        System.out.println(++day);
//
//        System.out.println(name+= 3);
//
//        float price = 21.0F;
//
//        boolean isHigher = false;
//        System.out.println(isHigher);
//        if (day > 15 || day < 35 && day > 46) {
//            //something
//        } else if (name != "otherName") {
//            //else
//        }
//
//
//        System.out.println(String.format("Dainius %s\n %s", name, name));
//        System.out.println("Dainius " + " " +  name + name);
//        System.out.print(day);
//        System.out.println(price);
//        System.out.println();
//
//        main.oop.AccessModifier example = new main.oop.AccessModifier();
//        System.out.println(example.age);
//
//        example.age = 40 + 34;
//        System.out.println(example.age);
//
//        int price2 = 5;
//
        String[] cars = new String[4];

        cars[0] = "bmw";
        System.out.println(cars[0]);
        System.out.println(cars[1]);
//
//        System.out.println(12);
//        System.out.println(true);
//        System.out.println(Arrays.toString(cars) + "something");
//
//        switch (price2) {
//            case 5: {
//                System.out.println("price was 5");
//            }
//            default: {
//                System.out.println("no match found");
//            }
//            case 1: {
//                System.out.println("price was 1");
//            }
//        }
//
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        for (String car : cars) {
            System.out.println(car);
        }


        int i = 0;
        while (cars.length > i) {
            System.out.println(cars[i]);
            i++;
        }


        classExample();

    }

    public static void classExample() {
        AccessModifier modifier = new AccessModifier();
        System.out.println(modifier.toString());

        Person mantvydas = new Person();
        Person karolis = new Person("Karolis", 26);
        System.out.println(mantvydas);
        System.out.println(karolis);

        System.out.println(karolis.getAge());
        karolis.setAge(40);
        System.out.println(karolis.getAge());
        karolis.setGender(Gender.MALE);

        switch (karolis.getGender()) {
            case MALE -> System.out.println("male");
            case FEMALE -> System.out.println("female");
            default -> System.out.println("other");
        }

        switch (karolis.getGender()) {
            case MALE: {
                System.out.println("male");
                break;
            }
        }

        Gender female = Gender.fromCode(2);
        System.out.println(female);

        Gender unknown = Gender.fromCode(4);
        System.out.println(unknown);
    }
}
