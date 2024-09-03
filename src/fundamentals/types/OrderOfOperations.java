package fundamentals.types;

public class OrderOfOperations {
    public static void main(String[] args) {

        int result;

        result = 10 + 3 * 2;
        System.out.println(result);

        result = (10 + 3) * 2;
        System.out.println(result);

        result = 18 / 2 * 3;
        System.out.println(result);

        result = 18 / (2 * 3);
        System.out.println(result);
    }
}
