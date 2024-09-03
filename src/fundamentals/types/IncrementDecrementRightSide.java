// Using increment & decrement operators on the right
// side of an assignment operator

package fundamentals.types;

public class IncrementDecrementRightSide {
    public static void main(String[] args) {

        int x = 1;
        int y = ++x;

        System.out.println("After pre-incrementing x and then assigning x to y:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int p = 1;
        int q = p++;

        System.out.println("After assigning p to q and then post-incrementing p:");
        System.out.println("p = " + p);
        System.out.println("q = " + q);

        int a = 2;
        int b = --a;

        System.out.println("After pre-decrementing a and then assigning a to b:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int l = 5;
        int m = l--;

        System.out.println("After assigning l to m and then post-decrementing l:");
        System.out.println("l = " + l);
        System.out.println("m = " + m);

    }
}
