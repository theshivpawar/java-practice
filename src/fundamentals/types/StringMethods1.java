package fundamentals.types;

import java.util.Arrays;

public class StringMethods1 {
    public static void main(String[] args) {

        String greeting = "Hello, World!";

        System.out.println("Length: " + greeting.length());

        System.out.println("Starts with H?: " + greeting.startsWith("H"));

        System.out.println("Ends with . ?: " + greeting.endsWith("."));

        System.out.println("Index Of o: " + greeting.indexOf('o'));
        System.out.println("Index of World: " + greeting.indexOf("World"));
        System.out.println("Index of Shivam: " + greeting.indexOf("Shivam"));
        System.out.println("Last index of o: " + greeting.lastIndexOf('o'));

        System.out.println("Contains Hello?: " + greeting.contains("Hello"));
        System.out.println("Contains t?: " + greeting.contains("t"));

        System.out.println("Character at 0 index: " + greeting.charAt(0));

        System.out.println("Substring from index 7 to end: " + greeting.substring(7));
        System.out.println("Substring from index 0 to end: " + greeting.substring(0, 5));

        char[] charsOfGreeting = greeting.toCharArray();
        System.out.println(Arrays.toString(charsOfGreeting));

    }
}
