package fundamentals.types;

import java.util.Arrays;

public class CharArrayAndString {
    public static void main(String[] args) {

        // String is sequence of characters
        // String greeting = "Hello, World!";
        char[] greeting = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!'};

        // character array is treated as a string
        System.out.println(greeting);

        // concatenating a character array (object) with another string
        System.out.println("Greeting: " + greeting);

        System.out.println("Greeting: " + Arrays.toString(greeting));
    }
}
