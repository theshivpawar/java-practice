package fundamentals.types;

public class CopyByValue {
    public static void main(String[] args) {

        int x = 10;
        int y = x;

        System.out.println("Before changing the values >");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x = 20;

        System.out.println("After changing the value of x >");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        y = 30;

        System.out.println("After changing the value of y >");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
