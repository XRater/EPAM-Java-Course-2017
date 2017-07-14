package HomeWork.p040717.DidgitSort;

import TestFramework.Asserts;
import TestFramework.RandomGenerator;

import java.util.Arrays;

public class SortsTest {

    private static final int MAX_INT = Integer.MAX_VALUE;
    private static final int MIN_INT = 0;
    private static final int INTS_NUMBER = 1000000;

    public static void main(String[] args) {
     //   testCountSort();
        testRadixSort();
    }

    static void testCountSort() {

        int[] a = new int[INTS_NUMBER];
        int[] b;

        RandomGenerator.generate_random_array(a, MIN_INT, MAX_INT);
        b = Arrays.copyOf(a, INTS_NUMBER);

        CountSort.sort(a);
        Arrays.sort(b);

        Asserts.assertEquals(a, b);
    }

    static void testRadixSort() {

        int[] a = new int[INTS_NUMBER];
        int[] b;

        RandomGenerator.generate_random_array(a, MIN_INT, MAX_INT);
        b = Arrays.copyOf(a, INTS_NUMBER);

        long start = System.currentTimeMillis();
        RadixSort.sort(a);
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        start = System.currentTimeMillis();
        Arrays.sort(b);
        end = System.currentTimeMillis();
        System.out.println(end - start);

        Asserts.assertEquals(a, b);
    }

}
