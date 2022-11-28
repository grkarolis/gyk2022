package main.collections;

public class Arrays {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        int[] intArray = {40, 55, 63, 17, 22, 68, 89, 97, 89};

        int[] undefinedArray = new int[10];

        undefinedArray[0] = 40;
        undefinedArray[1] = 55;
        undefinedArray[2] = 63;

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("value: " + intArray[i]);
        }
        System.out.println("---------------------");
        for (int i = 0; i < undefinedArray.length; i++) {
            System.out.println("value: " + undefinedArray[i]);
        }

    }
}
