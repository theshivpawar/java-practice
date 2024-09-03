// Simple Assignment Operator
// Augmented Compound Assignment Operators

package fundamentals.types;

public class AssignmentOperators {
    public static void main(String[] args) {

        int x = 100;
        System.out.println("x = " + x);

        // x = x + 20
        x += 20;
        System.out.println("After add 20 and assign to x: " + x);

        x -= 30;
        System.out.println("After subtract 30 and assign to x: " + x);

        x *= 2;
        System.out.println("After multiply 2 and assign to x: " + x);

        x /= 6;
        System.out.println("After divide by 6 and assign to x: " + x);

        x %= 12;
        System.out.println("After modulus by 12 and assign to x: " + x);
    }
}
