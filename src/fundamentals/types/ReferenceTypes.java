package fundamentals.types;

public class ReferenceTypes {
    public static void main(String[] args) {

        byte age = 30; // Primitive Type


        Point point = new Point(); // Reference Type
        point.x = 1;
        point.y = 2;

        System.out.println(point);
        System.out.println("x = " + point.x);
        System.out.println("y = " + point.y);

        point.display();
    }
}
