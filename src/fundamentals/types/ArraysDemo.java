package fundamentals.types;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {

        int number = 1;

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        System.out.println(numbers);

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        System.out.println(Arrays.toString(numbers));


        int[] numbers2 = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers2));

        int[] numbers3 = {6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(numbers3));

    }
}
