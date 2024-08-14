package fundamentals.types;

public class Variables2 {
    public static void main(String[] args) {
        // Variables that we declare inside a method are
        // called as local variables of that method
        // We can read local variables before initializing them

        int age;
        // System.out.println("Age: " + age);
        // Error > java: variable age might not have been initialized

        age = 30;
        System.out.println("Age: " + age);

    }
}
