package fundamentals.types;

public class StringsComparisonEqualOperator {
    public static void main(String[] args) {

        String greeting1 = new String("Hello, World!");
        String greeting2 = new String("Hello, World!");
        System.out.println(greeting1 == greeting2);

        String greeting3 = "Hello, World!";
        String greeting4 = "Hello, World!";
        System.out.println(greeting3 == greeting4);

        String greeting5 = "Hello, World!";
        String greeting6 = new String("Hello, World!");
        System.out.println(greeting5 == greeting6);

        String greeting7 = new String("Hello, World!");
        String greeting8 = "Hello, World!";
        System.out.println(greeting7 == greeting8);
    }
}
