package fundamentals.types;

import java.util.Arrays;

public class DataTypesArrays {
    public static void main(String[] args) {

        byte[] ages = {22, 64, 12, 38, 60};

        short[] ids = {1001, 1432, 1267, 1806};

        int[] payments = {32000, 55700, 120000, 27500};

        long[] factorials = {39_916_800, 479_001_600, 6_227_020_800L};

        float[] prices = {10.99F, 99.99F, 199.99F};

        double[] percentiles = {97.1234, 67.3412, 89.123123};

        char[] letters = {'A', 'B', 'C', 'a', 'b', 'c', '!', '5'};

        boolean[] results = {true, true, false, true, false, true};

        String[] fruits = {"Mango", "Apple", "Banana", "Orange"};

        String[] names = {"Shivam", "Tejas", "Rohit", "Sanket"};

        String[] cities = {"Nanded", "Pune", "Latur", "Mumbai"};




        System.out.println("Ages: " + Arrays.toString(ages));
        System.out.println("Ids: " + Arrays.toString(ids));
        System.out.println("Payments: " + Arrays.toString(payments));
        System.out.println("Factorials: " + Arrays.toString(factorials));
        System.out.println("Prices: " + Arrays.toString(prices));
        System.out.println("Percentiles: " + Arrays.toString(percentiles));
        System.out.println("Letters: " + Arrays.toString(letters));
        System.out.println("Results: " + Arrays.toString(results));
        System.out.println("Fruits: " + Arrays.toString(fruits));
        System.out.println("Names: " + Arrays.toString(names));
        System.out.println("Cities: " + Arrays.toString(cities));

    }
}
