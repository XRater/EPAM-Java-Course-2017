package HomeWork.p040717;

import TestFramework.Asserts;
import TestFramework.RandomGenerator;

import java.util.ArrayList;
import java.util.Arrays;

public class SortsTest {

    private static final int MAX_INT = 10;
    private static final int INTS_NUMBER = 10;

    public static void main(String[] args) {

        test_radix();
        test_count();

    }

    private static void test_count() {

        int[] a = new int[INTS_NUMBER];
        int[] b = new int[INTS_NUMBER];

        RandomGenerator.generate_random_array(a, MAX_INT);
        b = Arrays.copyOf(a, INTS_NUMBER);

        CountSort.sort(a);
        Arrays.sort(b);

        Asserts.assertEquals(a, b);

    }

    private static void test_radix() {

    }

}
