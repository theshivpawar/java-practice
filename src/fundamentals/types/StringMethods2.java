package fundamentals.types;

public class StringMethods2 {
    public static void main(String[] args) {

        String greeting = "Hello, World!";

        System.out.println("Lowercase: " + greeting.toLowerCase());
        System.out.println("Uppercase: " + greeting.toUpperCase());

        System.out.println("Replace l with z: " + greeting.replace('l', 'z'));
        System.out.println("Original string greeting: " + greeting);
        System.out.println("Replace World with Shivam: " + greeting.replace("World", "Shivam"));

        String userName = "    theshivapawar    ";
        System.out.println("Input UserName: " + userName);
        System.out.println("Stripped UserName: " + userName.strip());

        System.out.println("Concatenated with Bye!: " + greeting.concat(" Bye!"));
    }
}
