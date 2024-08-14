package fundamentals.types;

public class PrimitiveDataTypes {
    public static void main(String[] args) {

        byte age = 22;

        short id = 1001;

        int rank = 3_267_329;

        long viewsCount = 3_123_456_789L;

        float cgpa = 9.5F;

        double percentage = 97.4935343;

        char grade = 'A';

        boolean isEligible = true;

        boolean isFeesPaid = false;

        System.out.println("Student Details >");
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Percentage: " + percentage);
        System.out.println("Rank: " + rank);
        System.out.println("Grade: " + grade);
        System.out.println("Is eligible for admission?: " + isEligible);
        System.out.println("Is fees paid?: " + isFeesPaid);

        System.out.println();
        System.out.println("YouTube video views count: " + viewsCount);

    }
}
