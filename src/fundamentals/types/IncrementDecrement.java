// Unary Arithmetic Operators => Increment and Decrement

package fundamentals.types;

public class IncrementDecrement {
    public static void main(String[] args) {

        int x = 1;

        // x = x + 1;
        // x += 1
        ++x;    // prefix increment
        System.out.println("After incrementing x by 1 (prefix): " + x);

        x++;    // postfix increment
        System.out.println("After incrementing x by 1 (postfix): " + x);

        int y = 10;
        --y;    // prefix decrement
        System.out.println("After decrementing y by 1 (prefix): " + y);

        y--;
        System.out.println("After decrementing y by 1 (postfix): " + y);
    }
}
