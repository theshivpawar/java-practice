package fundamentals.types;

public class Strings {
    public static void main(String[] args) {

        String greeting1 = new String("Hello, World!");
        System.out.println("Greeting 1: " + greeting1);

        String greeting2 = "Hello, World!";
        System.out.println("Greeting 2: " + greeting2);

        /*
        Strings are immutable in Java, which means that once a
        String object is created, its value cannot be changed.
        However, you can reassign the variable to a new String object.
        */

        greeting2 = "Namastey";
        System.out.println("Greeting 2: " + greeting2);

    }
}
