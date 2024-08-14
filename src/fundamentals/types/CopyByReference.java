package fundamentals.types;

public class CopyByReference {
    public static void main(String[] args) {

        Point point1 = new Point(); // Refer Point.java file
        point1.x = 1;
        point1.y = 1;

        Point point2 = point1;

        System.out.println("Before changing the values >");
        System.out.println("Point 1: x = " + point1.x + ", y = " + point1.y);
        System.out.println("Point 2: x = " + point2.x + ", y = " + point2.y);

        point1.x = 2;

        System.out.println("After changing the value of x through point1 reference variable >");
        System.out.println("Point 1: x = " + point1.x + ", y = " + point1.y);
        System.out.println("Point 2: x = " + point2.x + ", y = " + point2.y);

        point2.y = 3;

        System.out.println("After changing the value of y through point2 reference variable >");
        System.out.println("Point 1: x = " + point1.x + ", y = " + point1.y);
        System.out.println("Point 2: x = " + point2.x + ", y = " + point2.y);
    }
}
