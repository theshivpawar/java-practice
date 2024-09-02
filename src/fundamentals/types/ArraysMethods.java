// Arrays Methods

package fundamentals.types;

import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[] args) {

        int[] numbers1 = {5, 4, 3, 2, 1};

        // copying reference
        int[] numbers2 = numbers1;

        System.out.println("numbers1: " + numbers1);
        System.out.println("numbers2: " + numbers2);

        // creating a clone / duplicate / copy
        int[] numbers3 = numbers1.clone();

        System.out.println("numbers1: " + numbers1);
        System.out.println("numbers3 (clone): " + numbers3);

        // toString method of Arrays class
        System.out.println(Arrays.toString(numbers3));

        // sort method of Arrays class
        Arrays.sort(numbers1);

        System.out.println(Arrays.toString(numbers1));
    }
}