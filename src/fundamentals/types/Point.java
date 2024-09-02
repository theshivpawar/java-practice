package fundamentals.types;

public class Point {
    // Fields
    public int x;
    public int y;

    // Methods
    public void display() {
        System.out.println("(" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        Point point = new Point();

        System.out.println(point.x);
        System.out.println(point.y);
    }
}
