package fundamentals.types;

public class Variables {
    public static void main(String[] args) {

        int age = 30;
        System.out.println("Age = " + age);

        age = 35;
        System.out.println("Age = " + age);

/*
        int myAge = 22, herAge = 24;
        Technically we can declare multiple variables on the same line using comma
        it is not recommended because it makes code ugly and hard to read
        So it's better to declare each variable on a new line
*/

        int myAge = 22;
        int herAge = myAge;

        System.out.println("My Age = " + myAge);
        System.out.println("Her Age = " + herAge);
    }
}
