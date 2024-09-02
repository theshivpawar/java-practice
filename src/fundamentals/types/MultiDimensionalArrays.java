// Multi Dimensional Arrays
package fundamentals.types;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {

        // 1 / Single Dimensional Arrays
        int[] numbers = new int[5];
        System.out.println(numbers);

        int[] numbers2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers2));

        // Multi-Dimensional Arrays

        // 2d or 2 Dimensional Arrays

        int[][] matrix1 = new int[3][3];

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Converts only the outside array to string representation
        // Used in case of one dimensional arrays
        System.out.println(Arrays.toString(matrix));

        // Converts deeply all array to string representation
        // Used in case multidimensional arrays
        System.out.println(Arrays.deepToString(matrix));

        // 3d or 3 Dimensional Arrays
        int[][][] cube1 = new int[3][3][3];

        // Define a 3x3x3 cube
        int[][][] cube2 = {
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                },
                {
                        {10, 11, 12},
                        {13, 14, 15},
                        {16, 17, 18}
                },
                {
                        {19, 20, 21},
                        {22, 23, 24},
                        {25, 26, 27}
                }
        };

    }
}