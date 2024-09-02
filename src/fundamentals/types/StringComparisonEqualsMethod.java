package fundamentals.types;

public class StringComparisonEqualsMethod {
    public static void main(String[] args) {

        String greeting1 = new String("Hello, World!");
        String greeting2 = new String("Hello, World!");
        System.out.println(greeting1.equals(greeting2));

        String greeting3 = "Hello, World!";
        String greeting4 = "Hello, World!";
        System.out.println(greeting3.equals(greeting4));

    }
}