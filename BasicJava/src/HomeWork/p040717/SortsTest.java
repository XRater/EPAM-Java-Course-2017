package HomeWork.p040717;

import TestFramework.Asserts;
import TestFramework.RandomGenerator;

import java.util.Arrays;

public class SortsTest {

    private static final int MAX_INT = 100;
    private static final int MIN_INT = -100;
    private static final int INTS_NUMBER = 10000;

    public static void main(String[] args) {

        testCount();
        testRadix();

    }

    static void testCount() {

        int[] a = new int[INTS_NUMBER];
        int[] b;

        RandomGenerator.generate_random_array(a, MIN_INT, MAX_INT);
        b = Arrays.copyOf(a, INTS_NUMBER);

        CountSort.sort(a);
        Arrays.sort(b);

        Asserts.assertEquals(a, b);

    }

    private static void testRadix() {

    }

}
